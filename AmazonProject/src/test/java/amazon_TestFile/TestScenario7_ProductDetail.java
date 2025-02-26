package amazon_TestFile;
//Ensure that the product detail page displays all necessary information (price, reviews, description)

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.Product1SearchResultPage;
import amazon_SourceFile.SignInPage;

public class TestScenario7_ProductDetail extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void productdetailpage() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetcheddata=new FetchingDataFromExcelsheet();
		fetcheddata.amazon_logindeatils();
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists_signin(driver);
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon1();
		homepage.searchproduct();
		homepage.movecontroltochildbrowser(driver);
		Product1SearchResultPage product1searchresultpage=new Product1SearchResultPage(driver);
		product1searchresultpage.productdescription();
	}
	
	
}
