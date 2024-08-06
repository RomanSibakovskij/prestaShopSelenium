package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserAccountPage extends BasePage{

    //user account links
    @FindBy(css = "a[title='View my customer account']")
    private WebElement userAccountLink1;
    @FindBy(css = ".myaccount-title [rel]")
    private WebElement userAccountLink2;

    //add first address link
    @FindBy(css = "a#address-link")
    private WebElement addFirstAddressLink;
    @FindBy(css = "a#address-link  .material-icons")
    private WebElement addFirstLinkName;

    //add first address page elements
    @FindBy(css = "input#field-firstname")
    private WebElement firstNameInputField;
    @FindBy(css = "input#field-lastname")
    private WebElement lastNameInputField;
    @FindBy(css = "input[name='address1']")
    private WebElement addressInputField;
    @FindBy(css = "input#field-city")
    private WebElement cityInputField;
    @FindBy(css = "select#field-id_state")
    private WebElement stateDropdownMenu;
    @FindBy(css = "input#field-postcode")
    private WebElement postalCodeInputField;
    @FindBy(css = "select#field-id_country")
    private WebElement countryDropdownMenu;
    @FindBy(css = ".btn.btn-primary.float-xs-right.form-control-submit")
    private WebElement saveButton;

    //selected state/country elements
    @FindBy(css = "select#field-id_state > option[value='16']")
    private WebElement illinoisStateOption;
    @FindBy(css = "select#field-id_country > option[value='21']")
    private WebElement usChoiceOption;

    //input data
    private String changedFirstName;
    private String changedLastName;
    private String address;
    private String city;
    private int postalCode;



    public RegisteredUserAccountPage(WebDriver driver) {
        super(driver);
    }

    public void inputEditedUserDetails(){
        changedFirstName = TestDataGenerator.generateRandomFirstname(8);
        changedLastName = TestDataGenerator.generateRandomLastname(10);
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated Data:\n");
        System.out.println("Edited first name: " + changedFirstName);
        System.out.println("Edited last name: " + changedLastName);
        System.out.println("Added address: " + address);
        System.out.println("Added city: " + city);
        System.out.println("Added postal code: " + postalCode);
    }


    //user account link click methods
    public void clickUserAccountLink1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(userAccountLink1));
        userAccountLink1.click();
    }
    public void clickUserAccountLink2(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", userAccountLink2);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(userAccountLink2));
        userAccountLink2.click();
    }

    //add first address link method
    public void clickAddFirstAddressLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(addFirstAddressLink));
        addFirstAddressLink.click();
    }

    ///edit input methods
    public void changeFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));

        // store the old name
        String oldFirstName = firstNameInputField.getAttribute("value");

        if (!oldFirstName.isEmpty()) {
            firstNameInputField.clear();
            firstNameInputField.sendKeys(changedFirstName);
        }
    }
    public void changeLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));

        // store the old name
        String oldFirstName = lastNameInputField.getAttribute("value");

        if (!oldFirstName.isEmpty()) {
            lastNameInputField.clear();
            lastNameInputField.sendKeys(changedLastName);
        }
    }
    public void addUserAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.sendKeys(address);
    }
    public void addUserCity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(city);
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

    //selected state/country method
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

    public void addUserPostalCode(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(String.valueOf(postalCode));
    }



    //navigation links assert methods
    public boolean isUserAccountLink1Displayed(){return userAccountLink1.isDisplayed();}
    public boolean isUserAccountLink2Displayed(){return userAccountLink2.isDisplayed();}
    public boolean isAddFirstAddressLinkDisplayed(){return addFirstAddressLink.isDisplayed();}

    //input fields assert methods
    public boolean isFirstNameInputFieldDisplayed(){return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed(){return lastNameInputField.isDisplayed();}
    public boolean isAddressInputFieldDisplayed(){return addressInputField.isDisplayed();}
    public boolean isCityInputFieldDisplayed(){return cityInputField.isDisplayed();}
    public boolean isPostalCodeInputFieldDisplayed(){return firstNameInputField.isDisplayed();}

    //dropdown menu assert methods
    public boolean isStateDropdownMenuDisplayed(){return stateDropdownMenu.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed(){return countryDropdownMenu.isDisplayed();}

    //select dropdown option assert methods
    public boolean isIllinoisStateDisplayed(){return illinoisStateOption.isDisplayed();}
    public boolean isUSCountryDisplayed(){return usChoiceOption.isDisplayed();}




    //add first address link name getter method
    public String getAddFirstAddressLinkText(){return addFirstLinkName.getText();}

    //edit input data getters
    public String getChangedFirstName() {return firstNameInputField.getText();}
    public String getChangedLastName() {return lastNameInputField.getText();}
    public String getAddress() {return addressInputField.getText();}
    public String getCity() {return cityInputField.getText();}
    public String getPostalCode() {return postalCodeInputField.getText();}

    //dropdown menu option getters
    public String getChosenStateOption(){return illinoisStateOption.getText();}
    public String getUSCountryText(){return usChoiceOption.getText();}


}
