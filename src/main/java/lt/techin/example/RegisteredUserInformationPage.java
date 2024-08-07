package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserInformationPage extends BasePage{

    //link
    @FindBy(css = "a#identity-link")
    private WebElement informationLink;

    //gender selector elements
    @FindBy(css = "label:nth-of-type(1) > .custom-radio")
    private WebElement maleGenderSelector;
    @FindBy(css = "label:nth-of-type(2) > .custom-radio")
    private WebElement femaleGenderInputField;

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


    //information link assert method
    public boolean isInformationLinkDisplayed(){return informationLink.isDisplayed();}

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

}
