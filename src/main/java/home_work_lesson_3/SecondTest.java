package home_work_lesson_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SecondTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("http://selenium1py.pythonanywhere.com/ru/accounts/login/");


        WebElement webElement1 = driver.findElement(By.id("id_login-username"));
        webElement1.sendKeys("helen_perets@mail.ru");
        Thread.sleep(2000);

        WebElement webElement2 = driver.findElement(By.id("id_login-password"));
        webElement2.sendKeys("Musya2017");
        Thread.sleep(2000);

        WebElement webElement3 = driver.findElement(By.name("login_submit"));
        webElement3.click();
        Thread.sleep(2000);
    }

}
