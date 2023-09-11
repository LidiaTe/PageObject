package pages;

import components.CourseCard;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage {

    @FindBy(css = ".sc-gg1znw-0 > div")
    private List<WebElement> courses;
    private List<CourseCard> cards = new ArrayList<>();

    public MainPage(WebDriver driver) {
        super(driver);
        for(WebElement element : courses)
            cards.add(new CourseCard(element));
        url = "http://otus.ru";
    }

    public List<CourseCard> getCards(){
        return cards;
    }
}
