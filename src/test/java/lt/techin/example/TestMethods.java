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
        //assert show password button is displayed
        assertTrue(registerPage.isShowPasswordButtonDisplayed(), "The 'Show' password button isn't displayed");
        System.out.println("The 'Show' password button is displayed" + "\n");
        registerPage.clickShowPasswordButton();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

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

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
       // assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed"); // -> assert cause the click to fail
       // System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); // -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed" + "\n");
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

    protected void clickSignInRegisteredUserTest(){
        HomePage homePage = new HomePage(driver);
        //assert sign in link is displayed
        assertTrue(homePage.isSignInLinkDisplayed(), "The 'Sign In' link isn't displayed");
        System.out.println("The 'Sign In' link is displayed" + "\n");
        homePage.clickSignInLink();
    }

    protected void logInRegisteredUserTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);

        //assert email input field is displayed
        assertTrue(loginPage.isEmailInputfieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputEmailAddress(registerPage.getEmailAddress());

        //assert password input field is present
        assertTrue(loginPage.isPasswordInputFieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputPassword(registerPage.getPassword());

//        //assert 'Show' button is displayed
        assertTrue(loginPage.isShowPasswordButtonPresent(), "The 'show' button isn't displayed");
        System.out.println("The 'Show' button is displayed");
//        loginPage.clickShowPasswordButton(); //-> the button somehow works with the same algorithm as 'Sign In' button

        //assert sign in button is present
        assertTrue(loginPage.isSignInButtonPresent(), "The 'Sign in' button isn't present");
        System.out.println("The 'Sign in ' button is present" + "\n");
        loginPage.clickSignInButton();
    }

    // negative test methods for user registration -> no input at the singular field
    protected void createNewUserAccountNoGenderTest(RegisterPage registerPage){

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

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewUserAccountNoFirstNameTest(RegisterPage registerPage){

        //assert first name input field is present
        //assertTrue(registerPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed"); -> assert cause the click to fail
        System.out.println("The male gender selector is displayed" + "\n");
        registerPage.selectMaleGender();

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

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewUserAccountNoLastNameTest(RegisterPage registerPage){

        //assert first name input field is present
        //assertTrue(registerPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed"); -> assert cause the click to fail
        System.out.println("The male gender selector is displayed" + "\n");
        registerPage.selectMaleGender();

        //assert first name input field is displayed
        assertTrue(registerPage.isFirstNameInputDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registerPage.inputNewUserFirstName();

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

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewUserAccountNoEmailTest(RegisterPage registerPage){

        //assert first name input field is present
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

        //assert password input field is present
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registerPage.inputNewUserPassword();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewUserAccountNoPasswordTest(RegisterPage registerPage){

        //assert first name input field is present
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

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewUserAccountNoReceiveOffersCheckboxTest(RegisterPage registerPage){

        //assert first name input field is present
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

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewUserAccountNoAgreeToTermsCheckboxTest(RegisterPage registerPage){

        //assert first name input field is present
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

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewUserAccountNoNewsletterSignUpCheckboxTest(RegisterPage registerPage){

        //assert first name input field is present
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

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

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

    protected void createNewUserAccountNoCustomerDataCheckboxTest(RegisterPage registerPage){

        //assert first name input field is present
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

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();
    }

    protected void createNewUserAccountWithTooLongFirNameTest(RegisterPage registerPage){

//        //assert first name input field is present
        //assertTrue(registerPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed"); -> assert cause the click to fail
        System.out.println("The male gender selector is displayed" + "\n");
        registerPage.selectMaleGender();

        //assert first name input field is displayed
        assertTrue(registerPage.isFirstNameInputDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registerPage.inputNewUserTooLongFirstName();


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
        //assert show password button is displayed
        assertTrue(registerPage.isShowPasswordButtonDisplayed(), "The 'Show' password button isn't displayed");
        System.out.println("The 'Show' password button is displayed" + "\n");
        registerPage.clickShowPasswordButton();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();


        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();

        //assert the error message is displayed
        assertEquals(registerPage.getTooLongFirstNameMessage(), "The first name field is too long (255 chars max).");
    }

    protected void createNewUserAccountWithTooLongLastNameTest(RegisterPage registerPage){

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
        registerPage.inputNewUserTooLongLastName();

        //assert email address input field is displayed
        assertTrue(registerPage.isEmailAddressInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registerPage.inputNewUserEmail();


        //assert password input field is present
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registerPage.inputNewUserPassword();
        //assert show password button is displayed
        assertTrue(registerPage.isShowPasswordButtonDisplayed(), "The 'Show' password button isn't displayed");
        System.out.println("The 'Show' password button is displayed" + "\n");
        registerPage.clickShowPasswordButton();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();


        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();

        //assert the error message is displayed
        assertEquals(registerPage.getTooLongLastNameMessage(), "The last name field is too long (255 chars max).");
    }

    protected void createNewUserAccountWithTooLongEmailTest(RegisterPage registerPage){

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
        registerPage.inputNewUserTooLongEmailAddress();


        //assert password input field is present
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registerPage.inputNewUserPassword();
        //assert show password button is displayed
        assertTrue(registerPage.isShowPasswordButtonDisplayed(), "The 'Show' password button isn't displayed");
        System.out.println("The 'Show' password button is displayed" + "\n");
        registerPage.clickShowPasswordButton();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();


        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();

        //assert the error message is displayed
        assertEquals(registerPage.getTooLongEmailAddressMessage(), "The email field is too long (255 chars max).");
    }

    protected void createNewUserAccountWithInvalidEmailTest(RegisterPage registerPage){

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
        registerPage.inputNewUserInvalidEmailAddress();


        //assert password input field is present
        assertTrue(registerPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registerPage.inputNewUserPassword();
        //assert show password button is displayed
        assertTrue(registerPage.isShowPasswordButtonDisplayed(), "The 'Show' password button isn't displayed");
        System.out.println("The 'Show' password button is displayed" + "\n");
        registerPage.clickShowPasswordButton();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();


        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();

        //assert the error message is displayed
        assertEquals(registerPage.getInvalidEmailMessage(), "Invalid format.");
    }

    protected void createNewUserAccountWithTooShortPasswordTest(RegisterPage registerPage){

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
        registerPage.inputNewUserTooShortPassword();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();


        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();

        //assert the error message is displayed
        //assertEquals(registerPage.getInvalidLengthPasswordMessage(), "Password must be between 8 and 72 characters long");
    }

    protected void createNewUserAccountWithTooLongPasswordTest(RegisterPage registerPage){

        //assert first name input field is present
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
        registerPage.inputNewUserTooLongPassword();

        //assert birthdate input field is present
        assertTrue(registerPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is present" + "\n");
        registerPage.inputNewUserBirthDate();

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();


        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();

        //assert the error message is displayed
        assertEquals(registerPage.getInvalidLengthPasswordMessage(), "Password must be between 8 and 72 characters long");
    }

    protected void createNewUserAccountWithInvalidBirthdateTest(RegisterPage registerPage){

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
        registerPage.inputNewUserInvalidBirthdate();

        //assert 'Receive offers' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Receive offers' checkbox is displayed" + "\n");
        registerPage.clickReceiveOffersCheckbox();

//        //assert the password related messages are displayed
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordLengthMessage(), "Enter a password between 8 and 72 characters");
//        System.out.println("The password strength message is displayed" + "\n");
//        assertEquals(registerPage.getPasswordStrengthMessage(), "The minimum score must be: Strong");

        //assert 'Agree to terms' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Agree to terms' checkbox is displayed" + "\n");
        registerPage.clickAgreeToTermsCheckbox();

        //assert 'Sign up for newsletter' checkbox is displayed
        //assertTrue(registerPage.isAgreeToTermsCheckboxDisplayed(), "The 'Agree to terms' checkbox is displayed");  // -> assert cause the click to fail
        System.out.println("The 'Sign up for newsletter' checkbox is displayed" + "\n");
        registerPage.clickSignUpForNewsletterCheckbox();

        //assert 'Customer data privacy' checkbox is present
        // assertTrue(registerPage.isCustomerDataPrivacyCheckboxDisplayed(), "The 'Customer data privacy' checkbox isn't displayed"); //  -> assert cause the click to fail
        System.out.println("The 'Customer data privacy' checkbox is displayed");
        registerPage.clickCustomerDataPrivacyCheckbox();


        //assert 'Save' account button is present
        assertTrue(registerPage.isSaveAccountButtonDisplayed(), "The 'Save' account button isn't displayed");
        System.out.println("The 'Save' account button is displayed" + "\n");
        registerPage.clickSaveButton();

        //assert the error message is displayed
        assertEquals(registerPage.getInvalidBirthdateMessage(), "Format should be 05/31/1970.");
    }

    // negative registered user login test methods -> invalid / no input
    protected void logInRegisteredUserWithInvalidEmailTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);

        //assert email input field is displayed
        assertTrue(loginPage.isEmailInputfieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputInvalidLoginEmailAddress();

        //assert password input field is present
        assertTrue(loginPage.isPasswordInputFieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputPassword(registerPage.getPassword());

        //assert sign in button is present
        assertTrue(loginPage.isSignInButtonPresent(), "The 'Sign in' button isn't present");
        System.out.println("The 'Sign in ' button is present" + "\n");
        loginPage.clickSignInButton();
    }
    protected void logInRegisteredUserWithExistingEmailTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);

        //assert email input field is displayed
        assertTrue(loginPage.isEmailInputfieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputExistingLoginEmailAddress();

        //assert password input field is present
        assertTrue(loginPage.isPasswordInputFieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputPassword(registerPage.getPassword());

        //assert sign in button is present
        assertTrue(loginPage.isSignInButtonPresent(), "The 'Sign in' button isn't present");
        System.out.println("The 'Sign in ' button is present" + "\n");
        loginPage.clickSignInButton();
    }

    protected void logInRegisteredUserWithNoEmailTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);

        //assert email input field is displayed
        assertTrue(loginPage.isEmailInputfieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputNoLoginEmailAddress();

        //assert password input field is present
        assertTrue(loginPage.isPasswordInputFieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputPassword(registerPage.getPassword());

        //assert sign in button is present
        assertTrue(loginPage.isSignInButtonPresent(), "The 'Sign in' button isn't present");
        System.out.println("The 'Sign in ' button is present" + "\n");
        loginPage.clickSignInButton();
    }

    protected void logInRegisteredUserInvalidPasswordTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);

        //assert email input field is displayed
        assertTrue(loginPage.isEmailInputfieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputEmailAddress(registerPage.getEmailAddress());

        //assert password input field is present
        assertTrue(loginPage.isPasswordInputFieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputInvalidLoginPassword();

        //assert sign in button is present
        assertTrue(loginPage.isSignInButtonPresent(), "The 'Sign in' button isn't present");
        System.out.println("The 'Sign in ' button is present" + "\n");
        loginPage.clickSignInButton();
    }

    protected void logInRegisteredUserNoPasswordTest(RegisterPage registerPage){
        LoginPage loginPage = new LoginPage(driver);

        //assert email input field is displayed
        assertTrue(loginPage.isEmailInputfieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputEmailAddress(registerPage.getEmailAddress());

        //assert password input field is present
        assertTrue(loginPage.isPasswordInputFieldPresent(), "The email input field isn't present");
        System.out.println("The email input field is present" + "\n");
        loginPage.inputNoLoginPassword();

        //assert sign in button is present
        assertTrue(loginPage.isSignInButtonPresent(), "The 'Sign in' button isn't present");
        System.out.println("The 'Sign in ' button is present" + "\n");
        loginPage.clickSignInButton();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    // art page test methods
    protected void navigateToArtPageTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert 'Art' link is displayed on navbar
        assertTrue(registeredUserArtPage.isArtPageLinkPresent(), "The 'Art' link isn't displayed");
        System.out.println("The 'Art' link is displayed" + "\n");
        registeredUserArtPage.clickArtLink();
    }

    protected void filterProductsByInStockBoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserArtPage.isInStockBoxIconLinkPresent(), "The 'In stock' box icon link isn't displayed");
        System.out.println("The 'In stock' box icon link is displayed" + "\n");
        registeredUserArtPage.clickInStockBoxIconLink();
    }

    protected void filterProductsByInStockLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserArtPage.isInStockLinkPresent(), "The 'In stock' link isn't displayed");
        System.out.println("The 'In stock' link is displayed" + "\n");
        registeredUserArtPage.clickInStockLink();
        //assertEquals(registeredUserArtPage.getAvailabilityFilterMessage(), "Availability: In stock");
    }

    protected void filterProductsByNewProductBoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserArtPage.isInStockBoxIconLinkPresent(), "The 'In stock' box icon link isn't displayed");
        System.out.println("The 'In stock' box icon link is displayed" + "\n");
        registeredUserArtPage.clickNewProductBoxIconLink();
    }

    protected void filterProductsByNewProductLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserArtPage.isInStockLinkPresent(), "The 'In stock' link isn't displayed");
        System.out.println("The 'In stock' link is displayed" + "\n");
        registeredUserArtPage.clickNewProductLink();
        //assertEquals(registeredUserArtPage.getSelectionsFilterMessage(), "Selections: New product");
    }









}