package Package_Project2;
//Reach til payments page and select credit card option->enter card
//option->make the payment

import org.testng.annotations.Test;

public class TestCase10_MakeThePayment extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase10() throws InterruptedException {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        FlightDetails_Page flightdetailspage=new FlightDetails_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.book_oneway_flight_ticket();
        ReviewBooking_Page reviewbookingpage=new ReviewBooking_Page(driver);
        reviewbookingpage.review_flight_booking();
    }
}
