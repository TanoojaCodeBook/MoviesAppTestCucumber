package stepdefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePageSteps {
    WebDriver driver=Hooks.getDriver();
    HomePage hp=new HomePage(driver);
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

@Then("Heading text of each section should be \"Trending Now\" and \"Originals\"")
    public  void heading_text_of_each_section_should_be_trending_now_and_originals(){

    Assert.assertEquals( hp.getMoviesHeading(0).getText(),"Trending Now","Mismatch in text Trending Now");
    Assert.assertEquals(hp.getMoviesHeading(1).getText(),"Originals","Mismatch in text Originals");

}



@Then("Play button should be displayed")
    public  void play_button_should_be_displayed(){
    Assert.assertTrue(hp.isPalyBtnDisplayed(),"play button is not displayed");
}

@Then("Trending Now movies and Orginials movies should be displayed and it's count should be 10")
    public  void trendingnow_movies_and_originals_movies_should_be_displayed_and_its_count_shouldbe_10(){
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[contains(text(),'Trending Now')]/following-sibling::div/descendant::img")));
    Assert.assertTrue(hp.areTrendingNowMoviesDisplayed(),"Trending now are not displayed");
    Assert.assertEquals(hp.countTrendingNowMovies(),10,"mismatch in count of total trending now movies");
    Assert.assertTrue(hp.areOriginalMoviesDisplayed(),"Originals movies are not displaying");
    Assert.assertEquals(hp.countOriginalMovies(),10,"mismatch in count of total originals movies");
}

@Then("The text of Contact us section should be \"Contact Us\"")
    public  void the_text_of_contact_us_section_should_be_contactus(){
    Assert.assertEquals(hp.getContactUstext(),"Contact Us","mismatch in text Contacu Us");
}
}
