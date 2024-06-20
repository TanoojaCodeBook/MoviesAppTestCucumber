package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
  public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(className = "movies-list-heading")
    List<WebElement> moviesHeadingsList_eles;

    @FindBy(className = "home-movie-play-button")
    WebElement btn_play;

    @FindBy(xpath = "//h1[contains(text(),'Trending Now')]/following-sibling::div/descendant::img")
    List<WebElement> trendingNowMoviesList_eles;

    @FindBy(xpath = "//h1[contains(text(),'Originals')]/following-sibling::div/descendant::img")
    List<WebElement> originalMoviesList_eles;

    @FindBy(className = "contact-us-paragraph")
    WebElement textContactus_ele;




    public WebElement getMoviesHeading(int index){
        return moviesHeadingsList_eles.get(index);
    }
    public boolean isPalyBtnDisplayed(){
        return btn_play.isDisplayed();
    }

    public boolean areTrendingNowMoviesDisplayed(){
        boolean result=false;
        for(WebElement eachMovie:trendingNowMoviesList_eles){
            if(eachMovie.isDisplayed()){
                result=true;
            }
        }
        return result;

    }


    public boolean areOriginalMoviesDisplayed(){
        boolean result=false;
        for(WebElement eachMovie: originalMoviesList_eles){
            if(eachMovie.isDisplayed()){
                result=true;
            }
        }
        return result;
    }

    public int countTrendingNowMovies(){
        return trendingNowMoviesList_eles.size();
    }
    public  int countOriginalMovies(){
        return originalMoviesList_eles.size();
    }

    public String getContactUstext(){
        return  textContactus_ele.getText();
    }

   public  void clickFirstTrendingNowMovie(){
        trendingNowMoviesList_eles.get(0).click();

   }
}
