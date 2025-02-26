package amazon_TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.SignInPage;

//Check if products can be sorted by relevance, price, rating, etc.
public class TestScenario8_SortedProduct extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void sortedproduct() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetcheddata=new FetchingDataFromExcelsheet();
		fetcheddata.amazon_logindeatils();
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists_signin(driver);
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon1();
		homepage.productsortby();
	}
}
