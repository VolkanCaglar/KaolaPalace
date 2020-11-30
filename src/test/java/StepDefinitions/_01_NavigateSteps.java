package StepDefinitions;

import Utilities.Driver;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class _01_NavigateSteps {

    WebDriver driver;

    @Given("^navigate to koala$")
    public void navigateToKoala() {
        driver = Driver.getDriver();
        driver.get("https://www.kaolapalace.com/");
        driver.manage().window().maximize();

    }
}
