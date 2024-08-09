package lt.techin.example;

import org.junit.jupiter.api.*;

public class OrderHistoryAndDetailsPageTest extends TestMethods{

    //Test 064 -> order and history test of a single product
    @Test
    @DisplayName("Order History And Details of a 'The Best is Yet To Come' Poster")
    @Tag("Order_History_Of_Single_Product")
    void singleProductOrderAndHistoryPayByBankWireTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();
        viewOrderAndHistoryAfterConfirmation();
    }

    //Test 065 -> send a message for a single product order
    @Test
    @DisplayName("Send A Message For 'The Best is Yet To Come' Poster Order")
    @Tag("Send_Message_For_Single_Product_Order")
    void sendMessageForASingleProductOrderTest(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        navigateToArtPageTest();

        addMessageToOrderTest();
    }
}
