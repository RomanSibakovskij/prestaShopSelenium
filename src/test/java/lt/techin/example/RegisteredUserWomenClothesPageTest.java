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


}
