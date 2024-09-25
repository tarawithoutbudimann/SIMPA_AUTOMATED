import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    @Test
    public void test (){
        WebDriver driver = new ChromeDriver();

        //Login Page
        driver.get("https://simpa.datains.id/");

        driver.quit();
    }
}
