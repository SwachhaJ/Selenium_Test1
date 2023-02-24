package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector_tagid {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#input-email")).sendKeys("sweak22@gmail.com");
        driver.findElement(By.cssSelector("input#input-email")).clear();
        driver.findElement(By.cssSelector("input#input-email")).sendKeys("sweak@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input#input-password")).clear();
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("1234567");

        Thread.sleep(2000);
        driver.close();


    }

}
