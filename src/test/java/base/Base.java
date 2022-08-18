package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    protected static WebDriver driver;
    protected static WebDriverWait wdWait;


    @Before
     public void setup () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdWait = new WebDriverWait(driver, java.time.Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.halooglasi.com/");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
