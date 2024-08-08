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

    //Test 060g -> edit registered user information (male user) with no email test
    @Test
    void editUserInformationMaleNoEmailTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithNoEmailTest(registerPage);
    }

    //Test 060h -> edit registered user information (male user) with invalid email test
    @Test
    void editUserInformationMaleInvalidEmailTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithInvalidEmailTest(registerPage);
    }

    //Test 060i -> edit registered user information (male user) with too long email test
    @Test
    void editUserInformationMaleTooLongEmailTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithTooLongEmailTest(registerPage);
    }

    //Test 060j -> edit registered user information (male user) with no password test
    @Test
    void editUserInformationMaleNoPasswordTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithNoPasswordTest(registerPage);
    }

    //Test 060k -> edit registered user information (male user) with invalid password test
    @Test
    void editUserInformationMaleInvalidPasswordTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithInvalidPasswordTest(registerPage);
    }

    //Test 060l -> edit registered user information (male user) with no new password test (info gets updated)
    @Test
    void editUserInformationMaleNoNewPasswordTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithNoNewPasswordTest(registerPage);
    }

    //Test 060l -> edit registered user information (male user) with invalid new password test
    @Test
    void editUserInformationMaleInvalidNewPasswordTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithInvalidNewPasswordTest(registerPage);
    }

    //Test 060m -> edit registered user information (male user) with too long new password test
    @Test
    void editUserInformationMaleTooLongNewPasswordTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithTooLongNewPasswordTest(registerPage);
    }

    //Test 060n -> edit registered user information (male user) with matching new password test (info gets updated)
    @Test
    void editUserInformationMaleMatchingNewPasswordTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithMatchingNewPasswordTest(registerPage);
    }

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
