package amazon_TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import amazon_SourceFile.EditProfilePage;
import amazon_SourceFile.FetchingDataFromExcelsheet;
import amazon_SourceFile.HomePage;
import amazon_SourceFile.SignInPage;

//Check if a user can successfully edit their profile information
public class TestScenario4_SuccessfullyEditProfile extends LaunchQuitAmazon
{
	@Test(retryAnalyzer=IRetryAnalyzer_Logic.class)
	public void successfullyeditprofile() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FetchingDataFromExcelsheet fetcheddata=new FetchingDataFromExcelsheet();
		fetcheddata.amazon_logindeatils();
		HomePage homepage=new HomePage(driver);
		homepage.accountandlists_signin(driver);
		SignInPage signinpage=new SignInPage(driver);
		signinpage.signinamazon1();
		homepage.manageprofile(driver);
		EditProfilePage editprofilepage=new EditProfilePage(driver);
		editprofilepage.editprofile_name(driver);
		editprofilepage.assertiontestscenario4(driver);
	}
}