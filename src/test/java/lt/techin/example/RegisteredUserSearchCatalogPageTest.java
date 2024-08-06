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


}
