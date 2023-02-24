package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class by_tag_name {
    public static void main (String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.tagName("button")).click();
        // String textvalue= driver.findElement(By.tagName("fa fa-caret-down")).getText();

        // System.out.println(textvalue);

        Thread.sleep(5000);

    }
}
