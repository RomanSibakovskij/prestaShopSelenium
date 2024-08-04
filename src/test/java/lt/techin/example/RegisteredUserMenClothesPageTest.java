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

    //Test 038a -> filter men clothes by price test
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


}
