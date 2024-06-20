package stepdefinitions;

import Pages.HomePage;
import Pages.PopularPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class OriginalMoviesPageUISteps {

    WebDriver driver= Hooks.getDriver();
    PopularPage pp=new PopularPage(driver);

    @When("I click on first Original moive")
    public void i_click_on_first_original_moive() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        pp.clickOnFirstPopularMovie();

    }
}
