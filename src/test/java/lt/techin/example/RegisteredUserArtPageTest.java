package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserArtPageTest extends TestMethods {

    //Test 006 -> navigate to Art page test
    @Test
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

    //Test 007 -> filter product display by availability in stock (box icon) -> (the element click is intercepted)
    @Test
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

    //Test 008 -> filter product display by availability in stock (box icon) -> (the element click is intercepted)
    @Test
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

    //Test 010 -> filter product by product composition test (box icon) (element click intercepted)
    @Test
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




}
