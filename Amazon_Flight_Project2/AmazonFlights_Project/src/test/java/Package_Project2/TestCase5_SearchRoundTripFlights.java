package Package_Project2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5_SearchRoundTripFlights extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase5() throws InterruptedException {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.book_roundtrip_flight_ticket();
        Assert.assertEquals(flightspage.returnjourney_path_is_displayed(),true);
    }
}
