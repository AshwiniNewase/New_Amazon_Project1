package amazon_SourceFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EditProfilePage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//Step1
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement manageprofileedit_icon;
	
	@FindBy(id="editProfileNameInputId")
	WebElement manageprofileeditprofilename_Inputtextfield;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[3]")
	WebElement manageprofileeditprofilename_continuebutton;
	
	@FindBy(xpath="//div[@class='profile-name desktop']")
	WebElement profilename_text;
	
	//Step2
	public void editprofile_name(WebDriver driver) throws InterruptedException
	{
		manageprofileedit_icon.click();
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(manageprofileeditprofilename_Inputtextfield));
		manageprofileeditprofilename_Inputtextfield.clear();
		manageprofileeditprofilename_Inputtextfield.sendKeys("Ashwini S Newase");
		manageprofileeditprofilename_continuebutton.click();
	}
	
	public void assertiontestscenario4(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(profilename_text.getText(), "Ashwini S Newase");
	}
	
	//Step3
	public EditProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
