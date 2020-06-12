import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggest {
    @Test
    public void verifyUnitedKingdom() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement arrival = driver.findElement(By.id("autocomplete"));
        arrival.click();
        arrival.sendKeys("unit");
        for (int i = 0; i < 4; i++) {
            arrival.sendKeys(Keys.ARROW_DOWN);
        }
        System.out.println(arrival.getAttribute("value"));
        driver.quit();
    }
}

