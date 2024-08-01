package lt.techin.example;

import org.junit.jupiter.api.Test;

public class LoginPageTest extends TestMethodsRegistrationLoginLogout {

    //Test 004 -> login as a registered user with valid data
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
