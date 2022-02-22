package Pages.touchHomePage;

import Pages.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static Constants.Constant.Values.Catalog.NUMBER_OF_BUTTONS;

// Class of the Main page which extends basic logic from BasePage class
public class TouchHomePage extends BasePage {

    // Browser initialization
    public TouchHomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Search
     */

    // xPath for search text field Element
    private final By searchField = By.xpath("//input[@name='q']");

    // xPath for search button Element
    private final By searchButton = By.xpath("//input[@id='goSearch']");

    // Method for inputting data to the search text field
    public TouchHomePage inputInSearchField(String whatToSearch)
    {
        WebElement search = driver.findElement(searchField);
        waitElementIsVisible(search);
        scrollToElement(search);
        search.sendKeys(whatToSearch);

        return this;
    }

    // Method which click on search button
    public TouchHomePage clickOnSearchButton()
    {
        WebElement sButton = driver.findElement(searchButton);
        waitElementIsVisible(sButton);
        scrollToElement(sButton);
        sButton.click();

        return this;
    }

    /**
     * Search
     */

    /**
     * Catalog
     */
    // Category list xpathes
    private final By catalogButtons = By.xpath("span[@class='tx']");
    private final By touchCatalogButton = By.xpath("//a[@class='heading orange mround']");
    private final By categoryAppleButton = By.xpath("//li[@class='eChild'][1]");
    private final By categoryXiaomiButton = By.xpath("(//li[@class='eChild'])[2]");
    private final By categoryDgiAndGoProButton = By.xpath("(//li[@class='eChild'])[3]");
    private final By categorySmartphonesAndTelephonesButton = By.xpath("(//li[@class='eChild'])[4]");
    private final By categoryTabsAndBooksButton = By.xpath("(//li[@class='eChild'])[5]");
    private final By categoryGadgetsButton = By.xpath("(//li[@class='eChild'])[6]");
    private final By categoryHeadphonesButton = By.xpath("(//li[@class='eChild'])[7]");
    private final By categoryAccessoriesForGadgetsButton = By.xpath("(//li[@class='eChild'])[8]");
    private final By categoryTvsAndAccessoriesButton = By.xpath("(//li[@class='eChild'])[9]");
    private final By categoryComputerTechniqueButton = By.xpath("(//li[@class='eChild'])[10]");
    private final By categoryPlaystationAndGamingButton = By.xpath("(//li[@class='eChild'])[11]");
    private final By categoryHouseTechniqueButton = By.xpath("(//li[@class='eChild'])[12]");
    private final By categoryBarbershopButton = By.xpath("(//li[@class='eChild'])[13]");
    private final By categoryFashionAndStyleButton = By.xpath("(//li[@class='eChild'])[14]");
    private final By categoryMarkdownButton = By.xpath("(//li[@class='eChild'])[15]");

    // Method which check that number of categories buttons on the page is correct
    @Step("Count the number of buttons in the catalog")
    public TouchHomePage countTheNumberOfButtonsInCatalog()
    {
        List<WebElement> numberOfCatalogButtons = driver.findElements(catalogButtons);
        Assert.assertEquals(numberOfCatalogButtons.size(), NUMBER_OF_BUTTONS);

        return this;
    }

    // Method which redirect user to the whole Catalog page
    @Step("Click on the 'Каталог товаров' button")
    public TouchHomePage goToCatalogPage()
    {
        WebElement catalogButton = driver.findElement(touchCatalogButton);
        waitElementIsVisible(catalogButton);
        scrollToElement(catalogButton);
        catalogButton.click();

        return this;
    }

    // Method which redirect user to the Apple production page
    @Step("Click on the 'Техника Apple' button")
    public TouchHomePage goToApplePage()
    {
        WebElement appleButton = driver.findElement(categoryAppleButton);
        waitElementIsVisible(appleButton);
        scrollToElement(appleButton);
        appleButton.click();

        return this;
    }

    // Method which redirect user to the Xiaomi production page
    @Step("Click on the 'Техника Xiaomi' button")
    public TouchHomePage goToXiaomiPage()
    {
        WebElement xiaomiButton = driver.findElement(categoryXiaomiButton);
        waitElementIsVisible(xiaomiButton);
        scrollToElement(xiaomiButton);
        xiaomiButton.click();

        return this;
    }

    // Method which redirect user to the DGI and GoPro production page
    @Step("Click on the 'Техника DGI и GoPro' button")
    public TouchHomePage goToDgiAndGoProPage()
    {
        WebElement dgiAndGoProButton = driver.findElement(categoryDgiAndGoProButton);
        waitElementIsVisible(dgiAndGoProButton);
        scrollToElement(dgiAndGoProButton);
        dgiAndGoProButton.click();

        return this;
    }

    // Method which redirect user to the smartphones and telephones production page
    @Step("Click on the 'Смартфоны и телефоны' button")
    public TouchHomePage goToSmartphonesPage()
    {
        WebElement smartphonesButton = driver.findElement(categorySmartphonesAndTelephonesButton);
        waitElementIsVisible(smartphonesButton);
        scrollToElement(smartphonesButton);
        smartphonesButton.click();

        return this;
    }

