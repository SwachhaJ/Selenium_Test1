package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class by_name {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.name("email")).sendKeys("sweak22@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();

        Thread.sleep(5000);




    }
}
