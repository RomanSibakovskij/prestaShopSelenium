package lt.techin.example;

import org.junit.jupiter.api.Test;

public class OrderHistoryAndDetailsPageTest extends TestMethods{

    //Test 062 -> order and history test (link test)
    @Test
    void singleProductOrderAndHistoryLinkTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        selectBestYetToComePosterLinkTest(); // -> the link is either not clickable / visible therefore further testing here halts
    }

    //Test 062 -> order and history test (box icon test) (terms of service checkbox clicking halts the test)
    @Test
    void singleProductOrderAndHistoryBoxIconTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        selectBestYetToComePosterBoxIconTest();
    }

    //Test 063 -> add product into shopping cart and remove it test (the icon needs to be clicked repeatedly if more than one product (quantity of the same) is present)
    @Test
    void addAndRemoveProductFromCartTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        addAndRemoveBestYetToComePosterFromCartBoxIconTest();
    }
}
