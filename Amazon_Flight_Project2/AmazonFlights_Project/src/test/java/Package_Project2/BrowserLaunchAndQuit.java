package Package_Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.time.Duration;
@Listeners(ITestListenerLogic.class)
public class BrowserLaunchAndQuit extends ITestListenerLogic
{
        @BeforeMethod
        public void launchBrowser()
        {
            driver=new ChromeDriver();
            driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_33");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
    @AfterMethod
    public void quitBrowser()
    {
        driver.quit();
    }
    }
