import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class GoogleTest {

    @Test
    public void google() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select adult = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
        adult.selectByValue("5");
        Select child = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
        child.selectByValue("3");
        Select infant = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")));
        infant.selectByValue("2");
        Select inr = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
        inr.selectByVisibleText("USD");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@text='Bhopal (BHO)']")).click();
        Thread.sleep(800);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Mumbai (BOM)'][contains(text(),'Mumbai (BOM)')]")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_Unmr")).click();
        driver.findElement(By.xpath("//span[@class='hide-mobile']//a[contains(text(),'Special Assistance')]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scroll = driver.findElement(By.xpath("//td[contains(text(),'INCAD Form')]"));
        js.executeScript("arguments[0].scrollIntoView();",scroll);
        driver.findElement(By.xpath("//a[@id='SpecialAssistanceWindow']")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
        for (int i = 0; i>8; i++){
            driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]")).click();
        }
        driver.findElement(By.xpath("//a[text()='29']")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
        driver.findElement(By.xpath("//a[text()='29']")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
        driver.quit();

    }
}
