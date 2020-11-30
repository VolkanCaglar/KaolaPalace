package StepDefinitions;

import Pages.SDincMergePage;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class _05_MailMergeScenarioQutline {

    SDincMergePage sDincMergePage=new SDincMergePage();
    WebDriver driver;

    @Given("^navigate to sdinc$")
    public void navigateToSdinc() {
        driver= Driver.getDriver();
        //driver.manage().deleteAllCookies();
        driver.get("http://www.sdinc.xyz/meet/login.php");
        driver.manage().window().maximize();

    }

    @Given("^enter username as \"([^\"]*)\"$")
    public void enterUsernameAs(String username){
        sDincMergePage.sendKeysFunction(sDincMergePage.username,username);



    }

    @When("^enter password name as \"([^\"]*)\"$")
    public void enterPasswordNameAs(String password) {
        sDincMergePage.sendKeysFunction(sDincMergePage.password,password);

    }

    @Then("^click to autentifica$")
    public void clickToAutentifica() {
        sDincMergePage.clickFunction(sDincMergePage.submit);

    }

    @When("^click to message box and click trimite$")
    public void clickToMessageBoxAndClickTrimite() throws InterruptedException {
        Thread.sleep(1000);
        sDincMergePage.clickFunction(sDincMergePage.messageDropDown);
        sDincMergePage.clickFunction(sDincMergePage.trimiteSelect);

    }

    @When("^select \"([^\"]*)\"$")
    public void select(String destination){
       // sDincMergePage.selectByName(sDincMergePage.destination,destination);

    }

    @When("^enter \"([^\"]*)\"$")
    public void enter(String title)  {
        sDincMergePage.sendKeysFunction(sDincMergePage.title,title);

    }

    @When("^enter text message \"([^\"]*)\"$")
    public void enterTextMessage(String message) {
        sDincMergePage.sendKeysFunction(sDincMergePage.messageBox,message);
        sDincMergePage.waiting(1000);

    }
    @When("^click to trimite button$")
    public void clickToTrimiteButton() throws AWTException {
        sDincMergePage.clickFunction(sDincMergePage.submitButton);
        sDincMergePage.waiting(1000);
        sDincMergePage.robotFunction(2);
    }
}
