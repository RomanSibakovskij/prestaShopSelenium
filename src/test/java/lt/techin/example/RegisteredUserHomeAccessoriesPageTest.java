package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserHomeAccessoriesPageTest extends TestMethods{

    //Test 025 -> navigate to Home Accessories page (link 1)test
    @Test
    void goToHomeAccessoriesPageLink1Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();

        navigateToHomeAccessoriesPageLink1Test();
    }

    //Test 025a -> navigate to Home Accessories page (link 2) test
    @Test
    void goToHomeAccessoriesPageLink2Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();

        navigateToHomeAccessoriesPageLink2Test();
    }

    //Test 025b -> navigate to Home Accessories page (box icon) test
    @Test
    void goToHomeAccessoriesPageBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();

        navigateToHomeAccessoriesPageBoxIconTest();
    }

    //Test 026 -> filter home accessories products by availability (box icon) test
    @Test
    void filterHmAccProductByAvailabilityBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByAvailabilityBoxIconTest();
    }

    //Test 026a -> filter home accessories products by availability (link) test
    @Test
    void filterHmAccProductByAvailabilityLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByAvailabilityLinkTest();
    }

    //Test 027 -> filter home accessories products by selections (box icon) test
    @Test
    void filterHmAccProductBySelectionsBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductBySelectionsBoxIconTest();
    }

    //Test 027a -> filter home accessories products by selections (link) test
    @Test
    void filterHmAccProductBySelectionsLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductBySelectionsLinkTest();
    }

    //Test 028 -> filter home accessories products by price slider value test
    @Test
    void filterHmAccProductByPriceValueTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByPriceSliderTest();
    }

    //Test 029 -> filter home accessories products by white color (box icon) test (search shows black items for some reason)
    @Test
    void filterHmAccProductByWhiteColorBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByWhiteColorBoxIconTest();
    }

    //Test 029a -> filter home accessories products by white color (link) test (search shows black items for some reason)
    @Test
    void filterHmAccProductByWhiteColorLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByWhiteColorBoxIconTest();
    }

    //Test 030 -> filter home accessories products by black color (box icon) test
    @Test
    void filterHmAccProductByBlackColorBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByBlackColorBoxIconTest();
    }

    //Test 030a -> filter home accessories products by black color (link) test
    @Test
    void filterHmAccProductByBlackColorLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByBlackColorLinkTest();
    }

    //Test 031 -> filter home accessories products by composition -> ceramic (box icon) test
    @Test
    void filterHmAccProductByCeramicBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByCeramicBoxIconTest();
    }

    //Test 031a -> filter home accessories products by composition -> ceramic (link) test
    @Test
    void filterHmAccProductByCeramicLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByCeramicLinkTest();
    }

    //Test 032 -> filter home accessories products by composition -> polyester (box icon) test
    @Test
    void filterHmAccProductByPolyesterBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByPolyesterBoxIconTest();
    }

    //Test 032a -> filter home accessories products by composition -> polyester (link) test
    @Test
    void filterHmAccProductByPolyesterLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByPolyesterLinkTest();
    }

    //Test 033 -> filter home accessories products by property (box icon) test
    @Test
    void filterHmAccProductByPropertyBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByRemovableCoverBoxIconTest();
    }

    //Test 033a -> filter home accessories products by property (link) test
    @Test
    void filterHmAccProductByPropertyLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByRemovableCoverLinkTest();
    }
    //Test 034 -> filter home accessories products by brand test
    @Test
    void filterHmAccProductByBrandBoxIconTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByStudioDesignBoxIconTest();
    }

    //Test 034a -> filter home accessories products by brand (link) test
    @Test
    void filterHmAccProductByBrandLinkTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        filterHmAccProductByStudioDesignLinkTest();
    }

    //Test 035 -> click on sort by dropdown menu test
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
        clickHmAccessoriesSortByDropdownMenuTest();
    }

    //Test 035a -> sort home accessories by sales test
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

        sortHmAccessoriesProductsBySalesTest();
    }

    //Test 035b -> sort home accessories by relevance test
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

        sortHmAccessoriesProductsByRelevanceTest();
    }

}
