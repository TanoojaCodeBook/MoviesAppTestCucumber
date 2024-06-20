package stepdefinitions;

import Pages.HomePage;
import Pages.MovieDetailspage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TrendingNowMovieDetailsPageSteps {
    WebDriver driver=Hooks.getDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    MovieDetailspage mp=new MovieDetailspage(driver);
    HomePage hp=new HomePage(driver);

    @When("I click on first Trending now movie")
    public void i_click_on_first_trending_now_movie() {
        hp.clickFirstTrendingNowMovie();
    }
    @Then("I should be redirected to Movie Details page")
    public void i_should_be_redirected_to_movie_details_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("movie-title")));
    }
    @Then("I should view the  movie name element")
    public void i_should_view_the_movie_name_element() {
        Assert.assertTrue(mp.isMovieNameDisplayed(),"Movie name not displaying");
    }
    @Then("I should view the  watch time element")
    public void i_should_view_the_watch_time_element() {
        Assert.assertTrue(mp.isWatchTimeDisplayed(),"Watch time is not displaying");
    }
    @Then("I should view the sensor rating element")
    public void i_should_view_the_sensor_rating_element() {
        Assert.assertTrue(mp.isSensorRatingDisplayed(),"Sensor rating is not displaying");

    }

    @Then("I should view the release year element")
    public void i_should_view_the_release_year_element() {
        Assert.assertTrue(mp.isReleaseYearDisplayed(),"Release year is not displaying");
    }

    @Then("I should view the movie overview element")
    public void i_should_view_the_movie_overview_element() {
       Assert.assertTrue(mp.isMovieOverviewDisplayed(),"Movie overview is not displaying");
    }
    @Then("I should view the play button")
    public void i_should_view_the_play_button() {
        Assert.assertTrue(mp.isBtnPlayDisplayed(),"play button is not displaying");
    }


}
