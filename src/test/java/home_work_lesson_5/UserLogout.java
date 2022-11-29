package home_work_lesson_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLogout extends AbstractStart{

    private static Logger logger = LoggerFactory.getLogger(UserLogout.class);

    @Test
    @DisplayName("Logout TEST")
    void user_logout() {

        getDriver().findElement(By.id("login_link")).click();
        getDriver().findElement(By.id("id_login-username")).sendKeys("helen_perets@mail.ru");
        getDriver().findElement(By.id("id_login-password")).sendKeys("Musya2017");
        getDriver().findElement(By.name("login_submit")).click();
        Assertions.assertEquals("Oscar - Sandbox", getDriver().getTitle());

        logger.info("Logout");
        getDriver().findElement(By.id("logout_link")).click();
        Assertions.assertEquals("Oscar - Sandbox", getDriver().getTitle());

    }

}
