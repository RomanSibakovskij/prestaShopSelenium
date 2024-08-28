package lt.techin.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegisteredUserWomenClothesPageTest extends TestMethods{

    //Test 047 -> navigate to women Clothes page (link 1) test
    @Test
    @DisplayName("User Navigation To Women Clothes Page(aside link)")
    @Tag("Navigate_To_Category_Page_By_Aside_Link")
    void goToWomenClothesPageLink1Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
    }

    //Test 047a -> navigate to women Clothes page (link 2) test
    @Test
    @DisplayName("User Navigation To Women Clothes Page(box icon link)")
    @Tag("Navigate_To_Category_Page_By_Icon_Link")
    void goToWomenClothesPageLink2Test(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink2Test();
    }

    //Test 047b -> navigate to women Clothes page (box icon) test
    @Test
    @DisplayName("User Navigation To Women Clothes Page(box icon)")
    @Tag("Navigate_To_Category_Page_By_Box_Icon")
    void goToWomenClothesPageBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageBoxIconTest();
    }

    //Test 048 -> filter women clothes by availability (box icon) test
    @Test
    @DisplayName("Filter Women Clothes By Availability(box icon)")
    @Tag("Filter_Women_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterWomenClothesByAvailabilityBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesByInStockBoxIconTest();
    }

    //Test 048a -> filter women clothes by availability (link) test
    @Test
    @DisplayName("Filter Women Clothes By Availability(link)")
    @Tag("Filter_Women_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterWomenClothesByAvailabilityLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesByInStockLinkTest();
    }

    //Test 049 -> filter women clothes by selections -> discounted (box icon) test
    @Test
    @DisplayName("Filter Women Clothes By Selection[discounted](box icon)")
    @Tag("Filter_Women_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterWomenClothesDiscountedBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesByDiscountedBoxIconTest();
    }

    //Test 049a -> filter women clothes by selections -> discounted (link) test
    @Test
    @DisplayName("Filter Women Clothes By Selection[discounted](link)")
    @Tag("Filter_Women_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterWomenClothesDiscountedLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesByDiscountedLinkTest();
    }

    //Test 050 -> filter women clothes by selections -> new product (box icon) test
    @Test
    @DisplayName("Filter Women Clothes By Selection[new product](box icon)")
    @Tag("Filter_Women_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterWomenClothesNewProductBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesByNewProductBoxIconTest();
    }

    //Test 050a -> filter women clothes by selections -> new product (link) test
    @Test
    @DisplayName("Filter Women Clothes By Selection[new product](link)")
    @Tag("Filter_Women_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterWomenClothesNewProductLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesByNewProductLinkTest();
    }

    //Test 051 -> filter women clothes by price slider value test
    @Test
    @DisplayName("Filter Women Clothes By Price Slider Value")
    @Tag("Filter_Women_Clothes_By_Price_Slider")
    @Tag("Filter_Products_By_Price_Slider")
    void filterWomenClothesPriceValueTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesByPriceSliderTest();
    }

    //Test 052 -> filter women clothes by size s (box icon) test
    @Test
    @DisplayName("Filter Women Clothes By Size[s](box icon)")
    @Tag("Filter_Women_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterWomenClothesSizeSBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesBySizeSBoxIconTest();
    }

    //Test 052a -> filter women clothes by size s (link) test
    @Test
    @DisplayName("Filter Women Clothes By Size[s](link)")
    @Tag("Filter_Women_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterWomenClothesSizeSLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesBySizeSLinkTest();
    }

    //Test 053 -> filter women clothes by size m (box icon) test
    @Test
    @DisplayName("Filter Women Clothes By Size[m](box icon)")
    @Tag("Filter_Women_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterWomenClothesSizeMBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesBySizeMBoxIconTest();
    }

    //Test 053a -> filter women clothes by size m (link) test
    @Test
    @DisplayName("Filter Women Clothes By Size[m](link)")
    @Tag("Filter_Women_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterWomenClothesSizeMLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesBySizeMLinkTest();
    }

    //Test 054 -> filter women clothes by size l (box icon) test
    @Test
    @DisplayName("Filter Women Clothes By Size[l](box icon)")
    @Tag("Filter_Women_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterWomenClothesSizeLBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesBySizeLBoxIconTest();
    }

    //Test 054a -> filter women clothes by size l (link) test
    @Test
    @DisplayName("Filter Women Clothes By Size[l](link)")
    @Tag("Filter_Women_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterWomenClothesSizeLLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesBySizeLLinkTest();
    }

    //Test 055 -> filter women clothes by size xl (box icon) test
    @Test
    @DisplayName("Filter Women Clothes By Size[xl](box icon)")
    @Tag("Filter_Women_Clothes_By_Box_Icon_Click")
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterWomenClothesSizeXLBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesBySizeXLBoxIconTest();
    }

    //Test 055a -> filter women clothes by size xl (link) test
    @Test
    @DisplayName("Filter Women Clothes By Size[xl](link)")
    @Tag("Filter_Women_Clothes_By_Link_Click")
    @Tag("Filter_Products_By_Link_Click")
    void filterWomenClothesSizeXLLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        filterWomenClothesBySizeXLLinkTest();
    }

    //Test 056 -> click sort by dropdown menu on women clothes page test
    @Test
    @DisplayName("Women Clothes Sort By Menu Click Test")
    @Tag("Sort_Women_Clothes_By_Menu_Click_Test")
    @Tag("Sort_By_Menu_Click_Test")
    void clickWomenClothesSortByDropdownTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        clickWomenClothesSortByDropdownMenuTest();
    }

    //Test 056a -> click sort women clothes by sales page test
    @Test
    @DisplayName("Women Clothes Sort By Sales")
    @Tag("Sort_Women_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickWomenClothesSortBySalesTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        sortWomenClothesBySalesTest();
    }

    //Test 056b -> click sort women clothes by relevance page test
    @Test
    @DisplayName("Women Clothes Sort By Relevance")
    @Tag("Sort_Women_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickWomenClothesSortByRelevanceTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        sortWomenClothesByRelevanceTest();
    }

    //Test 056c -> click sort women clothes by name (A to Z) page test
    @Test
    @DisplayName("Women Clothes Sort By Name(A to Z)")
    @Tag("Sort_Women_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickWomenClothesSortByNameAToZTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        sortWomenClothesByNameAToZTest();
    }

    //Test 056d -> click sort women clothes by name (Z to A) page test
    @Test
    @DisplayName("Women Clothes Sort By Name(Z to A)")
    @Tag("Sort_Women_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickWomenClothesSortByNameZToATest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        sortWomenClothesByNameZToATest();
    }

    //Test 056e -> click sort women clothes by price (low to high) page test
    @Test
    @DisplayName("Women Clothes Sort By Price(low to high)")
    @Tag("Sort_Women_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickWomenClothesSortByPriceLowToHighTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        sortWomenClothesByPriceLowToHighTest();
    }

    //Test 056f -> click sort women clothes by price (high to low) page test
    @Test
    @DisplayName("Women Clothes Sort By price(high to low)")
    @Tag("Sort_Women_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickWomenClothesSortByPriceHighToLowTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        sortWomenClothesByPriceHighToLowTest();
    }

    //Test 056g -> click sort women clothes by reference (A to Z) page test
    @Test
    @DisplayName("Women Clothes Sort By Reference(A to Z)")
    @Tag("Sort_Women_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickWomenClothesSortByReferenceAToZTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        sortWomenClothesByReferenceAToZTest();
    }

    //Test 056h -> click sort women clothes by reference (Z to A) page test
    @Test
    @DisplayName("Women Clothes Sort By Reference(Z to A)")
    @Tag("Sort_Women_Clothes_By_Categories")
    @Tag("Sort_Products_By_Categories")
    void clickWomenClothesSortByReferenceZToATest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToClothesPageTest();
        navigateToWomenClothesPageLink1Test();
        sortWomenClothesByReferenceZToATest();
    }


}
