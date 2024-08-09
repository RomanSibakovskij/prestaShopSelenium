package lt.techin.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends TestMethods {

    //Test 004 -> login as a registered user with valid data
    @Test
    @DisplayName("Registered User Valid Sign-In")
    @Tag("Valid_Sign-In")
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
    @DisplayName("Registered User Sign-In With Invalid Email")
    @Tag("Invalid_Sign-In")
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
    @DisplayName("Registered User Sign-In With Existing Email")
    @Tag("Invalid_Sign-In")
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
    @DisplayName("Registered User Sign-In Without Email")
    @Tag("Invalid_Sign-In")
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
    @DisplayName("Registered User Sign-In With Invalid Password")
    @Tag("Invalid_Sign-In")
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
    @DisplayName("Registered User Sign-In Without Password")
    @Tag("Invalid_Sign-In")
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
