package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObject {

    WebDriver driver;

    By email = By.id("email1");

    By password = By.id("password1");

    By code = By.id("couponCode1");

    By submitBtn = By.xpath("//*[@id='actions']/div/div[14]/div/form/button");

    By submuittedText = By.xpath("//*[@class='action-form']//following::p[1]");

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String userName) {

        driver.findElement(email).sendKeys(userName);

    }

    public void setPassword(String userPassword) {

        driver.findElement(password).sendKeys(userPassword);

    }

    public void clickSubmit() {

        driver.findElement(submitBtn).click();

    }

    public String getSubmittedText() {

        return driver.findElement(submuittedText).getText();

    }
}
