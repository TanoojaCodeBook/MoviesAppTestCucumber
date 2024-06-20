package stepdefinitions;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestLoginPageUISteps {
    WebDriver driver=Hooks.getDriver();
    LoginPage lp=new LoginPage(driver);

@Given("I am on the Login Page")
    public void i_am_on_the_loginPage(){
        driver.get("https://qamoviesapp.ccbp.tech");
}

@Then("I should see the website logo displayed")
    public void i_should_see_the_website_logo_displayed(){
    Assert.assertTrue(lp.isLogoDisplayed(),"logo is not displayed");
}

@Then("the heading should display the text \"Login\"")
    public void the_heading_should_be_login(){
        Assert.assertEquals(lp.getTextLogin(),"Login","mismatch in text Login");
}

@Then("the Username label text should be \"USERNAME\"")
    public  void the_username_label_text_should_be_username(){
        Assert.assertEquals(lp.getUserNameLabelText(),"USERNAME","mismatch in text Username");
}

@Then("the Password label text should be \"PASSWORD\"")
    public  void the_password_label_text_should_be_password(){
        Assert.assertEquals(lp.getPasswordLabelText(),"PASSWORD","mismatch in text Password");

}

@Then("the Login button should be displayed")
    public  void the_login_button_should_be_displayed(){
        Assert.assertTrue(lp.isLoginBtnDisplayed(),"Login Button is not displayed");
}
}
