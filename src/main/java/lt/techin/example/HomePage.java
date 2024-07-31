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
    private WebElement signInLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //button click methods
    public void clickSignInLink() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signInLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.visibilityOf(signInLink));
        signInLink.click();
    }

    //assert methods
    public boolean isSignInLinkDisplayed() {
        return signInLink.isDisplayed();
    }
}
