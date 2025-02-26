package amazon_TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.CheckoutPage;
import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.Product1SearchResultPage;
import amazon_SourceFile.SignInPage;

//Check if user is able to select each payment method
public class TestScenario12_SelectEachPaymentMethod extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void selecteachpaymentmethod() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetchdata=new FetchingDataFromExcelsheet();
		fetchdata.amazon_logindeatils();
	HomePage homepage=new HomePage(driver);
	homepage.accountandlists_signin(driver);
	SignInPage signinpage=new SignInPage(driver);
	signinpage.signinamazon1();
	homepage.searchproduct();
	homepage.movecontroltochildbrowser(driver);
	Product1SearchResultPage product1searchresultpage=new Product1SearchResultPage(driver);
	product1searchresultpage.addtocart();
	homepage.proceedtobuy();
	CheckoutPage checkoutpage=new CheckoutPage(driver);
	checkoutpage.changedeliveryaddress();
	checkoutpage.changepaymentmethod();
	
	}
}
