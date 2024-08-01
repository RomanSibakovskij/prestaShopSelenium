package lt.techin.example;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethodsArtPage extends BaseTest{
    RegisteredUserArtPage registeredUserArtPage;
    protected void navigateToArtPageTest(){
        //assert 'Art' link is displayed on navbar
        assertTrue(registeredUserArtPage.isArtPageLinkPresent(), "The 'Art' link isn't displayed");
        System.out.println("The 'Art' link is displayed" + "\n");
        registeredUserArtPage.clickArtLink();
    }



}
