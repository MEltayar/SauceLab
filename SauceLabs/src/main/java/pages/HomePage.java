package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    Actions actions;
    By burgerMenuBtn = By.id("react-burger-menu-btn");
    By filterDropDown = By.xpath("//div//select[@class='product_sort_container']");
    By cartBtn = By.id("shopping_cart_container");
    public By sauceLabsBackpackAddToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    public  By sauceLabsBackpackRemoveBtn = By.id("remove-sauce-labs-backpack");

    public void addProductToCart(WebDriver driver)
    {
        Utils.clickButton(driver, sauceLabsBackpackAddToCartBtn );
    }
    public void removeProductFromCart(WebDriver driver)
    {
        Utils.clickButton(driver, sauceLabsBackpackRemoveBtn );
    }
    public void openCartPage(WebDriver driver)
    {
        Utils.clickButton(driver, cartBtn );
    }
    public void openBurgerMenu(WebDriver driver)
    {
        Utils.clickButton(driver, burgerMenuBtn );
    }
    public void openDropDownMenu(WebDriver driver)
    {
        Utils.clickButton(driver, filterDropDown );
    }

}
