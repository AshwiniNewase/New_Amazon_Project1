package Package_Project2;

import org.testng.Assert;
import org.testng.annotations.Test;

//Test for multi-city flight search
public class TestCase7_MultiCityFlightSearch extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase7() throws InterruptedException {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.two_plus_stop_filter();
        Assert.assertEquals(flightspage.is_two_stop_filter_button_enabled(), true);
    }

}
