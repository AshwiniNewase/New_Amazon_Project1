package Package_Project2;

import org.testng.Assert;
import org.testng.annotations.Test;

//Login to page,search the flight and logout
public class TestCase3_LoginSerachFlightLogout extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase3() throws InterruptedException
    {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.book_oneway_flight_ticket();
        flightspage.sign_out(driver);
        Assert.assertEquals(signinpage.check_input_textfield_is_displayed(),true);
    }
}

