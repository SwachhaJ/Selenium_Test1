package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class by_partial_linktext {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
        Thread.sleep(2000);


      //  driver.findElement(By.partialLinkText("Apple")).click();

        driver.findElement(By.partialLinkText("Mac")).click();

        Thread.sleep(5000);
        driver.close();


    }
}
