package lt.techin.example;

import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends TestMethods {


    //Test 002 -> create a male user account with valid data
    @Test
    @Tag("Valid_Account_Creation")
    void createNewMaleUserAccountTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
    }

    //Test 002a -> create a female user account with valid data
    @Test
    @Tag("Valid_Account_Creation")
    void createNewFemaleUserAccountTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewFemaleUserAccountTest(registerPage);
    }

    //Test 002b -> attempt to create an account without gender selection (it gets created)
    @Test
    @Tag("Valid_No_Gender_Selected_Account_Creation")
    void createNewUserAccountNoGenderTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoGenderTest(registerPage);
    }

    //Test 002c -> attempt to create an account without first name (it doesn't get created)
    @Test
    @Tag("Invalid_Account_Creation_No_Singular_Input")
    void createNewUserAccountNoFirstNameTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoFirstNameTest(registerPage);
    }

    //Test 002d -> attempt to create an account without last name (it doesn't get created)
    @Test
    @Tag("Invalid_Account_Creation_No_Singular_Input")
    void createNewUserAccountNoLastNameTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoLastNameTest(registerPage);
    }

    //Test 002d -> attempt to create an account without email (it doesn't get created)
    @Test
    @Tag("Invalid_Account_Creation_No_Singular_Input")
    void createNewUserAccountNoEmailTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoEmailTest(registerPage);
    }

    //Test 002e -> attempt to create an account without password (it doesn't get created)
    @Test
    @Tag("Invalid_Account_Creation_No_Singular_Input")
    void createNewUserAccountNoPasswordTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoPasswordTest(registerPage);
    }

    //Test 002f -> attempt to create an account without ticking receive offers checkbox (it gets created)
    @Test
    @Tag("Invalid_Account_Creation_No_Singular_Input")
    void createNewUserAccountNoReceiveOffersCheckboxTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoReceiveOffersCheckboxTest(registerPage);
    }

    //Test 002g -> attempt to create an account without ticking agree to terms checkbox (it doesn't get created)
    @Test
    @Tag("Invalid_Account_Creation_No_Singular_Input")
    void createNewUserAccountNoAgreeToTermsCheckboxTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoAgreeToTermsCheckboxTest(registerPage);
    }

    //Test 002h -> attempt to create an account without ticking newsletter signup checkbox (it gets created)
    @Test
    @Tag("Invalid_Account_Creation_No_Singular_Input")
    void createNewUserAccountNoNewsletterSignUpCheckboxTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoNewsletterSignUpCheckboxTest(registerPage);
    }

    //Test 002i -> attempt to create an account without ticking newsletter signup checkbox (it doesn't created)
    @Test
    @Tag("Invalid_Account_Creation_No_Singular_Input")
    void createNewUserAccountNoCustomerDataCheckboxTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoCustomerDataCheckboxTest(registerPage);
    }

    //Test 002j -> attempt to create an account with too long first name (it doesn't created)
    @Test
    @Tag("Invalid_Account_Creation_Too_Long_Singular_Input")
    void createNewUserAccountWithTooLongFirstNameTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithTooLongFirstNameDetails();

        createNewUserAccountWithTooLongFirNameTest(registerPage);
    }

    //Test 002k -> attempt to create an account with too long last name (it doesn't created)
    @Test
    @Tag("Invalid_Account_Creation_Too_Long_Singular_Input")
    void createNewUserAccountWithTooLongLastNameTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithTooLongLastNameDetails();

        createNewUserAccountWithTooLongLastNameTest(registerPage);
    }

    //Test 002l -> attempt to create an account with too long last name (it doesn't created)
    @Test
    @Tag("Invalid_Account_Creation_Too_Long_Singular_Input")
    void createNewUserAccountWithTooLongEmailTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithTooLongEmailDetails();

        createNewUserAccountWithTooLongEmailTest(registerPage);
    }

    //Test 002m -> attempt to create an account with invalid email (it doesn't created)
    @Test
    @Tag("Invalid_Account_Creation_Invalid_Singular_Input")
    void createNewUserAccountWithInvalidEmailTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithInvalidEmailDetails();

        createNewUserAccountWithInvalidEmailTest(registerPage);
    }

    //Test 002n -> attempt to create an account with too short password (it doesn't created)
    @Test
    @Tag("Invalid_Account_Creation_Too_Short_Singular_Input")
    void createNewUserAccountWithTooShortPasswordTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithTooShortPasswordDetails();

        createNewUserAccountWithTooShortPasswordTest(registerPage);
    }

    //Test 002o -> attempt to create an account with too long password (it doesn't created)
    @Test
    @Tag("Invalid_Account_Creation_Too_Long_Singular_Input")
    void createNewUserAccountWithTooLongPasswordTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithTooLongPasswordDetails();

        createNewUserAccountWithTooLongPasswordTest(registerPage);
    }

    //Test 002p -> attempt to create an account with too long password (it doesn't created)
    @Test
    @Tag("Invalid_Account_Creation_Invalid_Singular_Input")
    void createNewUserAccountWithInvalidBirthdateTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserWithInvalidBirthdateDetails();

        createNewUserAccountWithInvalidBirthdateTest(registerPage);
    }




    //Test 003 -> create a user account then logout
    @Test
    @Tag("New_Account_Login_Logout")
    void createNewUserAccountAndLogOutTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
    }
}
