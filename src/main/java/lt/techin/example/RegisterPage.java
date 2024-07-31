package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(css = "label:nth-of-type(1)  input[name='id_gender']")
    private WebElement maleGenderSelector;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
}
