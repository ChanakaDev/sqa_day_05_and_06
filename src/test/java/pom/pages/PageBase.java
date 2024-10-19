package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

// This class will be used to inherit the Page Objects
// ===================================================
public class PageBase {

    // When inheriting a Page Object from "PageBase"
    // Call the constructor to access the driver
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

    // Method to hover an element on a web page
    public void hover(WebElement element) {
        Actions hover = new Actions(driver);
        hover.moveToElement(element);
    }
}
