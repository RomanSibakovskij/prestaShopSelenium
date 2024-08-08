package lt.techin.example;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductOrderPage extends BasePage{

    //input fields
    @FindBy(css = "input[name='address1']")
    private WebElement addressInputField;
    @FindBy(css = "input#field-city")
    private WebElement cityInputField;
    @FindBy(css = "input#field-postcode")
    private WebElement postalCodeInputField;

    //dropdown menu elements
    @FindBy(css = "select#field-id_state")
    private WebElement stateDropdownMenu;
    @FindBy(css = "select#field-id_state > option[value='16']")
    private WebElement illinoisStateOption;
    @FindBy(css = "select#field-id_country")
    private WebElement countryDropdownMenu;
    @FindBy(css = "select#field-id_country > option[value='21']")
    private WebElement usChoiceOption;

    //save button
    @FindBy(css = "button[name='confirm-addresses']")
    private WebElement continueButton;

    //delivery message element
    @FindBy(css = "textarea#delivery_message")
    private WebElement orderDeliveryCommentInputField;

    //shipping method continue button
    @FindBy(css = "form#js-delivery > button[name='confirmDeliveryOption']")
    private WebElement shippingContinueButton;

    //payment method radio elements
    @FindBy(css = "div:nth-of-type(1) > .payment-option > .custom-radio.float-xs-left")
    private WebElement bankWireOption;
    @FindBy(css = "div:nth-of-type(4) > .payment-option > .custom-radio.float-xs-left")
    private WebElement checkOption;
    @FindBy(css = "div:nth-of-type(7) > .payment-option > .custom-radio.float-xs-left")
    private WebElement cashOnDeliveryOption;

    //terms of service checkbox element
    @FindBy(css= "input#conditions_to_approve\\[terms-and-conditions\\]")
    private WebElement termsOfServiceCheckbox;

    //place order button element
    @FindBy(css = ".btn.btn-primary.center-block")
    private WebElement placeOrderButton;

    //order confirmation message element
    @FindBy(css = ".card-title.h1")
    private WebElement orderIsConfirmedMessage;

    //input data
    private String address;
    private String city;
    private int postalCode;

    public ProductOrderPage(WebDriver driver) {
        super(driver);
    }

    public void inputCheckoutDetails(){
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated Data:\n");
        System.out.println("Added address: " + address);
        System.out.println("Added city: " + city);
        System.out.println("Added postal code: " + postalCode);
    }

    //input data methods
    public void inputAddressIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.sendKeys(address);
    }

    public void inputCityIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(city);
    }

    public void inputPostalCodeIntoInputField(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(String.valueOf(postalCode));
    }

    //dropdown menu methods

    public void clickStateDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(stateDropdownMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(stateDropdownMenu).clickAndHold().pause(Duration.ofSeconds(2)).release().perform();

    }

    public void clickCountryDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdownMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(countryDropdownMenu).clickAndHold().pause(Duration.ofSeconds(2)).release().perform();

    }

    //selected state/country methods
    public void clickIllinoisStateOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(illinoisStateOption));
        illinoisStateOption.click();
    }

    public void clickUSOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(usChoiceOption));
        usChoiceOption.click();
    }

    //delivery comment input method
    public void inputDeliveryComment(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(orderDeliveryCommentInputField));
        orderDeliveryCommentInputField.sendKeys("Test comment");
    }

    //continue button click methods
    public void clickContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(750));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }
    public void clickShippingContinueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(750));
        wait.until(ExpectedConditions.elementToBeClickable(shippingContinueButton));
        shippingContinueButton.click();
    }

    //payment method radio click methods
    public void selectBankWireOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(750));
        wait.until(ExpectedConditions.elementToBeClickable(bankWireOption));
        bankWireOption.click();
    }

    public void selectPayByCheckOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(750));
        wait.until(ExpectedConditions.elementToBeClickable(checkOption));
        checkOption.click();
    }
    public void selectPayByCashOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(750));
        wait.until(ExpectedConditions.elementToBeClickable(cashOnDeliveryOption));
        cashOnDeliveryOption.click();
    }

    //terms of service checkbox click method
    public void checkTermsOfServiceCheckbox(){
        termsOfServiceCheckbox.click();
    }

    //place order click method
    public void clickPlaceOrderButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(750));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
        placeOrderButton.click();
    }

    //input fields assert methods
    public boolean isAddressInputFieldDisplayed(){return addressInputField.isDisplayed();}
    public boolean isCityInputFieldDisplayed(){return cityInputField.isDisplayed();}
    public boolean isPostalCodeInputFieldDisplayed(){return postalCodeInputField.isDisplayed();}

    //dropdown menu assert methods
    public boolean isStateDropdownMenuDisplayed(){return stateDropdownMenu.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed(){return countryDropdownMenu.isDisplayed();}

    //select dropdown option assert methods
    public boolean isIllinoisStateDisplayed(){return illinoisStateOption.isDisplayed();}
    public boolean isUSCountryDisplayed(){return usChoiceOption.isDisplayed();}

    //continue button assert methods
    public boolean isContinueButtonDisplayed(){return continueButton.isDisplayed();}
    public boolean isShippingContinueButtonDisplayed(){return shippingContinueButton.isDisplayed();}

    //order delivery comment input field assert method
    public boolean isOrderDeliveryCommentFieldDisplayed(){return orderDeliveryCommentInputField.isDisplayed();}

    //payment radio elements assert methods
    public boolean isBankWireButtonDisplayed(){return bankWireOption.isDisplayed();}
    public boolean isCheckButtonDisplayed(){return checkOption.isDisplayed();}
    public boolean isCashOnDeliveryButtonDisplayed(){return cashOnDeliveryOption.isDisplayed();}

    //terms of service assert method
    //public boolean isTermsOfServiceCheckboxDisplayed(){return termsOfServiceCheckbox.isDisplayed();}

    //place order button assert method
    public boolean isPlaceOrderButtonDisplayed(){return placeOrderButton.isDisplayed();}

    //edit input data getters
    public String getAddress() {return addressInputField.getText();}
    public String getCity() {return cityInputField.getText();}
    public String getPostalCode() {return postalCodeInputField.getText();}

    //dropdown menu option getters
    public String getChosenStateOption(){return illinoisStateOption.getText();}
    public String getUSCountryText(){return usChoiceOption.getText();}

    //order confirmation message getter
    public String getOrderConfirmationMessage(){return orderIsConfirmedMessage.getText();}







}
