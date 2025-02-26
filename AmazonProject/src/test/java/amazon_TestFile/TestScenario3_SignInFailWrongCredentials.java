package amazon_TestFile;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.SignInPage;

public class TestScenario3_SignInFailWrongCredentials extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void signinfail_wrongcredentials() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetcheddata=new FetchingDataFromExcelsheet();
		fetcheddata.amazon_logindeatils();
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists_signin(driver);
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon2();
		homepage.testscenario2assertion(driver);
		
	}
	
}