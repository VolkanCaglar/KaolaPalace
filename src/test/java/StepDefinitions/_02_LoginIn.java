package StepDefinitions;

import Pages.LocatorContent;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

public class _02_LoginIn {


    LocatorContent locatorContent=new LocatorContent();

    @Given("^text username to username$")
    public void textUsernameToUsername() {
        locatorContent.clickFunction(locatorContent.logintext);
        locatorContent.sendKeysFunction(locatorContent.username,"manager3")
        ;
    }

    @When("^text password to password$")
    public void textPasswordToPassword() {
        locatorContent.sendKeysFunction(locatorContent.password,"M1anager3!");

    }

    @Then("^click to login$")
    public void clickToLogin() {
        locatorContent.clickFunction(locatorContent.loginButton);

    }
}
