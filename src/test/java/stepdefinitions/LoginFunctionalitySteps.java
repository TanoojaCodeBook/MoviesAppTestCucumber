package stepdefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginFunctionalitySteps {

    WebDriver driver=Hooks.getDriver();
    LoginPage lp=new LoginPage(driver);
    @When("I entered Username and Password")
    public  void i_entered_username_password(){
        lp.enterUserName("rahul");
        lp.enterPassword("rahul@2021");
    }
    @And("I clicked on Login button")
    public  void i_clicked_on_login_button(){
        lp.clickBtnLogin();
    }
    @Then("I should be redirected to Home page")
    public  void i_shold_be_redirected_to_homepage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qamoviesapp.ccbp.tech/","Login failed");
    }
}
