package Package_Project2;
//Validate the flight information,Fare details,Baggage Rules and
//Cancellation Rules link has the details in the search result page.
import org.testng.annotations.Test;

public class TestCase9_ValidateFlightInfoFlightFareBaggageRuleAndCancellationRules extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase9() throws InterruptedException
    {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        FlightDetails_Page flightdetailspage=new FlightDetails_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.book_oneway_flight_ticket();
        flightspage.click_on_book_flight_button();
        flightdetailspage.validate_flightdetails();

    }
}
