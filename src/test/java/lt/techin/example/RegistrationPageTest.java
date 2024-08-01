package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends TestMethodsRegistrationLoginLogout {

    //Test 002 -> create a male user account with valid data
    @Test
    void createNewMaleUserAccountTest(){
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
    void createNewUserAccountNoGenderTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoGenderTest(registerPage);
    }

    //Test 002c -> attempt to create an account without first name (it doesn't get created)
    @Test
    void createNewUserAccountNoFirstNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoFirstNameTest(registerPage);
    }

    //Test 002d -> attempt to create an account without last name (it doesn't get created)
    @Test
    void createNewUserAccountNoLastNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoLastNameTest(registerPage);
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
