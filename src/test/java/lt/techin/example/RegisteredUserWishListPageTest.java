package lt.techin.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegisteredUserWishListPageTest extends TestMethods{


    //Test 057 -> navigate to all products page test
    @Test
    @Tag("Navigate_To_All_Products_Page")
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
    @Tag("Add_TShirt_To_Wishlist")
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
    @Tag("Add_Sweater_To_Wishlist")
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
    @Tag("Add_Pictures_To_Wishlist")
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
    @Tag("Add_Pictures_To_Wishlist")
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
    @Tag("Add_Pictures_To_Wishlist")
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
    @Tag("Add_Mugs_To_Wishlist")
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
    @Tag("Add_Mugs_To_Wishlist")
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
    @Tag("Add_Mugs_To_Wishlist")
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
    @Tag("Add_Cushions_To_Wishlist")
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
    @Tag("Add_Cushions_To_Wishlist")
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
    @Tag("Add_Cushions_To_Wishlist")
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
    @Tag("Add_Graphics_To_Wishlist")
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

    //Test 058l -> add "Brown Bear" vector picture into wishlist test  (My wishlist inner link cannot be found)
    @Test
    @Tag("Add_Graphics_To_Wishlist")
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
    @Tag("Add_Graphics_To_Wishlist")
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
    @Tag("Add_Pack_To_Wishlist")
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
    @Tag("Add_Notebooks_To_Wishlist")
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

    //Test 058o -> add "Brown Bear" notebook into wishlist test
    @Test
    @Tag("Add_Notebooks_To_Wishlist")
    void addNotebookBearToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addNotebookBearWishListButtonTest();
    }

    //Test 058p -> add "Humming Bird" notebook into wishlist test
    @Test
    @Tag("Add_Notebooks_To_Wishlist")
    void addNotebookBirdToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addNotebookBirdWishListButtonTest();
    }

    //Test 058q -> add "Custom Text" mug into wishlist test
    @Test
    @Tag("Add_Mugs_To_Wishlist")
    void addMugCustomTextToWishListTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        clickAllProductsLinkTest();

        addMugCustomWishListButtonTest();
    }

}
