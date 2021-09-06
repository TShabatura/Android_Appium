package pagefactory;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

import java.time.Duration;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void waitForVisibilityOfElement(long timeToWait, WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), timeToWait).until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(long timeToWait, WebElement element) {
        new WebDriverWait(DriverManager.getDriver(), timeToWait).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void swipeUp(int X, int startY, int endY){
        new TouchAction((PerformsTouchActions) DriverManager.getDriver()).press(PointOption.point(X, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(X, endY))
                .release().perform();
    }
}
