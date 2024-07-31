package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends TestMethods{

    //Test 2 -> create a user account with valid data
    @Test
    void createNewMaleUserAccountTest(){
        clickOnSignUp();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccount(registerPage);
    }
}
