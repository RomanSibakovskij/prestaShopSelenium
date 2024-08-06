package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserAccountPageTest extends TestMethods{

    //Test 059 -> navigate to user account page (upper navbar link)
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

    //Test 059a -> navigate to user account page (footer link)
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

    //Test 060 -> navigate to add first address page
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

    //Test 061 -> change registered user data with valid data
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

    //Test 061a -> change registered user data without first name
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

    //Test 061b -> change registered user data without last name
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

    //Test 061c -> change registered user data without address
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

    //Test 061d -> change registered user data without city
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

    //Test 061e -> change registered user data without state
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

    //Test 061f -> change registered user data without postal code
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

    //Test 061g -> change registered user data with valid data (France)
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
