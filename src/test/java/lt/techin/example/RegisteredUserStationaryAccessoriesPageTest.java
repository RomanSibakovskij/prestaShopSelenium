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

    //Test 016a -> navigate to Stationary Accessories page (link 1) test
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

    //Test 016b -> navigate to Stationary Accessories page (link 2) test
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

    //Test 016c -> navigate to Stationary Accessories page (box icon) test
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

    //Test 017 -> filter stationary accessories by availability box icon click (element click intercepted)
    @Test
    void filterByInStockBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByAvailabilityBoxIconTest();
    }

    //Test 017a -> filter stationary accessories by availability link click
    @Test
    void filterByInStockLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByAvailabilityLinkTest();
    }

    //Test 018 -> filter stationary accessories by selections box icon click  (element click intercepted)
    @Test
    void filterByNewProductBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductBySelectionsBoxIconTest();
    }

    //Test 018a -> filter stationary accessories by selections link click
    @Test
    void filterByNewProductLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductBySelectionsLinkTest();
    }
}
