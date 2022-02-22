package tests.search.positive;

import Pages.TouchListingPage.TouchListingPage;
import Pages.touchHomePage.TouchHomePage;
import io.qameta.allure.Attachment;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchPositiveTest extends BaseTest {

    @Test(description = "Search items by using search field")
    @Attachment
    public void searchItem()
    {
        String whatToSearch = "Apple";
        touchHomepage.inputInSearchField(whatToSearch);
        touchHomepage.clickOnSearchButton();
        touchListingPage.resultOfSearchText(whatToSearch);
        touchListingPage.productCardSearchResultContain(whatToSearch);
    }

}
