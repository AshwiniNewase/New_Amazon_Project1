package amazon_TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.Product1SearchResultPage;

//Reach till cart page without login in amazon application
public class TestScenario15_SearchProductWithoutLogin extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void searchproductwithoutlogin() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetchdata=new FetchingDataFromExcelsheet();
		fetchdata.amazon_logindeatils();
		HomePage homepage=new HomePage(driver);
		homepage.searchproduct();
		homepage.movecontroltochildbrowser(driver);
		Product1SearchResultPage product1searchresultpage=new Product1SearchResultPage(driver);
		product1searchresultpage.verifyaddtocart();
		homepage.verifyproductaddedtocart();
	}
}
