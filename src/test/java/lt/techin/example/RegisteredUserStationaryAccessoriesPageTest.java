package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserStationaryAccessoriesPageTest extends TestMethods{

    //Test 016 -> navigate to Accessories page test
    @Test
    void goToAccessoriesPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        navigateToAccessoriesPageTest();
    }

    //Test 016a -> navigate to Accessories page test
    @Test
    void goToStationaryAccessoriesPageLink1Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
    }

    //Test 016b -> navigate to Accessories page test
    @Test
    void goToStationaryAccessoriesPageLink2Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink2Test();
    }

    //Test 016c -> navigate to Accessories page test
    @Test
    void goToStationaryAccessoriesPageBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageBoxIconTest();
    }
}
