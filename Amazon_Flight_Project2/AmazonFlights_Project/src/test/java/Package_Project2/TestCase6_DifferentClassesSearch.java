package Package_Project2;
//Validate search results for different classes (economy, business,
//first class)
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6_DifferentClassesSearch extends BrowserLaunchAndQuit
{
    @Test(retryAnalyzer = IRetryAnalyzerLogic.class)
    public void testcase6() throws InterruptedException {
        SignIn_Page signinpage=new SignIn_Page(driver);
        Flights_Page flightspage=new Flights_Page(driver);
        signinpage.provideUsernameAndPassword();
        flightspage.book_oneway_flight_ticket();
        flightspage.choose_different_classes();
        Assert.assertEquals(flightspage.bussiness_class_is_displayed_in_header(), true);

    }
}
