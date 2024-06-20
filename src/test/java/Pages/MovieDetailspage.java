package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MovieDetailspage {
    WebDriver driver;
    public MovieDetailspage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "movie-title")
    WebElement text_movieName;
    @FindBy(className = "watch-time")
    WebElement text_wachtime;
    @FindBy(className = "sensor-rating")
    WebElement text_sensorRating;
    @FindBy(className = "release-year")
    WebElement text_releaseYear;
    @FindBy(className = "movie-overview")
    WebElement text_movieOverview;
    @FindBy(className = "play-button")
    WebElement btn_play;

    public boolean isMovieNameDisplayed(){
        return text_movieName.isDisplayed();
    }

    public  boolean isWatchTimeDisplayed(){
        return text_wachtime.isDisplayed();
    }

    public  boolean isSensorRatingDisplayed(){
        return  text_sensorRating.isDisplayed();
    }
    public  boolean isReleaseYearDisplayed(){
        return text_releaseYear.isDisplayed();
    }

    public  boolean isMovieOverviewDisplayed(){
        return text_movieOverview.isDisplayed();
    }

    public  boolean isBtnPlayDisplayed(){
        return btn_play.isDisplayed();
    }

}
