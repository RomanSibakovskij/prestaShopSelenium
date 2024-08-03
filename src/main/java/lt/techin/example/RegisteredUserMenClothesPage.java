package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    //links
    @FindBy(css = "section:nth-of-type(1) > .collapse ._gray-darker.js-search-link.search-link")
    private WebElement menClothesInStockLink;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(1) > .facet-label > .custom-checkbox")
    private WebElement menClothesDiscountedLink;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(2) > .facet-label > .custom-checkbox")
    private WebElement menClothesNewProductLink;


    //box icons
    @FindBy(css = "section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement menClothesInStockBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(1) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesDiscountedBoxIcon;
    @FindBy(css = "section:nth-of-type(2) > .collapse > li:nth-of-type(2) > .facet-label > ._gray-darker.js-search-link.search-link")
    private WebElement menClothesNewProductBoxIcon;


    //filter messages
    @FindBy(xpath = "//*[contains(text(), 'Availability: In stock')]")
    private WebElement menClothesAvailabilityFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Selections: Discounted')]")
    private WebElement menClothesDiscountedFilterMessage;
    @FindBy(xpath = "//*[contains(text(), 'Selections: New Product')]")
    private WebElement menClothesNewProductFilterMessage;

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


    //filter message getters
    public String getMenClothesAvailabilityFilterMessage(){
        return menClothesAvailabilityFilterMessage.getText();
    }
    public String getMenClothesDiscountedFilterMessage(){
        return menClothesAvailabilityFilterMessage.getText();
    }




}
