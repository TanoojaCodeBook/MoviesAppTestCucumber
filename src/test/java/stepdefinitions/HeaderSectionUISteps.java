package stepdefinitions;

import Pages.HeaderPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HeaderSectionUISteps {

    WebDriver driver=Hooks.getDriver();
    HeaderPage hd=new HeaderPage(driver);
    @Then("Website Logo should be displayed")
    public void website_logo_should_be_displayed() {
        Assert.assertTrue(hd.isMoviesLogoDisplayed(),"Logo is not displaying");
    }

    @Then("The link Home should be displayed")
    public void the_link_home_should_be_displayed() {
        Assert.assertTrue(hd.isLinkHomeDisplayed(),"Link Home is not displaying");
    }

    @Then("The link Popular should be displayed")
    public void the_link_popular_should_be_displayed() {
        Assert.assertTrue(hd.isLinkPopularDisplayed(),"Link Popular is not displaying");
    }
    @Then("The link Search button should be displayed")
    public void the_link_search_button_should_be_displayed() {
        Assert.assertTrue(hd.isLinkSearchbtnDisplayed(),"Link search is not displaying");
    }

    @Then("The Link Profile should be displayed")
    public void the_link_profile_should_be_displayed() {
        Assert.assertTrue(hd.isLinkProfileDisplayed(),"Link profile is not displaying");
    }

    @Then("The text of Home element should be {string}")
    public void the_text_of_home_element_should_be(String string) {
        Assert.assertEquals(hd.getLinkHomeText(),"Home","mismatch in text Home");
    }

    @Then("The text of Popular element should be {string}")
    public void the_text_of_popular_element_should_be(String string) {
        Assert.assertEquals(hd.getLinkPopularText(),"Popular","mismatch in text popular");
    }

}
