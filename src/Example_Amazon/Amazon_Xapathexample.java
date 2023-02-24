package Example_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Amazon_Xapathexample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/amazonprime?tag=googhydr-20&hvadid=550213431242&hvpos=&hvexid=&hvnetw=g&hvrand=18107041371293026207&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9024585&hvtargid=kwd-3151046130&ref=pd_sl_34qfrygf2i_e");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

//        absolute xpath
//        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Valentines day gifts");
//        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);

//        by using double slash and multiple attribute xpath
//        driver.findElement(By.xpath("//html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")).click();
//        driver.findElement(By.xpath("//*[@name='email'] [@id='ap_email']")).sendKeys("sweak22@gmail.com");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@name='email'] [@id='ap_email']")).sendKeys(Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='password'] [@id='ap_password']")).sendKeys("123456");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
//
//        xpath using or
//        driver.findElement(By.xpath("//*[@name='email' or @id='ap_email']")).sendKeys("sweak22@gmail.com");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//*[@name='email' or @id='ap_email']")).sendKeys(Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='password' or @id='ap_password']")).sendKeys("123456");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@name='password' or @id='ap_password']")).sendKeys(Keys.ENTER);

//        xapth using starts with
        driver.findElement(By.xpath("//html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")).click();
        driver.findElement(By.xpath("//input[starts-with(@class,'a-input')]")).sendKeys("sweak22@gmail.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[starts-with(@class,'a-input')]")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[starts-with(@id,'ap_password')]")).sendKeys("123456");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[starts-with(@id,'ap_password')]")).sendKeys(Keys.ENTER);





        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        driver.close();

    }

}
