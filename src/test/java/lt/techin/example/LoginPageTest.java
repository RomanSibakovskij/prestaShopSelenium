package lt.techin.example;

import org.junit.jupiter.api.Test;

public class LoginPageTest extends TestMethods {

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

    //Test 004a -> login as a registered user attempt with invalid email address (login fails)
    @Test
    void signInAsRegisteredUserInvalidEmailTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserWithInvalidEmailTest(registerPage);
    }

    //Test 004b -> login as a registered user attempt with existing email address (login fails)
    @Test
    void signInAsRegisteredUserExistingEmailTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserWithExistingEmailTest(registerPage);
    }

    //Test 004c -> login as a registered user attempt with no email address (login fails)
    @Test
    void signInAsRegisteredUserNoEmailTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserWithNoEmailTest(registerPage);
    }

    //Test 004d -> login as a registered user attempt with invalid password (login fails)
    @Test
    void signInAsRegisteredUserInvalidPasswordTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserInvalidPasswordTest(registerPage);
    }

    //Test 004e -> login as a registered user attempt with invalid password (login fails)
    @Test
    void signInAsRegisteredUserNoPasswordTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserNoPasswordTest(registerPage);
    }


}
