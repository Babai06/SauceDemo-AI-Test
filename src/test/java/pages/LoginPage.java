package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Open SauceDemo site
    public void openSite() {
        driver.get("https://www.saucedemo.com/");
    }

    // Perform login
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
