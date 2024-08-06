package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    private WebElement saveButton;

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

    //edit input data getters
    public String getAddress() {return addressInputField.getText();}
    public String getCity() {return cityInputField.getText();}
    public String getPostalCode() {return postalCodeInputField.getText();}

    //dropdown menu option getters
    public String getChosenStateOption(){return illinoisStateOption.getText();}
    public String getUSCountryText(){return usChoiceOption.getText();}





}
