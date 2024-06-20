package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    WebDriver driver;
    public AccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "account-heading")
    WebElement text_accountHeading;
    @FindBy(xpath = "//p[contains(text(),'Member ship')]")
    WebElement text_memberShip;
    @FindBy(xpath = "//p[contains(text(),'Plan details')]")
    WebElement text_planDetails;
    @FindBy(className = "plan-paragraph")
    WebElement text_premium;
    @FindBy(className = "plan-details")
    WebElement text_ultraHd;
    @FindBy(className = "logout-button")
    WebElement btn_logout;

    public  boolean isAccountHeadingDisplayed(){
        return  text_accountHeading.isDisplayed();
    }
    public  boolean isMembershipDisplayed(){
        return  text_memberShip.isDisplayed();
    }
    public  boolean isPlanDetailsDisplayed(){
        return text_planDetails.isDisplayed();
    }
    public  boolean isPremiumDisplayed(){
      return   text_premium.isDisplayed();
    }
    public  boolean isultraHdDisplayed(){
        return  text_ultraHd.isDisplayed();
    }
    public  boolean isLogoutBtnDisplayed(){
        return btn_logout.isDisplayed();
    }
    public  void clickBtnLogout(){
        btn_logout.click();
    }
}
