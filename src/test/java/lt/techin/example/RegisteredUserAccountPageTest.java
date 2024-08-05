package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserAccountPageTest extends TestMethods{

    //Test 059 -> navigate to user account page (upper navbar link)
    @Test
    void navigateToUserAccountLink1Tests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
    }

    //Test 059a -> navigate to user account page (footer link)
    @Test
    void navigateToUserAccountLink2Tests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink2Test();
    }
}
