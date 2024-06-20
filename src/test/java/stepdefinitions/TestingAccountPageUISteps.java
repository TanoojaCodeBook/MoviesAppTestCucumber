package stepdefinitions;

import Pages.AccountPage;
import Pages.HeaderPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestingAccountPageUISteps {
    WebDriver driver=Hooks.getDriver();

    AccountPage ap= new AccountPage(driver);
    @Then("I should view the Account heading")
    public void i_should_view_the_account_heading() {
      Assert.assertTrue(ap.isAccountHeadingDisplayed(),"Account heading element is not displaying");

}

    @Then("I should view the Membership element")
    public void i_should_view_the_membership_element() {

        Assert.assertTrue(ap.isMembershipDisplayed(),"Memebership element is not displaying");
    }

    @Then("I should view the Plan details element")
    public void i_should_view_the_plan_details_element() {
        Assert.assertTrue(ap.isPlanDetailsDisplayed(),"Plan details element is not displaying");
    }
    @Then("I should view the Premium element")
    public void i_should_view_the_premium_element() {
        Assert.assertTrue(ap.isPremiumDisplayed(),"Premium element is not displaying");
    }
    @Then("I should view the UltraHD element")
    public void i_should_view_the_ultra_hd_element() {
        Assert.assertTrue(ap.isultraHdDisplayed(),"UltraHD element is not displaying");
    }
    @Then("I should view the Logout button")
    public void i_should_view_the_logout_button() {
        Assert.assertTrue(ap.isLogoutBtnDisplayed(),"Logout button is not displaying");
    }



}
