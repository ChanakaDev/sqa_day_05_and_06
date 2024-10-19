package pom.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pom.pages.EbayHome;
import pom.pages.EbayPhonesResultsPage;
import pom.pages.EbayShoesResultsPage;
import pom.pages.PageBase;
import pom.utilities.TestNGUtil;

public class EbayHomeTests extends TestNGUtil {
    @Test
    public void searchMobilePhones() {
        // Load the "PageBase" and use the "loadEbayHomePage" method
        PageBase pageBase = PageFactory.initElements(browserFactory.getDriver(), PageBase.class);
        EbayHome ebayHome = pageBase.loadEbayHomePage("www.ebay.com");

        // Perform writing text in input box
        ebayHome.insertTextToSearchBox("mobile phones");
        // Perform selecting a category from dropdown
        ebayHome.selectCategoryByVisibleText("Cell Phones & Accessories");

        // Perform clicking search button and taking resulting page to a variable
        EbayPhonesResultsPage ebayPhonesResultsPage = ebayHome.clickSearchButton("Cell Phones & Accessories");

        // Scroll down the result web page and click a checkbox
        ebayPhonesResultsPage.scrollDown(0, 300);
        ebayPhonesResultsPage.clickAppleCheckBox();
    }

    @Test
    public void searchShoes() {
        // Load the "PageBase" and use the "loadEbayHomePage" method
        PageBase pageBase = PageFactory.initElements(browserFactory.getDriver(), PageBase.class);
        EbayHome ebayHome = pageBase.loadEbayHomePage("www.ebay.com");

        // Perform writing text in input box
        ebayHome.insertTextToSearchBox("shoes");
        // Perform selecting a category from dropdown
        ebayHome.selectCategoryByVisibleText("Clothing, Shoes & Accessories");

        // Perform clicking search button and taking resulting page to a variable
        EbayShoesResultsPage ebayShoesResultsPage = ebayHome.clickSearchButton("Clothing, Shoes & Accessories");

        // Scroll down the result web page and click a checkbox
        ebayShoesResultsPage.scrollDown(0, 300);
        ebayShoesResultsPage.clickCheckBox();
    }
}
