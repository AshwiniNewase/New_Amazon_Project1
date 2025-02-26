package amazon_TestFile;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.Product1SearchResultPage;
import amazon_SourceFile.ShoppinCartPage;
import amazon_SourceFile.SignInPage;

//Verify that items can be added to the shopping cart from product pages.
public class TestScenario9_AddProducttoCart extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void addproducttocart() throws InterruptedException, EncryptedDocumentException, IOException
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
		String ExpectedProductDetails=product1searchresultpage.getproductdetails();
		String ExpectedProductPrice=product1searchresultpage.getproductprice();
		product1searchresultpage.addtocart();
		ShoppinCartPage shoppincartpage=new ShoppinCartPage(driver);
		String ActualProductDetails=shoppincartpage.getproductdetails_cart();
		String ActualProductPrice=shoppincartpage.getproductprice_cart();
		Assert.assertEquals(ActualProductDetails, ExpectedProductDetails, "Product details are not matching");
		Assert.assertEquals(ActualProductPrice, ExpectedProductPrice, "Product price is not matching");
		
	}
}
