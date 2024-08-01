package lt.techin.example;

import org.junit.jupiter.api.Test;

public class LoginPageTest extends TestMethods{

    //Test 4 -> login as a registered user with valid data
    @Test
    void signInAsRegisteredUserTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
    }
}
