import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myaccount_info_login {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/account");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.name("email")).sendKeys("sweak22@gmail.com");
        Thread.sleep(700);

        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(700);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
        Thread.sleep(700);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul[1]/li[1]/a")).click();
        Thread.sleep(700);

        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("sweak");
        Thread.sleep(700);

        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("joshi");
        Thread.sleep(700);

        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys("sweak22@gmail.com");
        Thread.sleep(700);

        driver.findElement(By.id("input-telephone")).clear();
        driver.findElement(By.id("input-telephone")).sendKeys("469888888");
        Thread.sleep(700);

        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input")).click();

        Thread.sleep(5000);
        driver.close();




    }
    }
