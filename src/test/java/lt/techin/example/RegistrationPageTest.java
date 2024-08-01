package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends TestMethods{

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
