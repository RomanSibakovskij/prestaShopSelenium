package lt.techin.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegisteredUserMenClothesPageTest extends TestMethods{

    //Test 036 -> navigate to Clothes page test
    @Test
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
