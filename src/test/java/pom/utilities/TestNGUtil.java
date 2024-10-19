package pom.utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGUtil {
    protected BrowserFactory browserFactory;

    @BeforeMethod
    public void initBrowser() {
        browserFactory = BrowserFactory.getBrowserFactory();
    }

    @AfterMethod
    public void quiteBrowser() {
        browserFactory.getDriver().quit();
    }
}
