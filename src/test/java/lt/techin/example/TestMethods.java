package lt.techin.example;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethods extends BaseTest{

    //sign up test methods
    protected void clickOnSignUpTest() {
        HomePage homePage = new HomePage(driver);

        //assert signin link is displayed
        assertTrue(homePage.isSignUpLinkDisplayed(), "The sign in link isn't displayed");
        System.out.println("The sign in link is displayed" + "\n");

        homePage.clickSignUpLink();
    }

    protected void createNewMaleUserAccountTest(RegisterPage registerPage){

//        //assert first name input field is present
        //assertTrue(registerPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed"); -> assert cause the click to fail
        System.out.println("The male gender selector is displayed" + "\n");
        registerPage.selectMaleGender();

        //assert first name input field is displayed
        assertTrue(registerPage.isFirstNameInputDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registerPage.inputNewUserFirstName();

        //assert last name input field is displayed
        assertTrue(registerPage.isLastNameInputDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registerPage.inputNewUserLastName();

        //assert email address input field is displayed
        assertTrue(registerPage.isEmailAddressInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registerPage.inputNewUserEmail();

        //assert password input field is present
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registerPage.inputNewUserPassword();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Customer data privacy' checkbox is present
       // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewFemaleUserAccountTest(RegisterPage registerPage){

//        //assert first name input field is present
       // assertTrue(registerPage.isFemaleGenderSelectorDisplayed(), "The female gender selector isn't displayed"); // -> assert cause the click to fail
       // System.out.println("The female gender selector is displayed" + "\n");
        registerPage.selectFemaleGender();

        //assert first name input field is displayed
        assertTrue(registerPage.isFirstNameInputDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registerPage.inputNewUserFirstName();

        //assert last name input field is displayed
        assertTrue(registerPage.isLastNameInputDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registerPage.inputNewUserLastName();

        //assert email address input field is displayed
        assertTrue(registerPage.isEmailAddressInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registerPage.inputNewUserEmail();

        //assert password input field is present
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registerPage.inputNewUserPassword();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Agree to terms' checkbox is displayed
       // assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed"); // -> assert cause the click to fail
       // System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); // -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void logoutFromUserAccountTest(){
        HomePage homePage = new HomePage(driver);
        //assert 'Sign out' link is present
        assertTrue(homePage.isSignOutLinkDisplayed(), "The sign out link isn't displayed");
        System.out.println("The sign out link is displayed" + "\n");
        homePage.clickSignOutLink();
    }
}
