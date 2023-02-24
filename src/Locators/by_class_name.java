package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class by_class_name {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.className("form-control")).sendKeys("Macbook");
        Thread.sleep(2000);

        driver.findElement(By.className("form-control")).clear();
        Thread.sleep(2000);

        driver.findElement(By.className("form-control")).sendKeys("iphone");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#search>span>button")).click();

        Thread.sleep(5000);
        driver.close();



    }

}
