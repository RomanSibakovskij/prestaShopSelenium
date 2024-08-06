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

    //Test 062 -> order and history test (box icon test)
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
}
