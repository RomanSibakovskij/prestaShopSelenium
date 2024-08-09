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
    @FindBy(css = ".account")
    private WebElement accountPageLink;
    @FindBy(css = "#history-link")
    private WebElement orderAndHistoryPageLink;

    //order and history table elements
    @FindBy(css = "tbody > tr:nth-of-type(1) > th")
    private WebElement orderID;
    @FindBy(css = "tr:nth-of-type(1) > td:nth-of-type(1)")
    private WebElement orderDate;
    @FindBy(css = "tr:nth-of-type(1) > .text-xs-right")
    private WebElement orderPrice;
    @FindBy(css = "tbody tr:nth-of-type(1) .hidden-md-down:nth-child(4)")
    private WebElement orderPayment;
    @FindBy(css = "tr:nth-of-type(1) > .order-actions.text-sm-center")
    private WebElement orderActions;
    @FindBy(css = ".view-order-details-link")
    private WebElement detailsReorderLink;

    //order details in reorder section elements
    @FindBy(css = "div#order-infos > div:nth-of-type(1) strong")
    private WebElement orderReference;
    @FindBy(css = "div#order-infos  ul > li:nth-of-type(1) > strong")
    private WebElement orderCarrier;
    @FindBy(css = "div#order-infos  ul > li:nth-of-type(2) > strong")
    private WebElement orderPaymentMethod;
    @FindBy(css = ".hidden-xs-down tr td:nth-of-type(1)")
    private WebElement orderPlacementDate;
    @FindBy(css = ".hidden-xs-down .label-pill")
    private WebElement orderCurrentStatus;

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

    //account page link click method
    public void clickAccountLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(accountPageLink));
        accountPageLink.click();
    }

    //order and history page link click method
    public void clickOrderAndHistoryLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(orderAndHistoryPageLink));
        orderAndHistoryPageLink.click();
    }

    //details reorder link click method
    public void clickDetailsReorderLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(detailsReorderLink));
        detailsReorderLink.click();
    }


    //navigation link assert method
    public boolean isOrdersPageLinkDisplayed(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ordersPageLink);
        return ordersPageLink.isDisplayed();}

    //account page link assert method
    public boolean isAccountLinkDisplayed(){return accountPageLink.isDisplayed();}

    //order and history page link assert method
    public boolean isOrderAndHistoryPageLinkDisplayed(){return orderAndHistoryPageLink.isDisplayed();}

    //order page table data getters
    public String getOrderID(){return orderID.getText();}
    public String getOrderDate(){return orderDate.getText();}
    public String getOrderPrice(){return orderPrice.getText();}
    public String getOrderPayment(){return orderPayment.getText();}
    public String getOrderActions(){return orderActions.getText();}

    //assert the details reorder link method
    public boolean isDetailsAndReorderLinkDisplayed(){return detailsReorderLink.isDisplayed();}

}
