import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {
    @Test
    public void deleteCookies(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        // There could be a senario where your have to automate you login and delete session cookie and navigate to homepage
      //  driver.manage().deleteCookieNamed("sessionKey");
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();

    }
}
