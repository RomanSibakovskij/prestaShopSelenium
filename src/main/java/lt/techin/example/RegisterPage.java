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
    @FindBy(id = "field-id_gender-1")
    private WebElement maleGenderSelector;

    @FindBy(css = "#field-id_gender-2")
    private WebElement femaleGenderSelector;

    @FindBy(css = ".input-group-btn [type]")
    private WebElement showPasswordButton;

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

    //elements

    @FindBy(css = "div:nth-of-type(2) ul > .alert.alert-danger")
    private WebElement tooLongFirstNameMessage;

    @FindBy(css = "div:nth-of-type(3) ul > .alert.alert-danger")
    private WebElement tooLongLastNameMessage;

    @FindBy(css = "div:nth-of-type(4) ul > .alert.alert-danger")
    private WebElement tooLongEmailAddressMessage;

    @FindBy(css = "div:nth-of-type(4) ul > .alert.alert-danger")
    private WebElement invalidEmailAddressMessage;

    @FindBy(css = ".field-password-policy ul > .alert.alert-danger")
    private WebElement invalidPasswordLengthMessage;

    @FindBy(xpath = "//*[contains(text(), 'Enter a password between 8 and 72 characters')]")
    private WebElement passwordLengthMessage;

    @FindBy(xpath = "//*[contains(text(), 'The minimum score must be: Strong')]")
    private WebElement passwordStrengthMessage;

    @FindBy(css = "div:nth-of-type(6) ul > .alert.alert-danger")
    private WebElement invalidBirthdateMessage;

    //checkboxes
    @FindBy(css = "input[name='psgdpr']")
    private WebElement agreeToTermCheckbox;

    @FindBy(css = "input[name='optin']")
    private WebElement receiveOffersCheckBox;

    @FindBy(css = "input[name='newsletter']")
    private WebElement signUpForNewsletterCheckbox;

    @FindBy(css = "input[name='customer_privacy']")
    private WebElement customerDataPrivacyCheckbox;

    //input data
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String birthDate;

    //negative input data
    private String longFirstName;
    private String longLastName;
    private String invalidEmailAddress;
    private String longEmail;
    private String shortPassword;
    private String longPassword;
    private String invalidBirthDate;

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
        passwordInputField.sendKeys(this.password);
    }

    public void inputNewUserBirthDate(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", birthDateInputField);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(birthDateInputField));
        birthDateInputField.sendKeys(birthDate);
    }

    // negative input methods

    public void inputNewUserWithTooLongFirstNameDetails(){
        longFirstName = TestDataGenerator.generateRandomFirstname(256);
        lastName = TestDataGenerator.generateRandomLastname(10);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = TestDataGenerator.generateRandomPassword();
        birthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Long first name: " + longFirstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Email: " + emailAddress);
        System.out.println("Password: " + password);
        System.out.println("Birthdate: " + birthDate);
    }
    public void inputNewUserTooLongFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstNameInputField.sendKeys(longFirstName);
    }

    public void inputNewUserWithTooLongLastNameDetails(){
        firstName = TestDataGenerator.generateRandomFirstname(10);
        longLastName = TestDataGenerator.generateRandomLastname(256);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = TestDataGenerator.generateRandomPassword();
        birthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("First name: " + firstName);
        System.out.println("Long last name: " + longLastName);
        System.out.println("Email: " + emailAddress);
        System.out.println("Password: " + password);
        System.out.println("Birthdate: " + birthDate);
    }
    public void inputNewUserTooLongLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastNameInputField.sendKeys(longLastName);
    }

    public void inputNewUserWithTooLongEmailDetails(){
        firstName = TestDataGenerator.generateRandomFirstname(10);
        lastName = TestDataGenerator.generateRandomLastname(12);
        longEmail = TestDataGenerator.generateRandomEmailAddress(256);
        password = TestDataGenerator.generateRandomPassword();
        birthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Long email: " + longEmail);
        System.out.println("Password: " + password);
        System.out.println("Birthdate: " + birthDate);
    }
    public void inputNewUserTooLongEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(longEmail);
    }

    public void inputNewUserWithInvalidEmailDetails(){
        firstName = TestDataGenerator.generateRandomFirstname(10);
        lastName = TestDataGenerator.generateRandomLastname(12);
        invalidEmailAddress = TestDataGenerator.generateRandomInvalidEmailAddress(5);
        password = TestDataGenerator.generateRandomPassword();
        birthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Invalid email: " + invalidEmailAddress);
        System.out.println("Password: " + password);
        System.out.println("Birthdate: " + birthDate);
    }
    public void inputNewUserInvalidEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(emailInputField));
        emailInputField.sendKeys(invalidEmailAddress);
    }

    public void inputNewUserWithTooShortPasswordDetails(){
        firstName = TestDataGenerator.generateRandomFirstname(10);
        lastName = TestDataGenerator.generateRandomLastname(12);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(8);
        shortPassword = "n";
        birthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("First name: " + firstName);
        System.out.println("Long last name: " + lastName);
        System.out.println("Email: " + emailAddress);
        System.out.println("Short password: " + shortPassword);
        System.out.println("Birthdate: " + birthDate);
    }
    public void inputNewUserTooShortPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(shortPassword);
    }

    public void inputNewUserWithTooLongPasswordDetails(){
        firstName = TestDataGenerator.generateRandomFirstname(10);
        lastName = TestDataGenerator.generateRandomLastname(12);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(8);
        longPassword = ")nFmtCHe**GcQik2~q@QktlP8v>AGR\\pvBIORL235[g'MJ;I}Rujs*Z:Ni{6K4Qm,>\\`t[jf~";
        birthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("First name: " + firstName);
        System.out.println("Long last name: " + lastName);
        System.out.println("Email: " + emailAddress);
        System.out.println("Short password: " + longPassword);
        System.out.println("Birthdate: " + birthDate);
    }
    public void inputNewUserTooLongPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(longPassword);
    }

    public void inputNewUserWithInvalidBirthdateDetails(){
        firstName = TestDataGenerator.generateRandomFirstname(10);
        lastName = TestDataGenerator.generateRandomLastname(12);
        emailAddress = TestDataGenerator.generateRandomEmailAddress(8);
        password = TestDataGenerator.generateRandomPassword();
        invalidBirthDate = "1000/01/01";

        System.out.println("Generated Data:" + "\n");
        System.out.println("First name: " + firstName);
        System.out.println("Long last name: " + lastName);
        System.out.println("Email: " + emailAddress);
        System.out.println("Short password: " + longPassword);
        System.out.println("Birthdate: " + invalidBirthDate);
    }
    public void inputNewUserInvalidBirthdate(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(birthDateInputField));
        birthDateInputField.sendKeys(invalidBirthDate);
    }

    //selector click methods
    public void selectMaleGender() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('field-id_gender-1').click();");
    }

    public void selectFemaleGender() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('field-id_gender-2').click();");
    }

    //button click methods

    public void clickShowPasswordButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(showPasswordButton));
        showPasswordButton.click();
    }

    public void clickSaveButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(saveAccountButton));
        saveAccountButton.click();
    }


    //checkbox methods
    public void clickAgreeToTermsCheckbox() {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.querySelector('input[name=\"psgdpr\"]').click();");

    }

    public void clickCustomerDataPrivacyCheckbox() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('input[name=\"customer_privacy\"]').click();");

    }

    public void clickReceiveOffersCheckbox() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('input[name=\"optin\"]').click();");

    }

    public void clickSignUpForNewsletterCheckbox() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('input[name=\"newsletter\"]').click();");

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

    public boolean isShowPasswordButtonDisplayed(){
        return showPasswordButton.isDisplayed();
    }
    public boolean isBirthDateInputFieldDisplayed(){
        return birthDateInputField.isDisplayed();
    }

    public boolean isPasswordLengthMessageDisplayed(){
        return passwordLengthMessage.isDisplayed();
    }

    public boolean isPasswordStrengthMessageDisplayed(){
        return passwordStrengthMessage.isDisplayed();
    }

    public boolean isReceiveOffersCheckbox(){
        return receiveOffersCheckBox.isDisplayed();
    }

    public boolean isSignupForNewsletterCheckbox(){
        return signUpForNewsletterCheckbox.isDisplayed();
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

    //getters for email / password

    public String getEmailAddress(){
        return emailAddress;
    }

    public String getPassword(){
        return this.password;
    }

    //getters for firstname, lastname, birthdate
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getBirthDate(){return birthDate;}

    //getters for first / last name error messages

    public String getTooLongFirstNameMessage(){
        return tooLongFirstNameMessage.getText();
    }

    public String getTooLongLastNameMessage(){
        return tooLongLastNameMessage.getText();
    }

    public String getTooLongEmailAddressMessage(){
        return tooLongEmailAddressMessage.getText();
    }

    public String getInvalidEmailMessage(){
        return invalidEmailAddressMessage.getText();
    }

    public String getInvalidLengthPasswordMessage(){
        return invalidPasswordLengthMessage.getText();
    }

    public String getInvalidBirthdateMessage(){
        return invalidBirthdateMessage.getText();
    }



    //getters for password requirements messages

    public String getPasswordStrengthMessage(){
        return passwordStrengthMessage.getText();
    }
    public String getPasswordLengthMessage(){
        return passwordLengthMessage.getText();
    }


}
