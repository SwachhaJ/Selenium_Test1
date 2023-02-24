import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register_login {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","utilis/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("sweak");
        driver.findElement(By.name("lastname")).sendKeys("joshi");
        driver.findElement(By.id("input-email")).sendKeys("sweakj@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("469888333");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("confirm")).sendKeys("12345678");
        //driver.findElement(By.name("newsletter")).sendKeys("No");
       // driver.findElement(By.xpath("agree")).sendKeys("/html/body/div[2]/div/div/form/div/div/input[1]");
       // driver.findElement(By.xpath("Continue")).sendKeys("/html/body/div[2]/div/div/form/div/div/input[2]");

        Thread.sleep(5000);

        driver.close();



    }
}