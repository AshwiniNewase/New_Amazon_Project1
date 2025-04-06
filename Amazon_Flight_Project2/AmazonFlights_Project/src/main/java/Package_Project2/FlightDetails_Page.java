package Package_Project2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class FlightDetails_Page
{
    WebDriver driver;
    WebDriverWait wait;
    //Step1
    @FindBy(xpath="//div[@class='d7b2a52c']")
    WebElement FlightDetails_Section;

    @FindBy(xpath="//div[@class='_4e0ac60f _22c2ff4c eac6651e ad23ce76']")
    WebElement TotalAmount_Section;

    @FindBy(xpath="//div[@class='_7c598c35 ']")
    WebElement BaggageAndCancellationPolicy_Link;

    @FindBy(xpath="(//div[@class='tabListInner'])[1]")
    WebElement Baggage_Section;

    @FindBy(xpath="(//div[@class='tabListInner'])[2]")
    WebElement Cancellation_Section;

    @FindBy(xpath="(//div[@class='_2f6a610f'])[2]")
    WebElement CabbinBaggage_Section;

    @FindBy(xpath="(//div[@class='d61cbc6b'])[2]")
    WebElement CheckInBaggage_Section;

    @FindBy(xpath="//div[@class='_8e778665']")
    WebElement CancellationFareRule_Section;

    @FindBy(xpath="//div[@class='_7445fd99 a3ab9dc9']")
    WebElement SeatCharge_Section;

    //Step2
    public boolean is_seat_charge_section_displayed() {
        boolean b =SeatCharge_Section.isDisplayed();
        return b;
    }
    public void validate_flightdetails()
    {
        String ActualTotalFare=TotalAmount_Section.getText();
        String ExpectedTotalFare="6045";
        Assert.assertEquals(ActualTotalFare, ActualTotalFare.contains(ExpectedTotalFare));
        BaggageAndCancellationPolicy_Link.click();
        if(!(Baggage_Section.isSelected()))
        {
            Baggage_Section.click();
        }
        String ActualCabinBaggage=CabbinBaggage_Section.getText();
        Assert.assertEquals(ActualCabinBaggage, ActualCabinBaggage.contains("7"));

        if(!(Cancellation_Section.isSelected()))
        {
            Cancellation_Section.click();
        }
        String ActualFareRule=CancellationFareRule_Section.getText();
        Assert.assertEquals(ActualFareRule, ActualFareRule.contains("Important Fare Rules"));

    }

    //Step3
    public FlightDetails_Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        this.wait=wait;
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }


}
