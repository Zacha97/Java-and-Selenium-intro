import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    WebDriver driver;
    @BeforeEach
    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1275,730)); // set width and height of browser
    }

    @AfterEach
    public void driverQuit(){
  //      driver.quit();
  //        driver.close();
    }

    @Test
    public void getMethod(){
        driver.get("http://www.google.pl");
    }

    @Test
    public void navigate(){
        driver.navigate().to("https://www.google.com");
        driver.navigate().to("https://www.nasa.gov");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}