package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KiwiPage {
    public KiwiPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[6]")
    public WebElement ContinueButton;
     //(//*[@class='android.widget.Button'])[4]
    @FindBy(xpath = "//*[@text='Continue as a guest']")
    public WebElement ContinueAsButton;



}
