package Pages.base;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Constants.Constant.Timeouts.EXPLICIT_WAIT;

// Base page Class: Contains similar logic which you can find or use for every page
public class BasePage {

    // Browser initialize
    protected WebDriver driver;

    // Browser constructor for BasePage
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    // Method which opens in browser page with passed URL
    public void open(String url)
    {
        driver.get(url);
    }

    // Method which wait until Element is downloaded on the WebPage
    public WebElement waitElementIsVisible(WebElement element)
    {
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    // Method which scroll page to chosen element. Method needs to be used after element was founded
    public void scrollToElement(WebElement element)
    {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
    }

    // Method which compare current URL with passed one
    // Annotation which describes step of the test. In () we write what we want to see written in report as a step
    @Step("Check current URL with expected URL - {0}")
    public void checkCurrentUrl(String expectedUrl)
    {
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    // Method which compare current Title with passed one
    public void checkCurrentTitle(String expectedTitle)
    {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    // Method which close current page in browser
    public void closePage()
    {
        driver.close();
    }

    // Browser back button
    public void goBack(){
        driver.navigate().back();
    }

    // Browser forward button
    public void goForward()
    {
        driver.navigate().forward();
    }

    // Browser refresh button
    public void refreshPage()
    {
        driver.navigate().refresh();
    }
}