    // Method which redirect user to the tabs and books production page
    @Step("Click on the 'Планшеты и книги' button")
    public TouchHomePage goToTabsAndBooksPage()
    {
        WebElement tabsAndBooksButton = driver.findElement(categoryTabsAndBooksButton);
        waitElementIsVisible(tabsAndBooksButton);
        scrollToElement(tabsAndBooksButton);
        tabsAndBooksButton.click();

        return this;
    }

    // Method which redirect user to the gadgets and electrical transport production page
    @Step("Click on the 'Гаджеты и электротранспорт' button")
    public TouchHomePage goToGadgetsAndElectricalTransportPage()
    {
        WebElement gadgetsAndElectricalTransportButton = driver.findElement(categoryGadgetsButton);
        waitElementIsVisible(gadgetsAndElectricalTransportButton);
        scrollToElement(gadgetsAndElectricalTransportButton);
        gadgetsAndElectricalTransportButton.click();

        return this;
    }

    // Method which redirect user to the headphones and acoustics production page
    @Step("Click on the 'Наушники и акустика' button")
    public TouchHomePage goToHeadphonesAndAcousticsPage()
    {
        WebElement headphonesAndAcousticsButton = driver.findElement(categoryHeadphonesButton);
        waitElementIsVisible(headphonesAndAcousticsButton);
        scrollToElement(headphonesAndAcousticsButton);
        headphonesAndAcousticsButton.click();

        return this;
    }

    // Method which redirect user to the gadgets accessories production page
    @Step("Click on the 'Аксессуары для гаджетов' button")
    public TouchHomePage goToGadgetsAccessoriesPage()
    {
        WebElement gadgetsAccessoriesButton = driver.findElement(categoryAccessoriesForGadgetsButton);
        waitElementIsVisible(gadgetsAccessoriesButton);
        scrollToElement(gadgetsAccessoriesButton);
        gadgetsAccessoriesButton.click();

        return this;
    }

    // Method which redirect user to the Tv's and accessories production page
    @Step("Click on the 'Телеевизоры и аксессуары' button")
    public TouchHomePage goToTvAndAccessoriesPage()
    {
        WebElement tvAndAccessoriesButton = driver.findElement(categoryTvsAndAccessoriesButton);
        waitElementIsVisible(tvAndAccessoriesButton);
        scrollToElement(tvAndAccessoriesButton);
        tvAndAccessoriesButton.click();

        return this;
    }

    // Method which redirect user to the computer technique production page
    @Step("Click on the 'Компьютерная техника' button")
    public TouchHomePage goToComputerTechniquePage()
    {
        WebElement computerTechniqueButton = driver.findElement(categoryComputerTechniqueButton);
        waitElementIsVisible(computerTechniqueButton);
        scrollToElement(computerTechniqueButton);
        computerTechniqueButton.click();

        return this;
    }

    // Method which redirect user to the PlayStation and gaming production page
    @Step("Click on the 'PlayStation и гейминг' button")
    public TouchHomePage goToPlayStationAndGamingPage()
    {
        WebElement playStationAndGamingButton = driver.findElement(categoryPlaystationAndGamingButton);
        waitElementIsVisible(playStationAndGamingButton);
        scrollToElement(playStationAndGamingButton);
        playStationAndGamingButton.click();

        return this;
    }

    // Method which redirect user to the House technique production page
    @Step("Click on the 'Товары для дома' button")
    public TouchHomePage goToHouseTechniquePage()
    {
        WebElement houseTechniqueButton = driver.findElement(categoryHouseTechniqueButton);
        waitElementIsVisible(houseTechniqueButton);
        scrollToElement(houseTechniqueButton);
        houseTechniqueButton.click();

        return this;
    }

    // Method which redirect user to the barbershop production page
    @Step("Click on the 'Barbershop' button")
    public TouchHomePage goToBarbershopPage()
    {
        WebElement barbershopButton = driver.findElement(categoryBarbershopButton);
        waitElementIsVisible(barbershopButton);
        scrollToElement(barbershopButton);
        barbershopButton.click();

        return this;
    }

    // Method which redirect user to the fashion and style production page
    @Step("Click on the 'Мода и стиль' button")
    public TouchHomePage goToFashionAndStylePage()
    {
        WebElement fashionAndStyleButton = driver.findElement(categoryFashionAndStyleButton);
        waitElementIsVisible(fashionAndStyleButton);
        scrollToElement(fashionAndStyleButton);
        fashionAndStyleButton.click();

        return this;
    }

    // Method which redirect user to the markdown production page
    @Step("Click on the 'Уценка' button")
    public TouchHomePage goToMarkdownPage()
    {
        WebElement markdownButton = driver.findElement(categoryMarkdownButton);
        waitElementIsVisible(markdownButton);
        scrollToElement(markdownButton);
        markdownButton.click();

        return this;
    }
    /**
     * Catalog
     */

}
