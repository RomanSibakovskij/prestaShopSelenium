package lt.techin.example;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserStationaryAccessoriesPage extends BasePage{

    //navigation links
    @FindBy(xpath = "//ul[@id='top-menu']//a[@href='http://192.168.88.247/6-accessories']")
    private WebElement accessoriesPageLink;
    @FindBy(css = ".category-sub-menu > li:nth-of-type(1) > a")
    private WebElement stationaryAccessoriesPageLink1;
    @FindBy(css = "a[title='Stationery']")
    private WebElement stationaryAccessoriesPageBoxIcon;
    @FindBy(css = "li:nth-of-type(1) > h5 > .subcategory-name")
    private WebElement stationaryAccessoriesPageLink2;

    //links
    @FindBy(css = "section:nth-of-type(1) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement stAccessoriesInStockLink;
    @FindBy(css = "section:nth-of-type(2) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement stAccessoriesNewProductLink;
    @FindBy(css = "li:nth-of-type(1) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement stAccessoriesRuledPaperLink;
    @FindBy(css = "li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement stAccessoriesPlainPaperLink;
    @FindBy(css = "li:nth-of-type(3) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement stAccessoriesSquaredPaperLink;
    @FindBy(css = "li:nth-of-type(4) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement stAccessoriesDottedPaperLink;

    //price slider
    @FindBy(xpath = "//div[@id='search_filters']/section[3]/ul/li/div")
    private WebElement stAccessoriesPriceSliderLine;

    //search filter remover
    @FindBy(xpath = "//section[@id='js-active-search-filters']/ul//i[.='\uE5CD']")
    private WebElement removeFilterIcon;

    //box icons
    @FindBy(css = "section:nth-of-type(1) > .collapse .ps-shown-by-js")
    private WebElement stAccessoriesInStockBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse .ps-shown-by-js")
    private WebElement stAccessoriesNewProductBoxIcon;
    @FindBy(css = "li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement stAccessoriesRuledPaperBoxIcon;
    @FindBy(css = "li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement stAccessoriesPlainPaperBoxIcon;
    @FindBy(css = "li:nth-of-type(3) > .facet-label > .custom-checkbox")
    private WebElement stAccessoriesSquaredPaperBoxIcon;
    @FindBy(css = "li:nth-of-type(4) > .facet-label > .custom-checkbox")
    private WebElement stAccessoriesDottedPaperBoxIcon;

    //filter messages
    @FindBy(xpath = "//*[contains(text(), 'Availability: In stock')]")
    private WebElement stAccAvailabilityFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Selections: New product')]")
    private WebElement stAccSelectionsFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Price: $12.00 - $13.00')]")
    private WebElement stAccPriceFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Paper Type: Ruled')]")
    private WebElement stAccRuledPaperFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Paper Type: Plain')]")
    private WebElement stAccPlainPaperFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Paper Type: Squared')]")
    private WebElement stAccSquaredPaperFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Paper Type: Doted')]")
    private WebElement stAccDottedPaperFilterMessage;



    public RegisteredUserStationaryAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    //button, links click methods

    public void clickAccessoriesPageLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(accessoriesPageLink));
        accessoriesPageLink.click();
    }

    public void clickStationaryAccessoriesPageLink1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stationaryAccessoriesPageLink1));
        stationaryAccessoriesPageLink1.click();
    }

    public void clickStationaryAccessoriesPageLink2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stationaryAccessoriesPageLink2));
        stationaryAccessoriesPageLink2.click();
    }

    public void clickStationaryAccessoriesPageBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stationaryAccessoriesPageBoxIcon));
        stationaryAccessoriesPageBoxIcon.click();
    }

    //stationary accessories product filter click methods
    public void clickStAccInStockBoxIcon(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesInStockBoxIcon));
            stAccessoriesInStockBoxIcon.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickStAccInStockLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stAccessoriesInStockLink));
        stAccessoriesInStockLink.click();
    }

    public void clickStAccNewProductBoxIcon(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesNewProductBoxIcon));
            stAccessoriesNewProductBoxIcon.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickStAccNewProductLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stAccessoriesNewProductLink));
        stAccessoriesNewProductLink.click();
    }

    public void clickStAccRuledPaperBoxIcon(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesRuledPaperBoxIcon));
            stAccessoriesRuledPaperBoxIcon.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickStAccRuledPaperLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stAccessoriesRuledPaperLink));
        stAccessoriesRuledPaperLink.click();
    }

    public void clickStAccPlainPaperBoxIcon(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesPlainPaperBoxIcon));
            stAccessoriesPlainPaperBoxIcon.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickStAccPlainPaperLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stAccessoriesPlainPaperLink));
        stAccessoriesPlainPaperLink.click();
    }
    public void clickStAccSquaredPaperBoxIcon(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesSquaredPaperBoxIcon));
            stAccessoriesSquaredPaperBoxIcon.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickStAccSquaredPaperLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stAccessoriesSquaredPaperLink));
        stAccessoriesSquaredPaperLink.click();
    }

    public void clickStAccDottedPaperBoxIcon(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesDottedPaperBoxIcon));
            stAccessoriesDottedPaperBoxIcon.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickStAccDottedPaperLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(stAccessoriesDottedPaperLink));
        stAccessoriesDottedPaperLink.click();
    }

    //slider price adjustment method

    public void setStAccessoriesPriceSliderValue(double price){
        // Validate the price value
        if (price < 12 || price > 13) {
            throw new IllegalArgumentException("Price must be between 12 and 13 dollars.");
        }

        // Get the size and location of the slider
        int sliderWidth = stAccessoriesPriceSliderLine.getSize().getWidth();
        Point sliderLocation = stAccessoriesPriceSliderLine.getLocation();

        // Price range
        double minPrice = 12.0;
        double maxPrice = 13.0;
        double range = maxPrice - minPrice;

        // target position (percentage of the slider width)
        double percentage = (price - minPrice) / range;
        int targetX = sliderLocation.getX() + (int) (sliderWidth * percentage);
        int targetY = sliderLocation.getY() + (stAccessoriesPriceSliderLine.getSize().getHeight() / 2); // Center vertically

        // Perform the drag and drop action
        Actions actions = new Actions(driver);
        actions.clickAndHold(stAccessoriesPriceSliderLine) // Click and hold on the slider
                .moveByOffset(targetX - sliderLocation.getX(), targetY - sliderLocation.getY()) // Move to the target position
                .release() // Release the mouse
                .build()
                .perform();
    }


    //remove search filter

    public void clickRemoveSearchFilter(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(removeFilterIcon));
        removeFilterIcon.click();
    }

    //assert methods

    public boolean isAccessoriesPageLinkDisplayed(){
        return accessoriesPageLink.isDisplayed();
    }
    public boolean isStationaryAccessoriesPageLink1Displayed(){
        return stationaryAccessoriesPageLink1.isDisplayed();
    }
    public boolean isStationaryAccessoriesPageBoxIconDisplayed(){
        return stationaryAccessoriesPageBoxIcon.isDisplayed();
    }
    public boolean isStationaryAccessoriesPageLink2Displayed(){
        return stationaryAccessoriesPageLink2.isDisplayed();
    }
    public boolean isStAccessoriesInStockBoxIconDisplayed(){
        return stAccessoriesInStockBoxIcon.isDisplayed();
    }
    public boolean isStAccessoriesInStockLinkDisplayed(){
        return stAccessoriesInStockLink.isDisplayed();
    }
    public boolean isStAccessoriesNewProductBoxIconDisplayed(){
        return stAccessoriesNewProductBoxIcon.isDisplayed();
    }
    public boolean isStAccessoriesNewProductLinkDisplayed(){
        return stAccessoriesNewProductLink.isDisplayed();
    }
    public boolean isStAccessoriesPriceSliderDisplayed(){
        return stAccessoriesPriceSliderLine.isDisplayed();
    }

    public boolean isStAccessoriesRuledPaperBoxIconDisplayed(){
        return stAccessoriesRuledPaperBoxIcon.isDisplayed();
    }
    public boolean isStAccessoriesRuledPaperLinkDisplayed(){
        return stAccessoriesRuledPaperLink.isDisplayed();
    }
    public boolean isStAccessoriesPlainPaperBoxIconDisplayed(){
        return stAccessoriesPlainPaperBoxIcon.isDisplayed();
    }
    public boolean isStAccessoriesPlainPaperLinkDisplayed(){
        return stAccessoriesPlainPaperLink.isDisplayed();
    }
    public boolean isStAccessoriesSquaredPaperBoxIconDisplayed(){
        return stAccessoriesSquaredPaperBoxIcon.isDisplayed();
    }
    public boolean isStAccessoriesSquaredPaperLinkDisplayed(){
        return stAccessoriesSquaredPaperLink.isDisplayed();
    }
    public boolean isStAccessoriesDottedPaperBoxIconDisplayed(){
        return stAccessoriesDottedPaperBoxIcon.isDisplayed();
    }
    public boolean isStAccessoriesDottedPaperLinkDisplayed(){
        return stAccessoriesDottedPaperBoxIcon.isDisplayed();
    }

    //filter text getters

    public String getStAccAvailabilityFilterMessage(){
        return stAccAvailabilityFilterMessage.getText();
    }
    public String getStAccSelectionsFilterMessage(){
        return stAccSelectionsFilterMessage.getText();
    }
    public String getStAccPriceFilterMessage(){
        return stAccPriceFilterMessage.getText();
    }
    public String getStAccRuledPaperFilterMessage(){
        return stAccRuledPaperFilterMessage.getText();
    }
}
