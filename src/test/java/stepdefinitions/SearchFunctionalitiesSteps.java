package stepdefinitions;

import Pages.HeaderPage;
import Pages.HomePage;
import Pages.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SearchFunctionalitiesSteps {

    WebDriver driver=Hooks.getDriver();
    SearchPage sp=new SearchPage(driver);
    HeaderPage hd=new HeaderPage(driver);
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    @When("I click on the search button element")
    public void i_click_on_the_search_button_element() {
      hd.clickLinkSearchBtn();
    }
    @Then("I should be redirected to serach Page")
    public void i_should_be_redirected_to_serach_page() {
       wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/search"));

    }
    @When("I entered any Movie name")
    public void i_entered_any_movie_name() {
        sp.enterMovieName("Avatar");
    }
    @When("I clicked on search button")
    public void i_clicked_on_search_button() {
      sp.clickBtnSearch();
    }
    @Then("Movies should be displayed")
    public void movies_should_be_displayed() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("link-item")));
        Assert.assertEquals(sp.getTotalMoviesDisplayed(),1,"Movies are displaying");
    }

}
