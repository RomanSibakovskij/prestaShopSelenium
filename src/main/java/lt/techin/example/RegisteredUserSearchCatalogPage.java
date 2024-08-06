package lt.techin.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RegisteredUserSearchCatalogPage extends BasePage{

    //elements
    @FindBy(css = "input[name='s']")
    private WebElement searchBar;
    @FindBy(css = "//body[@id='index']/ul")
    private WebElement searchQueryResult;
    @FindBy(css = "ul.ui-autocomplete")
    private WebElement searchResultsDropdown;

    private String mug1Query = "Mug The best is yet to come";
    private String mug2Query = "Mug The adventure begins";
    private String mug3Query = "Mug Today is a good day";
    private String mug4Query = "Customizable mug";


    public RegisteredUserSearchCatalogPage(WebDriver driver) {
        super(driver);
    }

    //input methods

    public void inputSearchQueryMug1IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(mug1Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    public void inputSearchQueryMug2IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(mug2Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    public void inputSearchQueryMug3IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(mug3Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    public void inputSearchQueryMug4IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(mug4Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    public List<WebElement> getSearchResults() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
        return searchResultsDropdown.findElements(By.cssSelector("li.ui-menu-item a"));
    }


    public boolean isProductPresent(String query) {
        List<WebElement> results = getSearchResults();
        for (WebElement result : results) {
            WebElement productNameElement = result.findElement(By.cssSelector("span.product"));
            String productText = productNameElement.getText().trim();
            if (productText.equalsIgnoreCase(query)) {
                return true;
            }
        }
        return false;
    }

    //assert methods

    public boolean isSearchBarDisplayed(){return searchBar.isDisplayed();}
    //public boolean isSearchQueryResultPopUpDisplayed(){return searchQueryResult.isDisplayed();}

    //search query getters
    public String getMugTheBestQuery(){return mug1Query;}
    public String getMugAdventureQuery(){return mug2Query;}
    public String getMugGoodDayQuery(){return mug3Query;}
    public String getMugCustomTextQuery(){return mug4Query;}

}
