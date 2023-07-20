import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

    WebDriver driver;

    @BeforeEach
    public void setDrivers(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterEach
    public void driverClose(){
        driver.close();
    }
    @Test
    public void secondMethod(){
        driver.navigate().to("https://www.wikipedia.org");
        driver.navigate().to("https://www.nasa.gov");
        driver.navigate().back();

        String wikiTitle = "Wikipedia";
        Assertions.assertEquals(wikiTitle, driver.getTitle(), "The title of the webpage is not " + wikiTitle);

        driver.navigate().forward();
        String nasaTitle = "NASA";
        Assertions.assertEquals(nasaTitle, driver.getTitle(), "The title of the webpage is not " + nasaTitle);
    }
}