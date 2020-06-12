import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Ceritification {

    @Test
    public void ssl(){
        //ssl cerification

//        DesiredCapabilities is class which helps to customize chrome browser
        DesiredCapabilities dc =DesiredCapabilities.chrome();
        dc.acceptInsecureCerts();
        //now your system is talking to local
        ChromeOptions ch =new  ChromeOptions();
        ch.merge(dc);
        WebDriver driver = new ChromeDriver(ch);

    }
}
