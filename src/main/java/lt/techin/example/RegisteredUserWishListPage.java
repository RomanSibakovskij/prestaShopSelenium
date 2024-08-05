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

    //success popup
    @FindBy(css = ".success.wishlist-toast")
    private WebElement productAddedPopUp;

    //product titles elements
    @FindBy(css = "div:nth-of-type(1) > .js-product-miniature.product-miniature.reviews-loaded .h3.product-title > a")
    private WebElement tShirtProductTitle;
    @FindBy(css = "div:nth-of-type(2) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement sweaterProductTitle;
    @FindBy(css = "div:nth-of-type(3) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement pictureBestYetToComeProductTitle;
    @FindBy(css = "div:nth-of-type(3) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement pictureAdventureBeginsProductTitle;
    @FindBy(css = "div:nth-of-type(3) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement pictureGoodDayProductTitle;
    @FindBy(css = "div:nth-of-type(4) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement mugBestYetProductTitle;
    @FindBy(css = "div:nth-of-type(5) > .js-product-miniature.product-miniature.reviews-loaded h2 > a")
    private WebElement mugAdventureBeginsProductTitle;

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
    public boolean isMugAdventureBeginsWishListButtonDisplayed(){return mugAdventureBeginsWishListButton.isDisplayed();}

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

    //assert the correct product is added into wishlist
    public String getAddedProductTitle(){return addedProductName.getText();}

    //success popup getter
    public String getProductAddedPopUpMessage(){return productAddedPopUp.getText();}


}
