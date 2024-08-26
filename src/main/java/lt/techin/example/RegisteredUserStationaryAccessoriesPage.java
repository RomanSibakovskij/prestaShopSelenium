package lt.techin.example;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RegisteredUserStationaryAccessoriesPage extends BasePage{

    //navigation links
//    @FindBy(xpath = "//ul[@id='top-menu']//a[@href='http://192.168.88.247/6-accessories']")
//    private WebElement accessoriesPageLink;
    @FindBy(css = "#_desktop_top_menu .category:nth-of-type(2) [data-depth='0']")
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
    @FindBy(css = "section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement stAccessoriesInStockBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse .custom-checkbox")
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
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement stAccAvailabilityFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement stAccSelectionsFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement stAccPriceFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement stAccRuledPaperFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement stAccPlainPaperFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement stAccSquaredPaperFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement stAccDottedPaperFilterMessage;

    //dropdown menu

    @FindBy(xpath = "//*//div[@id='js-product-list-top']//div[@class='row sort-by-row']/div[1]")
    private WebElement stAccessoriesSortByDropdownMenu;

    //menu options

    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(1)")
    private WebElement stAccessoriesSalesOption;

    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(2)")
    private WebElement stAccessoriesRelevanceOption;

    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(3)")
    private WebElement stAccessoriesNameAToZOption;

    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(4)")
    private WebElement stAccessoriesNameZToAOption;

    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(5)")
    private WebElement stAccessoriesPriceLowToHighOption;

    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(6)")
    private WebElement stAccessoriesPriceHighToLowOption;

    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(7)")
    private WebElement stAccessoriesReferenceAToZOption;

    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(8)")
    private WebElement stAccessoriesReferenceZToAOption;

    //products web elements
    private final List<WebElement> productImageElements = driver.findElements(By.xpath("//img[@loading='lazy']"));
    private final List<WebElement> productNameElements = driver.findElements(By.xpath("//h2[@class='h3 product-title']"));
    private final List<WebElement> productPriceElements = driver.findElements(By.xpath("//span[@class='price']"));

    // Locator for product names
    private By productNameLocator = By.xpath("//h2[@class='h3 product-title']");


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

    //dropdown menu methods

    public void clickStSortByDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesSortByDropdownMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesSortByDropdownMenu).clickAndHold().pause(Duration.ofSeconds(2)).release().perform();

    }

    //menu options methods

    public void clickStAccessoriesSalesOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesSalesOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesSalesOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }


    public void clickStAccessoriesRelevanceOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesRelevanceOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesRelevanceOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickStAccessoriesNameAToZOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesNameAToZOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesNameAToZOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickStAccessoriesNameZToAOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesNameZToAOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesNameZToAOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickStAccessoriesPriceLowToHighOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesPriceLowToHighOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesPriceLowToHighOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickStAccessoriesPriceHighToLowOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesPriceHighToLowOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesPriceHighToLowOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickStAccessoriesReferenceAToZOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesReferenceAToZOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesReferenceAToZOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickStAccessoriesReferenceZToAOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(stAccessoriesReferenceZToAOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(stAccessoriesReferenceZToAOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }
    //product elements list (for count)
    private List<WebElement> getProductElements() {return driver.findElements(productNameLocator);}
    // products list methods
    public List<String> getProductImages() {
        List<String> productImages = new ArrayList<>();
        for (WebElement productImage : productImageElements) {
            if (productImage.isDisplayed()) {
                String imageSrc = productImage.getAttribute("src");
                productImages.add(imageSrc);
            } else {
                productImages.add("Image not displayed");
            }
        }
        return productImages;
    }

    public List<String> getProductNames() {
        List<String> productNames = new ArrayList<>();
        for (WebElement product : productNameElements) {
            String name = product.getText();
            productNames.add(name);
        }
        return productNames;
    }

    public List<String> getProductPrices() {
        List<String> productPrices = new ArrayList<>();
        for (WebElement product : productPriceElements) {
            String price = product.getText();
            productPrices.add(price);
        }
        return productPrices;
    }
    //remove search filter

    public void clickRemoveSearchFilter(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
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
    public boolean isStationaryAccessoriesPageBoxIconDisplayed(){return stationaryAccessoriesPageBoxIcon.isDisplayed();}
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
    public boolean isStAccessoriesSquaredPaperBoxIconDisplayed(){return stAccessoriesSquaredPaperBoxIcon.isDisplayed();}
    public boolean isStAccessoriesSquaredPaperLinkDisplayed(){
        return stAccessoriesSquaredPaperLink.isDisplayed();
    }
    public boolean isStAccessoriesDottedPaperBoxIconDisplayed(){return stAccessoriesDottedPaperBoxIcon.isDisplayed();}
    public boolean isStAccessoriesDottedPaperLinkDisplayed(){
        return stAccessoriesDottedPaperBoxIcon.isDisplayed();
    }

    public boolean isStAccessoriesSortByDropdownMenuDisplayed(){return stAccessoriesSortByDropdownMenu.isDisplayed();}
    public boolean isStAccessoriesSalesOptionDisplayed(){
        return stAccessoriesSalesOption.isDisplayed();
    }
    public boolean isStAccessoriesRelevanceOptionDisplayed() {
        return stAccessoriesRelevanceOption.isDisplayed();
    }
    public boolean isStAccessoriesNameAToZOptionDisplayed(){
        return stAccessoriesNameAToZOption.isDisplayed();
    }
    public boolean isStAccessoriesNameZToAOptionDisplayed(){
        return stAccessoriesNameZToAOption.isDisplayed();
    }
    public boolean isStAccessoriesPriceLowToHighOptionDisplayed(){return stAccessoriesPriceLowToHighOption.isDisplayed();}
    public boolean isStAccessoriesPriceHighToLowOptionDisplayed(){return stAccessoriesPriceHighToLowOption.isDisplayed();}
    public boolean isStAccessoriesReferenceAToZOptionDisplayed(){return stAccessoriesReferenceAToZOption.isDisplayed();}
    public boolean isStAccessoriesReferenceZToAOptionDisplayed(){return stAccessoriesReferenceZToAOption.isDisplayed();}

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

    //dropdown options getters

    public String getStAccessoriesSalesOptionText(){
        WebElement stAccessoriesSalesOption = driver.findElement(By.linkText("Sales, highest to lowest"));
        return stAccessoriesSalesOption.getText();
    }
    public String getStAccessoriesRelevanceOptionText(){
        return stAccessoriesRelevanceOption.getText();
    }
    public String getStAccessoriesNameAToZOptionText(){
        return stAccessoriesNameAToZOption.getText();
    }
    public String getStAccessoriesNameZToAOptionText(){
        return stAccessoriesNameZToAOption.getText();
    }
    public String getStAccessoriesPriceLowToHighOptionText(){
        return stAccessoriesPriceLowToHighOption.getText();
    }
    public String getStAccessoriesPriceHighToLowOptionText(){
        return stAccessoriesPriceHighToLowOption.getText();
    }
    public String getStAccessoriesReferenceAToZOptionText(){
        return stAccessoriesReferenceAToZOption.getText();
    }
    public String getStAccessoriesReferenceZToAOptionText(){
        return stAccessoriesReferenceZToAOption.getText();
    }

    // Method to get the product count
    public int getProductCount() {
        return getProductElements().size();
    }
    //locator getter
    public By getProductLocator() {
        return productNameLocator;
    }
}
