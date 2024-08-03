package lt.techin.example;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserHomeAccessoriesPage extends BasePage{

    //navigation links
    @FindBy(css = ".category-sub-menu > li:nth-of-type(2) > a")
    private WebElement homeAccessoriesPageLink1;
    @FindBy(css = "li:nth-of-type(2) > h5 > .subcategory-name")
    private WebElement homeAccessoriesPageLink2;
    @FindBy(css = "a[title='Home Accessories']")
    private WebElement homeAccessoriesPageBoxIcon;

    //links
    @FindBy(css = "section:nth-of-type(1) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement hmAccessoriesInStockLink;
    @FindBy(css = "section:nth-of-type(2) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement hmAccessoriesNewProductLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(1) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement hmAccessoriesWhiteColorLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement hmAccessoriesBlackColorLink;

    //icons
    @FindBy(css = "section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement hmAccessoriesInStockBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse .custom-checkbox")
    private WebElement hmAccessoriesNewProductBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement hmAccessoriesWhiteColorBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement hmAccessoriesBlackColorBoxIcon;

    //price slider
    @FindBy(xpath = "//div[@id='search_filters']/section[3]/ul/li/div")
    private WebElement hmAccessoriesPriceSliderLine;

    //search filter remover
    @FindBy(xpath = "//section[@id='js-active-search-filters']/ul//i[.='\uE5CD']")
    private WebElement removeFilterIcon;

    //filter messages
    @FindBy(xpath = "//*[contains(text(), 'Availability: In stock')]")
    private WebElement hmAccAvailabilityFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Selections: New product')]")
    private WebElement hmAccSelectionsFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Price: $12.00 - $13.00')]")
    private WebElement hmAccPriceFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Color: White')]")
    private WebElement hmAccWhiteColorFilterMessage;

    public RegisteredUserHomeAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    //navigation link click methods

    public void clickHomeAccessoriesPageLink1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(homeAccessoriesPageLink1));
        homeAccessoriesPageLink1.click();
    }

    public void clickHomeAccessoriesPageLink2(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(homeAccessoriesPageLink2));
        homeAccessoriesPageLink2.click();
    }

    public void clickHomeAccessoriesPageBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.visibilityOf(homeAccessoriesPageBoxIcon));
        homeAccessoriesPageBoxIcon.click();
    }

    // links click methods

    public void clickHomeAccessoriesInStockLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(hmAccessoriesInStockLink));
        hmAccessoriesInStockLink.click();
    }

    public void clickHomeAccessoriesInStockBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(hmAccessoriesInStockBoxIcon));
        hmAccessoriesInStockBoxIcon.click();
    }

    public void clickHomeAccessoriesNewProductLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(hmAccessoriesNewProductLink));
        hmAccessoriesNewProductLink.click();
    }

    public void clickHomeAccessoriesNewProductBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(hmAccessoriesNewProductBoxIcon));
        hmAccessoriesNewProductBoxIcon.click();
    }

    public void clickHomeAccessoriesWhiteColorLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(hmAccessoriesWhiteColorLink));
        hmAccessoriesWhiteColorLink.click();
    }

    public void clickHomeAccessoriesWhiteBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(hmAccessoriesWhiteColorBoxIcon));
        hmAccessoriesWhiteColorBoxIcon.click();
    }

    //slider price adjustment method

    public void setHmAccessoriesPriceSliderValue(double price){
        // Validate the price value
        if (price < 11 || price > 35) {
            throw new IllegalArgumentException("Price must be between 12 and 13 dollars.");
        }

        // Get the size and location of the slider
        int sliderWidth = hmAccessoriesPriceSliderLine.getSize().getWidth();
        Point sliderLocation = hmAccessoriesPriceSliderLine.getLocation();

        // Price range
        double minPrice = 11.0;
        double maxPrice = 35.0;
        double range = maxPrice - minPrice;

        // target position (percentage of the slider width)
        double percentage = (price - minPrice) / range;
        int targetX = sliderLocation.getX() + (int) (sliderWidth * percentage);
        int targetY = sliderLocation.getY() + (hmAccessoriesPriceSliderLine.getSize().getHeight() / 2); // Center vertically

        // Perform the drag and drop action
        Actions actions = new Actions(driver);
        actions.clickAndHold(hmAccessoriesPriceSliderLine) // Click and hold on the slider
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
    public boolean isHomeAccessoriesPageLink1Displayed(){
        return homeAccessoriesPageLink1.isDisplayed();
    }
    public boolean isHomeAccessoriesPageLink2Displayed(){
        return homeAccessoriesPageLink2.isDisplayed();
    }
    public boolean isHomeAccessoriesPageBoxIconDisplayed(){
        return homeAccessoriesPageBoxIcon.isDisplayed();
    }
    public boolean isHomeAccessoriesInStockLinkDisplayed(){
        return hmAccessoriesInStockLink.isDisplayed();
    }
    public boolean isHomeAccessoriesInStockBoxIconDisplayed(){
        return hmAccessoriesInStockBoxIcon.isDisplayed();
    }
    public boolean isHomeAccessoriesNewProductLinkDisplayed(){
        return hmAccessoriesNewProductLink.isDisplayed();
    }
    public boolean isHomeAccessoriesNewProductBoxIconDisplayed(){
        return hmAccessoriesNewProductBoxIcon.isDisplayed();
    }
    public boolean isHmAccessoriesPriceSliderDisplayed(){
        return hmAccessoriesPriceSliderLine.isDisplayed();
    }
    public boolean isHmAccessoriesWhiteColorLinkDisplayed(){
        return hmAccessoriesWhiteColorLink.isDisplayed();
    }
    public boolean isHmAccessoriesWhiteBoxIconDisplayed(){
        return hmAccessoriesWhiteColorBoxIcon.isDisplayed();
    }

    //filter message getters
    public String getHmAccAvailabilityFilterMessage(){
        return hmAccAvailabilityFilterMessage.getText();
    }
    public String getHmAccSelectionsFilterMessage(){
        return hmAccSelectionsFilterMessage.getText();
    }
    public String getHmAccPriceSliderFilterMessage(){
        return hmAccPriceFilterMessage.getText();
    }
    public String getHmAccWhiteColorFilterMessage(){ return hmAccWhiteColorFilterMessage.getText();}


}

