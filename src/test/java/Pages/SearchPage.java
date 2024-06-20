package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    WebDriver driver;
    public SearchPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);
}


@FindBy(className = "search-input-field")
    WebElement input_search;
@FindBy(className = "search-button")
    WebElement btn_serch;
@FindBy(className = "link-item")
    List<WebElement> img_search_result;

public  void enterMovieName(String movieName){
    input_search.sendKeys(movieName);
}
public  void clickBtnSearch(){
    btn_serch.click();
}

public  int getTotalMoviesDisplayed(){
    return img_search_result.size();
}

}
