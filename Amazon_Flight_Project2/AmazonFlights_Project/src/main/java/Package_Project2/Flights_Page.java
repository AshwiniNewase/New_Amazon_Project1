package Package_Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights_Page
{
    WebDriver driver;

    //Step1
    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[1]/div/label/i")
    WebElement OneWay_Radiobutton;

    @FindBy(xpath="//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
    WebElement Search_Button;

    @FindBy(xpath="(//i[@class='_4b539ab8'])[2]")
    WebElement RoundTrip_Radiobutton;

    @FindBy(xpath="//div[@class='sizeMedium a8cdd5cb']")
    WebElement ChooseNumberofTravellersAndClasses_Section;

    @FindBy(xpath="(//i[@class='_4b539ab8'])[1]")
    WebElement EconomyClass_Radiobutton;

    @FindBy(xpath="(//i[@class='_4b539ab8'])[2]")
    WebElement PremiumEconomyClass_Radiobutton;

    @FindBy(xpath="(//i[@class='_4b539ab8'])[3]")
    WebElement BussinessClass_Radiobutton;

    @FindBy(xpath="(//div[@class='_3cb848bf'])[1]")
    WebElement SelectDepartCity_Section;

    @FindBy(xpath="(//div[@class='_3cb848bf'])[2]")
    WebElement SelectArrivalCity_Section;

    @FindBy(xpath="//button[.='2+ Stops']")
    WebElement TwoPlusStopFilter_Button;

    @FindBy(xpath="(//button[.='Book'])[1]")
    WebElement BookFlight_Button;

    @FindBy(xpath="//button[.='Proceed to traveller details']")
    WebElement ProceedToTravellerDetails_Button;

    @FindBy(xpath="//button[.='Proceed to seat selection']")
    WebElement ProcessToSeatSelection_Button;

    @FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
    WebElement SelectOneTraveller_Checkbox;

    @FindBy(xpath="(//div[@class='_0d462540  _1b6b90e5  '])[1]")
    WebElement FirstSeat_Icon;

    @FindBy(xpath="(//button[.='2'])[1]")
    WebElement NumberofAdults_Button;

    @FindBy(xpath="(//button[.='1'])[2]")
    WebElement NumberofChildren_Button;

    @FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
    WebElement AccountAndList_HoverOver;

    @FindBy(xpath="//span[.='Sign Out']")
    WebElement SignOut_Link;

    @FindBy(xpath = "//span[.='Add Return']")
    WebElement AddReturn_Section;

    @FindBy(xpath="(//div[@class='_285a55dc'])[2]")
    WebElement ReturnPath_Section;

    @FindBy(xpath="(//span[.='Business'])[1]")
    WebElement BussinessClass_Header;

    //Step2
    public String get_number_of_travellers()
    {
       String numOfTravellers= ChooseNumberofTravellersAndClasses_Section.getText();
       return numOfTravellers;
    }
    public boolean is_two_stop_filter_button_enabled()
    {
        boolean b=TwoPlusStopFilter_Button.isEnabled();
        return b;
    }
    public boolean bussiness_class_is_displayed_in_header()
    {
        boolean b3=BussinessClass_Header.isDisplayed();
        return b3;
    }
    public boolean returnjourney_path_is_displayed()
    {
        boolean b2=ReturnPath_Section.isDisplayed();
        return b2;
    }
    public String get_flight_page_title()
    {
        String page_title=driver.getTitle();
        return page_title;
    }

    public boolean add_return_section_is_displayed()
    {
        boolean b1=AddReturn_Section.isDisplayed();
        return b1;
    }

    public void book_oneway_flight_ticket() throws InterruptedException {

        if(OneWay_Radiobutton.isSelected()==false)
        {
            OneWay_Radiobutton.click();
        }
        Search_Button.click();
        Thread.sleep(3000);
    }

    public void book_roundtrip_flight_ticket() throws InterruptedException {
        if(RoundTrip_Radiobutton.isSelected()==false)
        {
            RoundTrip_Radiobutton.click();
        }
        Search_Button.click();
        Thread.sleep(3000);
    }

    public void choose_different_classes() throws InterruptedException {
        ChooseNumberofTravellersAndClasses_Section.click();
        EconomyClass_Radiobutton.click();
        Search_Button.click();
        Thread.sleep(3000);
        ChooseNumberofTravellersAndClasses_Section.click();
        PremiumEconomyClass_Radiobutton.click();
        Search_Button.click();
        Thread.sleep(3000);
        ChooseNumberofTravellersAndClasses_Section.click();
        BussinessClass_Radiobutton.click();
        Search_Button.click();
        Thread.sleep(3000);
    }

    public void choose_flying_cities()
    {
        SelectDepartCity_Section.click();
        SelectDepartCity_Section.sendKeys("Delhi");
        SelectArrivalCity_Section.click();
        SelectArrivalCity_Section.sendKeys("Kolkata");

    }

    public void two_plus_stop_filter() throws InterruptedException
    {
        Search_Button.click();
        Thread.sleep(3000);
        TwoPlusStopFilter_Button.click();
    }

    public void seat_selection_during_booking_process()
    {
        BookFlight_Button.click();
        ProceedToTravellerDetails_Button.click();
        if(!(SelectOneTraveller_Checkbox.isSelected()))
        {
            SelectOneTraveller_Checkbox.click();
        }
        ProcessToSeatSelection_Button.click();
        FirstSeat_Icon.click();

    }
    public void click_on_book_flight_button()
    {
        BookFlight_Button.click();
    }

    public void select_number_of_travellers()
    {
        ChooseNumberofTravellersAndClasses_Section.click();
        NumberofAdults_Button.click();
        NumberofChildren_Button.click();
    }

    public void sign_out(WebDriver driver) throws InterruptedException {
        Actions action=new Actions(driver);
        action.moveToElement(AccountAndList_HoverOver).perform();
        SignOut_Link.click();
        Thread.sleep(3000);
    }
    //Step3
    public Flights_Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}

