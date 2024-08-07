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
    public RegisteredUserInformationPage(WebDriver driver) {
        super(driver);
    }

    //information page navigation method
    public void clickInformationLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(informationLink));
        informationLink.click();
    }

    //information link assert method
    public boolean isInformationLinkDisplayed(){return informationLink.isDisplayed();}



}
