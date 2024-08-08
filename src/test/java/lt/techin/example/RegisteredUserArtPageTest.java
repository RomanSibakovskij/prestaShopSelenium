package lt.techin.example;

import org.junit.jupiter.api.*;

public class RegisteredUserArtPageTest extends TestMethods {

    //Test 006 -> navigate to Art page test
    @Test
    @Tag("Navigation_To_Art_Page")
    void goToArtPageTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);
        navigateToArtPageTest();
    }

    //Test 007 -> filter product display by availability in stock (box icon)
    @Test
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterByInStockBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByInStockBoxIconLinkTest();
    }

    //Test 007a -> filter product display by availability in stock (link)
    @Test
    @Tag("Filter_Products_By_Link_Click")
    void filterByInStockLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByInStockLinkTest();
    }

    //Test 008 -> filter product display by availability in stock (box icon)
    @Test
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterByNewProductBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByNewProductBoxIconLinkTest();
    }

    //Test 008a -> filter product display by availability in stock (link)
    @Test
    @Tag("Filter_Products_By_Link_Click")
    void filterByNewProductLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByNewProductLinkTest();
    }

    //Test 009 -> filter product by price test
    @Test
    @Tag("Filter_Products_By_Price_Slider")
    void filterProductsByPriceSliderTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByPriceSliderTest();
    }

    //Test 010 -> filter product by product composition test (box icon)
    @Test
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterProductsByCompositionBoxIconTest() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByCompositionBoxIconLinkTest();
    }

    //Test 010a -> filter product by product composition test
    @Test
    @Tag("Filter_Products_By_Link_Click")
    void filterProductsByCompositionLinkTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByCompositionLinkTest();
    }

    //Test 011 -> filter product by product composition test (box icon) (element click intercepted)
    @Test
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterProductsByBrandBoxIconTest() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByBrandBoxIconLinkTest();
    }

    //Test 011a -> filter product by product composition test
    @Test
    @Tag("Filter_Products_By_Link_Click")
    void filterProductsByBrandLinkTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByBrandLinkTest();
    }

    //Test 012 -> filter product by product composition test (box icon)
    @Test
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterProductsByDimension1BoxIconTest() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByDimension1BoxIconLinkTest();
    }

    //Test 012a -> filter product by product composition test
    @Test
    @Tag("Filter_Products_By_Link_Click")
    void filterProductsByDimension1LinkTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByDimension1LinkTest();
    }

    //Test 013 -> filter product by product composition test (box icon)
    @Test
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterProductsByDimension2BoxIconTest() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByDimension2BoxIconLinkTest();
    }

    //Test 013a -> filter product by product composition test
    @Test
    @Tag("Filter_Products_By_Link_Click")
    void filterProductsByDimension2LinkTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByDimension2LinkTest();
    }

    //Test 014 -> filter product by product composition test (box icon)
    @Test
    @Tag("Filter_Products_By_Box_Icon_Click")
    void filterProductsByDimension3BoxIconTest() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByDimension3BoxIconLinkTest();
    }

    //Test 014a -> filter product by product composition test
    @Test
    @Tag("Filter_Products_By_Link_Click")
    void filterProductsByDimension3LinkTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        filterProductsByDimension3LinkTest();
    }

    //Test 015 -> click on sort by dropdown menu test
    @Test
    @Tag("Sort_By_Menu_Click_Test")
    void clickSortByMenuTest() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        clickSortByDropdownMenuTest();
    }

    //Test 015a -> sort products by sales test
    @Test
    @Tag("Sort_Products_By_Categories")
    void sortProductsBySalesTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        sortProductsBySalesTest();
    }

    //Test 015b -> sort products by relevance test
    @Test
    @Tag("Sort_Products_By_Categories")
    void sortProductsByRelevanceTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        sortProductsByRelevanceTest();
    }

    //Test 015c -> sort products by name (A to Z) test
    @Test
    @Tag("Sort_Products_By_Categories")
    void sortProductsByNameAToZTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        sortProductsByNameAToZTest();
    }

    //Test 015d -> sort products by name (Z to A) test
    @Test
    @Tag("Sort_Products_By_Categories")
    void sortProductsByNameZToATests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        sortProductsByNameZToATest();
    }

    //Test 015e -> sort products by price (low to high) test
    @Test
    @Tag("Sort_Products_By_Categories")
    void sortProductsByPriceLowToHighTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        sortProductsByPriceLowToHighTest();
    }

    //Test 015f -> sort products by price (high to low) test
    @Test
    @Tag("Sort_Products_By_Categories")
    void sortProductsByPriceHighToLowTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        sortProductsByPriceHighToLowTest();
    }

    //Test 015g -> sort products by relevance (a to z) test
    @Test
    @Tag("Sort_Products_By_Categories")
    void sortProductsByRelevanceAToZTests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        sortProductsByReferenceAToZTest();
    }

    //Test 015h -> sort products by relevance (z to a) test
    @Test
    @Tag("Sort_Products_By_Categories")
    void sortProductsByRelevanceZToATests() {
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();
        createNewMaleUserAccountTest(registerPage);

        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        sortProductsByReferenceZToATest();
    }




}
