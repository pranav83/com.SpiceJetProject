import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfRows {
    @Test
    public void rowsCount() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement table = driver.findElement(By.xpath("//table[@id='product']//tbody"));
        int rowCount = table.findElements(By.xpath("//div[@class='block large-row-spacer']//tr")).size();
        System.out.println("Total row in Table = " + rowCount);
        int totalColumns = table.findElements(By.xpath("//tr[2]//td")).size();
        System.out.println("Total column in table = " + totalColumns);
        int printColumns = table.findElements(By.xpath("//body//tr[3]")).size();
        for (int i = 0; i < printColumns; i++) {
            System.out.println(table.findElements(By.xpath("//body//tr[3]")).get(i).getText());
        }
        driver.quit();

    }

}
