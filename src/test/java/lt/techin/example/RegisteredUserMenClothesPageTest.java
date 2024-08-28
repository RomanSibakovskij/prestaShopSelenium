package lt.techin.example;

import org.junit.jupiter.api.*;

public class RegisteredUserMenClothesPageTest extends TestMethods{

    //Test 036 -> navigate to Clothes page test
    @Test
    @DisplayName("User Navigation To Clothes Page")
    @Tag("Navigate_To_Clothes_Page")
    void goToClothesPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
    }

    //Test 036a -> navigate to men Clothes page (link 1) test
    @Test
    @DisplayName("User Navigation To Men Clothes Page(aside link)")
    @Tag("Navigate_To_Category_Page_By_Aside_Link")
    void goToMenClothesPageLink1Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
    }

    //Test 036b -> navigate to men Clothes page (link 2) test
    @Test
    @DisplayName("User Navigation To Men Clothes Page(box icon link)")
    @Tag("Navigate_To_Category_Page_By_Icon_Link")
    void goToMenClothesPageLink2Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink2Test();
    }

    //Test 036c -> navigate to men Clothes page (box icon) test
    @Test
    @DisplayName("User Navigation To Men Clothes Page(box icon)")
    @Tag("Navigate_To_Category_Page_By_Box_Icon")
    void goToMenClothesPageBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageBoxIconTest();
    }

    //Test 037 -> filter men clothes by availability (box icon) test
    @Test
    @DisplayName("Filter Men Clothes By Availability(box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesByAvailabilityBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByInStockBoxIconTest();
    }

    //Test 037a -> filter men clothes by availability (link) test
    @Test
    @DisplayName("Filter Men Clothes By Availability(link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesByAvailabilityLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByInStockLinkTest();
    }

    //Test 037 -> filter men clothes by selections (box icon) test
    @Test
    @DisplayName("Filter Men Clothes By Selections[discounted](box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesDiscountedBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByDiscountedBoxIconTest();
    }

    //Test 037a -> filter men clothes by selections (link) test
    @Test
    @DisplayName("Filter Men Clothes By Selections[discounted](link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesDiscountedLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByDiscountedLinkTest();
    }

    //Test 038 -> filter men clothes by selections (box icon) test
    @Test
    @DisplayName("Filter Men Clothes By Selections[new product](box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesNewProductBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByNewProductBoxIconTest();
    }

    //Test 038a -> filter men clothes by selections (link) test
    @Test
    @DisplayName("Filter Men Clothes By Selections[new product](link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesNewProductLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByNewProductLinkTest();
    }

    //Test 039 -> filter men clothes by price test
    @Test
    @DisplayName("Filter Men Clothes By Price Slider Value")
    @Tag("Filter_Men_Clothes_By_Price_Slider")
    @Tag("Filter_Products_By_Price_Slider")
    void filterMenClothesByPriceTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByPriceSliderTest();
    }

    //Test 040 -> filter men clothes by size S (box icon) test
    @Test
    @DisplayName("Filter Men Clothes By Size[s](box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesSizeSBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesBySizeSBoxIconTest();
    }

    //Test 040a -> filter men clothes by size S (link) test
    @Test
    @DisplayName("Filter Men Clothes By Size[s](link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesSizeSLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesBySizeSLinkTest();
    }

    //Test 041 -> filter men clothes by size M (box icon) test
    @Test
    @DisplayName("Filter Men Clothes By Size[m](box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesSizeMBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesBySizeMBoxIconTest();
    }

    //Test 041a -> filter men clothes by size M (link) test
    @Test
    @DisplayName("Filter Men Clothes By Size[m](link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesSizeMLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesBySizeMLinkTest();
    }

    //Test 042 -> filter men clothes by size L (box icon) test
    @Test
    @DisplayName("Filter Men Clothes By Size[l](box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesSizeLBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesBySizeLBoxIconTest();
    }

    //Test 042a -> filter men clothes by size L (link) test
    @Test
    @DisplayName("Filter Men Clothes By Size[l](link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesSizeLLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesBySizeLLinkTest();
    }

    //Test 043 -> filter men clothes by size XL (box icon) test
    @Test
    @DisplayName("Filter Men Clothes By Size[xl](box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesSizeXLBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesBySizeXLBoxIconTest();
    }

    //Test 043a -> filter men clothes by size XL (link) test
    @Test
    @DisplayName("Filter Men Clothes By Size[xl](link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesSizeXLLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesBySizeXLLinkTest();
    }

    //Test 044 -> filter men clothes by white color (box icon) test (displays black items, should display 0 if none are present)
    @Test
    @DisplayName("Filter Men Clothes By White Color(box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesColorWhiteBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByWhiteBoxIconTest();
    }

    //Test 044a -> filter men clothes by white color (link) test (displays black items, should display 0 if none are present)
    @Test
    @DisplayName("Filter Men Clothes By White Color(link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesColorWhiteLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByWhiteLinkTest();
    }

    //Test 045 -> filter men clothes by black color (box icon) test
    @Test
    @DisplayName("Filter Men Clothes By Black Color(box icon)")
    @Tag("Filter_Men_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterMenClothesColorBlackBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByBlackBoxIconTest();
    }

    //Test 045a -> filter men clothes by black color (link) test
    @Test
    @DisplayName("Filter Men Clothes By Black Color(link)")
    @Tag("Filter_Men_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterMenClothesColorBlackLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        filterMenClothesByBlackLinkTest();
    }

    //Test 046 -> click sort by dropdown menu on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Menu Click Test")
    @Tag("Sort_Men_Clothes_By_Menu_Click_Test")
    @Tag("Sort_By_Menu_Click_Test")
    void clickMenClothesSortByDropdownTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        clickMenClothesSortByDropdownMenuTest();
    }

    //Test 046a -> click sort by sales on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Sales")
    @Tag("Sort_Men_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickMenClothesSortBySalesTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        sortMenClothesBySalesTest();
    }

    //Test 046b -> click sort by relevance on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Relevance")
    @Tag("Sort_Men_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickMenClothesSortByRelevanceTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        sortMenClothesByRelevanceTest();
    }

    //Test 046c -> click sort by name 'A to Z' on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Name(A to Z)")
    @Tag("Sort_Men_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickMenClothesSortByNameAToZTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        sortMenClothesByNameAToZTest();
    }

    //Test 046d -> click sort by name 'Z to A' on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Name (Z to A)")
    @Tag("Sort_Men_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickMenClothesSortByNameZToATest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        sortMenClothesByNameZToATest();
    }

    //Test 046e -> click sort by price 'low to high' on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Price(low to high)")
    @Tag("Sort_Men_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickMenClothesSortByPriceLowToHighTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        sortMenClothesByPriceLowToHighTest();
    }

    //Test 046e -> click sort by price 'high to low' on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Price(high to low)")
    @Tag("Sort_Men_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickMenClothesSortByPriceHighToLowTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        sortMenClothesByPriceHighToLowTest();
    }

    //Test 046f -> click sort by reference 'A to Z' on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Reference(A to Z)")
    @Tag("Sort_Men_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickMenClothesSortByReferenceAToZTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        sortMenClothesByReferenceAToZTest();
    }

    //Test 046g -> click sort by reference 'Z to A' on men clothes page test
    @Test
    @DisplayName("Men Clothes Sort By Reference(Z to A)")
    @Tag("Sort_Men_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickMenClothesSortByReferenceZToATest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToMenClothesPageLink1Test();
        sortMenClothesByReferenceZToATest();
    }

}
