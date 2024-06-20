package stepdefinitions;

import Pages.PopularPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestingPopularPageUISteps {

    WebDriver driver=Hooks.getDriver();
    PopularPage pp=new PopularPage(driver);
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    @Then("I will be redirected to Popular page")
    public void i_will_be_redirected_to_popular_page() {
        wait.until(ExpectedConditions.urlToBe("https://qamoviesapp.ccbp.tech/popular"));
    }
    @Then("Popular movies should be displayed")
    public void popular_movies_should_be_displayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='link-item']")));
        Assert.assertTrue(pp.arePopularImgDisplayed(),"Popular movies are not displaying");
    }


}
