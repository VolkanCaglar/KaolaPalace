package StepDefinitions;

import Pages.AddUserFormPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class _04_AddUserSteps {

AddUserFormPage addUserFormPage= new AddUserFormPage();

    @Given("^click add user button$")
    public void clickAddUserButton() {
        addUserFormPage.clickFunction(addUserFormPage.addUserButton);

    }

    @When("^create username$")
    public void createUsername() {
        addUserFormPage.sendKeysFunction(addUserFormPage.usernameForm,"volkan");
    }

    @When("^create password$")
    public void createPassword() {
        addUserFormPage.sendKeysFunction(addUserFormPage.passwordForm,"Volkan12.");

    }

    @When("^create email$")
    public void createEmail() {
        addUserFormPage.sendKeysFunction(addUserFormPage.emailForm,"volkan@gmail.com");

    }

    @When("^create full name$")
    public void createFullName() {
        addUserFormPage.sendKeysFunction(addUserFormPage.fullnameForm,"volkan caglar");
    }

    @When("^create phone no$")
    public void createPhoneNo() {
        addUserFormPage.sendKeysFunction(addUserFormPage.phoneForn,"4445556789");
    }

    @When("^create driving licence$")
    public void createDrivingLicence() {
        addUserFormPage.sendKeysFunction(addUserFormPage.driverLForm,"123456789");
    }

    @When("^create social security$")
    public void createSocialSecurity() {
        addUserFormPage.sendKeysFunction(addUserFormPage.ssnForm,"123531234");
    }

    @When("^select country on register form$")
    public void selectCountryOnRegisterForm() {

        addUserFormPage.selectByName(addUserFormPage.countryForm,43);
    }

    @When("^create State to register form$")
    public void createStateToRegisterForm() {
    }

    @When("^create Address to register from$")
    public void createAddressToRegisterFrom() {
        addUserFormPage.sendKeysFunction(addUserFormPage.addressForm,"Tulsa OKLAHOMA");

    }

    @When("^select Date of Birth on register from$")
    public void selectDateOfBirthOnRegisterFrom() {
        addUserFormPage.sendKeysFunction(addUserFormPage.birthdayForm,"01/28/1983");

    }

    @When("^create WorkingSector on register from$")
    public void createWorkingSectorOnRegisterFrom() {
        addUserFormPage.sendKeysFunction(addUserFormPage.workingSectorForm,"IT");

    }

    @When("^select Role on register from$")
    public void selectRoleOnRegisterFrom() {
        addUserFormPage.selectByName(addUserFormPage.roleForm,"Customer");

    }

    @When("^select Approved on register from$")
    public void selectApprovedOnRegisterFrom() {
        addUserFormPage.clickFunction(addUserFormPage.approve);
        addUserFormPage.clickFunction(addUserFormPage.submitButton);
    }

    @Then("^success text message should be displayed$")
    public void successTextMessageShouldBeDisplayed() {
        addUserFormPage.verifyElementContainsText(addUserFormPage.successMessageForm,"User was inserted successfully");
        addUserFormPage.clickFunction(addUserFormPage.successMessageFormOK);
    }
}
