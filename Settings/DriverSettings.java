package Settings;

import org.openqa.selenium.WebDriver;

import Settings.Config;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static Constants.Constant.Timeouts.IMPLICIT_WAIT;

// Class of browser settings
public class DriverSettings {

    // Browser initialization
    static WebDriver driver;

    // Class of creating browser
    public static WebDriver createDriver()
    {

        // Change config.xxx to choose a system and browser (Check Config file)
        switch (Config.WIN_CHROME)
        {
            case "win_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "mac_chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
                break;
            case "win_firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail("Incorrect system or platform!");

        }

        // Browser fullscreen opens
        driver.manage().window().maximize();

        // Browser timeouts settings
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;

    }

    // Method for getting driver instance
    public static WebDriver getDriver()
    {
        return driver;
    }
}
