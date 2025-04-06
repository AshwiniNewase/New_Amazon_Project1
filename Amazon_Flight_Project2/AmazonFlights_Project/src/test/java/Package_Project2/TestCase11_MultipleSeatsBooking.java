package Package_Project2;

import org.testng.Assert;
import org.testng.annotations.Test;

//validate booking multiple seats in single go
public class TestCase11_MultipleSeatsBooking extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase11() throws InterruptedException {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.book_oneway_flight_ticket();
        flightspage.select_number_of_travellers();
        Assert.assertEquals(flightspage.get_number_of_travellers(), "03 Travellers, Economy");
    }
}
