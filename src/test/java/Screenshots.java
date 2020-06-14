import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshots {

    @Test
    public void takeScreenShot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flyoverinternational.com/");
        // to take screen shot we have to cast our diver to method take screenshot
        //by using method get screen shot as and telling to get output in file format
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      // copy file to our local machine
        FileUtils.copyFile(src,new File("C:\\Users\\prana\\Downloads\\SeleniumCucumber-master\\com.GradleProject\\screenshot.png"));
    }
}
