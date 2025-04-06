package Package_Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReviewBooking_Page
{
    WebDriver driver;
    WebDriverWait wait;

    //Step1
    @FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
    WebElement TermsAndConditions_Checkbox;

    @FindBy(xpath = "//button[.='Proceed to Payment']")
    WebElement ProceedToPayment_Button;

    //Step2
    public void review_flight_booking()
    {
        if(!(TermsAndConditions_Checkbox.isSelected()))
        {
            TermsAndConditions_Checkbox.click();
        }
       // ProceedToPayment_Button.click();
    }

    //Step3
    public ReviewBooking_Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.wait=wait;
    }
}
