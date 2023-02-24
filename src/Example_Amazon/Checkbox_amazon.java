package Example_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox_amazon {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics");
        driver.findElement(By.linkText("Today's Deals")).click();

//        WebElement element = driver.findElement(By.xpath("//*[@id='grid-main-container']/div[2]/span[3]/ul/li[1]"));
//        System.out.println(element.isSelected());
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
//        element.click();
//        System.out.println(element.isSelected());
//        String checkboxvalue=element.getText();
//        System.out.println("Successfully click on checkbox : "+ checkboxvalue);


          int v = driver.findElements(By.xpath("//*[@class='CheckboxFilter-module__checkboxLabel_21MUk0e7QdlZKH5Xcwap-F']")).size();
          System.out.println("Total Number of checkbox is "+ v);
          for(int i=3;i<v;i++) {
              driver.findElements(By.xpath("//*[@class='CheckboxFilter-module__checkboxLabel_21MUk0e7QdlZKH5Xcwap-F']")).get(i).click();
              String value = driver.findElements(By.xpath("//*[@class='CheckboxFilter-module__checkboxLabel_21MUk0e7QdlZKH5Xcwap-F']")).get(i).getText();
              System.out.println((i-2)+":" +value+"\n");
          }

        driver.close();
        driver.quit();

    }
}
