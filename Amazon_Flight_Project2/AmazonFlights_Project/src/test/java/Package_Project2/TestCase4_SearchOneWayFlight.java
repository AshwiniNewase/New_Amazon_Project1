package Package_Project2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4_SearchOneWayFlight extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase4() throws InterruptedException
    {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.book_oneway_flight_ticket();
        Assert.assertEquals(flightspage.add_return_section_is_displayed(), true);
    }

}
