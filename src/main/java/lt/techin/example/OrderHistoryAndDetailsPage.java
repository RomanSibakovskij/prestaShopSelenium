package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderHistoryAndDetailsPage extends BasePage{

    //orders webpage footer link element
    @FindBy(css = "[title='Orders']")
    private WebElement ordersPageLink;

    public OrderHistoryAndDetailsPage(WebDriver driver) {
        super(driver);
    }

    //navigate to orders page method
    public void clickOnOrdersLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ordersPageLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(ordersPageLink));
        ordersPageLink.click();
    }


    //navigation link assert method
    public boolean isOrdersPageLinkDisplayed(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ordersPageLink);
        return ordersPageLink.isDisplayed();}


}
