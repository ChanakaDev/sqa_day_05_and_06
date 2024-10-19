package pom.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    static BrowserFactory browserFactory;

    public static BrowserFactory getBrowserFactory() {
        if (browserFactory == null) {
            browserFactory = new BrowserFactory();
        }
        return browserFactory;
    }

    // Initialize browser instance
    // withInitial means this runs automatically
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
        return driver;
    });

    public WebDriver getDriver() {
        return threadLocal.get();
    }

}
