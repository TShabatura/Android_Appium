package utils;

import capabilitiesfactory.CapabilitiesFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static AndroidDriver<MobileElement> driver;

    private DriverManager() {
    }

    public static AndroidDriver getDriver() {
        if (driver == null) {
            driver = new AndroidDriver(CapabilitiesFactory.getAppiumServerURL(), CapabilitiesFactory.getCapabilities());
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}
