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
    /**
     * Catalog
     */

}
