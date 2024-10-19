package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayPhonesResultsPage extends PageBase {
    // Calling constructor of the super class "PageBase"
    public EbayPhonesResultsPage(WebDriver driver) {
        super(driver);
    }

    // 01. WebElements
    // ----------------
    @FindBy(xpath = "//input[@aria-label='Apple']")
    WebElement appleCheckBox;

    // 02. Methods to interact with WebElements
    // ----------------------------------------
    public void clickAppleCheckBox() {
        appleCheckBox.click();
    }

}
