package NEG;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class NEGLoginTest {
    WebDriver driver = new ChromeDriver();
    @Test
    public void test () throws InterruptedException {
        //Home Page
        driver.get("https://simpa.datains.id/login");

        //username salah
        WebElement usernamefield = driver.findElement(By.id("username"));
        usernamefield.sendKeys("it.cgkah");

        //password benar
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("Angkasapura001");

        //Sign In Button Click
        WebElement SignInButton = driver.findElement(By.id("loginButton"));
        SignInButton.click();

        //verifikasi password salah page tetap di login page
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        assertTrue(currentURL.contains("https://simpa.datains.id/login"));
    }
}
