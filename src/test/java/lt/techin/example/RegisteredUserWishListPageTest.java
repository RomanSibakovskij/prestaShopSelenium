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

    //Test 058e -> add "Best Yet To Come" mug into wishlist test
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

    //Test 058f -> add "Adventure Begins" mug into wishlist test
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

    //Test 058g -> add "Today Is A Good Day" mug into wishlist test
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

    //Test 058h -> add "Mountain fox" cushion into wishlist test
    @Test
    void addCushionFoxToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addCushionFoxWishListButtonTest();
    }

    //Test 058i -> add "Brown Bear" cushion into wishlist test
    @Test
    void addCushionBrownBearToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addCushionBrownBearWishListButtonTest();
    }

    //Test 058j -> add "Humming Bird" cushion into wishlist test
    @Test
    void addCushionHummingBirdToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addCushionHummingBearWishListButtonTest();
    }

    //Test 058k -> add "Mountain Bird" vector picture into wishlist test
    @Test
    void addVectorFoxToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addVectorFoxWishListButtonTest();
    }

    //Test 058l -> add "Brown Bear" vector picture into wishlist test
    @Test
    void addVectorBrownBearToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addVectorBearWishListButtonTest();
    }

    //Test 058m -> add "Humming Bird" vector picture into wishlist test (My wishlist inner link cannot be found)
    @Test
    void addVectorHummingBirdToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addVectorHummingBirdWishListButtonTest();
    }

    //Test 058m -> add "Mug and Poster" pack into wishlist test
    @Test
    void addPackMugAndPosterToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addPackMugAndPosterWishListButtonTest();
    }

    //Test 058n -> add "Mountain Fox" notebook into wishlist test
    @Test
    void addNotebookFoxToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addNotebookFoxWishListButtonTest();
    }



}
