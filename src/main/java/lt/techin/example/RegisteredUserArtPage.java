package lt.techin.example;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Point;

import java.time.Duration;

public class RegisteredUserArtPage extends BasePage{

    //box icon links
    @FindBy(css = "section:nth-of-type(1) > .collapse .ps-shown-by-js")
    private WebElement inStockBoxIconLink;

    @FindBy(css = "section:nth-of-type(2) > .collapse .ps-shown-by-js")
    private WebElement newProductBoxIconLink;

    @FindBy(css = "section:nth-of-type(4) > .collapse .ps-shown-by-js")
    private WebElement compositionBoxIconLink;

    @FindBy(css = "section:nth-of-type(5) > .collapse .custom-checkbox")
    private WebElement brandBoxIconLink;

    @FindBy(css = "section:nth-of-type(6) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement dimensionBoxIconLink1;

    @FindBy(css = "section:nth-of-type(6) > .collapse > li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement dimensionBoxIconLink2;

    @FindBy(css = "section:nth-of-type(6) > .collapse > li:nth-of-type(3) > .facet-label > .custom-checkbox")
    private WebElement dimensionBoxIconLink3;


    //links
    @FindBy(css = "li:nth-of-type(3) > .dropdown-item")
    private WebElement artPageLink;

    @FindBy(css = "section:nth-of-type(1) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement inStockLink;

    @FindBy(css = "section:nth-of-type(2) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement newProductLink;

    @FindBy(css = "section:nth-of-type(4) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement compositionLink;

    @FindBy(css = "section:nth-of-type(5) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement brandLink;

    @FindBy(css = "section:nth-of-type(6) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement dimensionLink1;

    @FindBy(css = "li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement dimensionLink2;

    @FindBy(css = "section:nth-of-type(8) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement dimensionLink3;

    //slider

    @FindBy(xpath = "//div[@id='search_filters']/section[3]/ul/li/div")
    private WebElement priceSliderLine;

    //elements

    @FindBy(xpath = "//*[contains(text(), 'Availability: In stock')]")
    private WebElement availabilityFilterMessage;

    @FindBy(xpath = "//*[contains(text(), 'Selections: New product')]")
    private WebElement selectionsFilterMessage;

    @FindBy(xpath = "//*[contains(text(), 'Price:')]")
    private WebElement priceFilterMessage;

    @FindBy(xpath = "//*[contains(text(), 'Composition: Matt paper')]")
    private WebElement compositionFilterMessage;

    @FindBy(xpath = "//*[contains(text(), 'Brand: Graphic Corner')]")
    private WebElement brandFilterMessage;

    @FindBy(xpath = "//*[contains(text(), 'Dimension: 40x60cm')]")
    private WebElement dimension1FilterMessage;

    @FindBy(xpath = "//*[contains(text(), 'Dimension: 60x90cm')]")
    private WebElement dimension2FilterMessage;

    @FindBy(xpath = "//*[contains(text(), 'Dimension: 80x120cm')]")
    private WebElement dimension3FilterMessage;

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

    //slider price adjustment method

    public void setPriceSliderValue(double price){
        // Validate the price value
        if (price < 9 || price > 35) {
            throw new IllegalArgumentException("Price must be between 9 and 35 dollars.");
        }

        // Get the size and location of the slider
        int sliderWidth = priceSliderLine.getSize().getWidth();
        Point sliderLocation = priceSliderLine.getLocation();

        // Price range
        double minPrice = 9.0;
        double maxPrice = 35.0;
        double range = maxPrice - minPrice;

        // target position (percentage of the slider width)
        double percentage = (price - minPrice) / range;
        int targetX = sliderLocation.getX() + (int) (sliderWidth * percentage);
        int targetY = sliderLocation.getY() + (priceSliderLine.getSize().getHeight() / 2); // Center vertically

        // Perform the drag and drop action
        Actions actions = new Actions(driver);
        actions.clickAndHold(priceSliderLine) // Click and hold on the slider
                .moveByOffset(targetX - sliderLocation.getX(), targetY - sliderLocation.getY()) // Move to the target position
                .release() // Release the mouse
                .build()
                .perform();
    }

    public void clickCompositionBoxIconLink(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(compositionBoxIconLink));
            compositionBoxIconLink.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickCompositionLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(compositionLink));
        compositionLink.click();
    }

    public void clickBrandBoxIconLink(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(brandBoxIconLink));
            brandBoxIconLink.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickBrandLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(brandLink));
        brandLink.click();
    }

    public void clickDimension1BoxIconLink(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(dimensionBoxIconLink1));
            dimensionBoxIconLink1.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickDimension1Link(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(dimensionLink1));
        dimensionLink1.click();
    }

    public void clickDimension2BoxIconLink(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(dimensionBoxIconLink2));
            dimensionBoxIconLink2.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickDimension2Link(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(dimensionLink2));
        dimensionLink2.click();
    }

    public void clickDimension3BoxIconLink(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
            wait.until(ExpectedConditions.elementToBeClickable(dimensionBoxIconLink3));
            dimensionBoxIconLink3.click();
        } catch (ElementClickInterceptedException e) {
            System.out.println("The 'In stock' box icon click is being intercepted: " + e.getMessage());
        }
    }

    public void clickDimension3Link(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.visibilityOf(dimensionLink3));
        dimensionLink3.click();
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

    public boolean isPriceSliderDisplayed(){
        return priceSliderLine.isDisplayed();
    }

    public boolean isCompositionBoxIconLinkDisplayed(){
        return compositionBoxIconLink.isDisplayed();
    }

    public boolean isCompositionLinkPresent(){
        return compositionBoxIconLink.isDisplayed();
    }

    public boolean isBrandBoxIconLinkDisplayed(){
        return brandBoxIconLink.isDisplayed();
    }

    public boolean isBrandLinkPresent(){
        return brandLink.isDisplayed();
    }

    public boolean isDimensionBoxIconLink1Present(){
        return dimensionBoxIconLink1.isDisplayed();
    }

    public boolean isDimensionLink1Present(){
        return dimensionLink1.isDisplayed();
    }

    public boolean isDimensionBoxIconLink2Present(){
        return dimensionBoxIconLink2.isDisplayed();
    }

    public boolean isDimensionLink2Present(){
        return dimensionLink2.isDisplayed();
    }

    public boolean isDimensionBoxIconLink3Present(){
        return dimensionBoxIconLink3.isDisplayed();
    }

    public boolean isDimensionLink3Present(){
        return dimensionLink3.isDisplayed();
    }

    //getters

    public String getAvailabilityFilterMessage(){
        return availabilityFilterMessage.getText();
    }
    public String getSelectionsFilterMessage(){
        return selectionsFilterMessage.getText();
    }
    public String getPriceFilterMessage(){
        return priceFilterMessage.getText();
    }
    public String getCompositionFilterMessage(){
        return compositionFilterMessage.getText();
    }
    public String getBrandFilterMessage(){
        return brandFilterMessage.getText();
    }
    public String getDimension1FilterMessage(){
        return dimension1FilterMessage.getText();
    }
    public String getDimension2FilterMessage(){
        return dimension2FilterMessage.getText();
    }
    public String getDimension3FilterMessage(){
        return dimension3FilterMessage.getText();
    }
}
