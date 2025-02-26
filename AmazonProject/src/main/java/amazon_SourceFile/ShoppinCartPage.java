package amazon_SourceFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShoppinCartPage 
{
	//step1
	@FindBy(xpath="(//span[@class='a-truncate-cut'])[1]")
	WebElement product1incart_title;
	
	@FindBy(xpath="(//span[@class='a-truncate-cut'])[1]")
	WebElement productdetails_section;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement productprice_section;
	
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']")
	WebElement productincrement_icon;
	
	@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[1]")
	WebElement deleteproduct_link;
	
	//step2
	public String getproductdetails_cart()
	{
		return productdetails_section.getText();
	}
	public String getproductprice_cart()
	{
		return productprice_section.getText();
	}
	
	public void increaseproduct() throws InterruptedException
	{
		int count=1;
		while(count<3)
		{
			Thread.sleep(3000);
			productincrement_icon.click();
			count++;
		}
	}
	public void deleteproductfromcart() throws InterruptedException
	{
		Thread.sleep(10000);
		deleteproduct_link.click();
	}
	
	//step3
	public ShoppinCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
