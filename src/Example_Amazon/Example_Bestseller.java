package Example_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Bestseller {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/amazonprime?tag=googhydr-20&hvadid=550213431242&hvpos=&hvexid=&hvnetw=g&hvrand=18107041371293026207&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9024585&hvtargid=kwd-3151046130&ref=pd_sl_34qfrygf2i_e");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Best Sellers")).click();
        String a = driver.findElement(By.linkText("Best Sellers")).getText();
        // System.out.println(a);

        // css selector contains
        // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[1]/div[2]/div/a[2]/span/div")).click();
        String b = driver.findElement(By.cssSelector("div[class*='p13n-sc-truncated']")).getText();
        //System.out.println(b);

        // absolute xpath
        // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[2]/div[2]/div/a[2]/span/div")).click();
        String c = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[2]/div[2]/div/a[2]/span/div")).getText();
        //System.out.println(c);

        // driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[3]/div[2]/div/a[2]/span/div")).click();
        String d = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[3]/div[2]/div/a[2]/span/div")).getText();
        // System.out.println(d);

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);

//        driver.findElement(By.linkText("Best Sellers")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.cssSelector("div[class*='p13n-sc-truncated']")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.linkText("Best Sellers")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[2]/div[2]/div/a[2]/span/div")).click();
//
//        driver.findElement(By.linkText("Best Sellers")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/ol/li[3]/div[2]/div/a[2]/span/div")).click();

        Thread.sleep(5000);
        driver.close();
    }

}




