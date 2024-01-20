package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
By userName = By.id("user-name");
By Password = By.id("password");
By loginBtn = By.id("login-button");

public void userLogin(String User_Name, String password) {

        Utils.setText(driver, userName, User_Name);
        Utils.setText(driver, Password, password);
        Utils.clickButton(driver, loginBtn);
    }

}

