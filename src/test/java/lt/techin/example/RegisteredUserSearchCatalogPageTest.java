package lt.techin.example;


import org.junit.jupiter.api.Test;

public class RegisteredUserSearchCatalogPageTest extends TestMethods{


    //Test 005 -> search catalog test as a registered user
    @Test
    void searchCatalogAsRegisteredUserTests(){
        clickOnSignUpTest();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.inputNewUserDetails();

        createNewMaleUserAccountTest(registerPage);
        logoutFromUserAccountTest();
        clickSignInRegisteredUserTest();
        logInRegisteredUserTest(registerPage);

        searchForProductInSearchCatalogTest();
    }
}
