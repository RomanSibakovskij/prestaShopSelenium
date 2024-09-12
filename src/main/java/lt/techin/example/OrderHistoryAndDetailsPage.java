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
    @FindBy(xpath = "//ul[@id='footer_account_list']/li[3]/a")
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
    @FindBy(css = "#delivery-address")
    private WebElement orderDeliveryAddress;
    @FindBy(css = "#invoice-address")
    private WebElement orderInvoiceAddress;
    @FindBy(css = "tbody a")
    private WebElement orderNameLink;
    @FindBy(css = "#order-products tbody tr td:nth-of-type(2)")
    private WebElement orderQuantity;
    @FindBy(css = "#order-products tr .text-xs-right:nth-of-type(3)")
    private WebElement orderUnitPrice;
    @FindBy(css = "#order-products tr .text-xs-right:nth-of-type(4)")
    private WebElement orderTotalPrice;
    @FindBy(css = ".line-products td:nth-of-type(2)")
    private WebElement orderSubTotalPrice;
    @FindBy(css = ".line-shipping td:nth-of-type(2)")
    private WebElement orderShippingAndHandlingPrice;
    @FindBy(css = ".line-tax td:nth-of-type(2)")
    private WebElement orderTax;
    @FindBy(css = ".line-total td:nth-of-type(2)")
    private WebElement orderTotalCost;

    //add message to order elements
    @FindBy(css = "select[name='id_product']")
    private WebElement productDropdownSelector;
    @FindBy(css = "select[name='id_product'] > option[value='3']")
    private WebElement singleProductChoice;
    @FindBy(css = "textarea[name='msgText']")
    private WebElement messageInputField;
    @FindBy(css = "button[name='submitMessage']")
    private WebElement sendMessageButton;

    //success message sent element
    @FindBy(css = "article[role='alert'] li")
    private WebElement successMessageSent;

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

    //product dropdown selector click method
    public void clickProductSelector(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", productDropdownSelector);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(productDropdownSelector));
        productDropdownSelector.click();
    }

    //single product choice method
    public void selectSingleProduct(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", singleProductChoice);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(singleProductChoice));
        singleProductChoice.click();
    }

    //add message for the order method
    public void inputOrderMessage(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", messageInputField);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.visibilityOf(messageInputField));
        messageInputField.sendKeys("I'm still waiting for the order to arrive.");
    }

    //send message for the order click method
    public void clickSendMessage(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sendMessageButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(700));
        wait.until(ExpectedConditions.elementToBeClickable(sendMessageButton));
        sendMessageButton.click();
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

    //order details table getters (with reorder link)
    public String getOrderReference(){return orderReference.getText();}
    public String getOrderCarrier(){return orderCarrier.getText();}
    public String getOrderPaymentMethod(){return orderPaymentMethod.getText();}
    public String getOrderPlacementDate(){return orderPlacementDate.getText();}
    public String getOrderCurrentStatus(){return orderCurrentStatus.getText();}
    public String getOrderDeliveryAddress(){return orderDeliveryAddress.getText();}
    public String getOrderInvoiceAddress(){return orderInvoiceAddress.getText();}
    public String getOrderNameLink(){return orderNameLink.getText();}
    public String getOrderQuantity(){return orderQuantity.getText();}
    public String getOrderUnitPrice(){return orderUnitPrice.getText();}
    public String getOrderTotalPrice(){return orderTotalPrice.getText();}
    public String getOrderSubTotalPrice(){return orderSubTotalPrice.getText();}
    public String getOrderShippingAndHandlingPrice(){return orderShippingAndHandlingPrice.getText();}
    public String getOrderTax(){return orderTax.getText();}
    public String getOrderTotalCost(){return orderTotalCost.getText();}

    // add message section element asserts
    public boolean isProductDropdownSelectorDisplayed(){return productDropdownSelector.isDisplayed();}
    public boolean isMessageInputFieldDisplayed(){return messageInputField.isDisplayed();}
    public boolean isSendMessageButtonDisplayed(){return sendMessageButton.isDisplayed();}

    //product choice getter
    public String getProductOrderName(){return singleProductChoice.getText();}

    //success message sent getter
    public String getSuccessMessage(){return successMessageSent.getText();}

}
