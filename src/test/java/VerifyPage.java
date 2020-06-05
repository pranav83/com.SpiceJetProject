import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VerifyPage {

    @Test
    public void verifyGreenKart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://indiancouture.co.za/");
        driver.manage().window().maximize();
        WebDriverWait w = new WebDriverWait(driver,5);
        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Dismiss')]")));
        driver.findElement(By.xpath("//button[contains(text(),'Dismiss')]")).click();
       List<WebElement> products = driver.findElements(By.cssSelector("span.label.label-sale"));
       for (int i = 0; i < products.size(); i++){
         String name = products.get(i).getText();
         if (name.contains("RED SATIN WITH ZARDOSI WORK WEDDING SAREE")){
             //click on AddToCart
             driver.findElements(By.xpath("//a[text()='RED SATIN WITH ZARDOSI WORK WEDDING SAREE']")).get(i).click();
             break;
         }
       }
       Thread.sleep(2000);
       driver.quit();
    }
}
