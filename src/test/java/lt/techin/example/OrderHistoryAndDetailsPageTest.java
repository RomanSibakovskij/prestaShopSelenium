package lt.techin.example;

import org.junit.jupiter.api.*;

public class OrderHistoryAndDetailsPageTest extends TestMethods{

    //Test 062 -> order and history test (link test)
    @Test
    @Tag("Single_Product_Order_And_History_Link")
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

    //Test 062 -> order and history test (box icon test)
    @Test
    @Tag("Single_Product_Order_And_History_Box_Icon")
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
    @Tag("Single_Product_Add_And_Remove_From_Cart")
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
