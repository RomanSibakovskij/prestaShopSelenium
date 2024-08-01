package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserArtPage extends BasePage{

    //link
    @FindBy(css = "li:nth-of-type(3) > .dropdown-item")
    private WebElement artPageLink;

    public RegisteredUserArtPage(WebDriver driver) {
        super(driver);
    }

    //click methods

    public void clickArtLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(artPageLink));
        artPageLink.click();
    }


    //assert methods
    public boolean isArtPageLinkPresent(){
        return artPageLink.isDisplayed();
    }

}
