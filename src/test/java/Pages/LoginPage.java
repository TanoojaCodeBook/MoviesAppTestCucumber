package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
WebDriver driver;
WebDriverWait wait;

  public LoginPage(WebDriver driver){
   this.driver=driver;
   this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    PageFactory.initElements(driver,this);
}


@FindBy(xpath = "//img[@alt='login website logo']")
WebElement logo_movies_ele;

@FindBy(className = "sign-in-heading")
    WebElement heading_login_ele;

@FindBy(xpath = "//label[contains(text(),'USERNAME')]")
    WebElement label_userName_ele;


@FindBy(xpath = "//label[contains(text(),'PASSWORD')]")
    WebElement label_password_ele;

@FindBy(id="usernameInput")
    WebElement input_userName_ele;

@FindBy(id="passwordInput")
    WebElement input_password_ele;

@FindBy(className = "login-button")
    WebElement btn_login;


public boolean isLogoDisplayed(){
    return logo_movies_ele.isDisplayed();
}

public String getTextLogin(){
    return heading_login_ele.getText();
}

public String getUserNameLabelText(){
    return  label_userName_ele.getText();
}

public  String getPasswordLabelText(){
    return  label_password_ele.getText();
}


public  void enterUserName(String userName){
    input_userName_ele.sendKeys(userName);
}
public  void enterPassword(String password){
    input_password_ele.sendKeys(password);
}

public  boolean isLoginBtnDisplayed(){
    return  btn_login.isDisplayed();
}

public  void clickBtnLogin(){
    btn_login.click();
}



public  void login(String userName, String password){
    enterUserName(userName);
    enterPassword(password);
    clickBtnLogin();
    new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/"));
}
}
