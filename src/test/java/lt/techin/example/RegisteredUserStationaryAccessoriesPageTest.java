package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserStationaryAccessoriesPageTest extends TestMethods{

    //Test 016 -> navigate to Accessories page test
    @Test
    void goToAccessoriesPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
    }

    //Test 016a -> navigate to Stationary Accessories page (link 1) test
    @Test
    void goToStationaryAccessoriesPageLink1Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
    }

    //Test 016b -> navigate to Stationary Accessories page (link 2) test
    @Test
    void goToStationaryAccessoriesPageLink2Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink2Test();
    }

    //Test 016c -> navigate to Stationary Accessories page (box icon) test
    @Test
    void goToStationaryAccessoriesPageBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageBoxIconTest();
    }

    //Test 017 -> filter stationary accessories by availability box icon click (element click intercepted)
    @Test
    void filterByInStockBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByAvailabilityBoxIconTest();
    }

    //Test 017a -> filter stationary accessories by availability link click
    @Test
    void filterByInStockLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByAvailabilityLinkTest();
    }

    //Test 018 -> filter stationary accessories by selections box icon click  (element click intercepted)
    @Test
    void filterByNewProductBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductBySelectionsBoxIconTest();
    }

    //Test 018a -> filter stationary accessories by selections link click
    @Test
    void filterByNewProductLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductBySelectionsLinkTest();
    }

    //Test 019 -> filter stationary accessories by price slider  (element click intercepted)
    @Test
    void filterProductByPriceSliderTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPriceSliderTest();
    }

    //Test 020 -> filter stationary accessories by ruled paper type box icon click
    @Test
    void filterByPaperType1BoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPaperType1BoxIconTest();
    }

    //Test 020a -> filter stationary accessories by ruled paper type link click
    @Test
    void filterByPaperType1LinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPaperType1LinkTest();
    }

    //Test 021 -> filter stationary accessories by plain paper type box icon click
    @Test
    void filterByPaperType2BoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPaperType2BoxIconTest();
    }

    //Test 021a -> filter stationary accessories by plain paper type link click
    @Test
    void filterByPaperType2LinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPaperType2LinkTest();
    }

    //Test 022 -> filter stationary accessories by squared paper type box icon click
    @Test
    void filterByPaperType3BoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPaperType3BoxIconTest();
    }

    //Test 022a -> filter stationary accessories by squared paper type link click
    @Test
    void filterByPaperType3LinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPaperType3LinkTest();
    }

    //Test 023 -> filter stationary accessories by dotted paper type box icon click
    @Test
    void filterByPaperType4BoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPaperType4BoxIconTest();
    }

    //Test 023a -> filter stationary accessories by dotted paper type link click
    @Test
    void filterByPaperType4LinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        filterProductByPaperType4LinkTest();
    }

    //Test 024 -> click on sort by dropdown menu test
    @Test
    void clickSortByMenuTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();
        clickStAccessoriesSortByDropdownMenuTest();
    }

    //Test 024a -> sort stationary accessories by sales test
    @Test
    void clickSortBySalesTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsBySalesTest();
    }

    //Test 024b -> sort stationary accessories by relevance test
    @Test
    void clickSortByRelevanceTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByRelevanceTest();
    }

    //Test 024c -> sort stationary accessories by name (A to Z) test
    @Test
    void clickSortByNameAToZTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByNameAToZTest();
    }

    //Test 024d -> sort stationary accessories by name (Z to A) test
    @Test
    void clickSortByNameZToATest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByNameZToATest();
    }

    //Test 024e -> sort stationary accessories by price (low to high) test
    @Test
    void clickSortByPriceLowToHighTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByPriceLowToHighTest();
    }

    //Test 024f -> sort stationary accessories by price (high to low) test
    @Test
    void clickSortByPriceHighToLowTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByPriceHighToLowTest();
    }

}
