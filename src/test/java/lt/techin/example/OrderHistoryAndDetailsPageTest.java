package lt.techin.example;

import org.junit.jupiter.api.*;

public class OrderHistoryAndDetailsPageTest extends TestMethods{

    //Test 064 -> order and history test of a single product
    @Test
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
}
