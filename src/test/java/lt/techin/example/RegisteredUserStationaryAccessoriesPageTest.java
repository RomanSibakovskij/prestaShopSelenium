package lt.techin.example;

import org.junit.jupiter.api.*;

public class RegisteredUserStationaryAccessoriesPageTest extends TestMethods{

    //Test 016 -> navigate to Accessories page test
    @Test
    @DisplayName("User Navigation To Accessories Page")
    @Tag("Navigate_To_Accessories_Page")
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
    @DisplayName("User Navigation To Stationary Accessories Page (aside link)")
    @Tag("Navigate_To_Category_Page_By_Aside_Link")
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
    @DisplayName("User Navigation To Stationary Accessories Page (box icon link)")
    @Tag("Navigate_To_Category_Page_By_Icon_Link")
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
    @DisplayName("User Navigation To Stationary Accessories Page (box icon)")
    @Tag("Navigate_To_Category_Page_By_Box_Icon")
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

    //Test 017 -> filter stationary accessories by availability box icon click
    @Test
    @DisplayName("Stationary Accessories Filter By Box Icon(availability)")
    @Tag("Filter_St_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Stationary Accessories Filter By Link(availability)")
    @Tag("Filter_St_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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

    //Test 018 -> filter stationary accessories by selections box icon click
    @Test
    @DisplayName("Stationary Accessories Filter By Box Icon(selections)")
    @Tag("Filter_St_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Stationary Accessories Filter By Link(selections)")
    @Tag("Filter_St_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Stationary Accessories Filter By Price Slider")
    @Tag("Filter_St_Acc_Products_By_Price_Slider")
    @Tag("Filter_Products_By_Price_Slider")
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
    @DisplayName("Stationary Accessories Filter By Box Icon(ruled paper)")
    @Tag("Filter_St_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Stationary Accessories Filter By Link(ruled paper)")
    @Tag("Filter_St_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Stationary Accessories Filter By Box Icon(plain paper)")
    @Tag("Filter_St_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Stationary Accessories Filter By Link(plain paper)")
    @Tag("Filter_St_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Stationary Accessories Filter By Box Icon(squared paper)")
    @Tag("Filter_St_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Stationary Accessories Filter By Link(squared paper)")
    @Tag("Filter_St_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Stationary Accessories Filter By Box Icon(dotted paper)")
    @Tag("Filter_St_Acc_Products_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
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
    @DisplayName("Stationary Accessories Filter By Link(dotted paper)")
    @Tag("Filter_St_Acc_Products_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
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
    @DisplayName("Stationary Accessories Sort By Menu Click Test")
    @Tag("St_Acc_Sort_By_Menu_Click_Test")
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
        navigateToStationaryAccessoriesPageLink1Test();
        clickStAccessoriesSortByDropdownMenuTest();
    }

    //Test 024a -> sort stationary accessories by sales test
    @Test
    @DisplayName("Stationary Accessories Sort By Sales")
    @Tag("Sort_St_Acc_Products_By_Categories")
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
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsBySalesTest();
    }

    //Test 024b -> sort stationary accessories by relevance test
    @Test
    @DisplayName("Stationary Accessories Sort By Relevance")
    @Tag("Sort_St_Acc_Products_By_Categories")
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
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByRelevanceTest();
    }

    //Test 024c -> sort stationary accessories by name (A to Z) test
    @Test
    @DisplayName("Stationary Accessories Sort By Name(A to Z)")
    @Tag("Sort_St_Acc_Products_By_Categories")
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
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByNameAToZTest();
    }

    //Test 024d -> sort stationary accessories by name (Z to A) test
    @Test
    @DisplayName("Stationary Accessories Sort By Name(Z to A)")
    @Tag("Sort_St_Acc_Products_By_Categories")
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
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByNameZToATest();
    }

    //Test 024e -> sort stationary accessories by price (low to high) test
    @Test
    @DisplayName("Stationary Accessories Sort By Price(low to high)")
    @Tag("Sort_St_Acc_Products_By_Categories")
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
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByPriceLowToHighTest();
    }

    //Test 024f -> sort stationary accessories by price (high to low) test
    @Test
    @DisplayName("Stationary Accessories Sort By Price(high to low)")
    @Tag("Sort_St_Acc_Products_By_Categories")
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
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByPriceHighToLowTest();
    }

    //Test 024g -> sort stationary accessories by reference (A to Z) test
    @Test
    @DisplayName("Stationary Accessories Sort By Reference(A to Z)")
    @Tag("Sort_St_Acc_Products_By_Categories")
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
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByReferenceAToZTest();
    }

    //Test 024h -> sort stationary accessories by reference (Z to A) test
    @Test
    @DisplayName("Stationary Accessories Sort By Reference(Z to A)")
    @Tag("Sort_St_Acc_Products_By_Categories")
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
        navigateToStationaryAccessoriesPageLink1Test();

        sortStAccessoriesProductsByReferenceZToATest();
    }

}
