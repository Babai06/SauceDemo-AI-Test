package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {

    WebDriver driver;

    @Test
    public void validLoginTest() {
        driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openSite();
        loginPage.login("standard_user", "secret_sauce");

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(
                currentUrl.contains("inventory"),
                "Login failed: User not redirected to products page"
        );
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
