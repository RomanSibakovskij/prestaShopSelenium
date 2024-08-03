package lt.techin.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
//        driver.get("http://192.168.88.247");
        driver.get("http://192.168.8.186");
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }



    @AfterEach
    public void close() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //driver.close();
        driver.quit();
    }
}
