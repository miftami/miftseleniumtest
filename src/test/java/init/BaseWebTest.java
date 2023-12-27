package init;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseWebTest {

    
    // WebDriver driver;
   public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>(); 
   public ThreadLocal<WebDriverWait> explisitWait = new ThreadLocal<WebDriverWait>();    
    @BeforeMethod
    public void openBrowser(){
    //open browser
        WebDriverManager.firefoxdriver().setup();;
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments();
        driver.set(new FirefoxDriver());
        driver.get().manage().window().maximize();
        driver.get().get("https://www.makemytrip.com/");
        //driver.wait(10);
        explisitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(80)));
        driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //explisitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(10000)));
        
        
    }

    //  @AfterMethod
    public void closeBrowser(){
        driver.get().quit();
    }
}
