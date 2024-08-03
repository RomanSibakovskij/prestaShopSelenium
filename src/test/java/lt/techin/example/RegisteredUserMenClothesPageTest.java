package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserMenClothesPageTest extends TestMethods{

    //Test 036 -> navigate to Clothes page test
    @Test
    void goToClothesPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();

        navigateToClothesPageTest();
    }


}
