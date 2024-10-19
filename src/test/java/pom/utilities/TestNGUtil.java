package pom.utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// This class will be used to inherit other classes
public class TestNGUtil {
    // We are not creating a new instance here
    // Rather we are going to get the same instance form browserFactory and hold it here
    protected BrowserFactory browserFactory;

    @BeforeMethod
    public void initBrowser() {
        // Call getBrowserFactory method to access the single instance of the BrowserFactory class
        browserFactory = BrowserFactory.getBrowserFactory();
    }

    @AfterMethod
    public void quiteBrowser() {
        // Call the quit method through getDriver() of the browserFactory
        browserFactory.getDriver().quit();
    }
}
