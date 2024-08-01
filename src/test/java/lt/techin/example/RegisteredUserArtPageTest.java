package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserArtPageTest extends BaseTest{

    //Test 006 -> navigate to Art page test
    @Test
    void goToArtPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        navigateToArtPageTest();
    }
}
