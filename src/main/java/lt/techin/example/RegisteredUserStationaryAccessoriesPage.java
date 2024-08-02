package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserStationaryAccessoriesPage extends BasePage{

    //links
    @FindBy(xpath = "//ul[@id='top-menu']//a[@href='http://192.168.88.247/6-accessories']")
    private WebElement accessoriesPageLink;
    @FindBy(css = ".category-sub-menu > li:nth-of-type(1) > a")
    private WebElement stationaryAccessoriesPageLink1;
    @FindBy(css = "a[title='Stationery']")
    private WebElement stationaryAccessoriesPageBoxIcon;
    @FindBy(css = "li:nth-of-type(1) > h5 > .subcategory-name")
    private WebElement stationaryAccessoriesPageLink2;
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
}
