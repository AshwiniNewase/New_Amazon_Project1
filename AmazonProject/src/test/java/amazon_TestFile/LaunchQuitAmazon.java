package amazon_TestFile;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
@Listeners(ITestListener_Logic.class)
public class LaunchQuitAmazon extends ITestListener_Logic
{
	@Parameters("browser")
	@BeforeMethod()
	public void launchamazon(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void quitamazon() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}

}