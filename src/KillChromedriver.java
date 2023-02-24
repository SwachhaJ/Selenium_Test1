import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class KillChromedriver {

    public static void main(String[] args)  {

        for (int i=0; i<2; i++) {
            System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
            driver.manage().window().maximize();


           KillProecssChromedriver Killdriver = new KillProecssChromedriver();
          // Killdriver.KillProcess_mac();

        }
    }
}
