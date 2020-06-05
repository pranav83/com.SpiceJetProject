import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ActionClass {

    @Test
    public void mouseHover() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://indiancouture.co.za/");
        driver.manage().window().maximize();
        WebDriverWait w = new WebDriverWait(driver,5);
        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Dismiss')]")));
        driver.findElement(By.xpath("//button[contains(text(),'Dismiss')]")).click();
        Actions a = new Actions(driver);
        a.moveToElement
                (driver.findElement
                        (By.xpath("//a[@class='dropdown-toggle sf-with-ul'][contains(text(),'Sarees')]"))).build().perform();
        a.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle sf-with-ul'][contains(text(),'Anarkali')]")))
        .build().perform();
        a.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle sf-with-ul'][contains(text(),'Lehenga Cholis')]")))
                .build().perform();
        a.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle sf-with-ul'][contains(text(),'Designer Wear')]")))
                .build().perform();
        a.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle sf-with-ul'][contains(text(),'Ready-To-Wear')]")))
                .build().perform();
        a.moveToElement(driver.findElement(By.xpath("//a[@class='dropdown-toggle sf-with-ul'][contains(text(),\"MEN's WEAR\")]")))
                .build().perform();
        Thread.sleep(2000);
        //Writing the text in Caps and select the text
        a.moveToElement(driver.findElement
                (By.id("searchMain"))).click().keyDown(Keys.SHIFT).sendKeys("sarees").doubleClick().build().perform();
        //Click the right click on element
        a.moveToElement(driver.findElement
                (By.xpath("//a[contains(text(),'Sign-in')]"))).contextClick().build().perform();

        Thread.sleep(2000);
        driver.quit();



    }
}
