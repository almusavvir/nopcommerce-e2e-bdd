package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    public WebDriver driver;


    public DashboardPage(WebDriver driver) { super(driver);}

    //locators
    @FindBy (xpath = "//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4']/div[@class='sidebar']/nav[@class='mt-2']/ul[@role='menu']/li[@class='nav-item has-treeview menu-open']/a[1]")
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