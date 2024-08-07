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

    //product delete icon element
    @FindBy(css = ".remove-from-cart")
    private WebElement deleteProductIcon;

    //removed product from cart message element
    @FindBy(css = ".js-cart > .no-items")
    private WebElement deleteSuccessMessage;

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
        qtyAdjuster.sendKeys("4");
    }

    //remove product method
    public void clickRemoveProductIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(deleteProductIcon));
        deleteProductIcon.click();
    }

    //assert methods
    public boolean isQtyAdjusterDisplayed(){return qtyAdjuster.isDisplayed();}
    public boolean isDeleteProductIconDisplayed(){return deleteProductIcon.isDisplayed();}
    public boolean isProceedToCheckoutButtonDisplayed(){return proceedToCheckoutButton.isDisplayed();}

    //delete message confirmation getter
    public String getDeleteMessageConfirmation(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1600));
        wait.until(ExpectedConditions.visibilityOf(deleteSuccessMessage));
        return deleteSuccessMessage.getText();}
}
