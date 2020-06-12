import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestive2 {
    @Test
    public void makeMyTriP() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//input[@id='fromPlaceName']")).clear();
        WebElement arrival = driver.findElement(By.id("fromPlaceName"));
        arrival.click();
        arrival.sendKeys("Beng");
//        arrival.sendKeys(Keys.ARROW_DOWN);
//        arrival.sendKeys(Keys.ARROW_DOWN);
//        arrival.sendKeys(Keys.ARROW_DOWN);


// Now using javascript html DOM we can extract all the hidden element bcz selenium hidden ajax element

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String getDest = "return document.getElementById(\"fromPlaceName\").value";
        String airport = (String) js.executeScript(getDest);

        int i =0;
        while (!airport.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
            arrival.sendKeys(Keys.ARROW_DOWN);
            airport = (String) js.executeScript(getDest);
            System.out.println(airport);
            break;
        }

//         Thread.sleep(2000);
//         for (int i =0; i<2; i++){
//             arrival.sendKeys(Keys.ARROW_DOWN);
//         }
//         arrival.sendKeys(Keys.ENTER);
//
//         WebElement departure = driver.findElement(By.xpath("//input[@placeholder='To']"));
//         departure.sendKeys("Ba");
//         for (int i = 0; i<6; i++){
//             departure.sendKeys(Keys.ARROW_DOWN);
//         }
//         Thread.sleep(2000);
//         departure.sendKeys(Keys.ENTER);

        // driver.quit();


    }
}
