package amazon_SourceFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Product1SearchResultPage
{
	WebDriver driver;
	//Step1
	@FindBy(xpath="//span[@class='a-size-large product-title-word-break']")
	WebElement productdetails_section;
	
	@FindBy(xpath="//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]")
	WebElement price_section;
	
	@FindBy(xpath="//*[@id=\"cm_cr_dp_d_rating_histogram\"]/div[1]/h2")
	WebElement review_section;
	
	@FindBy(xpath="//input[@name='submit.add-to-cart']")
	WebElement addtocart_button;
	
	@FindBy(xpath="//a[@href='/cart?ref_=sw_gtc']")
	WebElement gotocart_button;
	
	
	//Step2
	public void productdescription()
	{
		//Assert.assertEquals(productdetails_section.isDisplayed(), true);
		Assert.assertEquals(price_section.isDisplayed(), true);
		Assert.assertEquals(review_section.isDisplayed(), true);	
	}
	
	public void addtocart() throws InterruptedException
	{
		Thread.sleep(7000);
		addtocart_button.click();
		Thread.sleep(3000);
		gotocart_button.click();
	}
	public void verifyaddtocart()
	{
		addtocart_button.click();
	}
	
	public String getproductprice()
	{
		return price_section.getText();
	}
	public String getproductdetails() throws InterruptedException
	{
		
		return productdetails_section.getText();
	}
	
	//Step3
	public Product1SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
