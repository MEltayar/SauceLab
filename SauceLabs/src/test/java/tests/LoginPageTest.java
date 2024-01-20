package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Utils;

public class LoginPageTest extends TestBase {

LoginPage login;
Utils.JsonFileManager readData = new Utils.JsonFileManager("src/test/java/data/TestData.json");
@Test
public void loginSuccessfully(){
    login = new LoginPage(driver);
    login.userLogin(readData.getTestData("username"), readData.getTestData("password"));
    WebElement element = driver.findElement(By.xpath("//div//span[@class='title']"));
    String Products = element.getText();
    Assert.assertEquals(Products,"Products");
}
}
