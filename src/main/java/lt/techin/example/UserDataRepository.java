package lt.techin.example;

import org.openqa.selenium.WebDriver;

public class UserDataRepository extends BasePage{
    private String password;
    public UserDataRepository(WebDriver driver) {
        super(driver);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
