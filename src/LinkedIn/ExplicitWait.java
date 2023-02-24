package LinkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("https://www.linkedin.com/home");

        WebElement email = driver.findElement(By.name("session_key"));
        WebElement pass = driver.findElement(By.name("session_password"));

        sendkeys(driver, email, 10, "sweak22@gmail.com");
        sendkeys(driver, pass, 20, "123456");

        WebElement forgotAccount=driver.findElement(By.linkText("Forgot password?"));

        clickOn(driver,forgotAccount, 10);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.close();
    }

    public static void sendkeys(WebDriver driver1, WebElement element, int timeout, String value) {

        new WebDriverWait(driver1,
                Duration.ofDays(timeout)).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public static void clickOn(WebDriver driver1, WebElement element, int timeout) {
        new WebDriverWait(driver1,
                Duration.ofDays(timeout)).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}

