package lt.techin.example;


import org.junit.jupiter.api.Test;

public class RegisteredUserSearchCatalogPageTest extends TestMethods{


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


}
