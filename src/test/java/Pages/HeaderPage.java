package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderPage {
    WebDriver driver;
    public HeaderPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//img[@alt='website logo']")
    WebElement logo_movies_ele;
    @FindBy(linkText = "Home")
    WebElement link_home_ele;
    @FindBy(linkText = "Popular")
    WebElement link_popular_ele;
    @FindBy(className = "search-empty-button")
    WebElement link_serachBtn_ele;
    @FindBy(xpath = "//img[@class='avatar-img']")
    WebElement link_profile_ele;


    public boolean isMoviesLogoDisplayed(){
        return logo_movies_ele.isDisplayed();
    }
    public boolean isLinkHomeDisplayed(){
        return link_home_ele.isDisplayed();
    }
    public boolean isLinkPopularDisplayed(){
        return link_popular_ele.isDisplayed();
    }

    public boolean isLinkSearchbtnDisplayed(){
        return  link_serachBtn_ele.isDisplayed();
    }

    public  boolean isLinkProfileDisplayed(){
        return  link_profile_ele.isDisplayed();
    }

    public String getLinkHomeText(){
        return link_home_ele.getText();
    }

    public  String getLinkPopularText(){
        return link_popular_ele.getText();
    }

    public void clickLinkHome(){
        link_home_ele.click();
    }

    public  void clickLinkPopular(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Popular")));
        link_popular_ele.click();
    }
    public  void clickLinkSearchBtn(){
        link_serachBtn_ele.click();
    }
    public  void clickLinkProfile(){
        link_profile_ele.click();
    }
}
