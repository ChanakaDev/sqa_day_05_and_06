package pom.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pom.pages.EbayHome;
import pom.pages.EbayPhonesResultsPage;
import pom.pages.PageBase;
import pom.utilities.TestNGUtil;

public class EbayHomeTests extends TestNGUtil {
    @Test
    public void searchMobilePhones() {
        PageBase pageBase = PageFactory.initElements(browserFactory.getDriver(), PageBase.class);
        EbayHome ebayHome = pageBase.loadEbayHomePage("www.ebay.com");

        ebayHome.insertTextToSearchBox("mobile phones");
        ebayHome.selectCategoryByVisibleText("Cell Phones & Accessories");

        EbayPhonesResultsPage ebayPhonesResultsPage = ebayHome.clickSearchButton("ell Phones & Accessories");

        ebayPhonesResultsPage.scrollDown(0, 300);
        ebayPhonesResultsPage.clickAppleCheckBox();
    }
}
