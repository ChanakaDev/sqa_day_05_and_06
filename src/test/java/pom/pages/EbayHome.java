package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EbayHome extends PageBase {
    // Calling constructor of the super class "PageBase"
    public EbayHome(WebDriver driver) {
        super(driver);
    }

    // 01. WebElements
    // ----------------
    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement SearchBox;

    @FindBy(xpath = "//select[@id='gh-cat']")
    WebElement DropDown;

    @FindBy(xpath = "//input[@id='gh-btn']")
    WebElement SearchButton;

    // 02. Methods to interact with WebElements
    // ----------------------------------------
    public void insertTextToSearchBox(String searchText) {
        SearchBox.sendKeys(searchText);
    }

    public void selectCategoryByVisibleText(String visibleText) {
//        Select dropDown = new Select(DropDown);
//        dropDown.selectByVisibleText(visibleText);
        new Select(DropDown).selectByVisibleText(visibleText);
    }

    public <T> T clickSearchButton(String visibleText) {
        SearchButton.click();

        if (visibleText.equals("Clothing, Shoes & Accessories")) {
            return (T) PageFactory.initElements(driver, EbayShoesResultsPage.class);
        } else {
            return (T) PageFactory.initElements(driver, EbayPhonesResultsPage.class);
        }
    }
}
