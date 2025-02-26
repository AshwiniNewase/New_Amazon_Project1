package amazon_TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.SignInPage;

//Check if user is able to apply for coupon code while ordering the product
public class TestScenario13_IfApplicableApplyCouponCode extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void ifapplicableapplycouponcode() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetchdata=new FetchingDataFromExcelsheet();
		fetchdata.amazon_logindeatils();
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists_signin(driver);
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon1();
		homepage.searchproduct();
		homepage.movecontroltochildbrowser(driver);
		homepage.verifycouponcodeisapplicable();
	}
}
