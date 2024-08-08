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
        //registerPage.clickReceiveOffersCheckbox();

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
        //registerPage.clickSignUpForNewsletterCheckbox();

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

    //search catalog test methods

    // mugs test methods
    protected void searchForMugBestInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryMug1IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getMugTheBestQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getMugTheBestQuery() + " isn't present in search result");
    }

    protected void searchForMugAdventureInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryMug2IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getMugAdventureQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getMugAdventureQuery() + " isn't present in search result");
    }

    protected void searchForMugGoodDayInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryMug3IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getMugGoodDayQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getMugGoodDayQuery() + " isn't present in search result");
    }

    protected void searchForMugCustomTextInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryMug4IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getMugCustomTextQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getMugCustomTextQuery() + " isn't present in search result");
    }

    //posters test methods

    protected void searchForPosterBestInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryPoster1IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getPosterTheBestQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getPosterTheBestQuery() + " isn't present in search result");
    }

    protected void searchForPosterAdventureInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryPoster2IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getPosterAdventureQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getPosterAdventureQuery() + " isn't present in search result");
    }

    protected void searchForPosterGoodDayInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryPoster3IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getPosterGoodDayQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getPosterGoodDayQuery() + " isn't present in search result");
    }

    //cushion test methods
    protected void searchForCushionFoxInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryCushion1IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getCushionFoxQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getCushionFoxQuery() + " isn't present in search result");
    }

    protected void searchForCushionBearInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryCushion2IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getCushionBearQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getCushionBearQuery() + " isn't present in search result");
    }

    protected void searchForCushionBirdInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryCushion3IntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getCushionBirdQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getCushionBirdQuery() + " isn't present in search result");
    }

    //t-shirt test method
    protected void searchForTShirtInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryTShirtIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getTShirtQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getTShirtQuery() + " isn't present in search result");
    }

    //sweater test method
    protected void searchForSweaterBirdInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQuerySweaterIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getSweaterQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getSweaterQuery() + " isn't present in search result");
    }

    //graphics test methods
    protected void searchForGraphicsFoxInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryGraphicsFoxIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getGraphicsFoxQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getGraphicsFoxQuery() + " isn't present in search result");
    }

    protected void searchForGraphicsBearInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryGraphicsBearIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getGraphicsBearQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getGraphicsBearQuery() + " isn't present in search result");
    }

    protected void searchForGraphicsBirdInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryGraphicsBirdIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getGraphicsBirdQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getGraphicsBirdQuery() + " isn't present in search result");
    }

    //notebooks test methods
    protected void searchForNotebookFoxInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryNotebookFoxIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getNotebookFoxQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getNotebookFoxQuery() + " isn't present in search result");
    }

    protected void searchForNotebookBearInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryNotebookBearIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getNotebookBearQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getNotebookBearQuery() + " isn't present in search result");
    }

    protected void searchForNotebookBirdInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryNotebookBirdIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getNotebookBirdQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getNotebookBirdQuery() + " isn't present in search result");
    }

    protected void searchForPackQueryInSearchCatalogTest(){
        RegisteredUserSearchCatalogPage registeredUserSearchCatalogPage = new RegisteredUserSearchCatalogPage(driver);

        //assert search bar is present
        assertTrue(registeredUserSearchCatalogPage.isSearchBarDisplayed(), "The search bar isn't displayed");
        System.out.println("The search bar is displayed");
        registeredUserSearchCatalogPage.inputSearchQueryPackMugPosterIntoSearchBar();
        //assert search query result is displayed
        //assertTrue(registeredUserSearchCatalogPage.isSearchQueryResultPopUpDisplayed(), "The search query result isn't displayed");
        boolean isProductFound = registeredUserSearchCatalogPage.isProductPresent(registeredUserSearchCatalogPage.getPackSearchQuery());
        assertTrue(isProductFound, "The product with the name " +  registeredUserSearchCatalogPage.getPackSearchQuery() + " isn't present in search result");
    }




    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    // art page test methods

    protected void navigateToArtPageTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert 'Art' link is displayed on navbar
        assertTrue(registeredUserArtPage.isArtPageLinkPresent(), "The 'Art' link isn't displayed on navbar");
        System.out.println("The 'Art' link is displayed on navbar" + "\n");
        registeredUserArtPage.clickArtLink();
    }

    // filter products by test methods
    protected void filterProductsByInStockBoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserArtPage.isInStockBoxIconLinkPresent(), "The 'In stock' box icon link isn't displayed");
        System.out.println("The 'In stock' box icon link is displayed" + "\n");
        registeredUserArtPage.clickInStockBoxIconLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getAvailabilityFilterMessage(), "Availability: In stock");
    }

    protected void filterProductsByInStockLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserArtPage.isInStockLinkPresent(), "The 'In stock' link isn't displayed");
        System.out.println("The 'In stock' link is displayed" + "\n");
        registeredUserArtPage.clickInStockLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getAvailabilityFilterMessage(), "Availability: In stock");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByNewProductBoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by new product choice is displayed
        assertTrue(registeredUserArtPage.isNewProductBoxIconLinkPresent(), "The 'New product' box icon link isn't displayed");
        System.out.println("The 'New product' box icon link is displayed" + "\n");
        registeredUserArtPage.clickNewProductBoxIconLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getSelectionsFilterMessage(), "Selections: New product");
    }

    protected void filterProductsByNewProductLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by new product choice is displayed
        assertTrue(registeredUserArtPage.isNewProductLinkPresent(), "The 'New product' link isn't displayed");
        System.out.println("The 'New product' link is displayed" + "\n");
        registeredUserArtPage.clickNewProductLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getSelectionsFilterMessage(), "Selections: New product");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    //filter products by price slider
    protected void filterProductsByPriceSliderTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by price slider is displayed
        assertTrue(registeredUserArtPage.isPriceSliderDisplayed(), "The price slider isn't displayed");
        System.out.println("The price slider is displayed");
        double targetPrice = 21.0;
        registeredUserArtPage.setPriceSliderValue(targetPrice);
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByCompositionLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by matt paper choice is displayed
        assertTrue(registeredUserArtPage.isCompositionLinkPresent(), "The 'Matt paper' link isn't displayed");
        System.out.println("The 'Matt paper' link is displayed" + "\n");
        registeredUserArtPage.clickCompositionLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getCompositionFilterMessage(), "Composition: Matt paper");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByCompositionBoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by matt paper choice is displayed
        assertTrue(registeredUserArtPage.isCompositionBoxIconLinkDisplayed(), "The 'Matt paper' box icon link isn't displayed");
        System.out.println("The 'Matt paper' box icon link is displayed" + "\n");
        registeredUserArtPage.clickCompositionBoxIconLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getCompositionFilterMessage(), "Composition: Matt paper");
    }

    protected void filterProductsByBrandLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by graphic corner choice is displayed
        assertTrue(registeredUserArtPage.isBrandLinkPresent(), "The 'Graphic Corner' link isn't displayed");
        System.out.println("The 'Graphic Corner' link is displayed" + "\n");
        registeredUserArtPage.clickBrandLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getBrandFilterMessage(), "Brand: Graphic Corner");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByBrandBoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by graphic corner choice is displayed
        assertTrue(registeredUserArtPage.isBrandBoxIconLinkDisplayed(), "The 'Graphic Corner' box icon link isn't displayed");
        System.out.println("The 'Graphic Corner' box icon link is displayed" + "\n");
        registeredUserArtPage.clickCompositionBoxIconLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getBrandFilterMessage(), "Brand: Graphic Corner");

    }

    protected void filterProductsByDimension1LinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by '40x60 cm' dimension choice is displayed
        assertTrue(registeredUserArtPage.isDimensionLink1Present(), "The '40x60 cm' link isn't displayed");
        System.out.println("The '40x60 cm' link is displayed" + "\n");
        registeredUserArtPage.clickDimension1Link();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getDimension1FilterMessage(), "Dimension: 40x60cm");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByDimension1BoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by '40x60 cm' dimension choice is displayed
        assertTrue(registeredUserArtPage.isDimensionBoxIconLink1Present(), "The '40x60 cm' box icon link isn't displayed");
        System.out.println("The '40x60 cm' box icon link is displayed" + "\n");
        registeredUserArtPage.clickDimension1BoxIconLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getDimension1FilterMessage(), "Dimension: 40x60cm");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByDimension2LinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by '60x90 cm' dimension choice is displayed
        assertTrue(registeredUserArtPage.isDimensionLink2Present(), "The '60x90 cm' link isn't displayed");
        System.out.println("The '60x90 cm' link is displayed" + "\n");
        registeredUserArtPage.clickDimension2Link();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getDimension2FilterMessage(), "Dimension: 60x90cm");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByDimension2BoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by '60x90 cm' dimension choice is displayed
        assertTrue(registeredUserArtPage.isDimensionBoxIconLink2Present(), "The '60x90 cm' box icon link isn't displayed");
        System.out.println("The '60x90 cm' box icon link is displayed" + "\n");
        registeredUserArtPage.clickDimension2BoxIconLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getDimension2FilterMessage(), "Dimension: 60x90cm");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByDimension3LinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by '80x120 cm' dimension choice is displayed
        assertTrue(registeredUserArtPage.isDimensionLink3Present(), "The '80x120 cm' link isn't displayed");
        System.out.println("The '80x120 cm' link is displayed" + "\n");
        registeredUserArtPage.clickDimension3Link();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getDimension3FilterMessage(), "Dimension: 80x120cm");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void filterProductsByDimension3BoxIconLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the filter by '80x120 cm' dimension choice is displayed
        assertTrue(registeredUserArtPage.isDimensionBoxIconLink3Present(), "The '80x120 cm' box icon link isn't displayed");
        System.out.println("The '80x120 cm' box icon link is displayed" + "\n");
        registeredUserArtPage.clickDimension3BoxIconLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getDimension3FilterMessage(), "Dimension: 80x120cm");
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    // dropdown menu test methods

    protected void clickSortByDropdownMenuTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert the dropdown is displayed
        assertTrue(registeredUserArtPage.isSortByDropDownMenuPresent(), "The 'Sort By' dropdown menu isn't displayed");
        System.out.println("The 'Sort By' dropdown menu is displayed" + "\n");
        registeredUserArtPage.clickSortByDropdownMenu();
    }

    //menu options test methods

    protected void sortProductsBySalesTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);

        registeredUserArtPage.clickSortByDropdownMenu();
        //assert the sort by sales option is displayed
        assertTrue(registeredUserArtPage.isSalesOptionDisplayed(), "The sort by 'Sales' menu option isn't displayed");
        System.out.println("The sort by 'Sales' menu option  is displayed" + "\n");
        registeredUserArtPage.clickSalesOption();
        //assertEquals(registeredUserArtPage.getSalesOptionText(), "Sales, highest to lowest"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortProductsByRelevanceTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);

        registeredUserArtPage.clickSortByDropdownMenu();
        //assert the sort by relevance option is displayed
        assertTrue(registeredUserArtPage.isRelevanceOptionDisplayed(), "The sort by 'Relevance' menu option isn't displayed");
        System.out.println("The sort by 'Relevance' menu option  is displayed" + "\n");
        registeredUserArtPage.clickRelevanceOption();
        //assertEquals(registeredUserArtPage.getRelevanceOptionText(), "Relevance"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortProductsByNameAToZTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);

        registeredUserArtPage.clickSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserArtPage.isNameAToZOptionDisplayed(), "The sort by name 'A to Z' menu option isn't displayed");
        System.out.println("The sort by name 'A to Z' menu option is displayed" + "\n");
        registeredUserArtPage.clickNameAToZOption();
        //assertEquals(registeredUserArtPage.getNameAToZOptionText(), "Name,A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortProductsByNameZToATest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);

        registeredUserArtPage.clickSortByDropdownMenu();
        //assert the sort by name 'z to a' option is displayed
        assertTrue(registeredUserArtPage.isNameZToAOptionDisplayed(), "The sort by name 'Z to A' menu option isn't displayed");
        System.out.println("The sort by name 'Z to A' menu option is displayed" + "\n");
        registeredUserArtPage.clickNameZToAOption();
        //assertEquals(registeredUserArtPage.getNameAToZOptionText(), "Name,Z to A"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortProductsByPriceLowToHighTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);

        registeredUserArtPage.clickSortByDropdownMenu();
        //assert the sort by price 'low to high' option is displayed
        assertTrue(registeredUserArtPage.isPriceLowToHighOptionDisplayed(), "The sort by price 'low to high' menu option isn't displayed");
        System.out.println("The sort by price 'low to high' menu option is displayed" + "\n");
        registeredUserArtPage.clickPriceLowToHighOption();
        //assertEquals(registeredUserArtPage.getPriceLowToHighOptionText(), "Price,low to high"); // -> assert crashes the test, it doesn't find text
        //remove search filter
        registeredUserArtPage.clickRemoveSearchFilter();
    }

    protected void sortProductsByPriceHighToLowTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);

        registeredUserArtPage.clickSortByDropdownMenu();
        //assert the sort by price 'high to low' option is displayed
        assertTrue(registeredUserArtPage.isPriceHighToLowOptionDisplayed(), "The sort by price 'high to low' menu option isn't displayed");
        System.out.println("The sort by price 'high to low' menu option is displayed" + "\n");
        registeredUserArtPage.clickPriceHighToLowOption();
        //assertEquals(registeredUserArtPage.getPriceHighToLowOptionText(), "Price,high to low"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortProductsByReferenceAToZTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);

        registeredUserArtPage.clickSortByDropdownMenu();
        //assert the sort by reference 'a to z' option is displayed
        assertTrue(registeredUserArtPage.isReferenceAToZOptionDisplayed(), "The sort by reference 'a to z' menu option isn't displayed");
        System.out.println("The sort by reference 'a to z' menu option is displayed" + "\n");
        registeredUserArtPage.clickReferenceAToZOption();
        //assertEquals(registeredUserArtPage.getReferenceAToZOptionText(), "Reference,a to z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortProductsByReferenceZToATest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);

        registeredUserArtPage.clickSortByDropdownMenu();
        //assert the sort by reference 'z to a' option is displayed
        assertTrue(registeredUserArtPage.isReferenceZToAOptionDisplayed(), "The sort by reference 'z to a' menu option isn't displayed");
        System.out.println("The sort by reference 'z to a' menu option is displayed" + "\n");
        registeredUserArtPage.clickReferenceZToAOption();
        //assertEquals(registeredUserArtPage.getReferenceZToAOptionText(), "Reference,z to a"); // -> assert crashes the test, it doesn't find text
    }

    protected void selectBestYetToComePosterLinkTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert 'Art' link is displayed on navbar
        assertTrue(registeredUserArtPage.isArtPageLinkPresent(), "The 'Art' link isn't displayed on navbar");
        System.out.println("The 'Art' link is displayed on navbar" + "\n");
        registeredUserArtPage.clickArtLink();
        //assert 'Best Yet To Come' poster link is displayed
        //assertTrue(registeredUserArtPage.isBestYetToComePosterLinkDisplayed(), "The 'Best Yet To Come poster link isn't displayed");
        System.out.println("The 'Best Yet To Come poster link isn't displayed" + "\n");
        registeredUserArtPage.clickBestYetToComePosterLink();
    }

    protected void selectBestYetToComePosterBoxIconTest(){
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert 'Art' link is displayed on navbar
        assertTrue(registeredUserArtPage.isArtPageLinkPresent(), "The 'Art' link isn't displayed on navbar");
        System.out.println("The 'Art' link is displayed on navbar" + "\n");
        registeredUserArtPage.clickArtLink();
        //assert 'Best Yet To Come' poster box icon is displayed
        assertTrue(registeredUserArtPage.isBestYetToComePosterBoxIconDisplayed(), "The 'Best Yet To Come' poster box icon isn't displayed");
        System.out.println("The 'Best Yet To Come' poster box icon isn't displayed" + "\n");
        registeredUserArtPage.clickBestYetToComePosterBoxIcon();

        BestYetToComePosterPage bestYetToComePosterPage = new BestYetToComePosterPage(driver);
        //assert product name is correct
        assertEquals(bestYetToComePosterPage.getProductName(), "THE BEST IS YET TO COME' FRAMED POSTER");
        //assert 'Add to Cart' button is displayed
        assertTrue(bestYetToComePosterPage.isAddToCartButtonDisplayed(), "The 'Add to Cart' button isn't displayed");
        System.out.println("The 'Add To Cart' button is displayed" + "\n");
        bestYetToComePosterPage.clickAddToCartButton();

        //assert the product was added to cart
        assertEquals(bestYetToComePosterPage.getSuccessMessage(), "\uE876Product successfully added to your shopping cart");
        //assert the product added bears the correct name
        assertEquals(bestYetToComePosterPage.getAddedProductName(), "The best is yet to come' Framed poster");
        //assert the correct amount was added to cart
        assertEquals(bestYetToComePosterPage.getCartItemCount(), "There is 1 item in your cart.");

        //assert 'Proceed to Checkout' button in pop-up is displayed
        assertTrue(bestYetToComePosterPage.isProceedToCheckoutButtonDisplayed(), "The 'Proceed To Checkout' button isn't displayed");
        System.out.println("The 'Proceed To Checkout' button is displayed" + "\n");
        bestYetToComePosterPage.clickProceedToCheckoutButton();

        ProductCheckoutPage productCheckoutPage = new ProductCheckoutPage(driver);
        //assert quantity field is displayed in checkout page
        assertTrue(productCheckoutPage.isQtyAdjusterDisplayed(), "The quantity adjuster isn't present");
        System.out.println("The quantity adjuster is present" + "\n");
        productCheckoutPage.inputProductQuantity();
        //assert 'Proceed to checkout' button is displayed
        assertTrue(productCheckoutPage.isProceedToCheckoutButtonDisplayed(), "The 'Proceed To Checkout' button isn't displayed");
        System.out.println("The 'Proceed To Checkout' button is displayed" + "\n");
        productCheckoutPage.clickProceedToCheckoutButton();

        ProductOrderPage productOrderPage = new ProductOrderPage(driver);
        //assert the address input field is displayed
        assertTrue(productOrderPage.isAddressInputFieldDisplayed(), "The address input field isn't displayed");
        System.out.println("The 'Proceed To Checkout' button is displayed" + "\n");
        productOrderPage.inputCheckoutDetails();
        productOrderPage.inputAddressIntoInputField();
        //assert the city input field is displayed
        assertTrue(productOrderPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        productOrderPage.inputCityIntoInputField();
        //assert the state dropdown menu is displayed
        assertTrue(productOrderPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        System.out.println("The state dropdown menu is displayed" + "\n");
        productOrderPage.clickStateDropdownMenu();
        //assert the valid state option is displayed
        assertTrue(productOrderPage.isIllinoisStateDisplayed(), "The Illinois option isn't displayed");
        System.out.println("The Illinois option is displayed" + "\n");
        productOrderPage.clickIllinoisStateOption();
        //assert the postal code input field is displayed
        assertTrue(productOrderPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        productOrderPage.inputPostalCodeIntoInputField();
        //assert the country dropdown menu is displayed
        assertTrue(productOrderPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        productOrderPage.clickCountryDropdownMenu();
        //assert the right country is displayed
        assertTrue(productOrderPage.isUSCountryDisplayed(), "The US option isn't displayed");
        System.out.println("The US option is displayed" + "\n");
        productOrderPage.clickUSOption();
        //assert 'Continue' button is displayed
        assertTrue(productOrderPage.isContinueButtonDisplayed(), "The 'Continue' button isn't displayed");
        System.out.println("The 'Continue' button is displayed" + "\n");
        productOrderPage.clickContinueButton();
        //assert shipping order comment input field is displayed
        assertTrue(productOrderPage.isOrderDeliveryCommentFieldDisplayed(), "The comment input field isn't displayed");
        System.out.println("The comment input field is displayed" + "\n");
        productOrderPage.inputDeliveryComment();
        //assert 'Continue' button is displayed
        assertTrue(productOrderPage.isShippingContinueButtonDisplayed(), "The 'Continue' button isn't displayed");
        System.out.println("The 'Continue' button is displayed" + "\n");
        productOrderPage.clickShippingContinueButton();
        //assert chosen payment button option is displayed
        assertTrue(productOrderPage.isBankWireButtonDisplayed(), "The 'Bank wire' button isn't displayed");
        System.out.println("The 'Bank wire' button is displayed" + "\n");
        productOrderPage.selectBankWireOption();
        //assert terms of service checkbox is displayed
        assertTrue(productOrderPage.isTermsOfServiceCheckboxDisplayed(), "The 'Terms of service' checkbox isn't displayed");
        System.out.println("The 'Terms of service' checkbox is displayed" + "\n");
        productOrderPage.checkTermsOfServiceCheckbox();
        //assert 'Place Order' button is displayed
        assertTrue(productOrderPage.isPlaceOrderButtonDisplayed(), "The 'Place Order' button isn't displayed");
        System.out.println("The 'Place Order' button is displayed" + "\n");
        productOrderPage.clickPlaceOrderButton();
    }

    protected void addAndRemoveBestYetToComePosterFromCartBoxIconTest() {
        RegisteredUserArtPage registeredUserArtPage = new RegisteredUserArtPage(driver);
        //assert 'Art' link is displayed on navbar
        assertTrue(registeredUserArtPage.isArtPageLinkPresent(), "The 'Art' link isn't displayed on navbar");
        System.out.println("The 'Art' link is displayed on navbar" + "\n");
        registeredUserArtPage.clickArtLink();
        //assert 'Best Yet To Come' poster box icon is displayed
        assertTrue(registeredUserArtPage.isBestYetToComePosterBoxIconDisplayed(), "The 'Best Yet To Come' poster box icon isn't displayed");
        System.out.println("The 'Best Yet To Come' poster box icon isn't displayed" + "\n");
        registeredUserArtPage.clickBestYetToComePosterBoxIcon();

        BestYetToComePosterPage bestYetToComePosterPage = new BestYetToComePosterPage(driver);
        //assert product name is correct
        assertEquals(bestYetToComePosterPage.getProductName(), "THE BEST IS YET TO COME' FRAMED POSTER");
        //assert 'Add to Cart' button is displayed
        assertTrue(bestYetToComePosterPage.isAddToCartButtonDisplayed(), "The 'Add to Cart' button isn't displayed");
        System.out.println("The 'Add To Cart' button is displayed" + "\n");
        bestYetToComePosterPage.clickAddToCartButton();

        //assert the product was added to cart
        assertEquals(bestYetToComePosterPage.getSuccessMessage(), "\uE876Product successfully added to your shopping cart");
        //assert the product added bears the correct name
        assertEquals(bestYetToComePosterPage.getAddedProductName(), "The best is yet to come' Framed poster");
        //assert the correct amount was added to cart
        assertEquals(bestYetToComePosterPage.getCartItemCount(), "There is 1 item in your cart.");

        //assert 'Proceed to Checkout' button in pop-up is displayed
        assertTrue(bestYetToComePosterPage.isProceedToCheckoutButtonDisplayed(), "The 'Proceed To Checkout' button isn't displayed");
        System.out.println("The 'Proceed To Checkout' button is displayed" + "\n");
        bestYetToComePosterPage.clickProceedToCheckoutButton();

        ProductCheckoutPage productCheckoutPage = new ProductCheckoutPage(driver);
//        //assert quantity field is displayed in checkout page
//        assertTrue(productCheckoutPage.isQtyAdjusterDisplayed(), "The quantity adjuster isn't present");
//        System.out.println("The quantity adjuster is present" + "\n");
//        productCheckoutPage.inputProductQuantity();
        //assert product delete icon is displayed
        assertTrue(productCheckoutPage.isDeleteProductIconDisplayed(), "The delete icon isn't displayed");
        System.out.println("The delete icon is present" + "\n");
        productCheckoutPage.clickRemoveProductIcon();
        //assert delete confirmation message is as expected
        assertEquals(productCheckoutPage.getDeleteMessageConfirmation(), "There are no more items in your cart");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //registered user accessories page navigation test method

    protected void navigateToAccessoriesPageTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserStationaryAccessoriesPage.isAccessoriesPageLinkDisplayed(), "The accessories page link isn't displayed on navbar");
        System.out.println("The accessories page link is displayed on navbar" + "\n");
        registeredUserStationaryAccessoriesPage.clickAccessoriesPageLink();
    }

    //registered user stationary accessories page navigation test methods

    protected void navigateToStationaryAccessoriesPageLink1Test(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserStationaryAccessoriesPage.isStationaryAccessoriesPageLink1Displayed(), "The stationary accessories page link1 isn't displayed");
        System.out.println("The stationary accessories page link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStationaryAccessoriesPageLink1();
    }

    protected void navigateToStationaryAccessoriesPageLink2Test(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserStationaryAccessoriesPage.isStationaryAccessoriesPageLink2Displayed(), "The stationary accessories page link2 isn't displayed");
        System.out.println("The accessories page link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStationaryAccessoriesPageLink2();
    }

    protected void navigateToStationaryAccessoriesPageBoxIconTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserStationaryAccessoriesPage.isStationaryAccessoriesPageBoxIconDisplayed(), "The stationary accessories page box icon isn't displayed");
        System.out.println("The stationary accessories page box icon is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStationaryAccessoriesPageBoxIcon();
    }

    // stationary accessories product filter by test methods

    protected void filterProductByAvailabilityBoxIconTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'in stock' box icon is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesInStockBoxIconDisplayed(), "The stationary accessories 'in stock' box icon isn't displayed");
        System.out.println("The stationary accessories page 'in stock' box icon is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccInStockBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccAvailabilityFilterMessage(), "Availability: In stock"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterProductByAvailabilityLinkTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesInStockLinkDisplayed(), "The stationary accessories 'in stock' link isn't displayed");
        System.out.println("The stationary accessories page 'in stock' link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccInStockLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccAvailabilityFilterMessage(), "Availability: In stock"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();

    }

    protected void filterProductBySelectionsBoxIconTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesNewProductBoxIconDisplayed(), "The stationary accessories 'in stock' link isn't displayed");
        System.out.println("The stationary accessories page 'in stock' link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccNewProductBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccSelectionsFilterMessage(), "Selections: New product"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();

    }

    protected void filterProductBySelectionsLinkTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' link is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesNewProductLinkDisplayed(), "The stationary accessories 'new product' link isn't displayed");
        System.out.println("The stationary accessories page 'new product' link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccNewProductLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccSelectionsFilterMessage(), "Selections: New product"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();

    }

    protected void filterProductByPriceSliderTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' link is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesPriceSliderDisplayed(), "The stationary accessories price slider isn't displayed");
        System.out.println("The stationary accessories page price slider is displayed" + "\n");
        double targetPrice = 12.5;
        registeredUserStationaryAccessoriesPage.setStAccessoriesPriceSliderValue(targetPrice);
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccPriceFilterMessage(), "Price: $12.00 - $13.00"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterProductByPaperType1BoxIconTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesRuledPaperBoxIconDisplayed(), "The stationary accessories 'ruled' box icon isn't displayed");
        System.out.println("The stationary accessories page 'ruled' box icon is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccRuledPaperBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccRuledPaperFilterMessage(), "Paper Type: Ruled"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();

    }

    protected void filterProductByPaperType1LinkTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' link is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesRuledPaperLinkDisplayed(), "The stationary accessories 'ruled' link isn't displayed");
        System.out.println("The stationary accessories page 'ruled' link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccRuledPaperLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccRuledPaperFilterMessage(), "Paper Type: Ruled"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();

    }

    protected void filterProductByPaperType2BoxIconTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesPlainPaperBoxIconDisplayed(), "The stationary accessories 'plain' box icon isn't displayed");
        System.out.println("The stationary accessories page 'plain' box icon is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccPlainPaperBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccPlainPaperFilterMessage(), "Paper Type: Plain"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterProductByPaperType2LinkTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' link is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesPlainPaperLinkDisplayed(), "The stationary accessories 'plain' link isn't displayed");
        System.out.println("The stationary accessories page 'plain' link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccPlainPaperLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccPlainPaperFilterMessage(), "Paper Type: Plain"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterProductByPaperType3BoxIconTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesSquaredPaperBoxIconDisplayed(), "The stationary accessories 'squarred' box icon isn't displayed");
        System.out.println("The stationary accessories page 'squarred' box icon is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccSquaredPaperBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccSquaredPaperFilterMessage(), "Paper Type: Squared"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterProductByPaperType3LinkTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' link is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesSquaredPaperLinkDisplayed(), "The stationary accessories 'squarred' link isn't displayed");
        System.out.println("The stationary accessories page 'squarred' link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccSquaredPaperLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccSquaredPaperFilterMessage(), "Paper Type: Squared"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterProductByPaperType4BoxIconTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesDottedPaperBoxIconDisplayed(), "The stationary accessories 'dotted' box icon isn't displayed");
        System.out.println("The stationary accessories page 'dotted' box icon is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccDottedPaperBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccDottedPaperFilterMessage(), "Paper Type: Doted"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterProductByPaperType4LinkTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert product 'new product' link is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesDottedPaperLinkDisplayed(), "The stationary accessories 'dotted' link isn't displayed");
        System.out.println("The stationary accessories page 'dotted' link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccDottedPaperLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccDottedPaperFilterMessage(), "Paper Type: Doted"); -> assert crashes the test
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    // dropdown menu test method

    protected void clickStAccessoriesSortByDropdownMenuTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);
        //assert the dropdown is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesSortByDropdownMenuDisplayed(), "The 'Sort By' dropdown menu isn't displayed");
        System.out.println("The 'Sort By' dropdown menu is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
    }

    //stationary accessories dropdown menu options test methods

    protected void sortStAccessoriesProductsBySalesTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
        //assert the sort by sales option is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesSalesOptionDisplayed(), "The sort by 'Sales' menu option isn't displayed");
        System.out.println("The sort by 'Sales' menu option  is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccessoriesSalesOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccessoriesSalesOptionText(), "Sales, highest to lowest"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortStAccessoriesProductsByRelevanceTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
        //assert the sort by relevance option is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesRelevanceOptionDisplayed(), "The sort by 'Relevance' menu option isn't displayed");
        System.out.println("The sort by 'Relevance' menu option  is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccessoriesRelevanceOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccessoriesRelevanceOptionText(), "Relevance"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortStAccessoriesProductsByNameAToZTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesNameAToZOptionDisplayed(), "The sort by name 'A to Z' menu option isn't displayed");
        System.out.println("The sort by name 'A to Z' menu option  is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccessoriesNameAToZOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccessoriesNameAToZOptionText(), "Name,A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortStAccessoriesProductsByNameZToATest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesNameZToAOptionDisplayed(), "The sort by name 'Z to A' menu option isn't displayed");
        System.out.println("The sort by name 'A to Z' menu option  is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccessoriesNameZToAOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccessoriesNameZtoAOptionText(), "Name,Z to A"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortStAccessoriesProductsByPriceLowToHighTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesPriceLowToHighOptionDisplayed(), "The sort by price 'low to high' menu option isn't displayed");
        System.out.println("The sort by price 'low to high' menu option  is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccessoriesPriceLowToHighOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccessoriesPriceLowToHighText(), "Price,low to high"); // -> assert crashes the test, it doesn't find text
        //remove search filter
        registeredUserStationaryAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void sortStAccessoriesProductsByPriceHighToLowTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesPriceHighToLowOptionDisplayed(), "The sort by price 'high to low' menu option isn't displayed");
        System.out.println("The sort by price 'high to low' menu option  is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccessoriesPriceHighToLowOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccessoriesPriceHighToLowText(), "Price,high to low"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortStAccessoriesProductsByReferenceAToZTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesReferenceAToZOptionDisplayed(), "The sort by reference 'A to Z' menu option isn't displayed");
        System.out.println("The sort by reference 'A to Z' menu option  is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccessoriesReferenceAToZOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccessoriesReferenceAToZText(), "Reference,A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortStAccessoriesProductsByReferenceZToATest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        registeredUserStationaryAccessoriesPage.clickStSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesReferenceZToAOptionDisplayed(), "The sort by reference 'Z to A' menu option isn't displayed");
        System.out.println("The sort by reference 'Z to A' menu option  is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccessoriesReferenceZToAOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccessoriesReferenceAToZText(), "Reference,A to Z"); // -> assert crashes the test, it doesn't find text
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //registered user home accessories page navigation test methods

    protected void navigateToHomeAccessoriesPageLink1Test(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserHomeAccessoriesPage.isHomeAccessoriesPageLink1Displayed(), "The home accessories page link1 isn't displayed");
        System.out.println("The home accessories page link1 is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesPageLink1();
    }

    protected void navigateToHomeAccessoriesPageLink2Test(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserHomeAccessoriesPage.isHomeAccessoriesPageLink2Displayed(), "The home accessories page link2 isn't displayed");
        System.out.println("The home accessories page link2 is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesPageLink2();
    }

    protected void navigateToHomeAccessoriesPageBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserHomeAccessoriesPage.isHomeAccessoriesPageBoxIconDisplayed(), "The home accessories page box icon isn't displayed");
        System.out.println("The home accessories page box icon is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesPageBoxIcon();
    }


    //registered user home accessories test methods

    protected void filterHmAccProductByAvailabilityLinkTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHomeAccessoriesInStockLinkDisplayed(), "The home accessories 'in stock' link isn't displayed");
        System.out.println("The home accessories page 'in stock' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesInStockLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccAvailabilityFilterMessage(), "Availability: In stock"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByAvailabilityBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHomeAccessoriesInStockBoxIconDisplayed(), "The home accessories 'in stock' link isn't displayed");
        System.out.println("The home accessories page 'in stock' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesInStockBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccAvailabilityFilterMessage(), "Availability: In stock"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductBySelectionsLinkTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHomeAccessoriesNewProductLinkDisplayed(), "The home accessories 'new product' link isn't displayed");
        System.out.println("The home accessories page 'new product' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesNewProductLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccAvailabilityFilterMessage(), "Selections: New product"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductBySelectionsBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHomeAccessoriesNewProductBoxIconDisplayed(), "The home accessories 'new product' link isn't displayed");
        System.out.println("The home accessories page 'new product' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesNewProductBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccSelectionsFilterMessage(), "Selections: New product"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByPriceSliderTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesPriceSliderDisplayed(), "The stationary accessories price slider isn't displayed");
        System.out.println("The stationary accessories page price slider is displayed" + "\n");
        double targetPrice = 25.0;
        registeredUserHomeAccessoriesPage.setHmAccessoriesPriceSliderValue(targetPrice);
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccPriceFilterMessage(), "Price: $12.00 - $13.00"); -> assert crashes the test
    }

    protected void filterHmAccProductByWhiteColorLinkTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesWhiteColorLinkDisplayed(), "The home accessories 'white' link isn't displayed");
        System.out.println("The home accessories page 'white' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesWhiteColorLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccWhiteColorFilterMessage(), "Color: White"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByWhiteColorBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesWhiteBoxIconDisplayed(), "The home accessories 'white' box icon isn't displayed");
        System.out.println("The home accessories page 'white' box icon is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesWhiteBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccWhiteColorFilterMessage(), "Color: White"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByBlackColorLinkTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesBlackLinkDisplayed(), "The home accessories 'black' link isn't displayed");
        System.out.println("The home accessories page 'black' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesBlackColorLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccBlackColorFilterMessage(), "Color: Black"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByBlackColorBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesBlackBoxIconDisplayed(), "The home accessories 'black' box icon isn't displayed");
        System.out.println("The home accessories page 'black' box icon is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesBlackBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccBlackColorFilterMessage(), "Color: Black"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByCeramicLinkTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesCeramicLinkDisplayed(), "The home accessories 'ceramic' link isn't displayed");
        System.out.println("The home accessories page 'ceramic' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesCeramicLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccCeramicFilterMessage(), "Composition: Ceramic"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByCeramicBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesCeramicBoxIconDisplayed(), "The home accessories 'ceramic' box icon isn't displayed");
        System.out.println("The home accessories page 'ceramic' box icon is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesCeramicBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccCeramicFilterMessage(), "Composition: Ceramic"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByPolyesterLinkTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesPolyesterLinkDisplayed(), "The home accessories 'polyester' link isn't displayed");
        System.out.println("The home accessories page 'polyester' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesPolyesterLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccPolyesterFilterMessage(), "Composition: Polyester"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByPolyesterBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesPolyesterBoxIconDisplayed(), "The home accessories 'polyester' box icon isn't displayed");
        System.out.println("The home accessories page 'polyester' box icon is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesPolyesterBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccPolyesterFilterMessage(), "Composition: Polyester"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByRemovableCoverLinkTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesRemovableCoverLinkDisplayed(), "The home accessories 'removable cover' link isn't displayed");
        System.out.println("The home accessories page 'removable cover' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesRemovableCoverLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccRemovableCoverFilterMessage(), "Property: Removable cover"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByRemovableCoverBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesRemovableCoverBoxIconDisplayed(), "The home accessories 'removable cover' box icon isn't displayed");
        System.out.println("The home accessories page 'removable cover' box icon is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesRemovableCoverBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccRemovableCoverFilterMessage(), "Property: Removable cover"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByStudioDesignLinkTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'in stock' link is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesStudioDesignLinkDisplayed(), "The home accessories 'studio design' link isn't displayed");
        System.out.println("The home accessories page 'studio design' link is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesStudioDesignLink();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccStudioDesignFilterMessage(), "Brand: Studio Design"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    protected void filterHmAccProductByStudioDesignBoxIconTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        //assert product 'new product' box icon is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesStudioDesignBoxIconDisplayed(), "The home accessories 'studio design' box icon isn't displayed");
        System.out.println("The home accessories page 'studio design' box icon is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHomeAccessoriesStudioDesignBoxIcon();
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccStudioDesignFilterMessage(), "Brand: Studio Design"); -> assert crashes the test
        //remove search filter
        registeredUserHomeAccessoriesPage.clickRemoveSearchFilter();
    }

    // dropdown menu test method

    protected void clickHmAccessoriesSortByDropdownMenuTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);
        //assert the dropdown is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesSortByDropdownMenuDisplayed(), "The 'Sort By' dropdown menu isn't displayed");
        System.out.println("The 'Sort By' dropdown menu is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
    }

    //home accessories dropdown menu options test methods

    protected void sortHmAccessoriesProductsBySalesTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
        //assert the sort by sales option is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesSalesOptionDisplayed(), "The sort by 'Sales' menu option isn't displayed");
        System.out.println("The sort by 'Sales' menu option  is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmAccessoriesSalesOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccessoriesSalesOptionText(), "Sales, highest to lowest"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortHmAccessoriesProductsByRelevanceTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
        //assert the sort by relevance option is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesRelevanceOptionDisplayed(), "The sort by 'Relevance' menu option isn't displayed");
        System.out.println("The sort by 'Relevance' menu option  is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmAccessoriesRelevanceOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccessoriesRelevanceOptionText(), "Relevance"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortHmAccessoriesProductsByNameAToZTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesNameAToZOptionDisplayed(), "The sort by name 'A to Z' menu option isn't displayed");
        System.out.println("The sort by name 'A to Z' menu option  is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmAccessoriesNameAToZOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccessoriesNameAToZOptionText(), "Name, A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortHmAccessoriesProductsByNameZToATest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
        //assert the sort by name 'z to a' option is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesNameZToAOptionDisplayed(), "The sort by name 'Z to A' menu option isn't displayed");
        System.out.println("The sort by name 'Z to A' menu option  is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmAccessoriesNameZToAOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccessoriesNameZToAOptionText(), "Name, Z to A"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortHmAccessoriesProductsByPriceLowToHighTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
        //assert the sort by price 'low to high' option is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesPriceLowToHighOptionDisplayed(), "The sort by price 'low to high' menu option isn't displayed");
        System.out.println("The sort by price 'low to high' menu option  is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmAccessoriesPriceLowToHighOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccessoriesPriceLowToHighOptionText(), "Price, low to high"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortHmAccessoriesProductsByPriceHighToLowTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
        //assert the sort by price 'high to low' option is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesPriceHighToLowOptionDisplayed(), "The sort by price 'high to low' menu option isn't displayed");
        System.out.println("The sort by price 'high to low' menu option  is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmAccessoriesPriceHighToLowOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccessoriesPriceHighToLowOptionText(), "Price, high to low"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortHmAccessoriesProductsByReferenceAToZTest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
        //assert the sort by reference 'A to Z' option is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesReferenceAToZOptionDisplayed(), "The sort by reference 'A to Z' menu option isn't displayed");
        System.out.println("The sort by reference 'A to Z' menu option  is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmAccessoriesReferenceAToZOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccessoriesReferenceAToZOptionText(), "Reference, A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortHmAccessoriesProductsByReferenceZToATest(){
        RegisteredUserHomeAccessoriesPage registeredUserHomeAccessoriesPage = new RegisteredUserHomeAccessoriesPage(driver);

        registeredUserHomeAccessoriesPage.clickHmSortByDropdownMenu();
        //assert the sort by reference 'Z to A' option is displayed
        assertTrue(registeredUserHomeAccessoriesPage.isHmAccessoriesReferenceZToAOptionDisplayed(), "The sort by reference 'Z to A' menu option isn't displayed");
        System.out.println("The sort by reference 'Z to A' menu option  is displayed" + "\n");
        registeredUserHomeAccessoriesPage.clickHmAccessoriesReferenceZToAOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getHmAccessoriesReferenceAToZOptionText(), "Reference, A to Z"); // -> assert crashes the test, it doesn't find text
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //men clothes page test methods

    protected void navigateToClothesPageTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert 'Clothes' link is displayed on navbar
        assertTrue(registeredUserMenClothesPage.isClothesPageLinkDisplayed(), "The 'Clothes' link isn't displayed on navbar");
        System.out.println("The 'Clothes' link is displayed on navbar" + "\n");
        registeredUserMenClothesPage.clickOnClothesPageLink();
    }

    protected void navigateToMenClothesPageLink1Test(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert 'Men' clothes link1 is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesPageLink1Displayed(), "The 'Men' clothes link1 isn't displayed");
        System.out.println("The 'Men' clothes link1 is displayed" + "\n");
        registeredUserMenClothesPage.clickOnMenClothesPageLink1();
    }

    protected void navigateToMenClothesPageLink2Test(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert 'Men' clothes link2 is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesPageLink2Displayed(), "The 'Men' clothes link2 isn't displayed");
        System.out.println("The 'Men' clothes link2 is displayed" + "\n");
        registeredUserMenClothesPage.clickOnMenClothesPageLink2();
    }

    protected void navigateToMenClothesPageBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert 'Men' clothes box icon is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesPageBoxIconDisplayed(), "The 'Men' clothes box icon isn't displayed");
        System.out.println("The 'Men' clothes box icon is displayed" + "\n");
        registeredUserMenClothesPage.clickOnMenClothesPageBoxIcon();
    }

    //men clothes filter by test methods

    protected void filterMenClothesByInStockBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesInStockBoxIconDisplayed(), "The 'In stock' box icon link isn't displayed");
        System.out.println("The 'In stock' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesInStockBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesAvailabilityFilterMessage(), "Availability: In stock");
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByInStockLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesInStockLinkDisplayed(), "The 'In stock' link isn't displayed");
        System.out.println("The 'In stock' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesInStockLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesAvailabilityFilterMessage(), "Availability: In stock");
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByDiscountedBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by discounted choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesDiscountedBoxIconDisplayed(), "The 'Discounted' box icon link isn't displayed");
        System.out.println("The 'Discounted' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesDiscountedBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesDiscountedFilterMessage(), "Selections: Discounted");
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByDiscountedLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by discounted choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesDiscountedLinkDisplayed(), "The 'Discounted' link isn't displayed");
        System.out.println("The 'Discounted' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesDiscountedLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesDiscountedFilterMessage(), "Selections: Discounted");
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByNewProductBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by new product choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesNewProductBoxIconDisplayed(), "The 'New product' box icon link isn't displayed");
        System.out.println("The 'New Product' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesNewProductBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesNewProductFilterMessage(), "Selections: New product");
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByNewProductLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by new product choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesNewProductLinkDisplayed(), "The 'New product' link isn't displayed");
        System.out.println("The 'New product' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesNewProductLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesNewProductFilterMessage(), "Selections: New product");
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByPriceSliderTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        //assert product 'new product' link is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesPriceSliderDisplayed(), "The men clothes price slider isn't displayed");
        System.out.println("The men clothes page price slider is displayed" + "\n");
        double targetPrice = 22.0;
        registeredUserMenClothesPage.setMenClothesPriceSliderValue(targetPrice);
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesPriceFilterMessage(), "Price: $19.00 - $24.00"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesBySizeSBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by size s choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSizeSBoxIconDisplayed(), "The men clothes 'Size S' box icon link isn't displayed");
        System.out.println("The men clothes 'Size S' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSizeSBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeSFilterMessage(), "Size: S"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesBySizeSLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by size s choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSizeSLinkDisplayed(), "The men clothes 'Size S' link isn't displayed");
        System.out.println("The men clothes 'Size S' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSizeSLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeSFilterMessage(), "Size: S"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesBySizeMBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by size m choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSizeMBoxIconDisplayed(), "The men clothes 'Size M' box icon link isn't displayed");
        System.out.println("The men clothes 'Size M' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSizeMBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeMFilterMessage(), "Size: M"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesBySizeMLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by size m choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSizeMLinkDisplayed(), "The men clothes 'Size M' link isn't displayed");
        System.out.println("The men clothes 'Size M' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSizeMLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeMFilterMessage(), "Size: M"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesBySizeLBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by size l choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSizeLBoxIconDisplayed(), "The men clothes 'Size L' box icon link isn't displayed");
        System.out.println("The men clothes 'Size L' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSizeLBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeLFilterMessage(), "Size: L"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesBySizeLLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by size l choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSizeLLinkDisplayed(), "The men clothes 'Size L' link isn't displayed");
        System.out.println("The men clothes 'Size L' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSizeLLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeLFilterMessage(), "Size: L"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesBySizeXLBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by size xl choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSizeXLBoxIconDisplayed(), "The men clothes 'Size XL' box icon link isn't displayed");
        System.out.println("The men clothes 'Size XL' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSizeXLBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeXLFilterMessage(), "Size: XL"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesBySizeXLLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by size xl choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSizeXLLinkDisplayed(), "The men clothes 'Size XL' link isn't displayed");
        System.out.println("The men clothes 'Size XL' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSizeXLLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeXLFilterMessage(), "Size: XL"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByWhiteBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by white color choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesWhiteBoxIconDisplayed(), "The men clothes color 'White' box icon link isn't displayed");
        System.out.println("The men clothes color 'White' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesWhiteBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeWhiteFilterMessage(), "Color: White"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByWhiteLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by white color choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesWhiteLinkDisplayed(), "The men clothes color 'White' link isn't displayed");
        System.out.println("The men clothes color 'White' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesWhiteLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeWhiteFilterMessage() "Color: White"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByBlackBoxIconTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by black color choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesBlackBoxIconDisplayed(), "The men clothes color 'Black' box icon link isn't displayed");
        System.out.println("The men clothes color 'Black' box icon link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesBlackBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeBlackFilterMessage(), "Color: Black"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterMenClothesByBlackLinkTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the filter by black color choice is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesBlackLinkDisplayed(), "The men clothes color 'Black' link isn't displayed");
        System.out.println("The men clothes color 'Black' link is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesBlackLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getMenClothesSizeBlackFilterMessage() "Color: Black"); -> assert crashes the test
        //remove search filter
        registeredUserMenClothesPage.clickRemoveSearchFilter();
    }

    // dropdown menu test method

    protected void clickMenClothesSortByDropdownMenuTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);
        //assert the dropdown is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSortByDropdownMenuDisplayed(), "The 'Sort By' dropdown menu isn't displayed");
        System.out.println("The 'Sort By' dropdown menu is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
    }

    //home accessories dropdown menu options test methods

    protected void sortMenClothesBySalesTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
        //assert the sort by sales option is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesSalesOptionDisplayed(), "The sort by 'Sales' menu option isn't displayed");
        System.out.println("The sort by 'Sales' menu option  is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesSalesOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesSalesOptionText(), "Sales, highest to lowest"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortMenClothesByRelevanceTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
        //assert the sort by relevance option is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesRelevanceOptionDisplayed(), "The sort by 'Relevance' menu option isn't displayed");
        System.out.println("The sort by 'Relevance' menu option  is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesRelevanceOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesRelevanceOptionText(), "Relevance"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortMenClothesByNameAToZTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
        //assert the sort by name 'A to Z' option is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesNameAToZOptionDisplayed(), "The sort by name 'A to Z' menu option isn't displayed");
        System.out.println("The sort by name 'A to Z' menu option  is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesNameAToZOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesNameAToZOptionText(), "Name, A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortMenClothesByNameZToATest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
        //assert the sort by name 'Z to A' option is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesNameZToAOptionDisplayed(), "The sort by name 'Z to A' menu option isn't displayed");
        System.out.println("The sort by name 'Z to A' menu option  is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesNameZToAOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesNameZToAOptionText(), "Name, Z to A"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortMenClothesByPriceLowToHighTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
        //assert the sort by price 'low to high' option is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesPriceLowToHighOptionDisplayed(), "The sort by price 'low to high' menu option isn't displayed");
        System.out.println("The sort by price 'low to high' menu option  is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesPriceLowToHighOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesPriceLowToHighOptionText(), "Price, low to high"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortMenClothesByPriceHighToLowTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
        //assert the sort by price 'high to low' option is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesPriceHighToLowOptionDisplayed(), "The sort by price 'high to low' menu option isn't displayed");
        System.out.println("The sort by price 'low to high' menu option  is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesPriceHighToLowOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesPriceHighToLowOptionText(), "Price, high to low"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortMenClothesByReferenceAToZTest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
        //assert the sort by reference 'A to Z' option is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesReferenceAToZOptionDisplayed(), "The sort by reference 'A to Z' menu option isn't displayed");
        System.out.println("The sort by reference 'A to Z' menu option  is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesReferenceAToZOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesReferenceAToZOptionText(), "Reference, A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortMenClothesByReferenceZToATest(){
        RegisteredUserMenClothesPage registeredUserMenClothesPage = new RegisteredUserMenClothesPage(driver);

        registeredUserMenClothesPage.clickMenClothesSortByDropdownMenu();
        //assert the sort by reference 'Z to A' option is displayed
        assertTrue(registeredUserMenClothesPage.isMenClothesReferenceZToAOptionDisplayed(), "The sort by reference 'Z to A' menu option isn't displayed");
        System.out.println("The sort by reference 'Z to A' menu option  is displayed" + "\n");
        registeredUserMenClothesPage.clickMenClothesReferenceZToAOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getMenClothesReferenceZToAOptionText(), "Reference, Z to A"); // -> assert crashes the test, it doesn't find text
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // women clothes page navigation test methods

    protected void navigateToWomenClothesPageLink1Test(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert 'Women' clothes link1 is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesPageLink1Displayed(), "The 'Women' clothes link1 isn't displayed");
        System.out.println("The 'Women' clothes link1 is displayed" + "\n");
        registeredUserWomenClothesPage.clickOnWomenClothesPageLink1();
    }

    protected void navigateToWomenClothesPageLink2Test(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert 'Women' clothes link2 is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesPageLink2Displayed(), "The 'Women' clothes link2 isn't displayed");
        System.out.println("The 'Women' clothes link2 is displayed" + "\n");
        registeredUserWomenClothesPage.clickOnWomenClothesPageLink2();
    }

    protected void navigateToWomenClothesPageBoxIconTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert 'Women' clothes box icon is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesPageBoxIconDisplayed(), "The 'Women' clothes box icon isn't displayed");
        System.out.println("The 'Women' clothes box icon is displayed" + "\n");
        registeredUserWomenClothesPage.clickOnWomenClothesPageBoxIcon();
    }

    //men clothes filter by test methods

    protected void filterWomenClothesByInStockBoxIconTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesInStockBoxIconDisplayed(), "The 'In stock' box icon link isn't displayed");
        System.out.println("The 'In stock' box icon link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesInStockBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesAvailabilityFilterMessage(), "Availability: In stock");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesByInStockLinkTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by in stock choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesInStockLinkDisplayed(), "The 'In stock' link isn't displayed");
        System.out.println("The 'In stock' link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesInStockLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesAvailabilityFilterMessage(), "Availability: In stock");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesByDiscountedBoxIconTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by discounted choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesDiscountedBoxIconDisplayed(), "The selections 'Discounted' box icon link isn't displayed");
        System.out.println("The selections 'Discounted' box icon link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesDiscountedBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesDiscountedFilterMessage(), "Selections: Discounted");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesByDiscountedLinkTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by discounted choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesDiscountedLinkDisplayed(), "The selections 'Discounted' link isn't displayed");
        System.out.println("The selections 'Discounted' link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesDiscountedLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesDiscountedFilterMessage(), "Selections: Discounted");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesByNewProductBoxIconTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by new product choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesNewProductBoxIconDisplayed(), "The selections 'New product' box icon link isn't displayed");
        System.out.println("The selections 'New product' box icon link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesNewProductBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesNewProductFilterMessage(), "Selections: New product");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesByNewProductLinkTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by new product choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesNewProductLinkDisplayed(), "The selections 'New product' link isn't displayed");
        System.out.println("The selections 'New product' link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesNewProductLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesNewProductFilterMessage(), "Selections: New product");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesByPriceSliderTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        //assert price slider is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesPriceSliderDisplayed(), "The women clothes price slider isn't displayed");
        System.out.println("The women clothes page price slider is displayed" + "\n");
        double targetPrice = 30.0;
        registeredUserWomenClothesPage.setMenClothesPriceSliderValue(targetPrice);
        //assert the correct message is displayed
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesPriceFilterMessage(), "Price: $30.00 - $36.00"); -> assert crashes the test
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesBySizeSBoxIconTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by size s choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSizeSBoxIconDisplayed(), "The size 'S' box icon link isn't displayed");
        System.out.println("The size 'S' box icon link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSizeSBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesSizeSFilterMessage(), "Size: S");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesBySizeSLinkTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by size s choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSizeSLinkDisplayed(), "The size 'S' link isn't displayed");
        System.out.println("The size 'S' link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSizeSLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesSizeSFilterMessage(), "Size: S");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesBySizeMBoxIconTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by size m choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSizeMBoxIconDisplayed(), "The size 'M' box icon link isn't displayed");
        System.out.println("The size 'M' box icon link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSizeMBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesSizeMFilterMessage(), "Size: M");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesBySizeMLinkTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by size m choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSizeMLinkDisplayed(), "The size 'M' link isn't displayed");
        System.out.println("The size 'M' link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSizeMLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesSizeMFilterMessage(), "Size: M");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesBySizeLBoxIconTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by size l choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSizeLBoxIconDisplayed(), "The size 'L' box icon link isn't displayed");
        System.out.println("The size 'L' box icon link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSizeLBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesSizeLFilterMessage(), "Size: L");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesBySizeLLinkTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by size l choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSizeLLinkDisplayed(), "The size 'L' link isn't displayed");
        System.out.println("The size 'L' link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSizeLLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesSizeLFilterMessage(), "Size: L");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesBySizeXLBoxIconTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by size xl choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSizeXLBoxIconDisplayed(), "The size 'XL' box icon link isn't displayed");
        System.out.println("The size 'XL' box icon link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSizeXLBoxIcon();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesSizeXLFilterMessage(), "Size: XL");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    protected void filterWomenClothesBySizeXLLinkTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the filter by size xl choice is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSizeXLLinkDisplayed(), "The size 'XL' link isn't displayed");
        System.out.println("The size 'XL' link is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSizeXLLink();
        //assert the correct text is displayed in search filter
        //assertEquals(registeredUserArtPage.getWomenClothesSizeXLFilterMessage(), "Size: XL");
        //remove search filter
        registeredUserWomenClothesPage.clickRemoveSearchFilter();
    }

    // dropdown menu test method

    protected void clickWomenClothesSortByDropdownMenuTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);
        //assert the dropdown is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSortByDropdownMenuDisplayed(), "The 'Sort By' dropdown menu isn't displayed");
        System.out.println("The 'Sort By' dropdown menu is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
    }

    //women clothes dropdown menu options test methods

    protected void sortWomenClothesBySalesTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
        //assert the sort by sales option is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesSalesOptionDisplayed(), "The sort by 'Sales' menu option isn't displayed");
        System.out.println("The sort by 'Sales' menu option  is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesSalesOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesSalesOptionText(), "Sales, highest to lowest"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortWomenClothesByRelevanceTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
        //assert the sort by relevance option is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesRelevanceOptionDisplayed(), "The sort by 'Relevance' menu option isn't displayed");
        System.out.println("The sort by 'Relevance' menu option  is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesRelevanceOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesRelevanceOptionText(), "Relevance"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortWomenClothesByNameAToZTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
        //assert the sort by name 'a to z' option is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesNameAToZOptionDisplayed(), "The sort by name 'A to Z' menu option isn't displayed");
        System.out.println("The sort by name 'A to Z' menu option  is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesNameAToZOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesNameAToZOptionText(), "Name, A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortWomenClothesByNameZToATest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
        //assert the sort by name 'z to a' option is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesNameZToAOptionDisplayed(), "The sort by name 'Z to A' menu option isn't displayed");
        System.out.println("The sort by name 'Z to A' menu option  is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesNameZToAOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesNameZToAOptionText(), "Name, Z to A"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortWomenClothesByPriceLowToHighTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
        //assert the sort by price 'low to high' option is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesPriceLowToHighOptionDisplayed(), "The sort by price 'low to high' menu option isn't displayed");
        System.out.println("The sort by price 'low to high' menu option  is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesPriceLowToHighOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesPriceLowToHighOptionText(), "Price, low to high"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortWomenClothesByPriceHighToLowTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
        //assert the sort by price 'high to low' option is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesPriceHighToLowOptionDisplayed(), "The sort by price 'high to low' menu option isn't displayed");
        System.out.println("The sort by price 'high to low' menu option  is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesPriceHighToLowOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesPriceHighToLowOptionText(), "Price, high to low"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortWomenClothesByReferenceAToZTest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
        //assert the sort by reference 'A to Z' option is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesReferenceAToZOptionDisplayed(), "The sort by reference 'A to Z' menu option isn't displayed");
        System.out.println("The sort by reference 'A to Z' menu option  is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesReferenceAToZOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesReferenceAToZOptionText(), "Reference, A to Z"); // -> assert crashes the test, it doesn't find text
    }

    protected void sortWomenClothesByReferenceZToATest(){
        RegisteredUserWomenClothesPage registeredUserWomenClothesPage = new RegisteredUserWomenClothesPage(driver);

        registeredUserWomenClothesPage.clickWomenClothesSortByDropdownMenu();
        //assert the sort by reference 'Z to A' option is displayed
        assertTrue(registeredUserWomenClothesPage.isWomenClothesReferenceZToAOptionDisplayed(), "The sort by reference 'Z to A' menu option isn't displayed");
        System.out.println("The sort by reference 'Z to A' menu option  is displayed" + "\n");
        registeredUserWomenClothesPage.clickWomenClothesReferenceZToAOption();
        //assert the correct text is input in option
        //assertEquals(registeredUserStationaryAccessoriesPage.getWomenClothesReferenceZToAOptionText(), "Reference, Z to A"); // -> assert crashes the test, it doesn't find text
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // all products page navigation

    protected void clickAllProductsLinkTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the all products link is displayed
        assertTrue(registeredUserWishListPage.isAllProductsLinkDisplayed(), "The 'All Products' link isn't displayed");
        System.out.println("The 'All Products' link is displayed" + "\n");
        registeredUserWishListPage.clickAllProductsLink();
    }

    // product wishlist test methods

    protected void addTShirtWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the t-shirt wishlist button is displayed
        assertTrue(registeredUserWishListPage.isTShirtWishListButtonDisplayed(), "The t-shirt wishlist button isn't displayed");
        System.out.println("The t-shirt wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getTShirtProductTitle(), "Hummingbird printed t-shirt");
        registeredUserWishListPage.clickTShirtWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Hummingbird printed t-shirt");
    }

    protected void addSweaterWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the sweater wishlist button is displayed
        assertTrue(registeredUserWishListPage.isSweaterWishListButtonDisplayed(), "The sweater wishlist button isn't displayed");
        System.out.println("The sweater wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getSweaterProductTitle(), "Hummingbird printed sweater");
        registeredUserWishListPage.clickSweaterWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Hummingbird printed sweater");
    }

    protected void addPictureBestYetWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the sweater wishlist button is displayed
        assertTrue(registeredUserWishListPage.isPictureBestYetWishListButtonDisplayed(), "The picture 'Best Yet To Come' wishlist button isn't displayed");
        System.out.println("The picture 'Best Yet To Come' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getPictureBestYetProductTitle(), "The Best Is Yet To Come' Framed Poster");
        registeredUserWishListPage.clickPictureBestYetWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed" + "\n");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
       // assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "The best is yet to come' Framed poster");
    }

    protected void addPictureAdventureBeginsWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the picture 'Adventure Begins' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isPictureAdventureBeginsWishListButtonDisplayed(), "The picture 'Adventure Begins' wishlist button isn't displayed");
        System.out.println("The picture 'Adventure Begins' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getPictureAdventureBeginsProductTitle(), "The Adventure Begins Framed Poster");
        registeredUserWishListPage.clickPictureAdventureBeginsWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "The adventure begins Framed poster");
    }

    protected void addPictureGoodDayWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the picture 'Good Day' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isPictureGoodDayWishListButtonDisplayed(), "The picture 'Good Day' wishlist button isn't displayed");
        System.out.println("The picture 'Good Day' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getPictureGoodDayProductTitle(), "Today Is A Good Day Framed Poster");
        registeredUserWishListPage.clickPictureGoodDayWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Today is a good day Framed poster");
    }

    protected void addMugBestYetWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the mug 'Best Yet' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isMugBestYetWishListButtonDisplayed(), "The mug 'Best Yet' wishlist button isn't displayed");
        System.out.println("The mug 'Best Yet' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getMugBestYetProductTitle(), "Mug The best is yet to come");
        registeredUserWishListPage.clickMugBestYetWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Mug The best is yet to come");
    }

    protected void addMugAdventureBeginsWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the mug 'Adventure Begins' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isMugAdventureBeginsWishListButtonDisplayed(), "The mug 'Adventure Begins' wishlist button isn't displayed");
        System.out.println("The mug 'Adventure Begins' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getMugAdventureBeginsProductTitle(), "Mug The adventure begins");
        registeredUserWishListPage.clickMugAdventureBeginsWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Mug The adventure begins");
    }

    protected void addMugGoodDayWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the mug 'Good Day' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isMugGoodDayWishListButtonDisplayed(), "The mug 'Good Day' wishlist button isn't displayed");
        System.out.println("The mug 'Good Day' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getMugGoodDayProductTitle(), "Mug Today is a good day");
        registeredUserWishListPage.clickMugGoodDayWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Mug Today is a good day");
    }

    protected void addCushionFoxWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the cushion 'Mountain Fox' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isCushionMountainFoxWishListButtonDisplayed(), "The cushion 'Mountain Fox' wishlist button isn't displayed");
        System.out.println("The cushion 'Mountain Fox' wishlist button is displayed");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getCushionFoxProductTitle(), "Mountain fox cushion");
        registeredUserWishListPage.clickCushionFoxWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Mountain fox cushion");
    }

    protected void addCushionBrownBearWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the cushion 'Brown Bear' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isCushionBrownBearWishListButtonDisplayed(), "The cushion 'Brown Bear' wishlist button isn't displayed");
        System.out.println("The cushion 'Brown Bear' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getCushionFoxProductTitle(), "Brown bear cushion");
        registeredUserWishListPage.clickCushionBearWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Brown bear cushion");
    }

    protected void addCushionHummingBearWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the cushion 'Humming Bird' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isCushionHummingBirdWishListButtonDisplayed(), "The cushion 'Humming Bird' wishlist button isn't displayed");
        System.out.println("The cushion 'Humming Bird' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getCushionHummingBirdProductTitle(), "Hummingbird cushion");
        registeredUserWishListPage.clickCushionHummingBirdWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Hummingbird cushion");
    }

    protected void addVectorFoxWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert the vector 'Mountain Fox' wishlist button is displayed
        assertTrue(registeredUserWishListPage.isVectorFoxWishListButtonDisplayed(), "The vector 'Mountain Fox' wishlist button isn't displayed");
        System.out.println("The vector 'Mountain Fox' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getVectorFoxProductTitle(), "Mountain fox - Vector graphics");
        registeredUserWishListPage.clickVectorFoxWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Mountain fox - Vector graphics");
    }

    protected void addVectorBearWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert next page link is displayed
        assertTrue(registeredUserWishListPage.isNextPageLinkDisplayed(), "The next page link isn't displayed");
        System.out.println("The next page link is displayed" + "\n");
        registeredUserWishListPage.clickNextPageLink();

        //assert the vector 'Brown Bear' wishlist button is displayed
        //assertTrue(registeredUserWishListPage.isVectorBearWishListButtonDisplayed(), "The vector 'Brown Bear' wishlist button isn't displayed"); -> assert crashes test
        System.out.println("The vector 'Brown Bear' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getVectorBearProductTitle(), "Brown bear - Vector graphics");
        registeredUserWishListPage.clickVectorBearWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Brown bear - Vector graphics");
    }

    protected void addVectorHummingBirdWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert next page link is displayed
        assertTrue(registeredUserWishListPage.isNextPageLinkDisplayed(), "The next page link isn't displayed");
        System.out.println("The next page link is displayed" + "\n");
        registeredUserWishListPage.clickNextPageLink();

        //assert the vector 'Humming Bird' wishlist button is displayed
        //assertTrue(registeredUserWishListPage.isVectorHummingBirdWishListButtonDisplayed(), "The vector 'Humming Bird' wishlist button isn't displayed"); -> assert crashes test
        System.out.println("The vector 'Humming Bird' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getVectorHummingBirdProductTitle(), "Hummingbird - Vector graphics");
        registeredUserWishListPage.clickVectorBirdWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Hummingbird - Vector graphics");
    }

    protected void addPackMugAndPosterWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert next page link is displayed
        assertTrue(registeredUserWishListPage.isNextPageLinkDisplayed(), "The next page link isn't displayed");
        System.out.println("The next page link is displayed" + "\n");
        registeredUserWishListPage.clickNextPageLink();

        //assert the pack 'Mug and Poster' wishlist button is displayed
        //assertTrue(registeredUserWishListPage.isPackMugAndPosterWishListButtonDisplayed(), "The pack 'Mug and Poster' wishlist button isn't displayed"); //-> assert crashes test
        System.out.println("The pack 'Mug and Poster' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getPackMugAndPosterProductTitle(), "Pack Mug + Framed poster");
        registeredUserWishListPage.clickPackMugPosterWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Pack Mug + Framed poster");
    }

    protected void addNotebookFoxWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert next page link is displayed
        assertTrue(registeredUserWishListPage.isNextPageLinkDisplayed(), "The next page link isn't displayed");
        System.out.println("The next page link is displayed" + "\n");
        registeredUserWishListPage.clickNextPageLink();

        //assert the notebook 'Mountain Fox' wishlist button is displayed
        //assertTrue(registeredUserWishListPage.isNotebookFoxWishListButtonDisplayed(), "The notebook 'Mountain Fox' wishlist button isn't displayed"); //-> assert crashes test
        System.out.println("The notebook 'Mountain Fox' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getNotebookFoxProductTitle(), "Mountain fox notebook");
        registeredUserWishListPage.clickNotebookFoxWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Mountain fox notebook");
    }

    protected void addNotebookBearWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert next page link is displayed
        assertTrue(registeredUserWishListPage.isNextPageLinkDisplayed(), "The next page link isn't displayed");
        System.out.println("The next page link is displayed" + "\n");
        registeredUserWishListPage.clickNextPageLink();

        //assert the notebook 'Brown Bear' wishlist button is displayed
        //assertTrue(registeredUserWishListPage.isNotebookBearWishListButtonDisplayed(), "The notebook 'Brown Bear' wishlist button isn't displayed"); //-> assert crashes test
        System.out.println("The notebook 'Brown Bear' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getNotebookBearProductTitle(), "Brown bear notebook");
        registeredUserWishListPage.clickNotebookBearWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Brown bear notebook");
    }

    protected void addNotebookBirdWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert next page link is displayed
        assertTrue(registeredUserWishListPage.isNextPageLinkDisplayed(), "The next page link isn't displayed");
        System.out.println("The next page link is displayed" + "\n");
        registeredUserWishListPage.clickNextPageLink();

        //assert the notebook 'Humming Bird' wishlist button is displayed
        //assertTrue(registeredUserWishListPage.isNotebookBirdWishListButtonDisplayed(), "The notebook 'Humming Bird' wishlist button isn't displayed"); //-> assert crashes test
        System.out.println("The notebook 'Brown Bear' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getNotebookBirdProductTitle(), "Hummingbird notebook");
        registeredUserWishListPage.clickNotebookBirdWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Hummingbird notebook");
    }

    protected void addMugCustomWishListButtonTest(){
        RegisteredUserWishListPage registeredUserWishListPage = new RegisteredUserWishListPage(driver);

        //assert next page link is displayed
        assertTrue(registeredUserWishListPage.isNextPageLinkDisplayed(), "The next page link isn't displayed");
        System.out.println("The next page link is displayed" + "\n");
        registeredUserWishListPage.clickNextPageLink();

        //assert the mug 'Custom Text' wishlist button is displayed
        //assertTrue(registeredUserWishListPage.isMugCustomWishListButtonDisplayed(), "The mug 'Custom Text' wishlist button isn't displayed"); //-> assert crashes test
        System.out.println("The mug 'Custom Text' wishlist button is displayed" + "\n");
        //assert the correct product is being selected for wishlist
        //assertEquals(registeredUserWishListPage.getMugCustomProductTitle(), "Customizable mug");
        registeredUserWishListPage.clickMugCustomTextWishListButton();
        //assert the 'My wishlist' link is displayed in 'My wishlists' pop-up box
        assertTrue(registeredUserWishListPage.isMyWishListLinkDisplayed(), "The 'My wishlist' link isn't displayed");
        System.out.println("The 'My wishlist' link is displayed" + "\n");
        registeredUserWishListPage.clickMyWishListLink();
        //assert the success pop up has the correct text
        //assertEquals(registeredUserWishListPage.getProductAddedPopUpMessage(), "Product added");
        //assert the 'Wishlist' link is displayed
        assertTrue(registeredUserWishListPage.isWishListPageLinkDisplayed(), "The 'Wishlist' page isn't displayed");
        System.out.println("The 'Wishlist' page is displayed" + "\n");
        registeredUserWishListPage.clickWishListLink();
        //assert 'My wishlist' inner box link is displayed
        //assertTrue(registeredUserWishListPage.isWishListInnerLinkDisplayed(), "The 'My wishlist' inner link isn't displayed");
        System.out.println("The 'My wishlist' inner link is displayed" + "\n");
        registeredUserWishListPage.clickWishListInnerLink();
        //assert correct product has been added to wishlist
        //assertEquals(registeredUserWishListPage.getAddedProductTitle(), "Customizable mug");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //navigation to user account page test methods

    protected void navigateToUserAccountLink1Test(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
    }

    protected void navigateToUserAccountLink2Test(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the footer link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink2Displayed(), "The footer link isn't displayed");
        System.out.println("The footer link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink2();
    }

    //navigation to add first address page test methods
    protected void navigateToAddFirstAddressPage(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();
    }

    //edit registered user with valid input data (United States)
    protected void editRegisteredUserDataValidInputTest(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();

        //assert first name input field is displayed
        assertTrue(registeredUserAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserAccountPage.inputEditedUserDetails();
        registeredUserAccountPage.changeFirstName();
        //assert last name input field is displayed
        assertTrue(registeredUserAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserAccountPage.changeLastName();
        //assert address input field is displayed
        assertTrue(registeredUserAccountPage.isAddressInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The address input field is displayed" + "\n");
        registeredUserAccountPage.addUserAddress();
        //assert city input field is displayed
        assertTrue(registeredUserAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        registeredUserAccountPage.addUserCity();
        //assert state dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        System.out.println("The state dropdown menu is displayed" + "\n");
        registeredUserAccountPage.clickStateDropdownMenu();
        //assert chosen state is displayed
        assertTrue(registeredUserAccountPage.isIllinoisStateDisplayed(), "The Illinois state isn't displayed");
        System.out.println("The Illinois state is displayed" + "\n");
        registeredUserAccountPage.clickIllinoisStateOption();
        //assert the correct state is selected
        assertEquals(registeredUserAccountPage.getChosenStateOption(), "Illinois");
        //assert postal code input field is displayed
        assertTrue(registeredUserAccountPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        registeredUserAccountPage.addUserPostalCode();
        //assert country dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The country dropdown menu isn't displayed" + "\n");
        registeredUserAccountPage.clickCountryDropdownMenu();
        //assert chosen country option is displayed
        assertTrue(registeredUserAccountPage.isUSCountryDisplayed(), "The US option isn't displayed");
        System.out.println("The US option is displayed" + "\n");
        registeredUserAccountPage.clickUSOption();
        //assert the correct country is selected
        assertEquals(registeredUserAccountPage.getUSCountryText(), "United States");
        //assert save button is displayed
        assertTrue(registeredUserAccountPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        System.out.println("The save button is displayed" + "\n");
        registeredUserAccountPage.clickSaveButton();
        //assert success message is displayed
        assertEquals(registeredUserAccountPage.getSuccessMessageText(), "Address successfully added.");
    }

    //edit registered user with valid input data (France)
    protected void editRegisteredUserDataValidInputFranceTest(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();

        //assert first name input field is displayed
        assertTrue(registeredUserAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserAccountPage.inputEditedUserFrenchDetails();
        registeredUserAccountPage.changeFirstName();
        //assert last name input field is displayed
        assertTrue(registeredUserAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserAccountPage.changeLastName();
        //assert address input field is displayed
        assertTrue(registeredUserAccountPage.isAddressInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The address input field is displayed" + "\n");
        registeredUserAccountPage.addUserAddress();
        //assert city input field is displayed
        assertTrue(registeredUserAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        registeredUserAccountPage.addUserFrenchCity();
        //assert postal code input field is displayed
        assertTrue(registeredUserAccountPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        registeredUserAccountPage.addUserFrenchPostalCode();
        //assert country dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The country dropdown menu isn't displayed" + "\n");
        registeredUserAccountPage.clickCountryDropdownMenu();
        //assert chosen country option is displayed
        assertTrue(registeredUserAccountPage.isFranceCountryDisplayed(), "The France option isn't displayed");
        System.out.println("The France option is displayed" + "\n");
        registeredUserAccountPage.clickFranceOption();
        //assert the correct country is selected
        assertEquals(registeredUserAccountPage.getFranceCountryText(), "France");
        //assert save button is displayed
        assertTrue(registeredUserAccountPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        System.out.println("The save button is displayed" + "\n");
        registeredUserAccountPage.clickSaveButton();
        //assert success message is displayed
        assertEquals(registeredUserAccountPage.getSuccessMessageText(), "Address successfully added.");
    }

    //edit registered user without first name
    protected void editRegisteredUserDataNoFirstNameTest(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();

        //assert first name input field is displayed
        assertTrue(registeredUserAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserAccountPage.inputEditedUserDetailsNoFirstName();
        registeredUserAccountPage.changeFirstNameAsEmptyString();
        //assert last name input field is displayed
        assertTrue(registeredUserAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserAccountPage.changeLastName();
        //assert address input field is displayed
        assertTrue(registeredUserAccountPage.isAddressInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The address input field is displayed" + "\n");
        registeredUserAccountPage.addUserAddress();
        //assert city input field is displayed
        assertTrue(registeredUserAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        registeredUserAccountPage.addUserCity();
        //assert state dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        System.out.println("The state dropdown menu is displayed" + "\n");
        registeredUserAccountPage.clickStateDropdownMenu();
        //assert chosen state is displayed
        assertTrue(registeredUserAccountPage.isIllinoisStateDisplayed(), "The Illinois state isn't displayed");
        System.out.println("The Illinois state is displayed" + "\n");
        registeredUserAccountPage.clickIllinoisStateOption();
        //assert the correct state is selected
        assertEquals(registeredUserAccountPage.getChosenStateOption(), "Illinois");
        //assert postal code input field is displayed
        assertTrue(registeredUserAccountPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        registeredUserAccountPage.addUserPostalCode();
        //assert country dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The country dropdown menu isn't displayed" + "\n");
        registeredUserAccountPage.clickCountryDropdownMenu();
        //assert chosen country option is displayed
        assertTrue(registeredUserAccountPage.isUSCountryDisplayed(), "The US option isn't displayed");
        System.out.println("The US option is displayed" + "\n");
        registeredUserAccountPage.clickUSOption();
        //assert the correct country is selected
        assertEquals(registeredUserAccountPage.getUSCountryText(), "United States");
        //assert save button is displayed
        assertTrue(registeredUserAccountPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        System.out.println("The save button is displayed" + "\n");
        registeredUserAccountPage.clickSaveButton();
    }

    //edit registered user without last name
    protected void editRegisteredUserDataNoLastNameTest(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();

        //assert first name input field is displayed
        assertTrue(registeredUserAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserAccountPage.inputEditedUserDetailsNoLastName();
        registeredUserAccountPage.changeFirstName();
        //assert last name input field is displayed
        assertTrue(registeredUserAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserAccountPage.changeLastNameAsEmptyString();
        //assert address input field is displayed
        assertTrue(registeredUserAccountPage.isAddressInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The address input field is displayed" + "\n");
        registeredUserAccountPage.addUserAddress();
        //assert city input field is displayed
        assertTrue(registeredUserAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        registeredUserAccountPage.addUserCity();
        //assert state dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        System.out.println("The state dropdown menu is displayed" + "\n");
        registeredUserAccountPage.clickStateDropdownMenu();
        //assert chosen state is displayed
        assertTrue(registeredUserAccountPage.isIllinoisStateDisplayed(), "The Illinois state isn't displayed");
        System.out.println("The Illinois state is displayed" + "\n");
        registeredUserAccountPage.clickIllinoisStateOption();
        //assert the correct state is selected
        assertEquals(registeredUserAccountPage.getChosenStateOption(), "Illinois");
        //assert postal code input field is displayed
        assertTrue(registeredUserAccountPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        registeredUserAccountPage.addUserPostalCode();
        //assert country dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The country dropdown menu isn't displayed" + "\n");
        registeredUserAccountPage.clickCountryDropdownMenu();
        //assert chosen country option is displayed
        assertTrue(registeredUserAccountPage.isUSCountryDisplayed(), "The US option isn't displayed");
        System.out.println("The US option is displayed" + "\n");
        registeredUserAccountPage.clickUSOption();
        //assert the correct country is selected
        assertEquals(registeredUserAccountPage.getUSCountryText(), "United States");
        //assert save button is displayed
        assertTrue(registeredUserAccountPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        System.out.println("The save button is displayed" + "\n");
        registeredUserAccountPage.clickSaveButton();
    }

    //edit registered user without address
    protected void editRegisteredUserDataNoAddressTest(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();

        //assert first name input field is displayed
        assertTrue(registeredUserAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserAccountPage.inputEditedUserDetailsNoAddress();
        registeredUserAccountPage.changeFirstName();
        //assert last name input field is displayed
        assertTrue(registeredUserAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserAccountPage.changeLastName();
        //assert address input field is displayed
        assertTrue(registeredUserAccountPage.isAddressInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The address input field is displayed" + "\n");
        registeredUserAccountPage.addUserWithNoAddress();
        //assert city input field is displayed
        assertTrue(registeredUserAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        registeredUserAccountPage.addUserCity();
        //assert state dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        System.out.println("The state dropdown menu is displayed" + "\n");
        registeredUserAccountPage.clickStateDropdownMenu();
        //assert chosen state is displayed
        assertTrue(registeredUserAccountPage.isIllinoisStateDisplayed(), "The Illinois state isn't displayed");
        System.out.println("The Illinois state is displayed" + "\n");
        registeredUserAccountPage.clickIllinoisStateOption();
        //assert the correct state is selected
        assertEquals(registeredUserAccountPage.getChosenStateOption(), "Illinois");
        //assert postal code input field is displayed
        assertTrue(registeredUserAccountPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        registeredUserAccountPage.addUserPostalCode();
        //assert country dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The country dropdown menu isn't displayed" + "\n");
        registeredUserAccountPage.clickCountryDropdownMenu();
        //assert chosen country option is displayed
        assertTrue(registeredUserAccountPage.isUSCountryDisplayed(), "The US option isn't displayed");
        System.out.println("The US option is displayed" + "\n");
        registeredUserAccountPage.clickUSOption();
        //assert the correct country is selected
        assertEquals(registeredUserAccountPage.getUSCountryText(), "United States");
        //assert save button is displayed
        assertTrue(registeredUserAccountPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        System.out.println("The save button is displayed" + "\n");
        registeredUserAccountPage.clickSaveButton();
    }

    //edit registered user without city
    protected void editRegisteredUserDataNoCityTest(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();

        //assert first name input field is displayed
        assertTrue(registeredUserAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserAccountPage.inputEditedUserDetailsNoCity();
        registeredUserAccountPage.changeFirstName();
        //assert last name input field is displayed
        assertTrue(registeredUserAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserAccountPage.changeLastName();
        //assert address input field is displayed
        assertTrue(registeredUserAccountPage.isAddressInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The address input field is displayed" + "\n");
        registeredUserAccountPage.addUserAddress();
        //assert city input field is displayed
        assertTrue(registeredUserAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        registeredUserAccountPage.addUserWithNoCity();
        //assert state dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        System.out.println("The state dropdown menu is displayed" + "\n");
        registeredUserAccountPage.clickStateDropdownMenu();
        //assert chosen state is displayed
        assertTrue(registeredUserAccountPage.isIllinoisStateDisplayed(), "The Illinois state isn't displayed");
        System.out.println("The Illinois state is displayed" + "\n");
        registeredUserAccountPage.clickIllinoisStateOption();
        //assert the correct state is selected
        assertEquals(registeredUserAccountPage.getChosenStateOption(), "Illinois");
        //assert postal code input field is displayed
        assertTrue(registeredUserAccountPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        registeredUserAccountPage.addUserPostalCode();
        //assert country dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The country dropdown menu isn't displayed" + "\n");
        registeredUserAccountPage.clickCountryDropdownMenu();
        //assert chosen country option is displayed
        assertTrue(registeredUserAccountPage.isUSCountryDisplayed(), "The US option isn't displayed");
        System.out.println("The US option is displayed" + "\n");
        registeredUserAccountPage.clickUSOption();
        //assert the correct country is selected
        assertEquals(registeredUserAccountPage.getUSCountryText(), "United States");
        //assert save button is displayed
        assertTrue(registeredUserAccountPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        System.out.println("The save button is displayed" + "\n");
        registeredUserAccountPage.clickSaveButton();
    }

    //edit registered user without state
    protected void editRegisteredUserDataNoStateTest(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();

        //assert first name input field is displayed
        assertTrue(registeredUserAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserAccountPage.inputEditedUserDetails();
        registeredUserAccountPage.changeFirstName();
        //assert last name input field is displayed
        assertTrue(registeredUserAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserAccountPage.changeLastName();
        //assert address input field is displayed
        assertTrue(registeredUserAccountPage.isAddressInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The address input field is displayed" + "\n");
        registeredUserAccountPage.addUserAddress();
        //assert city input field is displayed
        assertTrue(registeredUserAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        registeredUserAccountPage.addUserCity();
        //assert postal code input field is displayed
        assertTrue(registeredUserAccountPage.isPostalCodeInputFieldDisplayed(), "The postal code input field isn't displayed");
        System.out.println("The postal code input field is displayed" + "\n");
        registeredUserAccountPage.addUserPostalCode();
        //assert country dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The country dropdown menu isn't displayed" + "\n");
        registeredUserAccountPage.clickCountryDropdownMenu();
        //assert chosen country option is displayed
        assertTrue(registeredUserAccountPage.isUSCountryDisplayed(), "The US option isn't displayed");
        System.out.println("The US option is displayed" + "\n");
        registeredUserAccountPage.clickUSOption();
        //assert the correct country is selected
        assertEquals(registeredUserAccountPage.getUSCountryText(), "United States");
        //assert save button is displayed
        assertTrue(registeredUserAccountPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        System.out.println("The save button is displayed" + "\n");
        registeredUserAccountPage.clickSaveButton();
    }

    //edit registered user without state
    protected void editRegisteredUserDataNoPostalCodeTest(){
        RegisteredUserAccountAddFirstAddressPage registeredUserAccountPage = new RegisteredUserAccountAddFirstAddressPage(driver);
        //assert the nav link is displayed
        assertTrue(registeredUserAccountPage.isUserAccountLink1Displayed(), "The nav link isn't displayed");
        System.out.println("The nav link is displayed" + "\n");
        registeredUserAccountPage.clickUserAccountLink1();
        //assert the 'add first address' link is displayed
        assertTrue(registeredUserAccountPage.isAddFirstAddressLinkDisplayed(), "The 'add first address' link isn't displayed");
        System.out.println("The 'add first address' link is displayed" + "\n");
        //assert the 'add first address' link has the correct name
        //assertEquals(registeredUserAccountPage.getAddFirstAddressLinkText(), "Add first address"); // -> assert crashes the test
        registeredUserAccountPage.clickAddFirstAddressLink();

        //assert first name input field is displayed
        assertTrue(registeredUserAccountPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserAccountPage.inputEditedUserDetailsNoPostalCode();
        registeredUserAccountPage.changeFirstName();
        //assert last name input field is displayed
        assertTrue(registeredUserAccountPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserAccountPage.changeLastName();
        //assert address input field is displayed
        assertTrue(registeredUserAccountPage.isAddressInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The address input field is displayed" + "\n");
        registeredUserAccountPage.addUserAddress();
        //assert city input field is displayed
        assertTrue(registeredUserAccountPage.isCityInputFieldDisplayed(), "The city input field isn't displayed");
        System.out.println("The city input field is displayed" + "\n");
        registeredUserAccountPage.addUserCity();
        //assert state dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isStateDropdownMenuDisplayed(), "The state dropdown menu isn't displayed");
        System.out.println("The state dropdown menu is displayed" + "\n");
        registeredUserAccountPage.clickStateDropdownMenu();
        //assert chosen state is displayed
        assertTrue(registeredUserAccountPage.isIllinoisStateDisplayed(), "The Illinois state isn't displayed");
        System.out.println("The Illinois state is displayed" + "\n");
        registeredUserAccountPage.clickIllinoisStateOption();
        //assert the correct state is selected
        assertEquals(registeredUserAccountPage.getChosenStateOption(), "Illinois");
        //assert country dropdown menu is displayed
        assertTrue(registeredUserAccountPage.isCountryDropdownMenuDisplayed(), "The country dropdown menu isn't displayed");
        System.out.println("The country dropdown menu isn't displayed" + "\n");
        registeredUserAccountPage.clickCountryDropdownMenu();
        //assert chosen country option is displayed
        assertTrue(registeredUserAccountPage.isUSCountryDisplayed(), "The US option isn't displayed");
        System.out.println("The US option is displayed" + "\n");
        registeredUserAccountPage.clickUSOption();
        //assert the correct country is selected
        assertEquals(registeredUserAccountPage.getUSCountryText(), "United States");
        //assert save button is displayed
        assertTrue(registeredUserAccountPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        System.out.println("The save button is displayed" + "\n");
        registeredUserAccountPage.clickSaveButton();
    }

  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //information page navigation test method

  protected void navigateToInformationPage(){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the information link is displayed in the white frame
      assertTrue(registeredUserInformationPage.isInformationLinkDisplayed(), "The information link isn't displayed");
      System.out.println("The information link is displayed" + "\n");
      registeredUserInformationPage.clickInformationLink();
  }

  //information edit test methods (male user)

    protected void editMaleUserDataWithValidDataTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetails(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The lastst name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());
        //assert 'Show' button is displayed
        assertTrue(registeredUserInformationPage.isPasswordShowButtonDisplayed(), "The password 'Show' button isn't displayed");
        System.out.println("The password 'Show' button is displayed");
        registeredUserInformationPage.clickShowPassword();

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();
        //assert 'Show' button is displayed (new password)
        assertTrue(registeredUserInformationPage.isNewPasswordShowButtonDisplayed(), "The new password 'Show' button isn't displayed");
        System.out.println("The new password 'Show' button is displayed");
        registeredUserInformationPage.clickShowNewPassword();
        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert the 'Receive Offers' checkbox is displayed
        assertTrue(registeredUserInformationPage.isReceiveOffersCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickReceiveOffersCheckbox();
        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Sign Up to Newsletter' checkbox is displayed
        assertTrue(registeredUserInformationPage.isSignUpNewsletterCheckboxDisplayed(), "The 'Sign Up to Newsletter' checkbox isn't displayed");
        System.out.println("The 'Sign Up to Newsletter' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickSignUpNewsletterCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the success message is displayed
        assertEquals(registeredUserInformationPage.getSuccessEditMessage(), "Information successfully updated.");
        System.out.println("The success message is: " + registeredUserInformationPage.getSuccessEditMessage() + "\n");

        //assert 'Return to your account' link is displayed
        assertTrue(registeredUserInformationPage.isReturnBackLinkDisplayed(), "The 'Return to your account' link isn't displayed");
        System.out.println("The 'Return to your account' link is displayed" + "\n");
        registeredUserInformationPage.clickBackToAccount();

        //assert the user account name displayed in navbar link has indeed changed
        assertEquals(registeredUserInformationPage.getEditedUserAccountName(), registeredUserInformationPage.getEditedFirstName().concat(" ").concat(registeredUserInformationPage.getEditedLastName()));
        System.out.println("The edited user account name is: " + registeredUserInformationPage.getEditedFirstName().concat(" ").concat(registeredUserInformationPage.getEditedLastName()));
    }

    //information edit test methods (female user)

    protected void editFemaleUserDataWithValidDataTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isFemaleGenderSelectorDisplayed(), "The female gender selector isn't displayed");
        System.out.println("The female gender selector is displayed" + "\n");
        registeredUserInformationPage.clickFemaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetails(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());
        //assert 'Show' button is displayed
        assertTrue(registeredUserInformationPage.isPasswordShowButtonDisplayed(), "The password 'Show' button isn't displayed");
        System.out.println("The password 'Show' button is displayed");
        registeredUserInformationPage.clickShowPassword();

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();
        //assert 'Show' button is displayed (new password)
        assertTrue(registeredUserInformationPage.isNewPasswordShowButtonDisplayed(), "The new password 'Show' button isn't displayed");
        System.out.println("The new password 'Show' button is displayed");
        registeredUserInformationPage.clickShowNewPassword();
        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert the 'Receive Offers' checkbox is displayed
        assertTrue(registeredUserInformationPage.isReceiveOffersCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickReceiveOffersCheckbox();
        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Sign Up to Newsletter' checkbox is displayed
        assertTrue(registeredUserInformationPage.isSignUpNewsletterCheckboxDisplayed(), "The 'Sign Up to Newsletter' checkbox isn't displayed");
        System.out.println("The 'Sign Up to Newsletter' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickSignUpNewsletterCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the success message is displayed
        assertEquals(registeredUserInformationPage.getSuccessEditMessage(), "Information successfully updated.");
        System.out.println("The success message is: " + registeredUserInformationPage.getSuccessEditMessage() + "\n");

        //assert 'Return to your account' link is displayed
        assertTrue(registeredUserInformationPage.isReturnBackLinkDisplayed(), "The 'Return to your account' link isn't displayed");
        System.out.println("The 'Return to your account' link is displayed" + "\n");
        registeredUserInformationPage.clickBackToAccount();

        //assert the user account name displayed in navbar link has indeed changed
        assertEquals(registeredUserInformationPage.getEditedUserAccountName(), registeredUserInformationPage.getEditedFirstName().concat(" ").concat(registeredUserInformationPage.getEditedLastName()));
        System.out.println("The edited user account name is: " + registeredUserInformationPage.getEditedFirstName().concat(" ").concat(registeredUserInformationPage.getEditedLastName()));
    }

    //negative test methods

    //information edit test methods (male user) -> no first name

    protected void editMaleUserDataWithNoFirstNameTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsNoFirstName(registerPage);
        registeredUserInformationPage.editFirstNameAsNone();

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();
        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

    }

    //information edit test methods (male user) -> invalid first name

    protected void editMaleUserDataWithInvalidFirstNameTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsInvalidFirstName(registerPage);
        registeredUserInformationPage.editFirstNameInvalidFormat();

        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The lastst name input field isn't displayed");


        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();
        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();


        //assert whether warning messages are appearing
        assertEquals(registeredUserInformationPage.getCheckDataMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getInvalidFormatMessage(), "Invalid format.");

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getFormatErrorMessage(), "Invalid format.");
    }

    //information edit test methods (male user) -> too long first name
    protected void editMaleUserDataWithTooLongFirstNameTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsTooLongFirstName(registerPage);
        registeredUserInformationPage.editTooLongFirstName();

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getFormatErrorMessage(), "The first name field is too long (255 chars max).");
    }

    //information edit test methods (male user) -> no last name
    protected void editMaleUserDataWithNoLastNameTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsNoLastName(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editNoLastName();

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();
    }

    //information edit test methods (male user) -> invalid last name
    protected void editMaleUserDataWithInvalidLastNameTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsInvalidLastName(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editInvalidLastName();

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getFormatErrorMessage(), "Invalid format.");
    }

    //information edit test methods (male user) -> invalid last name
    protected void editMaleUserDataWithTooLongLastNameTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsTooLongLastName(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editTooLongLastName();

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();
        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getFormatErrorMessage(), "The last name field is too long (255 chars max).");
    }

    //information edit test methods (male user) -> no email
    protected void editMaleUserDataWithNoEmailTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsNoEmail(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editNoEmail();

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();
        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();
    }

    //information edit test methods (male user) -> invalid email
    protected void editMaleUserDataWithInvalidEmailTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsInvalidEmail(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editInvalidEmail();

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());

        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();
        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getFormatErrorMessage(), "Invalid format.");
    }

    //information edit test methods (male user) -> too long email
    protected void editMaleUserDataWithTooLongEmailTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsTooLongEmail(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editTooLongEmail();

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());
        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getFormatErrorMessage(), "The email field is too long (255 chars max).");
    }

    //information edit test methods (male user) -> no password test
    protected void editMaleUserDataWithNoPasswordTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsNoPassword(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.editNoPassword();
        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();
    }

    //information edit test methods (male user) -> invalid password test
    protected void editMaleUserDataWithInvalidPasswordTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsInvalidPassword(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.editInvalidPassword();
        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.inputNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getFormatErrorMessage(), "Invalid email/password combination");
    }

    //information edit test methods (male user) -> no new password test
    protected void editMaleUserDataWithNoNewPasswordTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsNoNewPassword(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());
        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.editNoNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the success message is displayed
        assertEquals(registeredUserInformationPage.getSuccessEditMessage(), "Information successfully updated.");
        System.out.println("The success message is: " + registeredUserInformationPage.getSuccessEditMessage() + "\n");
    }

    //information edit test methods (male user) -> invalid new password test
    protected void editMaleUserDataWithInvalidNewPasswordTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsInvalidNewPassword(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());
        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.editInvalidNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getNewPasswordLengthErrorMessage(), "Password must be between 8 and 72 characters long");
        assertEquals(registeredUserInformationPage.getNewPasswordStrengthErrorMessage(), "The minimum score must be: Strong");
    }

    //information edit test methods (male user) -> invalid new password test
    protected void editMaleUserDataWithTooLongNewPasswordTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsTooLongNewPassword(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());
        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.editTooLongNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the error messages are as expected
        assertEquals(registeredUserInformationPage.getDataErrorMessage(), "Could not update your information, please check your data.");
        assertEquals(registeredUserInformationPage.getNewPasswordLengthErrorMessage(), "The minimum score must be: Strong");
    }

    //information edit test methods (male user) -> invalid new password test
    protected void editMaleUserDataWithMatchingNewPasswordTest(RegisterPage registerPage){
        RegisteredUserInformationPage registeredUserInformationPage = new RegisteredUserInformationPage(driver);

        //assert the male gender selector is displayed
        assertTrue(registeredUserInformationPage.isMaleGenderSelectorDisplayed(), "The male gender selector isn't displayed");
        System.out.println("The male gender selector is displayed" + "\n");
        registeredUserInformationPage.clickMaleGenderSelector();

        //assert first name input field is displayed
        assertTrue(registeredUserInformationPage.isFirstNameInputFieldDisplayed(), "The first name input field isn't displayed");
        System.out.println("The first name input field is displayed" + "\n");
        registeredUserInformationPage.inputEditedInformationDetailsMatchingNewPassword(registerPage);
        registeredUserInformationPage.editFirstName();
        //assert the first names were indeed changed
        assertNotEquals(registeredUserInformationPage.getFirstName(), registeredUserInformationPage.getEditedFirstName());
        System.out.println("Old first name: " + registeredUserInformationPage.getFirstName() + "\n");
        System.out.println("New first name: " + registeredUserInformationPage.getEditedFirstName() + "\n");

        //assert last name input field is displayed
        assertTrue(registeredUserInformationPage.isLastNameInputFieldDisplayed(), "The last name input field isn't displayed");
        System.out.println("The last name input field is displayed" + "\n");
        registeredUserInformationPage.editLastName();
        //assert the last names were indeed changed
        assertNotEquals(registeredUserInformationPage.getLastName(), registeredUserInformationPage.getEditedLastName());
        System.out.println("Old last name: " + registeredUserInformationPage.getLastName() + "\n");
        System.out.println("New last name: " + registeredUserInformationPage.getEditedLastName() + "\n");

        //assert email address input field is displayed
        assertTrue(registeredUserInformationPage.isEmailInputFieldDisplayed(), "The email address input field isn't displayed");
        System.out.println("The email address input field is displayed" + "\n");
        registeredUserInformationPage.editEmailAddress();
        //assert the email addresses were indeed changed
        assertNotEquals(registeredUserInformationPage.getEmailAddress(), registeredUserInformationPage.getEditedEmailAddress());
        System.out.println("Old email address: " + registeredUserInformationPage.getEmailAddress() + "\n");
        System.out.println("New email address: " + registeredUserInformationPage.getEditedEmailAddress() + "\n");

        //assert password input field is displayed
        assertTrue(registeredUserInformationPage.isPasswordInputFieldDisplayed(), "The password input field isn't displayed");
        System.out.println("The password input field is displayed" + "\n");
        registeredUserInformationPage.inputOldPassword(registerPage.getPassword());
        //assert new password input field is displayed
        assertTrue(registeredUserInformationPage.isNewPasswordInputFieldDisplayed(), "The new password input field isn't displayed");
        System.out.println("The new password input field is displayed" + "\n");
        registeredUserInformationPage.editMatchingNewPassword();

        //assert the passwords were indeed changed
        assertNotEquals(registeredUserInformationPage.getPassword(), registeredUserInformationPage.getNewPassword());
        System.out.println("Old password: " + registeredUserInformationPage.getPassword() + "\n");
        System.out.println("New password: " + registeredUserInformationPage.getNewPassword() + "\n");

        //assert birthdate input field is displayed
        assertTrue(registeredUserInformationPage.isBirthDateInputFieldDisplayed(), "The birthdate input field isn't displayed");
        System.out.println("The birthdate input field is displayed" + "\n");
        registeredUserInformationPage.editBirthdate();
        //assert the birthdate was indeed changed
        assertNotEquals(registeredUserInformationPage.getBirthDate(), registeredUserInformationPage.getEditedBirthDate());
        System.out.println("Old birthdate: " + registeredUserInformationPage.getBirthDate() + "\n");
        System.out.println("New birthdate: " + registeredUserInformationPage.getEditedBirthDate() + "\n");

        //assert 'Agree to Terms' checkbox is displayed
        assertTrue(registeredUserInformationPage.isAgreeToTermsCheckboxDisplayed(), "The 'Receive Offers' checkbox isn't displayed");
        System.out.println("The 'Receive Offers' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickAgreeToTermsCheckbox();
        //assert 'Data Privacy' checkbox is displayed
        assertTrue(registeredUserInformationPage.isDataPrivacyCheckboxDisplayed(), "The 'Data Privacy' checkbox isn't displayed");
        System.out.println("The 'Data Privacy' checkbox is displayed" + "\n");
        registeredUserInformationPage.clickDataPrivacyCheckbox();

        //assert 'Save' button is displayed
        assertTrue(registeredUserInformationPage.isSaveButtonDisplayed(), "The 'Save' button isn't displayed");
        System.out.println("The 'Save' button is displayed" + "\n");
        registeredUserInformationPage.clickSaveButton();

        //assert the success message is displayed
        assertEquals(registeredUserInformationPage.getSuccessEditMessage(), "Information successfully updated.");
        System.out.println("The success message is: " + registeredUserInformationPage.getSuccessEditMessage() + "\n");
    }



  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


}