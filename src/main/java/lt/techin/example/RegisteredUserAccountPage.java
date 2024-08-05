package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserAccountPage extends BasePage{

    //user account links
    @FindBy(css = "a[title='View my customer account']")
    private WebElement userAccountLink1;
    @FindBy(css = ".myaccount-title [rel]")
    private WebElement userAccountLink2;

    //add first address link
    @FindBy(css = "a#address-link")
    private WebElement addFirstAddressLink;
    @FindBy(css = "a#address-link  .material-icons")
    private WebElement addFirstLinkName;

    //add first address page elements
    @FindBy(css = "input#field-firstname")
    private WebElement firstNameInputField;
    @FindBy(css = "input#field-lastname")
    private WebElement lastNameInputField;
    @FindBy(css = "input[name='address1']")
    private WebElement addressInputField;
    @FindBy(css = "input#field-city")
    private WebElement cityInputField;
    @FindBy(css = "select#field-id_state")
    private WebElement stateDropdownMenu;
    @FindBy(css = "input#field-postcode")
    private WebElement postalCodeInputField;
    @FindBy(css = "select#field-id_country")
    private WebElement countryDropdownMenu;
    @FindBy(css = ".btn.btn-primary.float-xs-right.form-control-submit")
    private WebElement saveButton;



    public RegisteredUserAccountPage(WebDriver driver) {
        super(driver);
    }

    //user account link click methods
    public void clickUserAccountLink1(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(userAccountLink1));
        userAccountLink1.click();
    }
    public void clickUserAccountLink2(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", userAccountLink2);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(userAccountLink2));
        userAccountLink2.click();
    }

    //add first address link method
    public void clickAddFirstAddressLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(addFirstAddressLink));
        addFirstAddressLink.click();
    }


    //navigation links assert methods
    public boolean isUserAccountLink1Displayed(){return userAccountLink1.isDisplayed();}
    public boolean isUserAccountLink2Displayed(){return userAccountLink2.isDisplayed();}

    //assert methods
    public boolean isAddFirstAddressLinkDisplayed(){return addFirstAddressLink.isDisplayed();}


    //add first address link name getter method
    public String getAddFirstAddressLinkText(){return addFirstLinkName.getText();}


}
