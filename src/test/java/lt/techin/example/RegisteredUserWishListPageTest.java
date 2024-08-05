package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserWishListPageTest extends TestMethods{


    //Test 057 -> navigate to all products page test
    @Test
    void navigateToAllProductsPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        clickAllProductsLinkTest();
    }

    //Test 058 -> add "Hummingbird printed t-shirt" into wishlist test
    @Test
    void addTShirtToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        clickTShirtWishListButtonTest();
    }



}
