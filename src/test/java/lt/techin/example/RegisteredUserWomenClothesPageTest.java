package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserWomenClothesPageTest extends TestMethods{

    //Test 047 -> navigate to women Clothes page (link 1) test
    @Test
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


}
