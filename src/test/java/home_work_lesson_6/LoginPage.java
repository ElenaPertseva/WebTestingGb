package home_work_lesson_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{

    @FindBy(id = "login_link")
    private WebElement login_button;
    @FindBy(id = "id_login-username")
    private WebElement enter_username;
    @FindBy(id = "id_login-password")
    private WebElement enter_password;
    @FindBy(name = "login_submit")
    private WebElement login_submit_button;

    @FindBy(id = "logout_link")
    private WebElement logout_button;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage clickLogoutButton(){
        logout_button.click();
        return this;
    }

    public LoginPage clickLoginButton(){
        login_button.click();
        return this;
    }
    public LoginPage sendKeysUsername(){
        enter_username.sendKeys("helen_perets@mail.ru");
        return this;
    }
    public LoginPage sendKeysPassword(){
        enter_password.sendKeys("Musya2017");
        return this;
    }
    public LoginPage clickLoginSubmitButton(){
        login_submit_button.click();
        return this;
    }

}


