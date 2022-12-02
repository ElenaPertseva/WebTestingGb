package home_work_lesson_6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Test {
    private static WebDriver webDriver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Assertions.assertDoesNotThrow( ()-> webDriver.navigate().to("http://selenium1py.pythonanywhere.com/ru/accounts/login/"),
                "Страница не доступна");
    }

    @AfterAll
    static void close()
    {
        webDriver.quit();
    }

    public WebDriver getWebDriver(){
        return this.webDriver;
    }
}
