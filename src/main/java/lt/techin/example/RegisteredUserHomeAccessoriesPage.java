package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserHomeAccessoriesPage extends BasePage{

    @FindBy(css = ".category-sub-menu > li:nth-of-type(2) > a")
    private WebElement homeAccessoriesPageLink1;
    @FindBy(css = "li:nth-of-type(2) > h5 > .subcategory-name")
    private WebElement homeAccessoriesPageLink2;
    @FindBy(css = "a[title='Home Accessories']")
    private WebElement homeAccessoriesPageBoxIcon;

    public RegisteredUserHomeAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    //link click methods

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
}
