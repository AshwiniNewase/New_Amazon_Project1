package Package_Project2;

import org.testng.Assert;
import org.testng.annotations.Test;

////Verify login is successful with correct email and password.
public class TestCase1_SuccessfulLogin extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase1()
    {
        SignIn_Page signinpage=new SignIn_Page(driver);
        signinpage.provideUsernameAndPassword();
        Flights_Page flightspage=new Flights_Page(driver);
        Assert.assertEquals(flightspage.get_flight_page_title(), "Flight Bookings on Amazon");

    }
}
