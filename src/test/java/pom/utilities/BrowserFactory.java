package pom.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {

    // Singleton pattern to create a BrowserFactory instance
    static BrowserFactory browserFactory;

    public static BrowserFactory getBrowserFactory() {
        if (browserFactory == null) {
            browserFactory = new BrowserFactory();
        }
        return browserFactory;
    }

    // Automatically creates a browser instance
    ThreadLocal<WebDriver> threadLocal = ThreadLocal.withInitial(() -> {
        WebDriver driver;
        String browserType = System.getProperty("browser", "chrome");

        switch (browserType) {
            case "edge":
                driver = WebDriverManager.edgedriver().avoidShutdownHook().create();
                break;
            case "chrome":
                driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
                break;
            case "firefox":
                driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
                break;
            default:
                throw new RuntimeException("No appropriate browser found");
        }

        driver.manage().window().maximize();
        return driver; // return browser instance only to this class (not to the outside of the class)
    });

    public WebDriver getDriver() {
        return threadLocal.get(); // get driver which is inside the threadLocal
    }
}
