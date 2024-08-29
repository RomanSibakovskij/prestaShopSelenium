package lt.techin.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisteredUserWishListPage extends BasePage{

    //links
    @FindBy(css = "#content section:nth-child(2) .all-product-link")
    private WebElement allProductsLink;
    @FindBy(css = ".wishlist-list > .wishlist-list-item")
    private WebElement myWishListPageLink;
    @FindBy(css = "a[title='My wishlists']")
    private WebElement wishListPageLink;
    @FindBy(css = ".wishlist-list-item-link")
    private WebElement myWishListInnerLink;

    //product wishlist buttons
    @FindBy(css = "[data-id-product='1'] .wishlist-button-add")
    private WebElement tShirtWishListButton;
    @FindBy(css = "[data-id-product='2'] .wishlist-button-add")
    private WebElement sweaterWishListButton;
    @FindBy(css = "[data-id-product='3'] .wishlist-button-add")
    private WebElement pictureBestYetToComeWishListButton;
    @FindBy(css = "[data-id-product='4'] .wishlist-button-add")
    private WebElement pictureAdventureBeginsWishListButton;
    @FindBy(css = "[data-id-product='5'] .wishlist-button-add")
    private WebElement pictureGoodDayWishListButton;
    @FindBy(css = "[data-id-product='6'] .wishlist-button-add")
    private WebElement mugBestYetWishListButton;
    @FindBy(css = "[data-id-product='7'] .wishlist-button-add")
    private WebElement mugAdventureBeginsWishListButton;
    @FindBy(css = "[data-id-product='8'] .wishlist-button-add")
    private WebElement mugGoodDayWishListButton;
    @FindBy(css = "[data-id-product='9'] .wishlist-button-add")
    private WebElement cushionMountainFoxWishListButton;
    @FindBy(css = "[data-id-product='10'] .wishlist-button-add")
    private WebElement cushionBrownBearWishListButton;
    @FindBy(css = "[data-id-product='11'] .wishlist-button-add")
    private WebElement cushionHummingBirdWishListButton;
    @FindBy(css = "[data-id-product='12'] .wishlist-button-add")
    private WebElement vectorFoxWishListButton;
    @FindBy(css = "[data-id-product='13'] .wishlist-button-add")
    private WebElement vectorBearWishListButton;
    @FindBy(css = "[data-id-product='14'] .wishlist-button-add")
    private WebElement vectorHummingBirdWishListButton;
    @FindBy(css = "[data-id-product='15'] .wishlist-button-add")
    private WebElement packMugPosterWishListButton;
    @FindBy(css = "[data-id-product='16'] .wishlist-button-add")
    private WebElement notebookFoxWishListButton;
    @FindBy(css = "[data-id-product='17'] .wishlist-button-add")
    private WebElement notebookBearWishListButton;
    @FindBy(css = "[data-id-product='18'] .wishlist-button-add")
    private WebElement notebookBirdWishListButton;
    @FindBy(css = "[data-id-product='19'] .wishlist-button-add")
    private WebElement mugCustomTextWishListButton;

    //success popup
    @FindBy(css = ".success.wishlist-toast")
    private WebElement productAddedPopUp;

    //pagination link
    @FindBy(css = "[class='col-md-6 offset-md-2 pr-0'] li:nth-of-type(2) .js-search-link")
    private WebElement nextPageLink;

    //product titles elements
    @FindBy(css = "div:nth-of-type(1) > .js-product-miniature.product-miniature.reviews-loaded .h3.product-title > a")
    private WebElement tShirtProductTitle;
    @FindBy(css = "div:nth-of-type(2) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement sweaterProductTitle;
    @FindBy(css = "div:nth-of-type(3) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement pictureBestYetToComeProductTitle;
    @FindBy(css = "div:nth-of-type(4) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement pictureAdventureBeginsProductTitle;
    @FindBy(css = "div:nth-of-type(5) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement pictureGoodDayProductTitle;
    @FindBy(css = "div:nth-of-type(6) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement mugBestYetProductTitle;
    @FindBy(css = "div:nth-of-type(7) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement mugAdventureBeginsProductTitle;
    @FindBy(css = "div:nth-of-type(8) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement mugGoodDayProductTitle;
    @FindBy(css = "div:nth-of-type(9) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement cushionMountainFoxProductTitle;
    @FindBy(css = "div:nth-of-type(10) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement cushionBrownBearProductTitle;
    @FindBy(css = "div:nth-of-type(11) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement cushionHummingBirdProductTitle;
    @FindBy(css = "div:nth-of-type(12) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement vectorFoxProductTitle;
    @FindBy(css = "div:nth-of-type(13) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement vectorBearProductTitle;
    @FindBy(css = "div:nth-of-type(14) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement vectorHummingBirdProductTitle;
    @FindBy(css = "div:nth-of-type(15) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement vectorPackMugPosterProductTitle;
    @FindBy(css = "div:nth-of-type(16) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement notebookFoxProductTitle;
    @FindBy(css = "div:nth-of-type(17) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement notebookBearProductTitle;
    @FindBy(css = "div:nth-of-type(18) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement notebookBirdProductTitle;
    @FindBy(css = "div:nth-of-type(19) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement mugCustomProductTitle;

    //added product title
    @FindBy(css = ".wishlist-product-title")
    private WebElement addedProductName;

    public RegisteredUserWishListPage(WebDriver driver) {
        super(driver);
    }

    // click methods
    public void clickAllProductsLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(allProductsLink));
        allProductsLink.click();
    }
    // t-shirt add to wishlist test method
    public void clickTShirtWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(tShirtWishListButton));
        tShirtWishListButton.click();
    }

    // sweater add to wishlist test method
    public void clickSweaterWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(sweaterWishListButton));
        sweaterWishListButton.click();
    }

    // picture 'Best Yet To Come' add to wishlist test method
    public void clickPictureBestYetWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(pictureBestYetToComeWishListButton));
        pictureBestYetToComeWishListButton.click();
    }

    // picture 'Adventure Begins' add to wishlist test method
    public void clickPictureAdventureBeginsWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(pictureAdventureBeginsWishListButton));
        pictureAdventureBeginsWishListButton.click();
    }

    // picture 'Today is a Good day' add to wishlist test method
    public void clickPictureGoodDayWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(pictureGoodDayWishListButton));
        pictureGoodDayWishListButton.click();
    }

    // mug 'Best Yet To Come' add to wishlist test method
    public void clickMugBestYetWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(mugBestYetWishListButton));
        mugBestYetWishListButton.click();
    }

    // mug 'Adventure Begins' add to wishlist test method
    public void clickMugAdventureBeginsWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(mugAdventureBeginsWishListButton));
        mugAdventureBeginsWishListButton.click();
    }

    // mug 'Good Day' add to wishlist test method
    public void clickMugGoodDayWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(mugGoodDayWishListButton));
        mugGoodDayWishListButton.click();
    }

    // cushion 'Mountain Fox' add to wishlist test method
    public void clickCushionFoxWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(cushionMountainFoxWishListButton));
        cushionMountainFoxWishListButton.click();
    }

    // cushion 'Brown Bear' add to wishlist test method
    public void clickCushionBearWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(cushionBrownBearWishListButton));
        cushionBrownBearWishListButton.click();
    }

    // cushion 'Humming Bird' add to wishlist test method
    public void clickCushionHummingBirdWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(cushionHummingBirdWishListButton));
        cushionHummingBirdWishListButton.click();
    }

    // vector 'Mountain Fox' add to wishlist test method
    public void clickVectorFoxWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(vectorFoxWishListButton));
        vectorFoxWishListButton.click();
    }

    // vector 'Brown Bear' add to wishlist test method
    public void clickVectorBearWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(vectorBearWishListButton));
        vectorBearWishListButton.click();
    }

    // vector 'Humming Bird' add to wishlist test method
    public void clickVectorBirdWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(vectorHummingBirdWishListButton));
        vectorHummingBirdWishListButton.click();
    }

    // pack 'Mug and Poster' add to wishlist test method
    public void clickPackMugPosterWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(packMugPosterWishListButton));
        packMugPosterWishListButton.click();
    }

    // notebook 'Mountain Fox' add to wishlist test method
    public void clickNotebookFoxWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(notebookFoxWishListButton));
        notebookFoxWishListButton.click();
    }

    // notebook 'Brown Bear' add to wishlist test method
    public void clickNotebookBearWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(notebookBearWishListButton));
        notebookBearWishListButton.click();
    }

    // notebook 'Humming Bird' add to wishlist test method
    public void clickNotebookBirdWishListButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(notebookBirdWishListButton));
        notebookBirdWishListButton.click();
    }

    // mug 'Custom text' add to wishlist test method
    public void clickMugCustomTextWishListButton(){
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mugCustomTextWishListButton);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(mugCustomTextWishListButton));
        mugCustomTextWishListButton.click();
    }


    // next page click method
    public void clickNextPageLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextPageLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(nextPageLink));
        nextPageLink.click();
    }

    // wishlist click methods
    public void clickMyWishListLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1200));
        wait.until(ExpectedConditions.elementToBeClickable(myWishListPageLink));
        myWishListPageLink.click();
    }

    public void clickWishListLink(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wishListPageLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(wishListPageLink));
        wishListPageLink.click();
    }

    public void clickWishListInnerLink(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(myWishListInnerLink));
        myWishListInnerLink.click();
    }


    //assert methods
    public boolean isAllProductsLinkDisplayed(){return allProductsLink.isDisplayed();}

    //t-shirt assert method
    public boolean isTShirtWishListButtonDisplayed(){return tShirtWishListButton.isDisplayed();}
    //sweater assert method
    public boolean isSweaterWishListButtonDisplayed(){return sweaterWishListButton.isDisplayed();}
    //picture 'Best Yet To Come' assert method
    public boolean isPictureBestYetWishListButtonDisplayed(){return pictureBestYetToComeWishListButton.isDisplayed();}
    //picture 'Adventure Begins' assert method
    public boolean isPictureAdventureBeginsWishListButtonDisplayed(){return pictureAdventureBeginsWishListButton.isDisplayed();}
    //picture 'Adventure Begins' assert method
    public boolean isPictureGoodDayWishListButtonDisplayed(){return pictureGoodDayWishListButton.isDisplayed();}
    //mug 'Best Yet To Come' assert method
    public boolean isMugBestYetWishListButtonDisplayed(){return mugBestYetWishListButton.isDisplayed();}
    //mug 'Adventure Begins' assert method
    public boolean isMugAdventureBeginsWishListButtonDisplayed(){return mugAdventureBeginsWishListButton.isDisplayed();}
    //mug 'Good Day' assert method
    public boolean isMugGoodDayWishListButtonDisplayed(){return mugGoodDayWishListButton.isDisplayed();}
    //cushion 'Mountain Fox' assert method
    public boolean isCushionMountainFoxWishListButtonDisplayed(){return cushionMountainFoxWishListButton.isDisplayed();}
    //cushion 'Brown Bear' assert method
    public boolean isCushionBrownBearWishListButtonDisplayed(){return cushionBrownBearWishListButton.isDisplayed();}
    //cushion 'Humming Bird' assert method
    public boolean isCushionHummingBirdWishListButtonDisplayed(){return cushionHummingBirdWishListButton.isDisplayed();}
    //vector 'Mountain Fox' assert method
    public boolean isVectorFoxWishListButtonDisplayed(){return vectorFoxWishListButton.isDisplayed();}
    //vector 'Brown Bear' assert method
    public boolean isVectorBearWishListButtonDisplayed(){return vectorBearWishListButton.isDisplayed();}
    //vector 'Humming Bird' assert method
    public boolean isVectorHummingBirdWishListButtonDisplayed(){return vectorHummingBirdWishListButton.isDisplayed();}
    //pack 'Mug and Poster' assert method
    public boolean isPackMugAndPosterWishListButtonDisplayed(){return packMugPosterWishListButton.isDisplayed();}
    //notebook 'Mountain Fox' assert method
    public boolean isNotebookFoxWishListButtonDisplayed(){return notebookFoxWishListButton.isDisplayed();}
    //notebook 'Brown Bear' assert method
    public boolean isNotebookBearWishListButtonDisplayed(){return notebookBearWishListButton.isDisplayed();}
    //notebook 'Humming Bird' assert method
    public boolean isNotebookBirdWishListButtonDisplayed(){return notebookBirdWishListButton.isDisplayed();}
    //mug 'Custom Text' assert method
    public boolean isMugCustomWishListButtonDisplayed(){return mugCustomTextWishListButton.isDisplayed();}


    // navigation page link assert
    public boolean isNextPageLinkDisplayed(){return nextPageLink.isDisplayed();}

    //wishlist link asserts
    public boolean isMyWishListLinkDisplayed(){return myWishListPageLink.isDisplayed();}
    public boolean isWishListPageLinkDisplayed(){return wishListPageLink.isDisplayed();}
    public boolean isWishListInnerLinkDisplayed(){return myWishListInnerLink.isDisplayed();}


    // added product assert
    public boolean isAddedProductNameDisplayed(){return addedProductName.isDisplayed();}

    //product title getters
    public String getTShirtProductTitle(){return tShirtProductTitle.getText();}
    public String getSweaterProductTitle(){return sweaterProductTitle.getText();}
    public String getPictureBestYetProductTitle(){return pictureBestYetToComeProductTitle.getText();}
    public String getPictureAdventureBeginsProductTitle(){return pictureAdventureBeginsProductTitle.getText();}
    public String getPictureGoodDayProductTitle(){return pictureGoodDayProductTitle.getText();}
    public String getMugBestYetProductTitle(){return mugBestYetProductTitle.getText();}
    public String getMugAdventureBeginsProductTitle(){return mugAdventureBeginsProductTitle.getText();}
    public String getMugGoodDayProductTitle(){return mugGoodDayProductTitle.getText();}
    public String getCushionFoxProductTitle(){return cushionMountainFoxProductTitle.getText();}
    public String getCushionBearProductTitle(){return cushionBrownBearProductTitle.getText();}
    public String getCushionHummingBirdProductTitle(){return cushionHummingBirdProductTitle.getText();}
    public String getVectorFoxProductTitle(){return vectorFoxProductTitle.getText();}
    public String getVectorBearProductTitle(){return vectorBearProductTitle.getText();}
    public String getVectorHummingBirdProductTitle(){return vectorHummingBirdProductTitle.getText();}
    public String getPackMugAndPosterProductTitle(){return vectorHummingBirdProductTitle.getText();}
    public String getNotebookFoxProductTitle(){return notebookFoxProductTitle.getText();}
    public String getNotebookBearProductTitle(){return notebookBearProductTitle.getText();}
    public String getNotebookBirdProductTitle(){return notebookBirdProductTitle.getText();}
    public String getMugCustomProductTitle(){return mugCustomProductTitle.getText();}

    //assert the correct product is added into wishlist
    public String getAddedProductTitle(){return addedProductName.getText();}

    //success popup getter
    public String getProductAddedPopUpMessage(){return productAddedPopUp.getText();}

}
