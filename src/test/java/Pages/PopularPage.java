package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PopularPage {

    WebDriver driver;
    public PopularPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//a[@class='link-item']")
List<WebElement> img_popularMovies_list;

    public boolean arePopularImgDisplayed(){

        boolean result=false;
        for(WebElement eachMovieImg: img_popularMovies_list){
            if(eachMovieImg.isDisplayed()){
                result=true;
            }
        }
        return  result;
    }
    public  void clickOnFirstPopularMovie() throws InterruptedException {
        Thread.sleep(5000);
        img_popularMovies_list.get(0).click();
    }
}
