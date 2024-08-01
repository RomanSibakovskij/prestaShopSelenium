package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserArtPageTest extends TestMethods {

    //Test 006 -> navigate to Art page test
    @Test
    void goToArtPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        navigateToArtPageTest();
    }

    //Test 007 -> filter product display by availability in stock (box icon) -> (the element click is intercepted)
    @Test
    void filterByInStockBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByInStockBoxIconLinkTest();
    }

    //Test 007a -> filter product display by availability in stock (link)
    @Test
    void filterByInStockLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByInStockLinkTest();
    }

    //Test 008 -> filter product display by availability in stock (box icon) -> (the element click is intercepted)
    @Test
    void filterByNewProductBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByNewProductBoxIconLinkTest();
    }

    //Test 008a -> filter product display by availability in stock (link)
    @Test
    void filterByNewProductLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByNewProductLinkTest();
    }
}
