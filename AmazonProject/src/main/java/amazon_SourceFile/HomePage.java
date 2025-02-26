package amazon_SourceFile;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class HomePage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	
	//Step1
	@FindBy(xpath="(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]") 
	WebElement accountandlistsbeforesignin_hoverover;
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	WebElement accountandlistsaftersignin_hoverover;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement signin_headerbutton;
	
	@FindBy(xpath="(//span[@class='nav-line-1 nav-progressive-content'])[1]")
	WebElement delivertoashwini_text;
	
	@FindBy(xpath="//button[.='Manage Profiles']")
	WebElement manageprofiles_link;
	
	@FindBy(xpath="//a[@class='sc-iGgWBj sc-fHjqPf fErbOa bdPZUm']")   
	WebElement manageprofileview_link;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchproduct_inputtextfield;
	
	@FindBy(xpath="//div[@class='two-pane-results-container']/div/div")
	List<WebElement> searchedproduct_autosuggestionlist;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[7]")
	WebElement brandfilterproduct_checkbox;
	
	@FindBy(xpath="(//div[@class='colorsprite aok-float-left'])[11]")
	WebElement colourfilter_box;
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[4]")
	WebElement firstproduct_link;
	
	@FindBy(xpath="//select[@class='a-native-dropdown a-declarative']")
	WebElement sortby_dropdown;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceedtobuy_button;
	
	@FindBy(xpath="//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	WebElement addtocart_text;
	
	@FindBy(xpath="//span[.='Your Orders']")
	WebElement yourorders_linkinheaderhoverover;
	
	@FindBy(xpath="//i[@class='a-icon a-icon-addon newCouponBadge aok-align-center']")
	WebElement coupon_text;
	
	//Step2
	public void verifycouponcodeisapplicable()
	{
		if(coupon_text.isDisplayed())
		{
			Assert.assertEquals(coupon_text.isDisplayed(), true);
		}
		else
		{
			Reporter.log("coupon is not applicable to this product");
		}
		
	}
	public void yourorders_link(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(yourorders_linkinheaderhoverover));
		yourorders_linkinheaderhoverover.click();
	}
	public void accountandlists_signin(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(accountandlistsbeforesignin_hoverover).perform();
		wait.until(ExpectedConditions.elementToBeClickable(signin_headerbutton));
		signin_headerbutton.click();
	}
	
	public void manageprofile(WebDriver driver) throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(accountandlistsaftersignin_hoverover).perform();
		wait.until(ExpectedConditions.elementToBeClickable(manageprofiles_link));
		manageprofiles_link.click();
		//wait.until(ExpectedConditions.elementToBeClickable(manageprofileview_link));
		Thread.sleep(4000);
		manageprofileview_link.click();
	}
	
	public void revieworderedproduct(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(accountandlistsaftersignin_hoverover).perform();
		wait.until(ExpectedConditions.elementToBeClickable(yourorders_linkinheaderhoverover));
		yourorders_linkinheaderhoverover.click();
	}
	
	public void searchproduct() throws InterruptedException
	{
		searchproduct_inputtextfield.sendKeys("Sshoes");
		//wait.until(ExpectedConditions.visibilityOfAllElements(searchedproduct_autosuggestionlist));
		//int size=searchedproduct_autosuggestionlist.size();
		//System.out.println(size);
		Thread.sleep(1000);
		searchedproduct_autosuggestionlist.get(2).click();
		
	}
	
	
	public void filterproducts() throws InterruptedException
	{
		brandfilterproduct_checkbox.click();
		colourfilter_box.click();
	}

	public void movecontroltochildbrowser(WebDriver driver)
	{
		firstproduct_link.sendKeys(Keys.ENTER);
		Set<String> allbrowsersid=driver.getWindowHandles();
		Iterator<String> iditr=allbrowsersid.iterator();
		String parentid=iditr.next();
		String childid=iditr.next();
		driver.switchTo().window(childid);
	}
	
	public void productsortby() throws InterruptedException
	{
		searchproduct_inputtextfield.sendKeys("Samsung Galaxy M35 5G"+ Keys.ENTER);
		//wait.until(ExpectedConditions.elementToBeClickable(sortby_dropdown));
		Thread.sleep(10000);
		Select sortby_product=new Select(sortby_dropdown);
		sortby_product.selectByIndex(3);
		Thread.sleep(3000);
		sortby_product.selectByVisibleText("Price: Low to High");
	}
	
	public void proceedtobuy()
	{
		proceedtobuy_button.click();
	}
	public void testscenario1assertion(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(delivertoashwini_text));
		Assert.assertEquals(delivertoashwini_text.isDisplayed(), true);
	}
	public void testscenario2assertion(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl.contains("signin"), true);	
	}
	public void verifyproductaddedtocart()
	{
		String addtocarttext=addtocart_text.getText();
		Assert.assertEquals(addtocarttext, "Added to cart");
	}
		
	
	//Step3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
