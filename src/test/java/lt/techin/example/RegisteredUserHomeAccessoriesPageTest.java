package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserHomeAccessoriesPageTest extends TestMethods{

    //Test 025 -> navigate to Home Accessories page (link 1)test
    @Test
    void goToHomeAccessoriesPageLink1Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();

        navigateToHomeAccessoriesPageLink1Test();
    }

    //Test 025a -> navigate to Home Accessories page (link 2) test
    @Test
    void goToHomeAccessoriesPageLink2Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();

        navigateToHomeAccessoriesPageLink2Test();
    }

    //Test 025b -> navigate to Home Accessories page (box icon) test
    @Test
    void goToHomeAccessoriesPageBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();

        navigateToHomeAccessoriesPageBoxIconTest();
    }

    //Test 026 -> filter home accessories products by availability (box icon) test
    @Test
    void filterHmAccProductByAvailabilityBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByAvailabilityBoxIconTest();
    }

    //Test 026a -> filter home accessories products by availability (link) test
    @Test
    void filterHmAccProductByAvailabilityLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByAvailabilityLinkTest();
    }



}
