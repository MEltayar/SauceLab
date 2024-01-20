package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends PageBase{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By prodcutName = By.xpath("//a[@id='item_4_title_link']");

    public void selectProduct()
    {

        Utils.clickButton(driver,prodcutName);
    }

}
