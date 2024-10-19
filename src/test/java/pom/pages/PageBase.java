package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    // Following constructor is used to assign a value to the driver
    // instance, when an object from the PageBase class is created
    protected WebDriver driver;
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    // Method to load the EbayHome page
    public EbayHome loadEbayHomePage(String url) {
        driver.get(url);
        return PageFactory.initElements(driver, EbayHome.class); // web page will be assigned to the EbayHome class
    }

    // Method to scroll down a web page
    public void scrollDown(int x, int y) {
        Actions scroll = new Actions(driver);
        scroll.scrollByAmount(x, y).perform();
    }
}
