package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_tag_class_attribute {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

          driver.findElement(By.cssSelector("input.form-control[type=text]")).sendKeys("iphone");
          driver.findElement(By.cssSelector("button.btn-default[type=button]")).click();

        Thread.sleep(5000);
        driver.close();

    }
}
