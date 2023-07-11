package utilitise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ReusableMethods {
    private final WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public  String url = ("https://automationexercise.com/");

    public void threadWait (int second){
        try {
            Thread.sleep(second * 1000);
        }catch (InterruptedException e){
            throw new RuntimeException();
        }
    }

    public void isDisplayed(WebElement displayElement){
        wait.until(ExpectedConditions.visibilityOf(displayElement));
        Assert.assertTrue(displayElement.isDisplayed(), "Is not visibly");
        System.out.println(displayElement.getText());
    }

    public void clickFunction(WebElement ClickElement){
        wait.until(ExpectedConditions.visibilityOf(ClickElement));
        ClickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }
}
