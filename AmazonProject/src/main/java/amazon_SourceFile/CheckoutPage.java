package amazon_SourceFile;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//Step1
	@FindBy(xpath="//a[@class='a-link-normal expand-panel-button celwidget']")
	WebElement changedeliveryaddress_link;
	
	@FindBy(xpath="//input[@type='radio']")
	WebElement changeaddress_radiobutton;
	
	@FindBy(xpath="//a[@id='add-new-address-popover-link']")
	WebElement addnewaddresslink;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[7]")
	WebElement usethiaddress_button;
	
	@FindBy(xpath="//a[@class='a-link-normal expand-panel-button expand-collapsed-panel-trigger']")
	WebElement changepaymentmethod_link;
	
	//@FindBy(xpath="(//input[@id='pp-JH8IrL-177' or @name='ppw-instrumentRowSelection'])[4]")
	//WebElement cashondelivery_radiobutton;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[1]") 
	WebElement usethispaymentmethod_button;
	
	@FindBy(xpath="//a[@class='a-link-normal expand-panel-button']")
	WebElement revieworder_link;
	
	@FindBy(xpath="//div[@class='a-column a-span10 a-span-last']")
	WebElement producttobeordered;
	
	@FindBy(css="input#pp-SkdXhB-108")
	WebElement amazonpaybalance_radiobutton;
	
	@FindBy(css="input#pp-U1p3Gz-115[name='ppw-instrumentRowSelection']")
	WebElement bankofmaharashtra_radiobutton;
	
	@FindBy(css="input#pp-SkdXhB-134")
	WebElement upi_radiobutton;
	
	@FindBy(css="input#pp-SkdXhB-141")
	WebElement creditanddebitcard_radiobutton;
	
	@FindBy(css="input#pp-SkdXhB-147")
	WebElement netbanking_radiobutton;
	
	@FindBy(css="input#pp-SkdXhB-167")
	WebElement otherupi_radiobutton;
	
	@FindBy(css="input#pp-uscU6h-172")
	WebElement emi_radiobutton;
	
	@FindBy(xpath="//input[@id='pp-U1p3Gz-177']")
	WebElement cashondelivery_radiobutton;
	
	//Step2
	public void changedeliveryaddress() throws InterruptedException
	{
		changedeliveryaddress_link.click();
		Thread.sleep(5000);
		changeaddress_radiobutton.click();
		Thread.sleep(2000);
		usethiaddress_button.click();
	}
	public void changepaymentmethod() throws InterruptedException
	{
		changepaymentmethod_link.click();
		Thread.sleep(3000);
		if(amazonpaybalance_radiobutton.isDisplayed())
		{
			amazonpaybalance_radiobutton.click();
		}
		Thread.sleep(3000);
		if(bankofmaharashtra_radiobutton.isDisplayed())
		{
			bankofmaharashtra_radiobutton.click();
		}
		Thread.sleep(3000);
		if(upi_radiobutton.isDisplayed())
		{
			upi_radiobutton.click();
		}
		Thread.sleep(3000);
		if(creditanddebitcard_radiobutton.isDisplayed())
		{
			creditanddebitcard_radiobutton.click();
		}
		Thread.sleep(3000);
		{
			netbanking_radiobutton.click();
		}
		Thread.sleep(3000);
		if(otherupi_radiobutton.isDisplayed())
		{
			otherupi_radiobutton.click();
		}
		Thread.sleep(3000);
		if(cashondelivery_radiobutton.isDisplayed())
		{
			cashondelivery_radiobutton.click();
		}
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(usethispaymentmethod_button));
		usethispaymentmethod_button.click();
		Thread.sleep(3000);
	}
	
	public String reviewordermethod() throws InterruptedException
	{
		Thread.sleep(5000);
		revieworder_link.click();
		String reviewedproduct=producttobeordered.getText();
		return reviewedproduct;
	}
	
	//Step3
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
