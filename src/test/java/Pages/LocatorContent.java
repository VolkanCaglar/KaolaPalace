package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorContent extends Parent{


    public LocatorContent()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//*[@id=\"navLogon\"]/a")
    public WebElement logintext;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
    public WebElement loginButton;
}
