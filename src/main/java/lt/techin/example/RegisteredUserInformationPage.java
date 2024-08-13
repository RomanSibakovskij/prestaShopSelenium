package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserInformationPage extends BasePage{

    //navigation link
    @FindBy(css = "a#identity-link")
    private WebElement informationLink;

    //gender selector elements
    @FindBy(css = "label:nth-of-type(1) > .custom-radio")
    private WebElement maleGenderSelector;
    @FindBy(css = "label:nth-of-type(2) > .custom-radio")
    private WebElement femaleGenderSelector;

    //input field elements
    @FindBy(css = "input#field-firstname")
    private WebElement firstNameInputField;
    @FindBy(css = "input#field-lastname")
    private WebElement lastNameInputField;
    @FindBy(css = "input#field-email")
    private WebElement emailAddressInputField;
    @FindBy(css = "input#field-password")
    private WebElement passwordInputField;
    @FindBy(css = "input#field-new_password")
    private WebElement newPasswordInputField;
    @FindBy(css = "input#field-birthday")
    private WebElement birthDateInputField;

    //checkboxes elements
    @FindBy(css = "div:nth-of-type(8)  .custom-checkbox")
    private WebElement receiveOffersCheckbox;
    @FindBy(css = "div:nth-of-type(9)  .custom-checkbox")
    private WebElement agreeToTermsCheckbox;
    @FindBy(css = "div:nth-of-type(10)  .custom-checkbox")
    private WebElement signUpNewsletterCheckbox;
    @FindBy(css = "div:nth-of-type(11)  .custom-checkbox")
    private WebElement dataPrivacyCheckbox;

    //password 'Show' button elements
    @FindBy(css = "div:nth-of-type(5) > .form-group.row .btn")
    private WebElement passwordShowButton;
    @FindBy(css = "div:nth-of-type(6) > .form-group.row .btn")
    private WebElement passwordNewShowButton;

    //save button element
    @FindBy(css = ".btn.btn-primary.float-xs-right.form-control-submit")
    private WebElement saveButton;

    //edit success message element
    @FindBy(css = "article[role='alert']")
    private WebElement successEditMessage;

    //return back to account page link element
    @FindBy(css = "footer > a:nth-of-type(1)")
    private WebElement returnToAccountLink;

    //user account link element
    @FindBy(css = "a[title='View my customer account']")
    private WebElement editedUserAccountLink;


    //negative data input warning message elements
    @FindBy(css = "aside#notifications > .container.notifications-container")
    private WebElement checkDataMessage;

    //warning error message elements
    @FindBy(css = "article[role='alert']")
    private WebElement dataErrorMessage;
    @FindBy(css = "ul > .alert.alert-danger")
    private WebElement invalidFormatMessage;
    @FindBy(xpath = "//ul/li[@class='alert alert-danger']")
    private WebElement invalidEmailAddressMessage;

    @FindBy(xpath = "//ul/li[@class='alert alert-danger']")
    private WebElement invalidPasswordLengthMessage;

    @FindBy(xpath = "//p[@class='password-requirements-length']/span")
    private WebElement passwordLengthMessage;

    @FindBy(xpath = "//p[@class='password-requirements-score']/span")
    private WebElement passwordStrengthMessage;
    @FindBy(css = "div:nth-of-type(6) ul > li:nth-of-type(1)")
    private WebElement newPasswordAlertBlock1;
    @FindBy(css = "div:nth-of-type(6) ul > li:nth-of-type(2)")
    private WebElement newPasswordAlertBlock2;

    //former input data
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private String birthDate ;

    //edited input data
    private String editedFirstName;
    private String editedLastName;
    private String editedEmailAddress;
    private String newPassword;
    private String editedBirthDate;

    //negative test input data
    private String noFirstName;
    private String invalidFirstName;
    private String tooLongFirstName;
    private String noLastName;
    private String invalidLastName;
    private String tooLongLastName;
    private String noEmail;
    private String invalidEmail;
    private String tooLongEmail;
    private String noPassword;
    private String invalidPassword;
    private String noNewPassword;
    private String invalidNewPassword;
    private String matchingNewPassword;
    private String tooLongNewPassword;
    private String noBirthDate;
    private String invalidBirthDate;

    public RegisteredUserInformationPage(WebDriver driver) {
        super(driver);
    }
    //old password setter (from registration phase)
    public void setPassword(String password) {
        this.password = password;
    }

    //information page navigation method
    public void clickInformationLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(informationLink));
        informationLink.click();
    }

    //click gender selector methods
    public void clickMaleGenderSelector(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(maleGenderSelector));
        maleGenderSelector.click();
    }
    public void clickFemaleGenderSelector(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(femaleGenderSelector));
        femaleGenderSelector.click();
    }

    public void inputEditedInformationDetails(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    //edited data input methods
    public void editFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstName = firstNameInputField.getAttribute("value");
        firstNameInputField.clear();
        firstNameInputField.sendKeys(editedFirstName);

    }
    public void editLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastName = lastNameInputField.getAttribute("value");
        lastNameInputField.clear();
        lastNameInputField.sendKeys(editedLastName);
    }
    public void editEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddress = emailAddressInputField.getAttribute("value");
        emailAddressInputField.clear();
        emailAddressInputField.sendKeys(editedEmailAddress);
    }
    public void inputOldPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        passwordInputField.sendKeys(this.password);
    }
    public void inputNewPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(newPasswordInputField));
        newPasswordInputField.sendKeys(newPassword);
    }
    public void editBirthdate(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(birthDateInputField));
        birthDate = birthDateInputField.getAttribute("value");
        birthDateInputField.clear();
        birthDateInputField.sendKeys(editedBirthDate);
    }

    //checkbox click methods
    public void clickReceiveOffersCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(receiveOffersCheckbox));
        receiveOffersCheckbox.click();
    }
    public void clickAgreeToTermsCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(agreeToTermsCheckbox));
        agreeToTermsCheckbox.click();
    }
    public void clickSignUpNewsletterCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(signUpNewsletterCheckbox));
        signUpNewsletterCheckbox.click();
    }
    public void clickDataPrivacyCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(dataPrivacyCheckbox));
        dataPrivacyCheckbox.click();
    }
    //password 'Show' button click method
    public void clickShowPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(passwordShowButton));
        passwordShowButton.click();
    }

    //new password 'Show' button click method
    public void clickShowNewPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(passwordNewShowButton));
        passwordNewShowButton.click();
    }

    //save button click method
    public void clickSaveButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        saveButton.click();
    }

    //return back to account link click method
    public void clickBackToAccount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(returnToAccountLink));
        returnToAccountLink.click();
    }


    //negative test data methods
    public void inputEditedInformationDetailsNoFirstName(RegisterPage registerPage){
        noFirstName = "";
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Expected first name: " + noFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editFirstNameAsNone(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstName = firstNameInputField.getAttribute("value");
        firstNameInputField.clear();
        try {
            firstNameInputField.sendKeys(noFirstName);
        }catch(IllegalArgumentException i){
            System.out.println("Keys to send should be a not null CharSequence");
            i.printStackTrace(System.out);
        }
    }
    //invalid first name format test methods
    public void inputEditedInformationDetailsInvalidFirstName(RegisterPage registerPage){
        invalidFirstName = "%$#";
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Expected first name: " + invalidFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editFirstNameInvalidFormat(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstName = firstNameInputField.getAttribute("value");
        firstNameInputField.clear();
        firstNameInputField.sendKeys(invalidFirstName);
    }
    //too long first name test methods
    public void inputEditedInformationDetailsTooLongFirstName(RegisterPage registerPage){
        tooLongFirstName = TestDataGenerator.generateRandomFirstname(256);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Expected first name: " + tooLongFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editTooLongFirstName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(firstNameInputField));
        firstName = firstNameInputField.getAttribute("value");
        firstNameInputField.clear();
        firstNameInputField.sendKeys(tooLongFirstName);
    }
    //no last name test methods
    public void inputEditedInformationDetailsNoLastName(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        noLastName = "";
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Expected last name: " + noLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editNoLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastName = lastNameInputField.getAttribute("value");
        lastNameInputField.clear();
        lastNameInputField.sendKeys(noLastName);
    }

    //invalid last name format test methods
    public void inputEditedInformationDetailsInvalidLastName(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        invalidLastName = "@#$";
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Expected last name: " + invalidLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editInvalidLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastName = lastNameInputField.getAttribute("value");
        lastNameInputField.clear();
        lastNameInputField.sendKeys(invalidLastName);
    }

    //too long last name test methods
    public void inputEditedInformationDetailsTooLongLastName(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        tooLongLastName = TestDataGenerator.generateRandomLastname(256);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Expected last name: " + tooLongLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editTooLongLastName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(lastNameInputField));
        lastName = lastNameInputField.getAttribute("value");
        lastNameInputField.clear();
        lastNameInputField.sendKeys(tooLongLastName);
    }

    //no email test methods
    public void inputEditedInformationDetailsNoEmail(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        noEmail = "";
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Expected email: " + noEmail);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editNoEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddress = emailAddressInputField.getAttribute("value");
        emailAddressInputField.clear();
        emailAddressInputField.sendKeys(noEmail);
    }

    //invalid email test methods
    public void inputEditedInformationDetailsInvalidEmail(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        invalidEmail = "m3@com";
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Expected email: " + invalidEmail);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editInvalidEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddress = emailAddressInputField.getAttribute("value");
        emailAddressInputField.clear();
        emailAddressInputField.sendKeys(invalidEmail);
    }

    //too long email test methods
    public void inputEditedInformationDetailsTooLongEmail(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        tooLongEmail = TestDataGenerator.generateRandomInvalidEmailAddress(256);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Expected email: " + tooLongEmail);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editTooLongEmail(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(emailAddressInputField));
        emailAddress = emailAddressInputField.getAttribute("value");
        emailAddressInputField.clear();
        emailAddressInputField.sendKeys(tooLongEmail);
    }

    //no password test methods
    public void inputEditedInformationDetailsNoPassword(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        noPassword = "";
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("No password: " + noPassword);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editNoPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        password = passwordInputField.getAttribute("value");
        passwordInputField.clear();
        passwordInputField.sendKeys(noPassword);
    }

    //invalid password test methods
    public void inputEditedInformationDetailsInvalidPassword(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        invalidPassword = "FDFSDF2323_";
        newPassword = TestDataGenerator.generateNewRandomPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Invalid password: " + invalidPassword);
        System.out.println("New password: " + newPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editInvalidPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(passwordInputField));
        password = passwordInputField.getAttribute("value");
        passwordInputField.clear();
        passwordInputField.sendKeys(invalidPassword);
    }

    //no new password test methods
    public void inputEditedInformationDetailsNoNewPassword(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        noNewPassword = "";
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + invalidPassword);
        System.out.println("No new password: " + noNewPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editNoNewPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(newPasswordInputField));
        password = newPasswordInputField.getAttribute("value");
        newPasswordInputField.clear();
        newPasswordInputField.sendKeys(noNewPassword);
    }

    //invalid new password test methods
    public void inputEditedInformationDetailsInvalidNewPassword(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        invalidNewPassword = "kithg";
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + invalidPassword);
        System.out.println("Invalid new password: " + invalidNewPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editInvalidNewPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(newPasswordInputField));
        password = newPasswordInputField.getAttribute("value");
        newPasswordInputField.clear();
        newPasswordInputField.sendKeys(invalidNewPassword);
    }

    //invalid new password test methods
    public void inputEditedInformationDetailsTooLongNewPassword(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        tooLongNewPassword = TestDataGenerator.generateRandomInvalidPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + invalidPassword);
        System.out.println("Too long new password: " + tooLongNewPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editTooLongNewPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(newPasswordInputField));
        password = newPasswordInputField.getAttribute("value");
        newPasswordInputField.clear();
        newPasswordInputField.sendKeys(tooLongNewPassword);
    }

    //invalid matching new password test methods
    public void inputEditedInformationDetailsMatchingNewPassword(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        matchingNewPassword = registerPage.getPassword();
        editedBirthDate = TestDataGenerator.generateRandomBirthdate(18, 75, "MM/dd/yyyy");

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("Matching new password: " + matchingNewPassword);
        System.out.println("Edited birthdate: " + editedBirthDate);
    }

    public void editMatchingNewPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(newPasswordInputField));
        password = newPasswordInputField.getAttribute("value");
        newPasswordInputField.clear();
        newPasswordInputField.sendKeys(matchingNewPassword);
    }

    //no birthdate test methods
    public void inputEditedInformationDetailsNoBirthDate(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        noBirthDate = "";

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("No birthdate: " + editedBirthDate);
    }

    public void editNoBirthDate(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(birthDateInputField));
        birthDate = birthDateInputField.getAttribute("value");
        birthDateInputField.clear();
        birthDateInputField.sendKeys(noBirthDate);
    }

    //no birthdate test methods
    public void inputEditedInformationDetailsInvalidBirthDate(RegisterPage registerPage){
        editedFirstName = TestDataGenerator.generateRandomFirstname(8);
        editedLastName = TestDataGenerator.generateRandomLastname(10);
        editedEmailAddress = TestDataGenerator.generateRandomEmailAddress(10);
        password = registerPage.getPassword();
        newPassword = TestDataGenerator.generateNewRandomPassword();
        invalidBirthDate = "1000-01-01";

        System.out.println("Generated Data:" + "\n");
        System.out.println("Edited first name: " + editedFirstName);
        System.out.println("Edited last name: " + editedLastName);
        System.out.println("Edited email: " + editedEmailAddress);
        System.out.println("Old password: " + password);
        System.out.println("New password: " + newPassword);
        System.out.println("Invalid birthdate: " + invalidBirthDate);
    }

    public void editInvalidBirthDate(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(birthDateInputField));
        password = birthDateInputField.getAttribute("value");
        birthDateInputField.clear();
        birthDateInputField.sendKeys(invalidBirthDate);
    }



    //information link assert method
    public boolean isInformationLinkDisplayed(){return informationLink.isDisplayed();}

    //gender selectors assert methods
    public boolean isMaleGenderSelectorDisplayed(){return maleGenderSelector.isDisplayed();}
    public boolean isFemaleGenderSelectorDisplayed(){return femaleGenderSelector.isDisplayed();}

    //input fields assert methods
    public boolean isFirstNameInputFieldDisplayed(){return firstNameInputField.isDisplayed();}
    public boolean isLastNameInputFieldDisplayed(){return lastNameInputField.isDisplayed();}
    public boolean isEmailInputFieldDisplayed(){return emailAddressInputField.isDisplayed();}
    public boolean isPasswordInputFieldDisplayed(){return passwordInputField.isDisplayed();}
    public boolean isNewPasswordInputFieldDisplayed(){return newPasswordInputField.isDisplayed();}
    public boolean isBirthDateInputFieldDisplayed(){return birthDateInputField.isDisplayed();}

    //checkboxes assert methods
    public boolean isReceiveOffersCheckboxDisplayed(){return receiveOffersCheckbox.isDisplayed();}
    public boolean isAgreeToTermsCheckboxDisplayed(){return agreeToTermsCheckbox.isDisplayed();}
    public boolean isSignUpNewsletterCheckboxDisplayed(){return signUpNewsletterCheckbox.isDisplayed();}
    public boolean isDataPrivacyCheckboxDisplayed(){return dataPrivacyCheckbox.isDisplayed();}

    //buttons assert methods
    public boolean isPasswordShowButtonDisplayed(){return passwordShowButton.isDisplayed();}
    public boolean isNewPasswordShowButtonDisplayed(){return passwordNewShowButton.isDisplayed();}
    public boolean isSaveButtonDisplayed(){return saveButton.isDisplayed();}
    public boolean isReturnBackLinkDisplayed(){return returnToAccountLink.isDisplayed();}

    //former data getters
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getEmailAddress(){return emailAddress;}
    public String getPassword(){return password;}
    public String getBirthDate(){return birthDate;}

    //edited input data getters
    public String getEditedFirstName(){return editedFirstName;}
    public String getEditedLastName(){return editedLastName;}
    public String getEditedEmailAddress(){return editedEmailAddress;}
    public String getNewPassword(){return newPassword;}
    public String getEditedBirthDate(){return editedBirthDate;}

    //success message getter
    public String getSuccessEditMessage(){return successEditMessage.getText();}

    //edited user account name getter
    public String getEditedUserAccountName(){return editedUserAccountLink.getText();}


    // warning message getters
    public String getCheckDataMessage(){return checkDataMessage.getText();}
    public String getInvalidFormatMessage(){return invalidFormatMessage.getText();}
    public String getInvalidEmailMessage(){return invalidEmailAddressMessage.getText();}
    public String getInvalidLengthPasswordMessage(){return invalidPasswordLengthMessage.getText();}



    //error message getters
    public String getDataErrorMessage(){return dataErrorMessage.getText();}
    public String getFormatErrorMessage(){return invalidFormatMessage.getText();}
    public String getNewPasswordLengthErrorMessage(){return newPasswordAlertBlock1.getText();}
    public String getNewPasswordStrengthErrorMessage(){return newPasswordAlertBlock2.getText();}


}
