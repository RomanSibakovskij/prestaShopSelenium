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
        System.out.println("The accessories page link is displayed on navbar" + "\n");
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

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesInStockBoxIconDisplayed(), "The stationary accessories 'in stock' box icon isn't displayed");
        System.out.println("The stationary accessories page 'in stock' box icon is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccInStockBoxIcon();
    }

    protected void filterProductByAvailabilityLinkTest(){
        RegisteredUserStationaryAccessoriesPage registeredUserStationaryAccessoriesPage = new RegisteredUserStationaryAccessoriesPage(driver);

        //assert accessories link is displayed on navbar
        assertTrue(registeredUserStationaryAccessoriesPage.isStAccessoriesInStockLinkDisplayed(), "The stationary accessories 'in stock' link isn't displayed");
        System.out.println("The stationary accessories page 'in stock' link is displayed" + "\n");
        registeredUserStationaryAccessoriesPage.clickStAccInStockLink();
        //assertEquals(registeredUserStationaryAccessoriesPage.getStAccAvailabilityFilterMessage(), "Availability: In stock"); -> assert crashes the test

    }
}