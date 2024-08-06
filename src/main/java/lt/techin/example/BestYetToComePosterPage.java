package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BestYetToComePosterPage extends BasePage{

    //buttons
    @FindBy(css = ".add-to-cart.btn.btn-primary")
    private WebElement addToCartButton;
    @FindBy(css = ".modal-body .btn.btn-primary")
    private WebElement proceedToCheckoutButton;

    //product name
    @FindBy(css = ".h1")
    private WebElement productName;

    //success 'add to cart' pop up elements
    @FindBy(css = "h4.modal-title")
    private WebElement successMessage;
    @FindBy(css = ".h6.product-name")
    private WebElement addedProductName;
    @FindBy(css = ".cart-content .cart-products-count")
    private WebElement cartItemCount;
    public BestYetToComePosterPage(WebDriver driver) {
        super(driver);
    }

    // button click method
    public void clickAddToCartButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
    }

    public void clickProceedToCheckoutButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton));
        proceedToCheckoutButton.click();
    }

    //assert methods
    public boolean isAddToCartButtonDisplayed(){return addToCartButton.isDisplayed();}
    public boolean isProceedToCheckoutButtonDisplayed(){return proceedToCheckoutButton.isDisplayed();}

    //product name getter
    public String getProductName(){return productName.getText();}

    // success 'add to cart' pop-up message getter
    public String getSuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOf(successMessage));
        return messageElement.getText();
    }

    //added product getter
    public String getAddedProductName(){return addedProductName.getText();}

    //cart item count
    public String getCartItemCount(){return cartItemCount.getText();}




}
