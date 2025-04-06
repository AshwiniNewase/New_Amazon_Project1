package Package_Project2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home_Page
{
    WebDriver driver;

    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    //Step1
    @FindBy(id="nav-link-accountList")
    WebElement signInAccountList_HoverOver;

    @FindBy(xpath = "(//span[.=\"Sign in\"])[1]")
    WebElement signIn_button;

    @FindBy(xpath="(//span[.='All'])[2]")
    WebElement hamburger_Icon;

    @FindBy(xpath="//div[.='Programs & Features']")
    WebElement programsAndFeatures_Section;

    @FindBy(xpath ="(//a[@class='hmenu-item hmenu-compressed-btn'])[2]")
    WebElement programsAndFeaturesSeeAll_DownArrow;

    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/ul[2]/li[5]/a")
    WebElement flightTickets_Link;




    //Step2
    public void goToSignInPage(WebDriver driver)
    {
        Actions action=new Actions(driver);
        action.moveToElement(signInAccountList_HoverOver).perform();
        //wait.until(ExpectedConditions.elementToBeClickable(signIn_button));
        //js.executeScript("arguments[0].click;",signIn_button);
        //signIn_button.click();
    }

    public void openFlightTickets(WebDriver driver) throws InterruptedException
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        hamburger_Icon.click();
        Point loc1=programsAndFeatures_Section.getLocation();
        int yLoc1=loc1.y;
        js.executeScript("window.scrollBy(0,"+yLoc1+")");
        Point loc2=flightTickets_Link.getLocation();
        int yLoc2=loc2.y;
        js.executeScript("window.scrollBy(0,"+yLoc2+")");
        //wait.until(ExpectedConditions.visibilityOf(programsAndFeaturesSeeAll_DownArrow));
        js.executeScript("arguments[0].click;",programsAndFeaturesSeeAll_DownArrow);
        //wait.until(ExpectedConditions.elementToBeClickable(flightTickets_Link));
        //flightTickets_Link.click();
        Thread.sleep(5000);
        js.executeScript("arguments[0].click;",flightTickets_Link);
        //wait.until(ExpectedConditions.titleContains("Flight Bookings on Amazon"));
        Thread.sleep(5000);
    }

    //Step3
    public Home_Page(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

}
