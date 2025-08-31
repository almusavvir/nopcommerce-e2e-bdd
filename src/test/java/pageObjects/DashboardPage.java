package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    public WebDriver driver;


    public DashboardPage(WebDriver driver) { super(driver);}

    //locators
    @FindBy (xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    WebElement CustomerHamburgerMenu;
    @FindBy (xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
    WebElement CustomerSubmenuItem;


    //action methods
    public void clickCustomerHamburgerMenu () {
        CustomerHamburgerMenu.click();
    }
    public void clickCustomerSubmenuItem () {
        CustomerSubmenuItem.click();
    }
}