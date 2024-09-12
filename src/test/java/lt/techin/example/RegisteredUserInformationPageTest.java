package lt.techin.example;

import org.junit.jupiter.api.*;

public class RegisteredUserInformationPageTest extends TestMethods{

    //Test 059 -> navigate to information page test
    @Test
    @DisplayName("User Navigation To Information Page")
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
    @DisplayName("Edit Male User Account Information With Valid Input")
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
    @DisplayName("Edit User Account Information Without First Name")
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
    @DisplayName("Edit User Account Information Without Last Name")
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
    @DisplayName("Edit User Account Information With Invalid First Name")
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
    @DisplayName("Edit User Account Information Without Last Name")
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
    @DisplayName("Edit User Account Information With Invalid Last Name")
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
    @DisplayName("Edit User Account Information With Too Long Last Name")
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
    @DisplayName("Edit User Account Information Without Email")
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
    @DisplayName("Edit User Account Information With Invalid Email")
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
    @DisplayName("Edit User Account Information With Too Long Email")
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
    @DisplayName("Edit User Account Information Without Old Password")
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
    @DisplayName("Edit User Account Information With Invalid Old Password")
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
    @DisplayName("Edit User Account Information Without New Password")
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
    @DisplayName("Edit User Account Information With Invalid New Password")
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
    @DisplayName("Edit User Account Information With Too Long New Password")
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
    @DisplayName("Edit User Account Information With Matching Passwords")
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
    @DisplayName("Edit User Account Information Without Birthdate")
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
    @DisplayName("Edit User Account Information With Invalid Birthdate Format")
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
    @DisplayName("Edit User Account Information Without Required Checkboxes")
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
    @DisplayName("Edit Female User Account Information With Valid Input")
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
