package amazon_TestFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListener_Logic implements ITestListener
{
	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		Date d1=new Date();
		String date1=d1.toString();
		String date=date1.substring(8, 10)+date1.substring(4, 7)+date1.substring(23)+(" ")+date1.substring(11, 16);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source_loc=screenshot.getScreenshotAs(OutputType.FILE);
		File dest_loc=new File("/Users/kiranshinde/eclipse-workspace/AmazonProject/PassedTests"+date+".png");
		try {
			FileHandler.copy(source_loc, dest_loc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		ITestListener.super.onTestFailure(result);
		Date d1=new Date();
		String date1=d1.toString();
		String date=date1.substring(8, 10)+date1.substring(4, 7)+date1.substring(23)+(" ")+date1.substring(11, 16);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source_loc=screenshot.getScreenshotAs(OutputType.FILE);
		File dest_loc=new File("/Users/kiranshinde/eclipse-workspace/AmazonProject/FailedTests"+date+".png");
		try {
			FileHandler.copy(source_loc, dest_loc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
