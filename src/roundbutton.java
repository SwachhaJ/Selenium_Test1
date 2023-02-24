import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class roundbutton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///Users/swachhajoshi/demo_example/utilis/radio.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("D:\\Softwares\\Testing\\Examples\\Selenium_Test\\Utils\\radio.html");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        int a = driver.findElements(By.xpath("//input [@name='group1']")).size();

        System.out.println(a);

        for(int i=0;i<a;i++) {
            driver.findElements(By.xpath("//input [@name='group1']")).get(i).click();
            String value = driver.findElements(By.xpath("//input [@name='group1']")).get(i).getAttribute("value");
            System.out.println(value+"\n");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




        driver.close();
        driver.quit();
        }
}
