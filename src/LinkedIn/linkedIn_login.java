package LinkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedIn_login {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/home");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        driver.findElement(By.cssSelector("input[id='session_key']")).sendKeys("sweak22@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='session_key']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='session_key']")).sendKeys("sweak@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input.input__input[id='session_password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.input__input[id='session_password']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.input__input[id='session_password']")).sendKeys("1234567");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("button.sign-in-form__submit-button[class='sign-in-form__submit-button']")).sendKeys("Keys.ENTER");

        Thread.sleep(5000);
        driver.close();
    }

}
