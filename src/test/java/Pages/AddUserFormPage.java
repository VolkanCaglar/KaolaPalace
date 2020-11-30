package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserFormPage extends Parent {



    public AddUserFormPage()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='actions']/a/span")
    public WebElement addUserButton;

    @FindBy(xpath = "//*[@id=\"UserName\"]")
    public WebElement usernameForm;

    @FindBy(xpath = "//*[@id=\"txtPassword\"]")
    public WebElement passwordForm ;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    public WebElement emailForm;

    @FindBy(xpath = "//*[@id=\"NameSurname\"]")
    public WebElement fullnameForm;

    @FindBy(xpath = "//*[@id=\"PhoneNo\"]")
    public WebElement phoneForn;

    @FindBy(xpath = "//*[@id=\"SSN\"]")
    public WebElement ssnForm;

    @FindBy(xpath = "//*[@id=\"DrivingLicense\"]")
    public WebElement driverLForm;

    @FindBy(xpath = "//*[@id=\"IDCountry\"]")
    public WebElement countryForm;

    @FindBy(xpath = "//*[@id=\"Address\"]")
    public WebElement addressForm;

    @FindBy(xpath = "//*[@id=\"BirthDate\"]")
    public WebElement birthdayForm;

    @FindBy(xpath = "//*[@id=\"WorkingSector\"]")
    public WebElement workingSectorForm;

    @FindBy(xpath = "//*[@id=\"IDRole\"]")
    public WebElement roleForm;

    @FindBy(xpath = "(//div[@id='uniform-Approved'])[1]")
    public WebElement approve;

    @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
    public WebElement submitButton;


    @FindBy(xpath = "//div[text()='User was inserted successfully']")
    public WebElement successMessageForm;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement successMessageFormOK;


}
