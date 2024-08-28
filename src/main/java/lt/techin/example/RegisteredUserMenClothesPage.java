package lt.techin.example;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
    @FindBy(css = "section:nth-of-type(5) > .collapse > li:nth-of-type(1) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesWhiteLink;
    @FindBy(css = "section:nth-of-type(5) > .collapse > li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesBlackLink;


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
    @FindBy(css = "section:nth-of-type(5) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement menClothesWhiteBoxIcon;
    @FindBy(css = "section:nth-of-type(5) > .collapse > li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement menClothesBlackBoxIcon;

    //dropdown menu
    @FindBy(xpath = "//*//div[@id='js-product-list-top']//div[@class='row sort-by-row']/div[1]")
    private WebElement menClothesSortByDropdownMenu;

    //menu options
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(1)")
    private WebElement menClothesSalesOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(2)")
    private WebElement menClothesRelevanceOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(3)")
    private WebElement menClothesNameAToZOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(4)")
    private WebElement menClothesNameZToAOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(5)")
    private WebElement menClothesPriceLowToHighOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(6)")
    private WebElement menClothesPriceHighToLowOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(7)")
    private WebElement menClothesReferenceAToZOption;
    @FindBy(css = ".dropdown-menu .js-search-link:nth-of-type(8)")
    private WebElement menClothesReferenceZToAOption;


    //filter messages
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesAvailabilityFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesDiscountedFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesNewProductFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesPriceFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesSizeSFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesSizeMFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesSizeLFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesSizeXLFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesWhiteFilterMessage;
    @FindBy(xpath = "//ul/li[@class='filter-block']")
    private WebElement menClothesBlackFilterMessage;

    //products web elements
    private final List<WebElement> productImageElements = driver.findElements(By.xpath("//img[@loading='lazy']"));
    private final List<WebElement> productNameElements = driver.findElements(By.xpath("//h2[@class='h3 product-title']"));
    private final List<WebElement> productPriceElements = driver.findElements(By.xpath("//span[@class='price']"));

    // Locator for product names
    private By productNameLocator = By.xpath("//h2[@class='h3 product-title']");

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
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeSBoxIcon);
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

    public void clickMenClothesSizeXLLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeXLLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSizeXLLink));
        menClothesSizeXLLink.click();
    }

    public void clickMenClothesSizeXLBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesSizeXLBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSizeXLBoxIcon));
        menClothesSizeXLBoxIcon.click();
    }

    public void clickMenClothesWhiteLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesWhiteLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesWhiteLink));
        menClothesWhiteLink.click();
    }

    public void clickMenClothesWhiteBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesWhiteBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesWhiteBoxIcon));
        menClothesWhiteBoxIcon.click();
    }

    public void clickMenClothesBlackLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesBlackLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesBlackLink));
        menClothesBlackLink.click();
    }

    public void clickMenClothesBlackBoxIcon(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menClothesBlackBoxIcon);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesBlackBoxIcon));
        menClothesBlackBoxIcon.click();
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

    //dropdown menu methods

    public void clickMenClothesSortByDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSortByDropdownMenu));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesSortByDropdownMenu).clickAndHold().pause(Duration.ofSeconds(2)).release().perform();

    }

    //menu options methods

    public void clickMenClothesSalesOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesSalesOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesSalesOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickMenClothesRelevanceOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesRelevanceOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesRelevanceOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickMenClothesNameAToZOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesNameAToZOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesNameAToZOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickMenClothesNameZToAOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesNameZToAOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesNameZToAOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickMenClothesPriceLowToHighOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesPriceLowToHighOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesPriceLowToHighOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickMenClothesPriceHighToLowOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesPriceHighToLowOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesPriceHighToLowOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickMenClothesReferenceAToZOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesReferenceAToZOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesReferenceAToZOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
    }

    public void clickMenClothesReferenceZToAOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(menClothesReferenceZToAOption));
        Actions actions = new Actions(driver);
        actions.moveToElement(menClothesReferenceZToAOption).clickAndHold().pause(Duration.ofMillis(1200)).release().perform();
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
    public boolean isMenClothesSizeXLLinkDisplayed(){return menClothesSizeXLLink.isDisplayed();}
    public boolean isMenClothesSizeXLBoxIconDisplayed(){return menClothesSizeXLBoxIcon.isDisplayed();}
    public boolean isMenClothesWhiteLinkDisplayed(){return menClothesWhiteLink.isDisplayed();}
    public boolean isMenClothesWhiteBoxIconDisplayed(){return menClothesWhiteBoxIcon.isDisplayed();}
    public boolean isMenClothesBlackLinkDisplayed(){return menClothesBlackLink.isDisplayed();}
    public boolean isMenClothesBlackBoxIconDisplayed(){return menClothesBlackBoxIcon.isDisplayed();}

    public boolean isMenClothesSortByDropdownMenuDisplayed(){return menClothesSortByDropdownMenu.isDisplayed();}
    public boolean isMenClothesSalesOptionDisplayed(){
        return menClothesSalesOption.isDisplayed();
    }
    public boolean isMenClothesRelevanceOptionDisplayed() {
        return menClothesRelevanceOption.isDisplayed();
    }
    public boolean isMenClothesNameAToZOptionDisplayed(){
        return menClothesNameAToZOption.isDisplayed();
    }
    public boolean isMenClothesNameZToAOptionDisplayed(){
        return menClothesNameZToAOption.isDisplayed();
    }
    public boolean isMenClothesPriceLowToHighOptionDisplayed(){return menClothesPriceLowToHighOption.isDisplayed();}
    public boolean isMenClothesPriceHighToLowOptionDisplayed(){return menClothesPriceHighToLowOption.isDisplayed();}
    public boolean isMenClothesReferenceAToZOptionDisplayed(){return menClothesReferenceAToZOption.isDisplayed();}
    public boolean isMenClothesReferenceZToAOptionDisplayed(){return menClothesReferenceZToAOption.isDisplayed();}

    //filter message getters
    public String getMenClothesAvailabilityFilterMessage(){return menClothesAvailabilityFilterMessage.getText();}
    public String getMenClothesDiscountedFilterMessage(){return menClothesAvailabilityFilterMessage.getText();}
    public String getMenClothesNewProductFilterMessage(){return menClothesNewProductFilterMessage.getText();}
    public String getMenClothesPriceFilterMessage(){return menClothesPriceFilterMessage.getText();}
    public String getMenClothesSizeSFilterMessage(){return menClothesSizeSFilterMessage.getText();}
    public String getMenClothesSizeMFilterMessage(){return menClothesSizeMFilterMessage.getText();}
    public String getMenClothesSizeLFilterMessage(){return menClothesSizeLFilterMessage.getText();}
    public String getMenClothesSizeXLFilterMessage(){return menClothesSizeXLFilterMessage.getText();}
    public String getMenClothesWhiteFilterMessage(){return menClothesWhiteFilterMessage.getText();}
    public String getMenClothesBlackFilterMessage(){return menClothesBlackFilterMessage.getText();}

    //dropdown options getters
    public String getMenClothesSalesOptionText(){
        WebElement menClothesSalesOption = driver.findElement(By.linkText("Sales, highest to lowest"));
        return menClothesSalesOption.getText();
    }
    public String getMenClothesRelevanceOptionText(){
        return menClothesRelevanceOption.getText();
    }
    public String getMenClothesNameAToZOptionText(){
        return menClothesNameAToZOption.getText();
    }
    public String getMenClothesNameZToAOptionText(){
        return menClothesNameZToAOption.getText();
    }
    public String getMenClothesPriceLowToHighOptionText(){
        return menClothesPriceLowToHighOption.getText();
    }
    public String getMenClothesPriceHighToLowOptionText(){
        return menClothesPriceHighToLowOption.getText();
    }
    public String getMenClothesReferenceAToZOptionText(){
        return menClothesReferenceAToZOption.getText();
    }
    public String getMenClothesReferenceZToAOptionText(){
        return menClothesReferenceZToAOption.getText();
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
