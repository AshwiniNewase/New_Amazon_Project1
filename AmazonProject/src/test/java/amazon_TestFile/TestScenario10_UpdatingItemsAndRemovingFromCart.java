package amazon_TestFile;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.Product1SearchResultPage;
import amazon_SourceFile.ShoppinCartPage;
import amazon_SourceFile.SignInPage;

//Test updating item quantities and removing items from the cart.

public class TestScenario10_UpdatingItemsAndRemovingFromCart extends LaunchQuitAmazon
{
	
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void updatingitemsandremovingfromcart() throws InterruptedException, EncryptedDocumentException, IOException
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
		ShoppinCartPage shoppincartpage=new ShoppinCartPage(driver);
		shoppincartpage.increaseproduct();
		shoppincartpage.deleteproductfromcart();
	}
}
