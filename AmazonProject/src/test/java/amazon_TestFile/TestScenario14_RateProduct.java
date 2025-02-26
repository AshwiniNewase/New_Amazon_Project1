package amazon_TestFile;
//Go to orders page and click on your last ordered product and give 5 star ratings

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.OrderPage;
import amazon_SourceFile.SignInPage;

public class TestScenario14_RateProduct extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void rateproduct() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetchdata=new FetchingDataFromExcelsheet();
		fetchdata.amazon_logindeatils();
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists_signin(driver);
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon1();
		homepage.revieworderedproduct(driver);
		OrderPage orderpage=new OrderPage(driver);
		orderpage.writeyourreview();
	}
}
