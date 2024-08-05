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

        addTShirtWishListButtonTest();
    }

    //Test 058a -> add "Hummingbird printed sweater" into wishlist test
    @Test
    void addSweaterToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addSweaterWishListButtonTest();
    }

    //Test 058b -> add "Best Is Yet To Come" picture into wishlist test
    @Test
    void addBestYetToComePictureToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addPictureBestYetWishListButtonTest();
    }

    //Test 058c -> add "Adventure Begins" picture into wishlist test
    @Test
    void addAdventureBeginsPictureToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addPictureAdventureBeginsWishListButtonTest();
    }

    //Test 058d -> add "Adventure Begins" picture into wishlist test (My wishlist inner link doesn't click)
    @Test
    void addGoodDayPictureToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addPictureGoodDayWishListButtonTest();
    }

    //Test 058e -> add "Best Yet To Come" mug into wishlist test (My wishlist inner link doesn't click)
    @Test
    void addBestYetMugToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addMugBestYetWishListButtonTest();
    }

    //Test 058f -> add "Adventure Begins" mug into wishlist test (My wishlist inner link doesn't click)
    @Test
    void addAdventureBeginsMugToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addMugAdventureBeginsWishListButtonTest();
    }

    //Test 058g -> add "Today Is A Good Day" mug into wishlist test (My wishlist inner link doesn't click)
    @Test
    void addGoodDayMugToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addMugGoodDayWishListButtonTest();
    }



}
