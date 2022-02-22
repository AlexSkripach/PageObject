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
    @Severity(SeverityLevel.BLOCKER)
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

    @Test(priority = 5, description = "Redirection to the DJI and GoPro product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the DJI and GoPro Product Page via button 'Техника DGI и GoPro' in Category List on Main Page")
    public void checkRedirectingToDJIAndGoProProductPage()
    {
        touchHomepage.goToDgiAndGoProPage();
        basePage.checkCurrentUrl(TOUCH_DGI_AND_GOPRO_HOME_PAGE);
    }

    @Test(priority = 6, description = "Redirection to the smartphones and telephones product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the smartphones and telephones Product Page via button 'Смартфоны и телефоны' in Category List on Main Page")
    public void checkRedirectingToSmartphonesAndTelephonesProductPage()
    {
        touchHomepage.goToSmartphonesPage();
        basePage.checkCurrentUrl(TOUCH_SMARTPHONES_AND_TELEPHONES_HOME_PAGE);
    }

    @Test(priority = 7, description = "Redirection to the tabs and books product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the tabs and books Product Page via button 'Планшеты и книги' in Category List on Main Page")
    public void checkRedirectingToTabsAndBooksProductPage()
    {
        touchHomepage.goToTabsAndBooksPage();
        basePage.checkCurrentUrl(TOUCH_TABS_AND_BOOKS_HOME_PAGE);
    }

    @Test(priority = 8, description = "Redirection to the gadgets and electrical transport product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the gadgets and electrical transport Product Page via button 'Гаджеты и электротранспорт' in Category List on Main Page")
    public void checkRedirectingToGadgetsAndElectricalTransportProductPage()
    {
        touchHomepage.goToGadgetsAndElectricalTransportPage();
        basePage.checkCurrentUrl(TOUCH_GADGETS_AND_ELECTRICAL_TRANSPORT_HOME_PAGE);
    }

    @Test(priority = 9, description = "Redirection to the headphones and acoustics product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the headphones and acoustics Product Page via button 'Наушники и акустика' in Category List on Main Page")
    public void checkRedirectingToHeadphonesAndAcousticsProductPage()
    {
        touchHomepage.goToHeadphonesAndAcousticsPage();
        basePage.checkCurrentUrl(TOUCH_XIAOMI_HOME_PAGE);
    }

    @Test(priority = 10, description = "Redirection to the gadgets accessories product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the gadgets accessories Product Page via button 'Аксессуары для гаджетов' in Category List on Main Page")
    public void checkRedirectingToGadgetsAccessoriesProductPage()
    {
        touchHomepage.goToGadgetsAccessoriesPage();
        basePage.checkCurrentUrl(TOUCH_GADGETS_ACCESSORIES_HOME_PAGE);
    }

    @Test(priority = 11, description = "Redirection to the Tv's and accessories product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the Tv's and accessories Product Page via button 'Телеевизоры и аксессуары' in Category List on Main Page")
    public void checkRedirectingToTvAndAccessoriesProductPage()
    {
        touchHomepage.goToTvAndAccessoriesPage();
        basePage.checkCurrentUrl(TOUCH_TV_AND_ACCESSORIES_HOME_PAGE);
    }

    @Test(priority = 12, description = "Redirection to the computer technique product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the computer technique Product Page via button 'Компьютерная техника' in Category List on Main Page")
    public void checkRedirectingToComputerTechniqueProductPage()
    {
        touchHomepage.goToComputerTechniquePage();
        basePage.checkCurrentUrl(TOUCH_COMPUTER_TECHNIQUE_HOME_PAGE);
    }

    @Test(priority = 13, description = "Redirection to the PlayStation and gaming product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the PlayStation and gaming Product Page via button 'PlayStation и гейминг' in Category List on Main Page")
    public void checkRedirectingToPlayStationAndGamingProductPage()
    {
        touchHomepage.goToPlayStationAndGamingPage();
        basePage.checkCurrentUrl(TOUCH_PLAYSTATION_AND_GAMING_HOME_PAGE);
    }

    @Test(priority = 14, description = "Redirection to the house technique product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the house technique Product Page via button 'Товары для дома' in Category List on Main Page")
    public void checkRedirectingToHouseTechniqueProductPage()
    {
        touchHomepage.goToHouseTechniquePage();
        basePage.checkCurrentUrl(TOUCH_HOUSE_TECHNIQUE_HOME_PAGE);
    }

    @Test(priority = 15, description = "Redirection to the barbershop product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the barbershop Product Page via button 'Barbershop' in Category List on Main Page")
    public void checkRedirectingToBarbershopProductPage()
    {
        touchHomepage.goToBarbershopPage();
        basePage.checkCurrentUrl(TOUCH_BARBERSHOP_HOME_PAGE);
    }

    @Test(priority = 16, description = "Redirection to the fashion and style product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the fashion and style Product Page via button 'Мода и стиль' in Category List on Main Page")
    public void checkRedirectingToFashionAndStyleProductPage()
    {
        touchHomepage.goToFashionAndStylePage();
        basePage.checkCurrentUrl(TOUCH_FASHION_AND_STYLE_HOME_PAGE);
    }

    @Test(priority = 17, description = "Redirection to the markdown product page")
    @Attachment
    @Severity(SeverityLevel.BLOCKER)
    @Description("Checking the ability to redirect to the markdown Product Page via button 'Уценка' in Category List on Main Page")
    public void checkRedirectingToMarkdownProductPage()
    {
        touchHomepage.goToMarkdownPage();
        basePage.checkCurrentUrl(TOUCH_MARKDOWN_HOME_PAGE);
    }

}