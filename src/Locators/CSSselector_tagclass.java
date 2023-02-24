package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector_tagclass {
        public static void main (String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input.form-control ")).sendKeys("Macbook");
            driver.findElement(By.cssSelector("input.form-control ")).clear();
            driver.findElement(By.cssSelector("input.form-control ")).sendKeys("iphone");
            driver.findElement(By.cssSelector("input.form-control ")).clear();
            driver.findElement(By.cssSelector("input.form-control ")).sendKeys("Apple Cinema 30\"");
            driver.findElement(By.cssSelector("button.btn-default")).click();

            Thread.sleep(5000);
            driver.close();


        }
    }


