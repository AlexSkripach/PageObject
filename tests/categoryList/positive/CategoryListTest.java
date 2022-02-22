package tests.categoryList.positive;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.Catalog.*;

@Feature("Category Buttons")
public class CategoryListTest extends BaseTest {


    @Test(priority = 1, description = "Check the number of buttons in catalog")
    @Attachment
    public void checkTheNumberOfCatalogButtons()
    {
        touchHomepage.countTheNumberOfButtonsInCatalog();
    }

    @Test(priority = 2, description ="Redirection to the Catalog page" )
    @Attachment
    public void checkRedirectingToCatalogPage()
    {
        touchHomepage.goToCatalogPage();
        basePage.checkCurrentUrl(TOUCH_CATALOG_PAGE);
    }

    @Test(priority = 3, description = "Redirection to the Apple product page")
    @Attachment
    //@Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the Apple Product Page via button 'Техника Apple' in Category List on Main Page")
    public void checkRedirectingToAppleProductPage() {
        touchHomepage.goToApplePage();
        basePage.checkCurrentUrl(TOUCH_APPLE_HOME_PAGE);
    }

    @Test(priority = 4, description = "Redirection to the Xiaomi product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the Xiaomi Product Page via button 'Техника Xiaomi' in Category List on Main Page")
    public void checkRedirectingToXiaomiProductPage()
    {
        touchHomepage.goToXiaomiPage();
        basePage.checkCurrentUrl(TOUCH_XIAOMI_HOME_PAGE);
    }
}