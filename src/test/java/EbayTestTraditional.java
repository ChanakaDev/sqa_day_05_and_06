import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class EbayTestTraditional {

    WebDriver driver;

    @BeforeTest
    public void initBrowser() {
        driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");
    }

    @Test
    public void searchMobilePhones() {
        // Enter "mobile phones" to the input box
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile phones");

        // Select "Cell phones & Accessories" from right side dropdown
        Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
        dropDown.selectByVisibleText("Cell Phones & Accessories");

        // Click the search button
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        // Scroll the page downwards
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 300);

        // Check the "Apple" checkbox
        driver.findElement(By.xpath("//input[@aria-label='Apple']")).click();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
