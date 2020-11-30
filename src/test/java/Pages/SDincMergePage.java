package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SDincMergePage extends Parent{

    public SDincMergePage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//*[@id=\"messagesDropdown\"]/i")
    public WebElement messageDropDown;

    @FindBy(xpath = "//*[text()='Trimite']")
    public WebElement trimiteSelect;

    @FindBy(xpath = "//*[@id=\"f_ad\"]")
    public WebElement destination;

    @FindBy(xpath = "//input[@name='f_baslik']")
    public WebElement title;

    @FindBy(xpath = "//*[@name='f_mesaj']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@name='submit']")
    public WebElement submitButton;



}
