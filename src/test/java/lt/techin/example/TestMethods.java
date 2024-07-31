package lt.techin.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMethods extends BaseTest{

    //sign up test methods
    protected void clickOnSignUp() {
        HomePage homePage = new HomePage(driver);

        //assert signin link is displayed
        assertTrue(homePage.isSignUpLinkDisplayed(), "The sign in link isn't displayed");
        System.out.println("The sign in link is displayed" + "\n");

        homePage.clickSignUpLink();
    }
}
