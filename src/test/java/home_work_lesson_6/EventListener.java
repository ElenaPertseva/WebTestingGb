package home_work_lesson_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class EventListener  extends Test {
    @org.junit.jupiter.api.Test
    void test(){
        try {
            getWebDriver().findElement(By.id("нет такого"));
        } catch (NoSuchElementException e){
            MyUtils.makeScreenshot(getWebDriver(),
                    "failure- org.example.bbc.EventListenerTest.test" + System.currentTimeMillis() + ".png");
        }

    }


    @org.junit.jupiter.api.Test
    void test2(){
        WebElement webElement = getWebDriver().findElement(By.cssSelector(".sb-icon-search"));
        webElement.click();

    }
}


