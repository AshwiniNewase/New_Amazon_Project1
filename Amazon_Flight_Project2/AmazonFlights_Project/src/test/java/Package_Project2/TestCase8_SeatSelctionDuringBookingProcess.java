package Package_Project2;

import org.testng.Assert;
import org.testng.annotations.Test;

//Check for seat selection during the booking process.
public class TestCase8_SeatSelctionDuringBookingProcess extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase8() throws InterruptedException {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.book_oneway_flight_ticket();
        flightspage.seat_selection_during_booking_process();
        FlightDetails_Page flightdetailspage=new FlightDetails_Page(driver);
        Assert.assertEquals(flightdetailspage.is_seat_charge_section_displayed(), true);
    }
}
