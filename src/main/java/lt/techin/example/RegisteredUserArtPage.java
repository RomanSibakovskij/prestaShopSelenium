package lt.techin.example;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserArtPage extends BasePage{

    //links
    @FindBy(css = "li:nth-of-type(3) > .dropdown-item")
    private WebElement artPageLink;

    @FindBy(xpath = "//div[@id='search_filters']/section[1]/ul[@class='collapse']//input[@type='checkbox']")
    private WebElement inStockBoxIconLink;

    @FindBy(css = "section:nth-of-type(1) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement inStockLink;

    public RegisteredUserArtPage(WebDriver driver) {
        super(driver);
    }

    //click methods

    public void clickArtLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(artPageLink));
        artPageLink.click();
    }

    public void clickInStockBoxIconLink(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(inStockBoxIconLink));
            inStockBoxIconLink.click();
        } catch (TimeoutException e) {
            System.out.println("The 'In stock' box icon isn't clickable within the timeout period: " + e.getMessage());
        } catch (Exception e) {
            // This will catch any other exceptions that are not TimeoutException
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    public void clickInStockLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(inStockLink));
        inStockLink.click();
    }


    //assert methods
    public boolean isArtPageLinkPresent(){
        return artPageLink.isDisplayed();
    }

    public boolean isInStockBoxIconLinkPresent(){
        return inStockBoxIconLink.isDisplayed();
    }

    public boolean isInStockLinkPresent(){
        return inStockLink.isDisplayed();
    }

}
