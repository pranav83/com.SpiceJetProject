import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestive {
     @Test
    public void makeMyTriP() throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.makemytrip.com/");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//input[@id='fromCity']")).click();
         WebElement arrival = driver.findElement(By.xpath("//input[@placeholder='From']"));
         arrival.sendKeys("Mu");
         Thread.sleep(2000);
         for (int i =0; i<2; i++){
             arrival.sendKeys(Keys.ARROW_DOWN);
         }
         arrival.sendKeys(Keys.ENTER);

         WebElement departure = driver.findElement(By.xpath("//input[@placeholder='To']"));
         departure.sendKeys("Ba");
         for (int i = 0; i<6; i++){
             departure.sendKeys(Keys.ARROW_DOWN);
         }
         Thread.sleep(2000);
         departure.sendKeys(Keys.ENTER);

         driver.quit();


    }
}
