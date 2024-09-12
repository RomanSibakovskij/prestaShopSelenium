package lt.techin.example;

import org.junit.jupiter.api.*;

public class RegisteredUserHomeAccessoriesPageTest extends TestMethods{

    //Test 025 -> navigate to Home Accessories page (link 1)test
    @Test
    @DisplayName("User Navigation To Home Accessories Page(aside link)")
    @Tag("Navigate_To_Category_Page_By_Aside_Link")
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
    @DisplayName("User Navigation To Home Accessories Page(box icon link)")
    @Tag("Navigate_To_Category_Page_By_Icon_Link")
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
    @DisplayName("User Navigation To Home Accessories Page(box icon)")
    @Tag("Navigate_To_Category_Page_By_Box_Icon")
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
    @DisplayName("Filter Home Accessories By Availability(box icon)")
    @Tag("Filter_Hm_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Filter Home Accessories By Availability(link)")
    @Tag("Filter_Hm_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Filter Home Accessories By Selections(box icon)")
    @Tag("Filter_Hm_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Filter Home Accessories By Selections(link)")
    @Tag("Filter_Hm_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Filter Home Accessories By Price Slider Value")
    @Tag("Filter_Hm_Acc_Products_By_Price_Slider")
    @Tag("Filter_Products_By_Price_Slider")
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
    @DisplayName("Filter Home Accessories By White Color(box icon)")
    @Tag("Filter_Hm_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Filter Home Accessories By White Color(link)")
    @Tag("Filter_Hm_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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

        filterHmAccProductByWhiteColorLinkTest();
    }

    //Test 030 -> filter home accessories products by black color (box icon) test
    @Test
    @DisplayName("Filter Home Accessories By Black Color(box icon)")
    @Tag("Filter_Hm_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Filter Home Accessories By Black Color(link)")
    @Tag("Filter_Hm_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Filter Home Accessories By Composition[ceramic](box icon)")
    @Tag("Filter_Hm_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Filter Home Accessories By Composition[ceramic](link)")
    @Tag("Filter_Hm_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Filter Home Accessories By Composition[polyester](box icon)")
    @Tag("Filter_Hm_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Filter Home Accessories By Composition[polyester](link)")
    @Tag("Filter_Hm_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Filter Home Accessories By Property(box icon)")
    @Tag("Filter_Hm_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Filter Home Accessories By Property(link)")
    @Tag("Filter_Hm_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Filter Home Accessories By Brand(box icon)")
    @Tag("Filter_Hm_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Filter Home Accessories By Brand(link)")
    @Tag("Filter_Hm_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Home Accessories Sort By Menu Click Test")
    @Tag("Hm_Acc_Sort_By_Menu_Click_Test")
    @Tag("Sort_By_Menu_Click_Test")
    void clickSortByMenuTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();
        clickHmAccessoriesSortByDropdownMenuTest();
    }

    //Test 035a -> sort home accessories by sales test
    @Test
    @DisplayName("Home Accessories Sort By Sales")
    @Tag("Sort_Hm_Acc_Products_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickSortBySalesTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        sortHmAccessoriesProductsBySalesTest();
    }

    //Test 035b -> sort home accessories by relevance test
    @Test
    @DisplayName("Home Accessories Sort By Relevance")
    @Tag("Sort_Hm_Acc_Products_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickSortByRelevanceTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        sortHmAccessoriesProductsByRelevanceTest();
    }

    //Test 035c -> sort home accessories by name (A to Z) test
    @Test
    @DisplayName("Home Accessories Sort By Name(A to Z)")
    @Tag("Sort_Hm_Acc_Products_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickSortByNameAToZTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        sortHmAccessoriesProductsByNameAToZTest();
    }

    //Test 035d -> sort home accessories by name (Z to A) test
    @Test
    @DisplayName("Home Accessories Sort By Name(Z to A)")
    @Tag("Sort_Hm_Acc_Products_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickSortByNameZToATest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        sortHmAccessoriesProductsByNameZToATest();
    }

    //Test 035e -> sort home accessories by price (low to high) test
    @Test
    @DisplayName("Home Accessories Sort By Price(low to high)")
    @Tag("Sort_Hm_Acc_Products_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickSortByPriceLowToHighTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        sortHmAccessoriesProductsByPriceLowToHighTest();
    }

    //Test 035f -> sort home accessories by price (high to low) test
    @Test
    @DisplayName("Home Accessories Sort By Price(high to low)")
    @Tag("Sort_Hm_Acc_Products_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickSortByPriceHighToLowTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        sortHmAccessoriesProductsByPriceHighToLowTest();
    }

    //Test 035g -> sort home accessories by reference (A to Z) test
    @Test
    @DisplayName("Home Accessories Sort By Reference(A to Z)")
    @Tag("Sort_Hm_Acc_Products_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickSortByReferenceAToZTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        sortHmAccessoriesProductsByReferenceAToZTest();
    }

    //Test 035g -> sort home accessories by reference (Z to A) test
    @Test
    @DisplayName("Home Accessories Sort By Reference(Z to A)")
    @Tag("Sort_Hm_Acc_Products_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickSortByReferenceZToATest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToAccessoriesPageTest();
        navigateToHomeAccessoriesPageLink1Test();

        sortHmAccessoriesProductsByReferenceZToATest();
    }

}
