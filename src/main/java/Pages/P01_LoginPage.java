package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_LoginPage {


    // 1- define Webdriver
    // 2- define constructor and initialize webdriver
    // 3- define locators using By
    // 4- define action methods for each locator
    WebDriver driver;

    public P01_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By USER_TEXT = By.xpath("//input[@id='user-name']");
    private final By PASSWORD_TEXT = By.xpath("//input[@id='password']");
    private final By LOGIN_BUTTON = By.xpath("//input[@id='login-button']");
    private final By Product_Title = By.xpath("//*[@id=\"inventory_filter_container\"]/div");

    public P01_LoginPage inputEmail(String email) {
        driver.findElement(this.USER_TEXT).sendKeys(email);
        return this;
    }
    public P01_LoginPage inputPassword(String password) {
        driver.findElement(this.PASSWORD_TEXT).sendKeys(password);
        return this;
    }

    public P01_LoginPage clickLoginButton() {
        driver.findElement(this.LOGIN_BUTTON).click();
        return this;
    }
    public boolean VerifyLogin() {
        return driver.findElement(this.Product_Title).getText().contains("Products");
    }

    public String VerifyLogin2() {
        return driver.findElement(this.Product_Title).getText();
    }
}






