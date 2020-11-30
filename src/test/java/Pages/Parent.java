package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;



public class Parent {

    WebDriver driver;
    WebDriverWait wait;
    WebElement myElement;
    List<WebElement> elementList = new ArrayList<>();

    public Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);// eleman clikable olana kadar bekle
        scrollToElement(element); // eleman kadar scroll yap
        element.click();// click yap

    }

    public void sendKeysFunction(WebElement element, String value) {
        //waitUntilVisible(element);// elelman görünüt olana kadar bekle
        scrollToElement(element);// elemana kadar scroll yap
        element.clear();// eleman clear yap
        element.sendKeys(value);// value yi gönder
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {

        if (!element.isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
         }
    }

    public void waiting(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void verifyElementContainsText(WebElement element, String text) {
        // waitUntilVisible(element);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));

        System.out.println(element.getText());
        System.out.println(text);

        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

//    public WebElement selectOptions(List<WebElement> elementList, String country) {
//
//        WebElement elementSelected = null;
//        for (WebElement element : elementList) {
//            if (element.getText().toLowerCase().contains(country.toLowerCase())) {
//                elementSelected = element;
//                break;
//            }
//        }
//        return elementSelected;
 //           }

        public void selectByName(WebElement element, String value) {
            scrollToElement(element);
            Select selectElement = new Select(element);
            selectElement.selectByVisibleText(value);
        }

    public void selectByName(WebElement element, int index) {
        scrollToElement(element);
        Select selectElement = new Select(element);
        selectElement.selectByIndex(index);
    }

    public void robotFunction(int countTab) throws AWTException {
        Robot robot=new Robot();

        for (int i = 0; i <countTab; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    }




