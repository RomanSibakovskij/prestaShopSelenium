package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends BasePage{

    @FindBy(xpath = "//ul[@id='footer_account_list']//a[@title='Create account']")
    private WebElement signUpLink;

    @FindBy(xpath = "//ul[@id='footer_account_list']//a[@title='Log me out']")
    private WebElement signOutLink;

    @FindBy(css = ".user-info > a:nth-child(1)")
    private WebElement signInLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //button click methods
    public void clickSignUpLink() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signUpLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.visibilityOf(signUpLink));
        signUpLink.click();
    }

    public void clickSignOutLink() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", signOutLink);
        jsExecutor.executeScript("document.querySelector('div.user-info a.logout.hidden-sm-down').click();");
    }

    public void clickSignInLink() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", signInLink);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        signInLink.click();
    }


    //assert methods
    public boolean isSignUpLinkDisplayed() {
        return signUpLink.isDisplayed();
    }

    public boolean isSignOutLinkDisplayed() {
        return signOutLink.isDisplayed();
    }

    public boolean isSignInLinkDisplayed(){
        return signInLink.isDisplayed();
    }
}
