package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserCataloguePage extends BasePage{

    //elements
    @FindBy(css = "input[name='s']")
    private WebElement searchBar;
    public RegisteredUserCataloguePage(WebDriver driver) {
        super(driver);
    }

    //input methods
    public void inputSweaterSearchQuery(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.visibilityOf(searchBar));
        searchBar.sendKeys("Sweater");
    }


    //assert methods
     public boolean isSearchBarPresent(){
        return searchBar.isDisplayed();
     }
}
