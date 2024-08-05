package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserSearchCatalogPage extends BasePage{

    //elements
    @FindBy(css = "input[name='s']")
    private WebElement searchBar;
    @FindBy(css = "//body[@id='index']/ul")
    private WebElement searchQueryResult;



    public RegisteredUserSearchCatalogPage(WebDriver driver) {
        super(driver);
    }

    //input methods

    public void inputSearchQueryIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys("Mug The best is yet to come");
    }

    public void clickSearchQueryResultPopUp(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(searchQueryResult));
        searchQueryResult.click();
    }

    //assert methods

    public boolean isSearchBarDisplayed(){return searchBar.isDisplayed();}
    public boolean isSearchQueryResultPopUpDisplayed(){return searchQueryResult.isDisplayed();}



}
