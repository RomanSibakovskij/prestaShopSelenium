package lt.techin.example;

import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Test;

public class RegisteredUserAccountAddFirstAddressPageTest extends TestMethods{

    //Test 062 -> navigate to user account page (upper navbar link)
    @Test
    @DisplayName("User Account Page Navigation(upper navbar link)")
    @Tag("Navigate_To_User_Account_NavLink")
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
    @DisplayName("User Account Page Navigation(footer link)")
    @Tag("Navigate_To_User_Account_FooterLink")
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
    @DisplayName("Add To First Address Page Navigation")
    @Tag("Navigate_To_First_Address_Page")
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

    //Test 065 -> change registered user data with valid input
    @Test
    @DisplayName("Edit User Account Data With Valid Input[United States]")
    @Tag("Edit_Account_Data_Valid_Input")
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
    @DisplayName("Edit User Account Data Without First Name")
    @Tag("Edit_Account_Data_No_Singular_Input")
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
    @DisplayName("Edit User Account Data Without Last Name")
    @Tag("Edit_Account_Data_No_Singular_Input")
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
    @DisplayName("Edit User Account Data Without Address")
    @Tag("Edit_Account_Data_No_Singular_Input")
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
    @DisplayName("Edit User Account Data Without City")
    @Tag("Edit_Account_Data_No_Singular_Input")
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
    @DisplayName("Edit User Account Data Without State")
    @Tag("Edit_Account_Data_No_Singular_Input")
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
    @DisplayName("Edit User Account Data Without Postal Code")
    @Tag("Edit_Account_Data_No_Singular_Input")
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
    @DisplayName("Edit User Account Data With Valid Input [France]")
    @Tag("Edit_Account_Data_Valid_Input")
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
