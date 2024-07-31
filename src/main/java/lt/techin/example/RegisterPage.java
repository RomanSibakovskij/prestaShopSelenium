package lt.techin.example;

import lt.techin.example.TestDataGenerator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BasePage{

    //buttons
    @FindBy(css = "input[name='id_gender'][id='field-id_gender-1']")
    private WebElement maleGenderSelector;

    @FindBy(css = "#field-id_gender-2")
    private WebElement femaleGenderSelector;

    @FindBy(xpath = "//form[@id='customer-form']//button[@type='submit']")
    private WebElement saveAccountButton;

    //inputs

    @FindBy(css = "input#field-firstname")
    private WebElement firstNameInputField;

    @FindBy(css = "input#field-lastname")
    private WebElement lastNameInputField;

    @FindBy(css = "input#field-email")
    private WebElement emailInputField;

    @FindBy(css = "input#field-password")
    private WebElement passwordInputField;

    @FindBy(css = "input#field-birthday")
    private WebElement birthDateInputField;

    //checkboxes
    @FindBy(css = "input#agree")
    private WebElement agreeToTermCheckbox;

    @FindBy(css = "input[name='customer_privacy']")
    private WebElement customerDataPrivacyCheckbox;


    //input data
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String birthDate;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void inputNewUserDetails(){
        firstName = TestDataGenerator.generateRandomFirstname(8);
        lastName = TestDataGenerator.generateRandomLastname(10);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = TestDataGenerator.generateRandomPassword();
        birthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Email: " + emailAddress);
        System.out.println("Password: " + password);
        System.out.println("Birthdate: " + birthDate);
    }


    //input methods

    public void inputNewUserFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(firstName);
    }

    public void inputNewUserLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(lastName);
    }

    public void inputNewUserEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(emailAddress);
    }

    public void inputNewUserPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    public void inputNewUserBirthDate(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", birthDateInputField);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(birthDateInputField));
        birthDateInputField.sendKeys(birthDate);
    }


    //selector click methods
    public void selectMaleGender() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1850));
        wait.until(ExpectedConditions.elementToBeClickable(maleGenderSelector));
        maleGenderSelector.click();
    }

    public void selectFemaleGender() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1850));
        wait.until(ExpectedConditions.elementToBeClickable(femaleGenderSelector));
        femaleGenderSelector.click();
    }

    //button click method
    public void clickSaveButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(saveAccountButton));
        saveAccountButton.click();
    }


    //checkbox methods
    public void clickAgreeToTermsCheckbox() {
        if (!agreeToTermCheckbox.isSelected()) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
            wait.until(ExpectedConditions.elementToBeClickable(agreeToTermCheckbox));
            agreeToTermCheckbox.click();
        }
    }

    public void clickCustomerDataPrivacyCheckbox() {
        if (!customerDataPrivacyCheckbox.isSelected()) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
            wait.until(ExpectedConditions.elementToBeClickable(customerDataPrivacyCheckbox));
            customerDataPrivacyCheckbox.click();
        }
    }


    //assert methods
    public boolean isMaleGenderSelectorDisplayed(){
        return maleGenderSelector.isDisplayed();
    }

    public boolean isFemaleGenderSelectorDisplayed(){
        return femaleGenderSelector.isDisplayed();
    }

    public boolean isFirstNameInputDisplayed(){
        return firstNameInputField.isDisplayed();
    }

    public boolean isLastNameInputDisplayed(){
        return lastNameInputField.isDisplayed();
    }

    public boolean isEmailAddressInputFieldDisplayed(){
        return emailInputField.isDisplayed();
    }

    public boolean isPasswordInputFieldDisplayed(){
        return passwordInputField.isDisplayed();
    }
    public boolean isBirthDateInputFieldDisplayed(){
        return birthDateInputField.isDisplayed();
    }

    public boolean isAgreeToTermsCheckboxDisplayed(){
        return agreeToTermCheckbox.isDisplayed();
    }
    public boolean isCustomerDataPrivacyCheckboxDisplayed(){
        return customerDataPrivacyCheckbox.isDisplayed();
    }

    public boolean isSaveAccountButtonDisplayed(){
        return saveAccountButton.isDisplayed();
    }

}
