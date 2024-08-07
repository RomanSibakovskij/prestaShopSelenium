package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserAccountAddFirstAddressPageTest extends TestMethods{

    //Test 062 -> navigate to user account page (upper navbar link)
    @Test
    void navigateToUserAccountLink1Tests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
    }

    //Test 063 -> navigate to user account page (footer link)
    @Test
    void navigateToUserAccountLink2Tests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink2Test();
    }

    //Test 064 -> navigate to add first address page
    @Test
    void navigateToAddFirstAddressPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
    }

    //Test 065 -> change registered user data with valid data
    @Test
    void changeRegisteredUserDataValidInputTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
        editRegisteredUserDataValidInputTest();
    }

    //Test 065a -> change registered user data without first name
    @Test
    void changeRegisteredUserDataNoFirstNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
        editRegisteredUserDataNoFirstNameTest();
    }

    //Test 065b -> change registered user data without last name
    @Test
    void changeRegisteredUserDataNoLastNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
        editRegisteredUserDataNoLastNameTest();
    }

    //Test 065c -> change registered user data without address
    @Test
    void changeRegisteredUserDataNoAddressTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
        editRegisteredUserDataNoAddressTest();
    }

    //Test 065d -> change registered user data without city
    @Test
    void changeRegisteredUserDataNoCityTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
        editRegisteredUserDataNoCityTest();
    }

    //Test 065e -> change registered user data without state
    @Test
    void changeRegisteredUserDataNoStateTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
        editRegisteredUserDataNoStateTest();
    }

    //Test 065f -> change registered user data without postal code
    @Test
    void changeRegisteredUserDataNoPostalCodeTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
        editRegisteredUserDataNoPostalCodeTest();
    }

    //Test 065g -> change registered user data with valid data (France)
    @Test
    void changeRegisteredUserDataValidInputFranceTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAddFirstAddressPage();
        editRegisteredUserDataValidInputFranceTest();
    }


}
