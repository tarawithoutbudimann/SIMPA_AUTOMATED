package POS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageAutomation {

    @Test
    public void test () throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //Home Page
        driver.get("https://simpa.datains.id/");

        //Click Button Login
        WebElement loginButton = driver.findElement(By.id("loginDropdown"));
        loginButton.click();

        //Click Button Login SIMPA
        WebElement loginsimpaButton = driver.findElement(By.linkText("Login Simpa"));
        loginsimpaButton.click();

    }
}
