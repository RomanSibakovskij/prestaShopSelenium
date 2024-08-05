package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserWishListPage extends BasePage{

    //links
    @FindBy(css = "#content section:nth-child(2) .all-product-link")
    private WebElement allProductsLink;


    public RegisteredUserWishListPage(WebDriver driver) {
        super(driver);
    }

    // click methods

    public void clickAllProductsLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(allProductsLink));
        allProductsLink.click();
    }


    //assert methods
    public boolean isAllProductsLinkDisplayed(){return allProductsLink.isDisplayed();}


}
