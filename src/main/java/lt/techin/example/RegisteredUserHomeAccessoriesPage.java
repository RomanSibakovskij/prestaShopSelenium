package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    //icons
    @FindBy(css = "section:nth-of-type(1) > .collapse .custom-checkbox")
    private WebElement hmAccessoriesInStockBoxIcon;

    //search filter remover
    @FindBy(xpath = "//section[@id='js-active-search-filters']/ul//i[.='\uE5CD']")
    private WebElement removeFilterIcon;

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



}

