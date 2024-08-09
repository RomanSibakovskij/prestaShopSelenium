package lt.techin.example;

import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Test;

public class RegisteredUserInformationPageTest extends TestMethods{

    //Test 059 -> navigate to information page test
    @Test
    @Tag("Navigate_To_Information_Page")
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
    @Tag("Edit_User_With_Valid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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
    @Tag("Edit_User_With_Invalid_Data")
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

    //Test 060o -> edit registered user information (male user) with no birthdate test (info gets updated)
    @Test
    @Tag("Edit_User_With_Invalid_Data")
    void editUserInformationMaleNoBirthDateTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithNoBirthDateTest(registerPage);
    }

    //Test 060p -> edit registered user information (male user) with invalid birthdate format test (info gets updated)
    @Test
    @Tag("Edit_User_With_Invalid_Data")
    void editUserInformationMaleInvalidBirthDateTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editMaleUserDataWithInvalidBirthDateTest(registerPage);
    }

    //Test 060q -> edit registered user information (female user) without clicking required checkboxes
    @Test
    @Tag("Edit_User_With_Invalid_Data")
    void editUserInformationFemaleNoRequiredCheckboxesTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToUserAccountLink1Test();
        navigateToInformationPage();

        editFemaleUserDataWithValidDataNoCheckboxesTest(registerPage);
    }

    //Test 061 -> edit registered user information (female user) test
    @Test
    @Tag("Edit_User_With_Valid_Data")
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
