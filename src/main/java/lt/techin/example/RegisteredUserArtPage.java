package lt.techin.example;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserArtPage extends BasePage{

    //box icon links
    @FindBy(css = "section:nth-of-type(1) > .collapse .ps-shown-by-js")
    private WebElement inStockBoxIconLink;

    @FindBy(css = "section:nth-of-type(2) > .collapse .ps-shown-by-js")
    private WebElement newProductBoxIconLink;

    //links
    @FindBy(css = "li:nth-of-type(3) > .dropdown-item")
    private WebElement artPageLink;

    @FindBy(css = "section:nth-of-type(1) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement inStockLink;

    @FindBy(css = "section:nth-of-type(2) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement newProductLink;

    //elements

    @FindBy(xpath = "//*[contains(text(), 'Availability: In stock')]")
    private WebElement availabilityFilterMessage;

    @FindBy(xpath = "//*[contains(text(), 'Selections: New product')]")
    private WebElement selectionsFilterMessage;

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
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }


    public void clickInStockLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(inStockLink));
        inStockLink.click();
    }

    public void clickNewProductBoxIconLink(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(newProductBoxIconLink));
            newProductBoxIconLink.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickNewProductLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(newProductLink));
        newProductLink.click();
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

    public boolean isNewProductBoxIconLinkPresent(){
        return newProductBoxIconLink.isDisplayed();
    }

    public boolean isNewProductLinkPresent(){
        return newProductLink.isDisplayed();
    }

    //getter

    public String getAvailabilityFilterMessage(){
        return availabilityFilterMessage.getText();
    }

    public String getSelectionsFilterMessage(){
        return selectionsFilterMessage.getText();
    }
}
