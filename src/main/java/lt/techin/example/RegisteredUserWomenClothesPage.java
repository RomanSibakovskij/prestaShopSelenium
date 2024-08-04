package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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


    //box icons
    @FindBy(css = "section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement womenClothesInStockBoxIcon;

    //search filter remover
    @FindBy(xpath = "//section[@id='js-active-search-filters']/ul//i[.='\uE5CD']")
    private WebElement removeFilterIcon;

    //filter messages
    @FindBy(xpath = "//*[contains(text(), 'Availability: In stock')]")
    private WebElement womenClothesAvailabilityFilterMessage;

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


    //filter message getters
    public String getWomenClothesAvailabilityFilterMessage(){return womenClothesAvailabilityFilterMessage.getText();}


}
