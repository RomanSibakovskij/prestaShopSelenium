package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends TestMethodsRegistrationLoginLogout {

    //Test 002 -> create a male user account with valid data
    @Test
    void createNewMaleUserAccountTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
    }

    //Test 002a -> create a female user account with valid data
    @Test
    void createNewFemaleUserAccountTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewFemaleUserAccountTest(registerPage);
    }

    //Test 002b -> attempt to create an account without gender selection (it gets created)
    @Test
    void createNewUserAccountNoGenderTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoGenderTest(registerPage);
    }

    //Test 002c -> attempt to create an account without first name (it doesn't get created)
    @Test
    void createNewUserAccountNoFirstNameTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoFirstNameTest(registerPage);
    }

    //Test 002d -> attempt to create an account without last name (it doesn't get created)
    @Test
    void createNewUserAccountNoLastNameTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoLastNameTest(registerPage);
    }

    //Test 002d -> attempt to create an account without email (it doesn't get created)
    @Test
    void createNewUserAccountNoEmailTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoEmailTest(registerPage);
    }

    //Test 002e -> attempt to create an account without password (it doesn't get created)
    @Test
    void createNewUserAccountNoPasswordTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoPasswordTest(registerPage);
    }

    //Test 002f -> attempt to create an account without ticking receive offers checkbox (it gets created)
    @Test
    void createNewUserAccountNoReceiveOffersCheckboxTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoReceiveOffersCheckboxTest(registerPage);
    }

    //Test 002g -> attempt to create an account without ticking agree to terms checkbox (it doesn't get created)
    @Test
    void createNewUserAccountNoAgreeToTermsCheckboxTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoAgreeToTermsCheckboxTest(registerPage);
    }

    //Test 002h -> attempt to create an account without ticking newsletter signup checkbox (it gets created)
    @Test
    void createNewUserAccountNoNewsletterSignUpCheckboxTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoNewsletterSignUpCheckboxTest(registerPage);
    }

    //Test 002i -> attempt to create an account without ticking newsletter signup checkbox (it doesn't created)
    @Test
    void createNewUserAccountNoCustomerDataCheckboxTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoCustomerDataCheckboxTest(registerPage);
    }

    //Test 002j -> attempt to create an account with too long first name (it doesn't created)
    @Test
    void createNewUserAccountWithTooLongFirNameTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithTooLongFirstNameDetails();

        createNewUserAccountWithTooLongFirNameTest(registerPage);
    }

    //Test 002k -> attempt to create an account with too long last name (it doesn't created)
    @Test
    void createNewUserAccountWithTooLongLasNameTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithTooLongLastNameDetails();

        createNewUserAccountWithTooLongLastNameTest(registerPage);
    }




    //Test 003 -> create a user account then logout
    @Test
    void createNewUserAccountAndLogOutTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
    }
}
