package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserAccountAddFirstAddressPage extends BasePage{

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
    @FindBy(css = "select#field-id_country > option[value='8']")
    private WebElement franceCountryOption;

    //success message element
    @FindBy(css = "aside#notifications ul")
    private WebElement successMessage;

    //input data
    private String changedFirstName;
    private String changedLastName;
    private String address;
    private String city;
    private int postalCode;
    private String frenchCity;
    private int frenchPostalCode;


    public RegisteredUserAccountAddFirstAddressPage(WebDriver driver) {
        super(driver);
    }
    //valid user data input
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

    public void inputEditedUserFrenchDetails(){
        changedFirstName = TestDataGenerator.generateRandomFirstname(8);
        changedLastName = TestDataGenerator.generateRandomLastname(10);
        address = TestDataGenerator.generateRandomAddress(6);
        frenchCity = TestDataGenerator.getRandomFrenchCity();
        frenchPostalCode = TestDataGenerator.getLyonsRandomPostalCode();

        System.out.println("Generated Data:\n");
        System.out.println("Edited first name: " + changedFirstName);
        System.out.println("Edited last name: " + changedLastName);
        System.out.println("Added address: " + address);
        System.out.println("Added city: " + city);
        System.out.println("Added postal code: " + postalCode);
    }

    // invalid user data input
    public void inputEditedUserDetailsNoFirstName(){
        changedLastName = TestDataGenerator.generateRandomLastname(10);
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated Data:\n");
        System.out.println("Expected first name: " + "");
        System.out.println("Edited last name: " + changedLastName);
        System.out.println("Added address: " + address);
        System.out.println("Added city: " + city);
        System.out.println("Added postal code: " + postalCode);
    }

    public void inputEditedUserDetailsNoLastName(){
        changedFirstName = TestDataGenerator.generateRandomFirstname(8);
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated Data:\n");
        System.out.println("Edited first name: " + changedFirstName);
        System.out.println("Expected last name: " + "");
        System.out.println("Added address: " + address);
        System.out.println("Added city: " + city);
        System.out.println("Added postal code: " + postalCode);
    }

    public void inputEditedUserDetailsNoAddress(){
        changedFirstName = TestDataGenerator.generateRandomFirstname(8);
        changedLastName = TestDataGenerator.generateRandomLastname(10);
        city = TestDataGenerator.getRandomCity();
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated Data:\n");
        System.out.println("Edited first name: " + changedFirstName);
        System.out.println("Edited last name: " + changedLastName);
        System.out.println("Expected address: " + "");
        System.out.println("Added city: " + city);
        System.out.println("Added postal code: " + postalCode);
    }

    public void inputEditedUserDetailsNoCity(){
        changedFirstName = TestDataGenerator.generateRandomFirstname(8);
        changedLastName = TestDataGenerator.generateRandomLastname(10);
        address = TestDataGenerator.generateRandomAddress(6);
        postalCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated Data:\n");
        System.out.println("Edited first name: " + changedFirstName);
        System.out.println("Edited last name: " + changedLastName);
        System.out.println("Edited address: " + address);
        System.out.println("Expected city: " + "");
        System.out.println("Added postal code: " + postalCode);
    }

    public void inputEditedUserDetailsNoPostalCode(){
        changedFirstName = TestDataGenerator.generateRandomFirstname(8);
        changedLastName = TestDataGenerator.generateRandomLastname(10);
        address = TestDataGenerator.generateRandomAddress(6);
        city = TestDataGenerator.getRandomCity();

        System.out.println("Generated Data:\n");
        System.out.println("Edited first name: " + changedFirstName);
        System.out.println("Edited last name: " + changedLastName);
        System.out.println("Edited address: " + address);
        System.out.println("Edited city: " + city);
        System.out.println("Expected postal code: " + "");
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

    ///edit input methods (valid data)
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
    public void addUserFrenchCity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys(frenchCity);
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

    public void clickFranceOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(franceCountryOption));
        franceCountryOption.click();
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

    public void addUserFrenchPostalCode(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.sendKeys(String.valueOf(frenchPostalCode));
    }

    public void clickSaveButton(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        saveButton.click();
    }

    //attempt to edit user with empty first name input field method
    public void changeFirstNameAsEmptyString(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));

        // store the old name
        String oldFirstName = firstNameInputField.getAttribute("value");

        if (!oldFirstName.isEmpty()) {
            firstNameInputField.clear();
            firstNameInputField.sendKeys("");
        }
    }

    //attempt to edit user with empty last name input field
    public void changeLastNameAsEmptyString(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));

        // store the old name
        String oldFirstName = lastNameInputField.getAttribute("value");

        if (!oldFirstName.isEmpty()) {
            lastNameInputField.clear();
            lastNameInputField.sendKeys("");
        }
    }

    //attempt to edit user with empty address input field
    public void addUserWithNoAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(addressInputField));
        addressInputField.sendKeys("");
    }

    //attempt to edit user with empty city input field
    public void addUserWithNoCity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(cityInputField));
        cityInputField.sendKeys("");
    }
    //attempt to edit user with empty postal code input field
    public void addNoUserPostalCode(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.visibilityOf(postalCodeInputField));
        postalCodeInputField.clear();
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
    public boolean isPostalCodeInputFieldDisplayed(){return postalCodeInputField.isDisplayed();}

    //dropdown menu assert methods
    public boolean isStateDropdownMenuDisplayed(){return stateDropdownMenu.isDisplayed();}
    public boolean isCountryDropdownMenuDisplayed(){return countryDropdownMenu.isDisplayed();}

    //select dropdown option assert methods
    public boolean isIllinoisStateDisplayed(){return illinoisStateOption.isDisplayed();}
    public boolean isUSCountryDisplayed(){return usChoiceOption.isDisplayed();}
    public boolean isFranceCountryDisplayed(){return franceCountryOption.isDisplayed();}

    //save button assert method
    public boolean isSaveButtonDisplayed(){return saveButton.isDisplayed();}




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
    public String getFranceCountryText(){return franceCountryOption.getText();}

    //success message getter
    public String getSuccessMessageText(){return successMessage.getText();}


}
