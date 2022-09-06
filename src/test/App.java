package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageObject;

public class App {

    String path = System.getProperty("user.dir"); // return project folder path

    // String driverPath = path + "\\driver\\chromedriver.exe"; // return driver
    // folder path

    String driverPath = "C:\\Users\\tomas\\Downloads\\chromedriver_win32\\chromedriver.exe";

    WebDriver driver;

    PageObject obj;

    @BeforeTest

    public void setup() {

        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://example.cypress.io/commands/actions?");

    }

    @Test(priority = 0)

    public void test_Home_Page_Appear_Correct() {

        // Create Login Page object

        obj = new PageObject(driver);

        obj.setUserName("Tom");
        obj.setPassword("1234");

        obj.clickSubmit();
        String text = obj.getSubmittedText();

        Assert.assertTrue(text.contains("Your form has been submitted!"));

    }
}