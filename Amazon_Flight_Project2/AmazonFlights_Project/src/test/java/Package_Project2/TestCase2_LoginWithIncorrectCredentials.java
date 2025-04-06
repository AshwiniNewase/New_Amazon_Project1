package Package_Project2;

import org.testng.Assert;
import org.testng.annotations.Test;

//Test login with invalid credentials
public class TestCase2_LoginWithIncorrectCredentials extends BrowserLaunchAndQuit
{

    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase2()
    {
        SignIn_Page signinpage=new SignIn_Page(driver);
        signinpage.provide_incorrect_username_or_password();
        Flights_Page flightspage=new Flights_Page(driver);
        Assert.assertNotEquals(flightspage.get_flight_page_title(), "Flight Bookings on Amazon");
    }
}
