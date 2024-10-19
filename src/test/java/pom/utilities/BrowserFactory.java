package pom.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    static BrowserFactory browserFactory;

    // Singleton pattern for the browserFactory
    public static BrowserFactory getBrowserFactory() {
        if (browserFactory == null) {
            browserFactory = new BrowserFactory();
        }
        return browserFactory;
    }

    // Initialize browser instance
    // withInitial means this runs automatically
    // Generic looks like: Test<T> test = new Test<T>;
    ThreadLocal<WebDriver> threadLocal = ThreadLocal.withInitial(() -> {
        WebDriver driver;
        String browserType = System.getProperty("browser", "edge");

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
        return driver; // this is returning only to the class (not to outside the class)
    });

    public WebDriver getDriver() {
        return threadLocal.get(); // get method of the threadLocal to access the browser instance
    }
}
