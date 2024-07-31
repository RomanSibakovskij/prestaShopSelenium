package lt.techin.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NavigationToSignUpPageTest extends BaseTest{

    //Test 1 -> click on sign in link

    @Test
    void clickOnSignInTest(){
        HomePage homePage = new HomePage(driver);

        //assert signin link is displayed
        assertTrue(homePage.isSignInLinkDisplayed(), "The sign in link isn't displayed");
        System.out.println("The sign in link is displayed" + "\n");

        homePage.clickSignInLink();
    }
}
