package pom.utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// This class will be used to inherit the Test Cases
// =================================================
public class TestNGUtil {
    // Just a variable
    protected BrowserFactory browserFactory;

    @BeforeMethod
    public void initBrowser() {
        // Call "getBrowserFactory" method from BrowserFactory
        browserFactory = BrowserFactory.getBrowserFactory();
    }

    @AfterMethod
    public void quiteBrowser() {
        // Call "quite" method from BrowserFactory.getDriver()
        browserFactory.getDriver().quit();
    }
}
