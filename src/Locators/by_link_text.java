package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class by_link_text {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
        Thread.sleep(2000);

       // driver.findElement(By.linkText("MacBook")).click();

      // String linktext1=driver.findElement(By.linkText("Canon EOS 5D")).getText();
       // System.out.println(linktext1);

       // driver.findElement(By.linkText("Canon EOS 5D")).click();

        driver.findElement(By.linkText("Apple Cinema 30\"")).click();

        Thread.sleep(5000);

        driver.close();

    }
}
