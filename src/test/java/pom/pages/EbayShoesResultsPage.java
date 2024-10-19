package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayShoesResultsPage extends PageBase {
    // Calling constructor of the super class "PageBase"
    public EbayShoesResultsPage(WebDriver driver) {
        super(driver);
    }

    // 01. WebElements
    // ----------------
    @FindBy(xpath = "//input[@aria-label='Adidas']")
    WebElement adidasCheckBox;

    // 02. Methods to interact with WebElements
    // ----------------------------------------
    public void clickCheckBox() {
        adidasCheckBox.click();
    }
}
