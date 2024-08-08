package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserInformationPageTest extends TestMethods{

    //Test 059 -> navigate to information page test
    @Test
    void navigateRegisteredUserInformationPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();
    }

    //Test 060 -> edit registered user information (male user) test
    @Test
    void editRegisteredUserInformationMaleTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithValidDataTest(registerPage);
    }

    //Test 060a -> edit registered user information (male user) with no first name test
    @Test
    void editUserInformationMaleNoFirstNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithNoFirstNameTest(registerPage);
    }

    //Test 060b -> edit registered user information (male user) with invalid first name test
    @Test
    void editUserInformationMaleInvalidFirstNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithInvalidFirstNameTest(registerPage);
    }

<<<<<<< HEAD
=======
    //Test 060c -> edit registered user information (male user) with invalid first name test
    @Test
    void editUserInformationMaleTooLongFirstNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithTooLongFirstNameTest(registerPage);
    }

    //Test 060d -> edit registered user information (male user) with no last name test
    @Test
    void editUserInformationMaleNoLastNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithNoLastNameTest(registerPage);
    }

    //Test 060e -> edit registered user information (male user) with invalid last name test
    @Test
    void editUserInformationMaleInvalidLastNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithInvalidLastNameTest(registerPage);
    }

    //Test 060f -> edit registered user information (male user) with too long last name test
    @Test
    void editUserInformationMaleTooLongLastNameTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithTooLongLastNameTest(registerPage);
    }

>>>>>>> 9fdddf9b5945a7b9bad0ff40c4546fd2a4ed0a82


    //Test 061 -> edit registered user information (female user) test
    @Test
    void editRegisteredUserInformationFemaleTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editFemaleUserDataWithValidDataTest(registerPage);
    }



}
