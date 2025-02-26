package amazon_SourceFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OrderPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
	//Step1
	@FindBy(xpath="//a[@id='a-autoid-7-announce']")
	WebElement writeyourreview_button;
	
	@FindBy(xpath="(//img[@class='ryp__review-stars__star ryp__star ryp__star--large'])[5]")
	WebElement fivestartclick;
	
	@FindBy(xpath="//span[.='Clear']")
	WebElement clearreview_text;
	//Step2
	public void writeyourreview()
	{
		writeyourreview_button.click();
		fivestartclick.click();
		wait.until(ExpectedConditions.visibilityOf(clearreview_text));
		Assert.assertEquals(clearreview_text.isDisplayed(), true);
	}
	//Step3
	public OrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
