package amazon_SourceFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends FetchingDataFromExcelsheet
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	
	//Step1
	@FindBy(name="email")
	WebElement username_Inputtextfield;
	
	@FindBy(id="continue")
	WebElement continue_Button;
	
	@FindBy(name="password")
	WebElement password_Inputtextfield;
	
	@FindBy(id="signInSubmit")
	WebElement signIn_Button;
	
	//Step2
	public void signinamazon1() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(username_Inputtextfield));
		username_Inputtextfield.sendKeys(username1);
		wait.until(ExpectedConditions.elementToBeClickable(continue_Button));
		continue_Button.click();
		wait.until(ExpectedConditions.elementToBeClickable(password_Inputtextfield));
		password_Inputtextfield.sendKeys(password1);
		wait.until(ExpectedConditions.elementToBeClickable(signIn_Button));
		signIn_Button.click();
	}
	public void signinamazon2()
	{
		wait.until(ExpectedConditions.elementToBeClickable(username_Inputtextfield));
		username_Inputtextfield.sendKeys(username2);
		wait.until(ExpectedConditions.elementToBeClickable(continue_Button));
		continue_Button.click();
		wait.until(ExpectedConditions.elementToBeClickable(password_Inputtextfield));
		password_Inputtextfield.sendKeys(password2);
		wait.until(ExpectedConditions.elementToBeClickable(signIn_Button));
		signIn_Button.click();
	}
	public void signinamazon3()
	{
		wait.until(ExpectedConditions.elementToBeClickable(username_Inputtextfield));
		username_Inputtextfield.sendKeys(username3);
		wait.until(ExpectedConditions.elementToBeClickable(continue_Button));
		continue_Button.click();
		wait.until(ExpectedConditions.elementToBeClickable(password_Inputtextfield));
		password_Inputtextfield.sendKeys(password3);
		wait.until(ExpectedConditions.elementToBeClickable(signIn_Button));
		signIn_Button.click();
	}
	
	
	//Step3
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
