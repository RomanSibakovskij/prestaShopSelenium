package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductCheckoutPage extends BasePage{
    //button
    @FindBy(css = ".cart-grid-right.col-lg-4 .btn.btn-primary")
    private WebElement proceedToCheckoutButton;
    //quantity adjuster
    @FindBy(css = "input[name='product-quantity-spin']")
    private WebElement qtyAdjuster;

    public ProductCheckoutPage(WebDriver driver) {
        super(driver);
    }

    //button click method
    public void clickProceedToCheckoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton));
        proceedToCheckoutButton.click();
    }

    //input method
    public void inputProductQuantity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(qtyAdjuster));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = '';", qtyAdjuster);
//        qtyAdjuster.clear();
        qtyAdjuster.sendKeys("4");
    }

    //assert methods
    public boolean isQtyAdjusterDisplayed(){return qtyAdjuster.isDisplayed();}
    public boolean isProceedToCheckoutButtonDisplayed(){return proceedToCheckoutButton.isDisplayed();}


}
