package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://gb.ru/login");

        WebElement webElement1 = driver.findElement(By.id("user_email"));
        webElement1.sendKeys("helen_perets@mail.ru");
        Thread.sleep(2000);

        WebElement webElement2 = driver.findElement(By.id("user_password"));
        webElement2.sendKeys("Crocodilerock_john87");
        Thread.sleep(2000);

        WebElement webElement4 = driver.findElement(By.linkText("Забыли пароль?"));
        webElement4.click();
        Thread.sleep(2000);

       // WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[4]/input"));
        //webElement3.click();
       // Thread.sleep(2000);

    }
}
