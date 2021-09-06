package utils;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenshotMaker {
    public void makeScreenshot(Logger logger) {
        try {
            File screenshot = ((TakesScreenshot) DriverManager.getDriver()).
                    getScreenshotAs(OutputType.FILE);
            String path = "./target/screenshots/" + screenshot.getName();
            FileUtils.copyFile(screenshot, new File(path));
        }catch (IOException e){
            logger.error(e.getMessage());
        }
    }
}
