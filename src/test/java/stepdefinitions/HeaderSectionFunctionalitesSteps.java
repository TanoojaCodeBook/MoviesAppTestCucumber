package stepdefinitions;

import Pages.HeaderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HeaderSectionFunctionalitesSteps {
    WebDriver driver=Hooks.getDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    HeaderPage hd=new HeaderPage(driver);

    @When("I clicked on the Popular link")
    public void i_clicked_on_the_popular_link() {
        hd.clickLinkPopular();

    }

    @Then("I should be redirected to Popular page")
    public void i_should_be_redirected_to_popular_page() {
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/popular"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qamoviesapp.ccbp.tech/popular","Navigation to the Popular Page failed");
    }


    @When("I clicked on Popular link")
    public void i_clicked_on_popular_link() {
       hd.clickLinkPopular();
       wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/popular"));
    }
    @When("I clicked on Home link")
    public void i_clicked_on_home_link() {
        hd.clickLinkHome();
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/"));
    }
    @When("I clicked on Profile link")
    public void i_clicked_on_profile_link() {
        hd.clickLinkProfile();
    }
    @Then("I should be redirected to accounts page")
    public void i_should_be_redirected_to_accounts_page() {
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/account"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://qamoviesapp.ccbp.tech/account","Navigation to the Accounts page failed");
    }


}
