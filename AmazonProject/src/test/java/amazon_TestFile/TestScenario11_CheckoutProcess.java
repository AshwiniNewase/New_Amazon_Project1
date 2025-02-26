package amazon_TestFile;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon_SourceFile.CheckoutPage;
import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.Product1SearchResultPage;
import amazon_SourceFile.SignInPage;

//Validate the entire checkout process, including address selection, payment method selection, and order review
public class TestScenario11_CheckoutProcess extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void checkoutprocess() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetcheddata=new FetchingDataFromExcelsheet();
		fetcheddata.amazon_logindeatils();
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists_signin(driver);
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon3();
		homepage.searchproduct();
		homepage.movecontroltochildbrowser(driver);
		Product1SearchResultPage product1searchresultpage=new Product1SearchResultPage(driver);
		String ExpectedProductDetails=product1searchresultpage.getproductdetails();
		product1searchresultpage.addtocart();
		homepage.proceedtobuy();
		CheckoutPage checkoutpage=new CheckoutPage(driver);
		checkoutpage.changedeliveryaddress();
		checkoutpage.changepaymentmethod();
		checkoutpage.reviewordermethod();
		String reviewproduct=checkoutpage.reviewordermethod();
		Assert.assertEquals(reviewproduct,ExpectedProductDetails);
	}
}
