package lt.techin.example;


import org.junit.jupiter.api.Test;

public class RegisteredUserSearchCatalogPageTest extends TestMethods{

    //Important note : the part title search is bugged, sometimes it shows the results it's not supposed to show. Even full title search results
    //are not quite appropriate. But in overall, search feature works, even if not without bugs


    //Test 005 -> search for "The Best is Yet To Come" mug as a registered user
    @Test
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
    void searchCatalogMugAdventureTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForMugBestInSearchCatalogTest();
    }

    //Test 005b -> search for "Today is a good day" mug as a registered user somehow
    @Test
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
    void searchCatalogNotebookBirdTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForNotebookBearInSearchCatalogTest();
    }

    //Test 005q -> search for "Pack Mug and Poster" as a registered user
    @Test
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
