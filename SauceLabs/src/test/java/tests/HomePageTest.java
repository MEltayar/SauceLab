package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.Utils;

public class HomePageTest extends TestBase {

ProductPage productPage;
LoginPage login;
HomePage homePage;
Utils.JsonFileManager readData = new Utils.JsonFileManager("src/test/java/data/TestData.json");
String realProductName = "Sauce Labs Fleece Jacket";
@Test
public void directToTheRightProduct() {
    login = new LoginPage(driver);
    login.userLogin(readData.getTestData("username"), readData.getTestData("password"));
    WebElement element1 = driver.findElement(By.xpath("//a[@id='item_4_title_link']"));
    String productNameInHomePage = element1.getText();
    productPage = new ProductPage(driver);
    productPage.selectProduct();
    WebElement element2 = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']"));
    String productNameInTheSpecificProductPage = element2.getText();
    Assert.assertEquals(productNameInHomePage,productNameInTheSpecificProductPage);
}

@Test
public void addProductToCart(){
    login = new LoginPage(driver);
    login.userLogin(readData.getTestData("username"), readData.getTestData("password"));
    homePage = new HomePage(driver);
    homePage.addProductToCart(driver);
    WebElement element = driver.findElement(By.id("remove-sauce-labs-backpack"));
    String removeText = element.getText();
    Assert.assertEquals(removeText,"Remove");
}
    @Test
    public void removeProductFromCart(){
        login = new LoginPage(driver);
        login.userLogin(readData.getTestData("username"), readData.getTestData("password"));
        homePage = new HomePage(driver);
        homePage.addProductToCart(driver);
        homePage.removeProductFromCart(driver);

        WebElement element = driver.findElement(By.id("remove-sauce-labs-backpack"));
        String addToCartText = element.getText();
        Assert.assertEquals(addToCartText,"Add to Cart");
    }






}
