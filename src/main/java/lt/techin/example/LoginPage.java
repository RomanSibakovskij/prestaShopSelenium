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

    //button
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

    //button click method
    public void clickSignInButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }

    //assert methods

    public boolean isEmailInputfieldPresent(){
        return emailInputField.isDisplayed();
    }

    public boolean isPasswordInputFieldPresent(){
        return passwordInputField.isDisplayed();
    }

    public boolean isSignInButtonPresent(){
        return signInButton.isDisplayed();
    }
}
