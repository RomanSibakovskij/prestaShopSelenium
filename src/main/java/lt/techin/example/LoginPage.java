package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{

    //elements
    @FindBy(css = "input#field-email")
    private WebElement emailInputField;

    @FindBy(css = "input#field-password")
    private WebElement passwordInputField;

    //buttons

    @FindBy(css = ".input-group-btn [type]")
    private WebElement showButton;
    @FindBy(css = "button#submit-login")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //input data methods

    public void inputEmailAddress(String emailAddress){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys(emailAddress);
    }

    public void inputPassword(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputField));
        passwordInputField.sendKeys(password);
    }

    //invalid input data methods

    public void inputInvalidLoginEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys("m9999@example.com");
    }

    public void inputExistingLoginEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys("m0@example.com");
    }

    public void inputNoLoginEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.sendKeys("");
    }

    public void inputInvalidLoginPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputField));
        passwordInputField.sendKeys("St334.");
    }

    public void inputNoLoginPassword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(passwordInputField));
        passwordInputField.sendKeys("");
    }

    //button click methods

    public void clickShowPasswordButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }

    public void clickSignInButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(4800));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }

    //assert methods

    public boolean isEmailInputFieldPresent(){return emailInputField.isDisplayed();}

    public boolean isPasswordInputFieldPresent(){return passwordInputField.isDisplayed();}

    public boolean isShowPasswordButtonPresent(){return showButton.isDisplayed();}
    public boolean isSignInButtonPresent(){return signInButton.isDisplayed();}
}
