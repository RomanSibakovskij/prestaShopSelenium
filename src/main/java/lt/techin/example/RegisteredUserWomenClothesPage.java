package lt.techin.example;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RegisteredUserWomenClothesPage extends BasePage{

    //navigation links
    @FindBy(css = ".category-sub-menu > li:nth-of-type(2) > a")
    private WebElement womenClothesPageLink1;
    @FindBy(css = "li:nth-of-type(2) > h5 > .subcategory-name")
    private WebElement womenClothesPageLink2;
    @FindBy(css = "a[title='Women']")
    private WebElement womenClothesPageBoxIcon;

    //links
    @FindBy(css = "section:nth-of-type(1) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement womenClothesInStockLink;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(1) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement womenClothesDiscountedLink;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement womenClothesNewProductLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(1) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement womenClothesSizeSLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement womenClothesSizeMLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(3) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement womenClothesSizeLLink;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(4) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement womenClothesSizeXLLink;

    //box icons
    @FindBy(css = "section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement womenClothesInStockBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement womenClothesDiscountedBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement womenClothesNewClothesBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement womenClothesSizeSBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement womenClothesSizeMBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(3) > .facet-label > .custom-checkbox")
    private WebElement womenClothesSizeLBoxIcon;
    @FindBy(css = "section:nth-of-type(4) > .collapse > li:nth-of-type(4) > .facet-label > .custom-checkbox")
    private WebElement womenClothesSizeXLBoxIcon;

    //search filter remover
    @FindBy(xpath = "//section[@id='js-active-search-filters']/ul//i[.='\uE5CD']")
    private WebElement removeFilterIcon;

    // price slider
    @FindBy(xpath = "//div[@id='search_filters']/section[3]/ul/li/div")
    private WebElement womenClothesPriceSlider;

    //dropdown menu
    @FindBy(xpath = "//*//div[@id='js-product-list-top']//div[@class='row sort-by-row']/div[1]")
    private WebElement womenClothesSortByDropdownMenu;

    //menu options
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(1)")
    private WebElement womenClothesSalesOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(2)")
    private WebElement womenClothesRelevanceOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(3)")
    private WebElement womenClothesNameAToZOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(4)")
    private WebElement womenClothesNameZToAOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(5)")
    private WebElement womenClothesPriceLowToHighOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(6)")
    private WebElement womenClothesPriceHighToLowOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(7)")
    private WebElement womenClothesReferenceAToZOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(8)")
    private WebElement womenClothesReferenceZToAOption;

    //filter messages
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement womenClothesAvailabilityFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement womenClothesDiscountedFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement womenClothesNewProductFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement womenClothesPriceFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement womenClothesSizeSFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement womenClothesSizeMFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement womenClothesSizeLFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement womenClothesSizeXLFilterMessage;

    //products web elements
    private final List<WebElement> productImageElements = driver.findElements(By.xpath("//img[@loading='lazy']"));
    private final List<WebElement> productNameElements = driver.findElements(By.xpath("//h2[@class='h3 product-title']"));
    private final List<WebElement> productPriceElements = driver.findElements(By.xpath("//span[@class='price']"));

    // Locator for product names
    private By productNameLocator = By.xpath("//h2[@class='h3 product-title']");

    public RegisteredUserWomenClothesPage(WebDriver driver) {
        super(driver);
    }

    //navigation links click methods

    public void clickOnWomenClothesPageLink1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1250));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesPageLink1));
        womenClothesPageLink1.click();
    }

    public void clickOnWomenClothesPageLink2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1250));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesPageLink2));
        womenClothesPageLink2.click();
    }

    public void clickOnWomenClothesPageBoxIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1250));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesPageBoxIcon));
        womenClothesPageBoxIcon.click();
    }

    // links click methods

    public void clickWomenClothesInStockLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesInStockLink));
        womenClothesInStockLink.click();
    }

    public void clickWomenClothesInStockBoxIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesInStockBoxIcon));
        womenClothesInStockBoxIcon.click();
    }

    public void clickWomenClothesDiscountedLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesDiscountedLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesDiscountedLink));
        womenClothesDiscountedLink.click();
    }

    public void clickWomenClothesDiscountedBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesDiscountedBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesDiscountedBoxIcon));
        womenClothesDiscountedBoxIcon.click();
    }

    public void clickWomenClothesNewProductLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesNewProductLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesNewProductLink));
        womenClothesNewProductLink.click();
    }

    public void clickWomenClothesNewProductBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesNewClothesBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesNewClothesBoxIcon));
        womenClothesNewClothesBoxIcon.click();
    }

    public void clickWomenClothesSizeSLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesSizeSLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSizeSLink));
        womenClothesSizeSLink.click();
    }

    public void clickWomenClothesSizeSBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesSizeSBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSizeSBoxIcon));
        womenClothesSizeSBoxIcon.click();
    }

    public void clickWomenClothesSizeMLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesSizeMLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSizeMLink));
        womenClothesSizeMLink.click();
    }

    public void clickWomenClothesSizeMBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesSizeMBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSizeMBoxIcon));
        womenClothesSizeMBoxIcon.click();
    }

    public void clickWomenClothesSizeLLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesSizeLLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSizeLLink));
        womenClothesSizeLLink.click();
    }

    public void clickWomenClothesSizeLBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesSizeLBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSizeLBoxIcon));
        womenClothesSizeLBoxIcon.click();
    }

    public void clickWomenClothesSizeXLLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesSizeXLLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSizeXLLink));
        womenClothesSizeXLLink.click();
    }

    public void clickWomenClothesSizeXLBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesSizeXLBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSizeXLBoxIcon));
        womenClothesSizeXLBoxIcon.click();
    }

    //slider price adjustment method

    public void setMenClothesPriceSliderValue(double price){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womenClothesPriceSlider);
        // Validate the price value
        if (price < 28 || price > 36) {
            throw new IllegalArgumentException("Price must be between 28 and 36 dollars.");
        }

        // Get the size and location of the slider
        int sliderWidth = womenClothesPriceSlider.getSize().getWidth();
        Point sliderLocation = womenClothesPriceSlider.getLocation();

        // Price range
        double minPrice = 28.0;
        double maxPrice = 36.0;
        double range = maxPrice - minPrice;

        // target position (percentage of the slider width)
        double percentage = (price - minPrice) / range;
        int targetX = sliderLocation.getX() + (int) (sliderWidth * percentage);
        int targetY = sliderLocation.getY() + (womenClothesPriceSlider.getSize().getHeight() / 2); // Center vertically

        // Perform the drag and drop action
        Actions actions = new Actions(driver);
        actions.clickAndHold(womenClothesPriceSlider) // Click and hold on the slider
                .moveByOffset(targetX - sliderLocation.getX(), targetY - sliderLocation.getY()) // Move to the target position
                .release() // Release the mouse
                .build()
                .perform();
    }

    //dropdown menu methods

    public void clickWomenClothesSortByDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSortByDropdownMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesSortByDropdownMenu).clickAndHold().pause(Duration.ofSeconds(2)).release().perform();

    }

    //menu options methods

    public void clickWomenClothesSalesOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesSalesOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesSalesOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickWomenClothesRelevanceOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesRelevanceOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesRelevanceOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickWomenClothesNameAToZOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesNameAToZOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesNameAToZOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickWomenClothesNameZToAOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesNameZToAOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesNameZToAOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickWomenClothesPriceLowToHighOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesPriceLowToHighOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesPriceLowToHighOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickWomenClothesPriceHighToLowOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesPriceHighToLowOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesPriceHighToLowOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickWomenClothesReferenceAToZOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesReferenceAToZOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesReferenceAToZOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickWomenClothesReferenceZToAOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(womenClothesReferenceZToAOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(womenClothesReferenceZToAOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1870));
        wait.until(ExpectedConditions.visibilityOf(removeFilterIcon));
        removeFilterIcon.click();
    }

    //assert methods
    public boolean isWomenClothesPageLink1Displayed() {return womenClothesPageLink1.isDisplayed();}
    public boolean isWomenClothesPageLink2Displayed() {return womenClothesPageLink2.isDisplayed();}
    public boolean isWomenClothesPageBoxIconDisplayed() {return womenClothesPageBoxIcon.isDisplayed();}
    public boolean isWomenClothesInStockLinkDisplayed() {return womenClothesInStockLink.isDisplayed();}
    public boolean isWomenClothesInStockBoxIconDisplayed() {return womenClothesInStockBoxIcon.isDisplayed();}
    public boolean isWomenClothesDiscountedLinkDisplayed() {return womenClothesDiscountedLink.isDisplayed();}
    public boolean isWomenClothesDiscountedBoxIconDisplayed() {return womenClothesDiscountedBoxIcon.isDisplayed();}
    public boolean isWomenClothesNewProductLinkDisplayed() {return womenClothesNewProductLink.isDisplayed();}
    public boolean isWomenClothesNewProductBoxIconDisplayed() {return womenClothesNewClothesBoxIcon.isDisplayed();}
    public boolean isWomenClothesPriceSliderDisplayed() {return womenClothesPriceSlider.isDisplayed();}
    public boolean isWomenClothesSizeSLinkDisplayed() {return womenClothesSizeSLink.isDisplayed();}
    public boolean isWomenClothesSizeSBoxIconDisplayed() {return womenClothesSizeSBoxIcon.isDisplayed();}
    public boolean isWomenClothesSizeMLinkDisplayed() {return womenClothesSizeMLink.isDisplayed();}
    public boolean isWomenClothesSizeMBoxIconDisplayed() {return womenClothesSizeMBoxIcon.isDisplayed();}
    public boolean isWomenClothesSizeLLinkDisplayed() {return womenClothesSizeLLink.isDisplayed();}
    public boolean isWomenClothesSizeLBoxIconDisplayed() {return womenClothesSizeLBoxIcon.isDisplayed();}
    public boolean isWomenClothesSizeXLLinkDisplayed() {return womenClothesSizeXLLink.isDisplayed();}
    public boolean isWomenClothesSizeXLBoxIconDisplayed() {return womenClothesSizeXLBoxIcon.isDisplayed();}

    public boolean isWomenClothesSortByDropdownMenuDisplayed(){return womenClothesSortByDropdownMenu.isDisplayed();}
    public boolean isWomenClothesSalesOptionDisplayed(){
        return womenClothesSalesOption.isDisplayed();
    }
    public boolean isWomenClothesRelevanceOptionDisplayed() {
        return womenClothesRelevanceOption.isDisplayed();
    }
    public boolean isWomenClothesNameAToZOptionDisplayed(){
        return womenClothesNameAToZOption.isDisplayed();
    }
    public boolean isWomenClothesNameZToAOptionDisplayed(){
        return womenClothesNameZToAOption.isDisplayed();
    }
    public boolean isWomenClothesPriceLowToHighOptionDisplayed(){return womenClothesPriceLowToHighOption.isDisplayed();}
    public boolean isWomenClothesPriceHighToLowOptionDisplayed(){return womenClothesPriceHighToLowOption.isDisplayed();}
    public boolean isWomenClothesReferenceAToZOptionDisplayed(){return womenClothesReferenceAToZOption.isDisplayed();}
    public boolean isWomenClothesReferenceZToAOptionDisplayed(){return womenClothesReferenceZToAOption.isDisplayed();}


    //filter message getters
    public String getWomenClothesAvailabilityFilterMessage(){return womenClothesAvailabilityFilterMessage.getText();}
    public String getWomenClothesDiscountedFilterMessage(){return womenClothesDiscountedFilterMessage.getText();}
    public String getWomenClothesNewProductFilterMessage(){return womenClothesNewProductFilterMessage.getText();}
    public String getWomenClothesPriceFilterMessage(){return womenClothesPriceFilterMessage.getText();}
    public String getWomenClothesSizeSFilterMessage(){return womenClothesSizeSFilterMessage.getText();}
    public String getWomenClothesSizeMFilterMessage(){return womenClothesSizeMFilterMessage.getText();}
    public String getWomenClothesSizeLFilterMessage(){return womenClothesSizeLFilterMessage.getText();}
    public String getWomenClothesSizeXLFilterMessage(){return womenClothesSizeXLFilterMessage.getText();}

    public String getWomenClothesSalesOptionText(){
        WebElement womenClothesSalesOption = driver.findElement(By.linkText("Sales, highest to lowest"));
        return womenClothesSalesOption.getText();
    }
    public String getWomenClothesRelevanceOptionText(){
        return womenClothesRelevanceOption.getText();
    }
    public String getWomenClothesNameAToZOptionText(){
        return womenClothesNameAToZOption.getText();
    }
    public String getWomenClothesNameZToAOptionText(){
        return womenClothesNameZToAOption.getText();
    }
    public String getWomenClothesPriceLowToHighOptionText(){
        return womenClothesPriceLowToHighOption.getText();
    }
    public String getWomenClothesPriceHighToLowOptionText(){
        return womenClothesPriceHighToLowOption.getText();
    }
    public String getWomenClothesReferenceAToZOptionText(){
        return womenClothesReferenceAToZOption.getText();
    }
    public String getWomenClothesReferenceZToAOptionText(){
        return womenClothesReferenceZToAOption.getText();
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
