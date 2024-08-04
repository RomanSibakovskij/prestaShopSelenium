package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserMenClothesPage extends BasePage{

    //navigation links
    @FindBy(css = "#_desktop_top_menu .category:nth-of-type(1) [data-depth='0']")
    private WebElement clothesPageLink;
    @FindBy(css = ".category-sub-menu > li:nth-of-type(1) > a")
    private WebElement menClothesPageLink1;
    @FindBy(css = "li:nth-of-type(1) > h5 > .subcategory-name")
    private WebElement menClothesPageLink2;
    @FindBy(css = "a[title='Men']")
    private WebElement menClothesPageBoxIcon;

    //search filter remover
    @FindBy(xpath = "//section[@id='js-active-search-filters']/ul//i[.='\uE5CD']")
    private WebElement removeFilterIcon;

    // price slider
    @FindBy(xpath = "//div[@id='search_filters']/section[3]/ul/li/div")
    private WebElement menClothesPriceSlider;

    //links
    @FindBy(css = "section:nth-of-type(1) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement menClothesInStockLink;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(1) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesDiscountedLink;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesNewProductLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(1) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesSizeSLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesSizeMLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(3) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesSizeLLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(4) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesSizeXLLink;


    //box icons
    @FindBy(css = "section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement menClothesInStockBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement menClothesDiscountedBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesNewProductBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement menClothesSizeSBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement menClothesSizeMBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(3) > .facet-label > .custom-checkbox")
    private WebElement menClothesSizeLBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(4) > .facet-label > .custom-checkbox")
    private WebElement menClothesSizeXLBoxIcon;


    //filter messages
    @FindBy(xpath = "//*[contains(text(), 'Availability: In stock')]")
    private WebElement menClothesAvailabilityFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Selections: Discounted')]")
    private WebElement menClothesDiscountedFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Selections: New product')]")
    private WebElement menClothesNewProductFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Price: $19.00 - $24.00')]")
    private WebElement menClothesPriceFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Size: S')]")
    private WebElement menClothesSizeSFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Size: M')]")
    private WebElement menClothesSizeMFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Size: L')]")
    private WebElement menClothesSizeLFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Size: XL')]")
    private WebElement menClothesSizeXLFilterMessage;

    public RegisteredUserMenClothesPage(WebDriver driver) {
        super(driver);
    }

    //navigation links click methods

    public void clickOnClothesPageLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1250));
        wait.until(ExpectedConditions.visibilityOf(clothesPageLink));
        clothesPageLink.click();
    }

    public void clickOnMenClothesPageLink1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1250));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesPageLink1));
        menClothesPageLink1.click();
    }

    public void clickOnMenClothesPageLink2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1250));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesPageLink2));
        menClothesPageLink2.click();
    }

    public void clickOnMenClothesPageBoxIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1250));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesPageBoxIcon));
        menClothesPageBoxIcon.click();
    }

    // links click methods

    public void clickMenClothesInStockLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesInStockLink));
        menClothesInStockLink.click();
    }

    public void clickMenClothesInStockBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesInStockBoxIcon));
        menClothesInStockBoxIcon.click();
    }

    public void clickMenClothesDiscountedLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesDiscountedLink));
        menClothesDiscountedLink.click();
    }

    public void clickMenClothesDiscountedBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesDiscountedBoxIcon));
        menClothesDiscountedBoxIcon.click();
    }

    public void clickMenClothesNewProductLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesNewProductLink));
        menClothesNewProductLink.click();
    }

    public void clickMenClothesNewProductBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesNewProductBoxIcon));
        menClothesNewProductBoxIcon.click();
    }

    public void clickMenClothesSizeSLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeSLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSizeSLink));
        menClothesSizeSLink.click();
    }

    public void clickMenClothesSizeSBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeMFilterMessage);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSizeSBoxIcon));
        menClothesSizeSBoxIcon.click();
    }

    public void clickMenClothesSizeMLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeMLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSizeMLink));
        menClothesSizeMLink.click();
    }

    public void clickMenClothesSizeMBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeMBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSizeMBoxIcon));
        menClothesSizeMBoxIcon.click();
    }

    public void clickMenClothesSizeLLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeLLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSizeLLink));
        menClothesSizeLLink.click();
    }

    public void clickMenClothesSizeLBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeLBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSizeLBoxIcon));
        menClothesSizeLBoxIcon.click();
    }

    //slider price adjustment method

    public void setMenClothesPriceSliderValue(double price){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesPriceSlider);
        // Validate the price value
        if (price < 19 || price > 24) {
            throw new IllegalArgumentException("Price must be between 19 and 24 dollars.");
        }

        // Get the size and location of the slider
        int sliderWidth = menClothesPriceSlider.getSize().getWidth();
        Point sliderLocation = menClothesPriceSlider.getLocation();

        // Price range
        double minPrice = 19.0;
        double maxPrice = 24.0;
        double range = maxPrice - minPrice;

        // target position (percentage of the slider width)
        double percentage = (price - minPrice) / range;
        int targetX = sliderLocation.getX() + (int) (sliderWidth * percentage);
        int targetY = sliderLocation.getY() + (menClothesPriceSlider.getSize().getHeight() / 2); // Center vertically

        // Perform the drag and drop action
        Actions actions = new Actions(driver);
        actions.clickAndHold(menClothesPriceSlider) // Click and hold on the slider
                .moveByOffset(targetX - sliderLocation.getX(), targetY - sliderLocation.getY()) // Move to the target position
                .release() // Release the mouse
                .build()
                .perform();
    }


    //remove search filter

    public void clickRemoveSearchFilter(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1870));
        wait.until(ExpectedConditions.visibilityOf(removeFilterIcon));
        removeFilterIcon.click();
    }

    //assert methods
    public boolean isClothesPageLinkDisplayed() {return clothesPageLink.isDisplayed();}
    public boolean isMenClothesPageLink1Displayed() {return menClothesPageLink1.isDisplayed();}
    public boolean isMenClothesPageLink2Displayed() {return menClothesPageLink2.isDisplayed();}
    public boolean isMenClothesPageBoxIconDisplayed() {return menClothesPageBoxIcon.isDisplayed();}
    public boolean isMenClothesInStockLinkDisplayed() {return menClothesInStockLink.isDisplayed();}
    public boolean isMenClothesInStockBoxIconDisplayed() {return menClothesInStockBoxIcon.isDisplayed();}
    public boolean isMenClothesDiscountedLinkDisplayed(){return menClothesDiscountedLink.isDisplayed();}
    public boolean isMenClothesDiscountedBoxIconDisplayed(){return menClothesDiscountedBoxIcon.isDisplayed();}
    public boolean isMenClothesNewProductLinkDisplayed(){return menClothesNewProductLink.isDisplayed();}
    public boolean isMenClothesNewProductBoxIconDisplayed(){return menClothesNewProductBoxIcon.isDisplayed();}
    public boolean isMenClothesPriceSliderDisplayed(){return menClothesPriceSlider.isDisplayed();}
    public boolean isMenClothesSizeSLinkDisplayed(){return menClothesSizeSLink.isDisplayed();}
    public boolean isMenClothesSizeSBoxIconDisplayed(){return menClothesSizeSBoxIcon.isDisplayed();}
    public boolean isMenClothesSizeMLinkDisplayed(){return menClothesSizeMLink.isDisplayed();}
    public boolean isMenClothesSizeMBoxIconDisplayed(){return menClothesSizeMBoxIcon.isDisplayed();}
    public boolean isMenClothesSizeLLinkDisplayed(){return menClothesSizeLLink.isDisplayed();}
    public boolean isMenClothesSizeLBoxIconDisplayed(){return menClothesSizeLBoxIcon.isDisplayed();}

    //filter message getters
    public String getMenClothesAvailabilityFilterMessage(){return menClothesAvailabilityFilterMessage.getText();}
    public String getMenClothesDiscountedFilterMessage(){return menClothesAvailabilityFilterMessage.getText();}
    public String getMenClothesNewProductFilterMessage(){return menClothesNewProductFilterMessage.getText();}
    public String getMenClothesPriceFilterMessage(){return menClothesPriceFilterMessage.getText();}
    public String getMenClothesSizeSFilterMessage(){return menClothesSizeSFilterMessage.getText();}
    public String getMenClothesSizeMFilterMessage(){return menClothesSizeMFilterMessage.getText();}
    public String getMenClothesSizeLFilterMessage(){return menClothesSizeLFilterMessage.getText();}




}
