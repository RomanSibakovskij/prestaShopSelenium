package lt.techin.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RegisteredUserSearchCatalogPage extends BasePage{

    //elements
    @FindBy(css = "input[name='s']")
    private WebElement searchBar;
    @FindBy(css = "ul.ui-autocomplete")
    private WebElement searchResultsDropdown;

    private String mug1Query = "Mug The best is yet to come";
    private String mug2Query = "Mug The adventure begins";
    private String mug3Query = "Mug Today is a good day";
    private String mug4Query = "Customizable mug";
    private String poster1Query = "The best is yet to come' Framed Poster";
    private String poster2Query = "The Adventure Begins Framed Poster";
    private String poster3Query = "Today is a Good Day Framed Poster";
    private String cushion1Query = "Mountain fox cushion";
    private String cushion2Query = "Brown bear cushion";
    private String cushion3Query = "Hummingbird cushion";
    private String tShirtQuery = "Hummingbird printed t-shirt";
    private String sweaterQuery = "Hummingbird printed sweater";
    private String graphics1Query = "Mountain fox - Vector graphics";
    private String graphics2Query = "Brown bear - Vector graphics";
    private String graphics3Query = "Hummingbird - Vector graphics";
    private String notebook1Query = "Mountain fox notebook";
    private String notebook2Query = "Brown bear notebook";
    private String notebook3Query = "Hummingbird notebook";
    private String packQuery = "Pack Mug + Framed poster";

    private List<WebElement> productNameElements = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));


    public RegisteredUserSearchCatalogPage(WebDriver driver) {
        super(driver);
    }

    //mugs input methods
    public void inputSearchQueryMug1IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(mug1Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryMug2IntoSearchBar() {
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

    //posters input methods
    public void inputSearchQueryPoster1IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(poster1Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryPoster2IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(poster2Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryPoster3IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(poster3Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    //cushions input methods
    public void inputSearchQueryCushion1IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(cushion1Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryCushion2IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(cushion2Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryCushion3IntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(cushion3Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    //t-shirt input method
    public void inputSearchQueryTShirtIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(tShirtQuery);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    //sweater input method
    public void inputSearchQuerySweaterIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(sweaterQuery);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    //graphics input methods
    public void inputSearchQueryGraphicsFoxIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(graphics1Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryGraphicsBearIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(graphics2Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryGraphicsBirdIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(graphics3Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    public List<WebElement> getSearchResults() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
        return searchResultsDropdown.findElements(By.cssSelector("li.ui-menu-item a"));
    }

    //notebooks input methods
    public void inputSearchQueryNotebookFoxIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(notebook1Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryNotebookBearIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(notebook2Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }
    public void inputSearchQueryNotebookBirdIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(notebook3Query);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
    }

    //pack search results
    public void inputSearchQueryPackMugPosterIntoSearchBar(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys(packQuery);
        wait.until(ExpectedConditions.visibilityOf(searchResultsDropdown));
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

    public List<String> getProductNames() {
        List<String> productNames = new ArrayList<>();
        for (WebElement product : productNameElements) {
            String name = product.getText();
            productNames.add(name);
        }
        return productNames;
    }

    //assert methods

    public boolean isSearchBarDisplayed(){return searchBar.isDisplayed();}
    //public boolean isSearchQueryResultPopUpDisplayed(){return searchQueryResult.isDisplayed();}

    //search query getters
    public String getMugTheBestQuery(){return mug1Query;}
    public String getMugAdventureQuery(){return mug2Query;}
    public String getMugGoodDayQuery(){return mug3Query;}
    public String getMugCustomTextQuery(){return mug4Query;}
    public String getPosterTheBestQuery(){return poster1Query;}
    public String getPosterAdventureQuery(){return poster2Query;}
    public String getPosterGoodDayQuery(){return poster3Query;}
    public String getCushionFoxQuery(){return cushion1Query;}
    public String getCushionBearQuery(){return cushion2Query;}
    public String getCushionBirdQuery(){return cushion3Query;}
    public String getTShirtQuery(){return tShirtQuery;}
    public String getSweaterQuery(){return sweaterQuery;}
    public String getGraphicsFoxQuery(){return graphics1Query;}
    public String getGraphicsBearQuery(){return graphics2Query;}
    public String getGraphicsBirdQuery(){return graphics3Query;}
    public String getNotebookFoxQuery(){return notebook1Query;}
    public String getNotebookBearQuery(){return notebook2Query;}
    public String getNotebookBirdQuery(){return notebook3Query;}
    public String getPackSearchQuery(){return packQuery;}

}
