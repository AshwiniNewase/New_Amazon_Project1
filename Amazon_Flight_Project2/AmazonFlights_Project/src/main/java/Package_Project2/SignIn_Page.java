package Package_Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignIn_Page //extends DataFetchingFromExcelsheet
{
    WebDriver driver;
    //Step1
    @FindBy(xpath="//input[@name='email']")
    WebElement username_Textbox;

    @FindBy(xpath="//*[@id=\"continue\"]/span/input")
    WebElement continue_Button;

    @FindBy(xpath="//input[@id='ap_password']")
    WebElement password_Textbox;

    @FindBy(xpath="//input[@id='signInSubmit']")
    WebElement signInSubmit_Button;


    //Step2
    public void provideUsernameAndPassword()
    {
        username_Textbox.sendKeys("newase777@gmail.com");
        continue_Button.click();
        password_Textbox.sendKeys("swamisamartH!2");
        signInSubmit_Button.click();
    }

    public void provide_incorrect_username_or_password()
    {
        username_Textbox.sendKeys("newase777@gmail.com");
        continue_Button.click();
        password_Textbox.sendKeys("swamisamarth!2");
        signInSubmit_Button.click();
    }
    public boolean check_input_textfield_is_displayed()
    {
        boolean b1=username_Textbox.isDisplayed();
        return b1;
    }
    //Step3
    public SignIn_Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

}
