package stepdefinitions;

import Pages.AccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LogoutFunctionalitySteps {
    WebDriver driver=Hooks.getDriver();
    AccountPage ap=new AccountPage(driver);
    @When("I clicked on the Logout button")
    public void i_clicked_on_the_logout_button() {
       ap.clickBtnLogout();
    }
    @Then("I should be redirected to Login Page")
    public void i_should_be_redirected_to_login_page() {
       new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/login"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qamoviesapp.ccbp.tech/login","Logout failed");
    }

}
