package Pages.TouchListingPage;

import Pages.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

// Class of the listing which extends basic logic from BasePage class
public class TouchListingPage extends BasePage {

    // Browser initialization
    public TouchListingPage(WebDriver driver) {
        super(driver);
    }

    // xPath for name of the page Text element
    private final By searchResultText = By.xpath("//h1[@class='changeName']");

    // xPath for product card (tabloid) Element
    private final By productCard = By.xpath("//div[contains(@class, 'item product sku cat_section')]");

    // Method which compare page's name text with passed one
    @Step("Check that page's name contains - {0}")
    public TouchListingPage resultOfSearchText(String whatToSearch)
    {
        WebElement resultText = driver.findElement(searchResultText);
        waitElementIsVisible(resultText);
        scrollToElement(resultText);

        Assert.assertEquals(resultText.getText(), "Результаты поиска - «" + whatToSearch + "»");

        return this;
    }

    // Method which checks that every product card's name contains passed value
    @Step("Check that all product cards contains - {0}")
    public TouchListingPage productCardSearchResultContain(String whatToSearch)
    {
        List<WebElement> productCardList = driver.findElements(productCard);
        for(WebElement element: productCardList)
        {
            waitElementIsVisible(element);
            scrollToElement(element);
            Assert.assertTrue(element.getText().contains(whatToSearch));
        }
        return this;
    }
}
