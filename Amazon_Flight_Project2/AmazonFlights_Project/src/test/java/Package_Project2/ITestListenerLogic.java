package Package_Project2;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ITestListenerLogic implements ITestListener
{
    public static WebDriver driver;
    @Override
    public void onTestSuccess(ITestResult result)
    {
        ITestListener.super.onTestSuccess(result);
        Date d1=new Date();
        String date1=d1.toString();
        String date=(" ")+date1.substring(8,10)+(" ")+ date1.substring(4,7)+date1.substring(23)+(" ")+date1.substring(11,16);
        TakesScreenshot ts= (TakesScreenshot) driver;
        File saurce_loc=ts.getScreenshotAs(OutputType.FILE);
        File dest_loc=new File("/Users/kiranshinde/IdeaProjects/AmazonFlights_Project/PassedTestSC"+date+".png");
        try {
            FileHandler.copy(saurce_loc, dest_loc);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        ITestListener.super.onTestFailure(result);
        Date d1=new Date();
        String date1=d1.toString();
        String date=(" ")+date1.substring(8,10)+(" ")+ date1.substring(4,7)+date1.substring(23)+(" ")+date1.substring(11,16);
        TakesScreenshot ts= (TakesScreenshot) driver;
        File saurce_loc=ts.getScreenshotAs(OutputType.FILE);
        File dest_loc=new File("/Users/kiranshinde/IdeaProjects/AmazonFlights_Project/FailedTestSC"+date+".png");
        try {
            FileHandler.copy(saurce_loc, dest_loc);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
