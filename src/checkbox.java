import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class checkbox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///Users/swachhajoshi/demo_example/utilis/checkbox.html");
//        WebElement element = driver.findElement(By.cssSelector("input[id*='check1']"));
//
//        System.out.println(element.isSelected());
//
//       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
//
//        element.click();
//        System.out.println(element.isSelected());
//        String checkboxvalue=element.getAttribute("value");
//        System.out.println("Successfully click on checkbox : "+ checkboxvalue);
//        driver.findElement(By.name("submit_button1")).click();
//        String result= driver.findElement(By.id("result")).getText();
//        System.out.println("Result: "+result);

        driver.navigate().to("file:///Users/swachhajoshi/demo_example/utilis/checkbox.html");
        WebElement element1 = driver.findElement(By.xpath("//*[@id= 'check6']"));
        System.out.println(element1.isSelected());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
        element1.click();
        System.out.println(element1.isSelected());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
        String checkboxvalue1= element1.getAttribute("value");
        System.out.println("Successfully clicked on checkbox :" +checkboxvalue1);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
        String result1= driver.findElement(By.id("result")).getText();
        System.out.println("result1: "+result1);
       driver.close();
       driver.quit();


    }
    }
