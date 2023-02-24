package Example_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class roundbutton_amazon {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/amazonprime?tag=googhydr-20&hvadid=550213431242&hvpos=&hvexid=&hvnetw=g&hvrand=18107041371293026207&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9024585&hvtargid=kwd-3151046130&ref=pd_sl_34qfrygf2i_e");
        {
       int z = driver.findElements(By.xpath("//*[@class='a-row plan-card-text headline2']")).size();
       System.out.println("Total Number of checkbox is "+ z);
        for(int i=0;i<z;i++) {
            driver.findElements(By.xpath("//*[@class='a-row plan-card-text headline2']")).get(i).click();
            String value = driver.findElements(By.xpath("//*[@class='a-row plan-card-text headline2']")).get(i).getText();
            System.out.println((i+1)+":" +value+"\n");
        }}
        // driver.navigate().to("https://www.amazon.com/amazonprime?tag=googhydr-20&hvadid=550213431242&hvpos=&hvexid=&hvnetw=g&hvrand=18107041371293026207&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9024585&hvtargid=kwd-3151046130&ref=pd_sl_34qfrygf2i_e");
        //driver.findElements(By.xpath("//*[@class='a-row plan-card-text headline2']")).click();
        //driver.navigate().back();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id='plan-comparison-cta']/form/div/input")).click();

        driver.close();
        driver.quit();
    }
    }
