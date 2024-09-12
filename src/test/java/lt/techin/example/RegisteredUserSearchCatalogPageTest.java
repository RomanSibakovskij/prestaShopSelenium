package lt.techin.example;


import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.Test;

public class RegisteredUserSearchCatalogPageTest extends TestMethods{

    //Important note : the part title search is bugged, sometimes it shows the results it's not supposed to show. Even full title search results
    //are not quite appropriate. But in overall, search feature works, even if not without bugs


    //Test 005 -> search for "The Best is Yet To Come" mug as a registered user
    @Test
    @DisplayName("Search Catalog For 'The Best Yet To Come' Mug")
    @Tag("Search_Catalog_For_Mugs")
    void searchCatalogMugBestTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForMugBestInSearchCatalogTest();
    }

    //Test 005a -> search for "The adventure begins" mug as a registered user
    @Test
    @DisplayName("Search Catalog For 'The Adventure Begins' Mug")
    @Tag("Search_Catalog_For_Mugs")
    void searchCatalogMugAdventureTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForMugAdventureInSearchCatalogTest();
    }

    //Test 005b -> search for "Today is a good day" mug as a registered user somehow
    @Test
    @DisplayName("Search Catalog For 'Today Is A Good day' Mug")
    @Tag("Search_Catalog_For_Mugs")
    void searchCatalogMugGoodDayTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForMugGoodDayInSearchCatalogTest();
    }

    //Test 005c -> search for "Customizable mug" mug as a registered user
    @Test
    @DisplayName("Search Catalog For 'Custom Text' Mug")
    @Tag("Search_Catalog_For_Mugs")
    void searchCatalogMugCustomTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForMugCustomTextInSearchCatalogTest();
    }

    //Test 005d -> search for "The Best is Yet To Come" framed poster as a registered user
    @Test
    @DisplayName("Search Catalog For 'The Best Yet To Come' Poster")
    @Tag("Search_Catalog_For_Posters")
    void searchCatalogPosterBestTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForPosterBestInSearchCatalogTest();
    }

    //Test 005e -> search for "The adventure begins" framed poster as a registered user
    @Test
    @DisplayName("Search Catalog For 'The Adventure Begins' Poster")
    @Tag("Search_Catalog_For_Posters")
    void searchCatalogPosterAdventureTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForPosterAdventureInSearchCatalogTest();
    }

    //Test 005f -> search for "The adventure begins" framed poster as a registered user
    @Test
    @DisplayName("Search Catalog For 'Today Is A Good Day' Poster")
    @Tag("Search_Catalog_For_Posters")
    void searchCatalogPosterGoodDayTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForPosterGoodDayInSearchCatalogTest();
    }

    //Test 005g -> search for "Mountain fox" cushion as a registered user
    @Test
    @DisplayName("Search Catalog For 'Mountain Fox' Cushion")
    @Tag("Search_Catalog_For_Cushions")
    void searchCatalogCushionFoxTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForCushionFoxInSearchCatalogTest();
    }

    //Test 005h -> search for "Brown Bear" cushion as a registered user
    @Test
    @DisplayName("Search Catalog For 'Brown Bear' Cushion")
    @Tag("Search_Catalog_For_Cushions")
    void searchCatalogCushionBearTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForCushionBearInSearchCatalogTest();
    }

    //Test 005h -> search for "Humming Bird" cushion as a registered user
    @Test
    @DisplayName("Search Catalog For 'Humming Bird' Cushion")
    @Tag("Search_Catalog_For_Cushions")
    void searchCatalogCushionBirdTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForCushionBirdInSearchCatalogTest();
    }

    //Test 005i -> search for "Humming Bird" t-shirt as a registered user
    @Test
    @DisplayName("Search Catalog For 'Humming Bird' T-shirt")
    @Tag("Search_Catalog_For_TShirt")
    void searchCatalogTShirtBirdTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForTShirtInSearchCatalogTest();
    }

    //Test 005j -> search for "Humming Bird" sweater as a registered user
    @Test
    @DisplayName("Search Catalog For 'Humming Bird' Sweater")
    @Tag("Search_Catalog_For_Sweater")
    void searchCatalogSweaterBirdTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForSweaterBirdInSearchCatalogTest();
    }

    //Test 005k -> search for "Mountain Fox" graphics as a registered user
    @Test
    @DisplayName("Search Catalog For 'Mountain Fox' Graphics")
    @Tag("Search_Catalog_For_Graphics")
    void searchCatalogGraphicsFoxTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForGraphicsFoxInSearchCatalogTest();
    }

    //Test 005l -> search for "Brown Bear" graphics as a registered user
    @Test
    @DisplayName("Search Catalog For 'Brown Bear' Graphics")
    @Tag("Search_Catalog_For_Graphics")
    void searchCatalogGraphicsBearTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForGraphicsBearInSearchCatalogTest();
    }

    //Test 005m -> search for "Humming Bird" graphics as a registered user
    @Test
    @DisplayName("Search Catalog For 'Humming Bird' Graphics")
    @Tag("Search_Catalog_For_Graphics")
    void searchCatalogGraphicsBirdTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForGraphicsBirdInSearchCatalogTest();
    }

    //Test 005n -> search for "Mountain Fox" notebook as a registered user
    @Test
    @DisplayName("Search Catalog For 'Mountain Fox' Notebook")
    @Tag("Search_Catalog_For_Notebooks")
    void searchCatalogNotebookFoxTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForNotebookFoxInSearchCatalogTest();
    }

    //Test 005o -> search for "Brown Bear" notebook as a registered user
    @Test
    @DisplayName("Search Catalog For 'Brown Bear' Notebook")
    @Tag("Search_Catalog_For_Notebooks")
    void searchCatalogNotebookBearTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForNotebookBearInSearchCatalogTest();
    }

    //Test 005p -> search for "Humming Bird" notebook as a registered user
    @Test
    @DisplayName("Search Catalog For 'Humming Bird' Notebook")
    @Tag("Search_Catalog_For_Notebooks")
    void searchCatalogNotebookBirdTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForNotebookBirdInSearchCatalogTest();
    }

    //Test 005q -> search for "Pack Mug and Poster" as a registered user
    @Test
    @DisplayName("Search Catalog For Pack Mug And Poster")
    @Tag("Search_Catalog_For_Pack")
    void searchCatalogPackMugPosterTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForPackQueryInSearchCatalogTest();
    }


}
