package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends TestMethodsRegistrationLoginLogout {

    //Test 2 -> create a male user account with valid data
    @Test
    void createNewMaleUserAccountTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
    }

    //Test 2a -> create a female user account with valid data
    @Test
    void createNewFemaleUserAccountTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewFemaleUserAccountTest(registerPage);
    }

    //Test 2b -> attempt to create an account without gender selection (it gets created)
    @Test
    void createNewUserAccountNoGenderTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoGenderTest(registerPage);
    }

    //Test 2c -> attempt to create an account without first name (it doesn't get created)
    @Test
    void createNewUserAccountNoFirstNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewUserAccountNoFirstNameTest(registerPage);
    }



    //Test 3 -> create a user account then logout
    @Test
    void createNewUserAccountAndLogOutTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
    }
}
