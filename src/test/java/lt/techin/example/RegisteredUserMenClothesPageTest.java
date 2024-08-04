package lt.techin.example;

import org.junit.jupiter.api.Test;

public class RegisteredUserMenClothesPageTest extends TestMethods{

    //Test 036 -> navigate to Clothes page test
    @Test
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




}
