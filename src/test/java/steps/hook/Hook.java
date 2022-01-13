package steps.hook;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Hook {

    private static WebDriver driver;

    @Before
    public void before() throws IOException {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/linux/chromedriver");
        driver = new ChromeDriver(new ChromeOptions().addArguments("ignore-certificate-errors"));
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}
