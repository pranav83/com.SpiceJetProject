import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.atomic.AtomicInteger;

public class Total_Runs_count {

    int sum = 0;

    @Test
    public void cribuzzTable() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/27169/qtg-vs-isu-1st-match-pakistan-super-league-2020");
        driver.manage().window().maximize();
        Thread.sleep(800);
        //throw the table css in webElement
        WebElement table = driver.findElement(By.id("innings_1"));
        //now get the row for which you element you looking
        int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
       //Now if you want to get third child in css + div:nth-child(3)
       int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

       for(int i =0; i<count-2; i++){
           String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
           // convert string to integer
          int valueInteger = Integer.parseInt(value);
          sum = sum + valueInteger;
       }
        System.out.println(sum);
       // this to travel to following sibling which has dynamic locator
        String extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        // string extras to int;
        int valueOfExtra = Integer.parseInt(extras);
        int totalScore = sum + valueOfExtra;
        System.out.println(totalScore);
        System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
       driver.quit();

    }

}
