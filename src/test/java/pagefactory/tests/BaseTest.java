package pagefactory.tests;

import org.testng.annotations.AfterSuite;
import utils.DriverManager;

public class BaseTest {

    @AfterSuite
    public void quitDriver(){
        DriverManager.quitDriver();
    }
}
