package tests.base;

import Pages.TouchListingPage.TouchListingPage;
import Pages.base.BasePage;
import Pages.touchHomePage.TouchHomePage;
import Settings.DriverSettings;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static Constants.Constant.Urls.Home.TOUCH_HOME_PAGE;
import static Settings.Config.CLEAR_COOKIES_AND_LOCAL_STORAGE;

// Base test Class: Contains similar logic which you can use in any test
public class BaseTest {

    // Creating instances of logic classes
    protected WebDriver driver = DriverSettings.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected TouchHomePage touchHomepage = new TouchHomePage(driver);
    protected TouchListingPage touchListingPage = new TouchListingPage(driver);

    // Method which opens Main page
    @BeforeMethod // This annotation means that this method will be executed before each test
    @Step("Opening TOUCH Home page")
    public void openTouchHomePage()
    {
        basePage.open(TOUCH_HOME_PAGE);
    }

    // Method which clean cookies and storage
    @AfterClass
    @Step("Clear Cookies And Local Storage")
    public void clearCookiesAndLocalStorage()
    {
        if(CLEAR_COOKIES_AND_LOCAL_STORAGE)
        {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    // Method which closes browser
    @AfterClass
    @Step("Close Browser")
    public void closeBrowser()
    {
        driver.quit();
    }

}
