package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    public WebDriver driver;


    public DashboardPage(WebDriver driver) { super(driver);}

    //locators
    @FindBy(xpath = "//input[@id='Email']")
    WebElement customerMainMenuItem;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement customerSubMenuItem;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement ;
    @FindBy(linkText = "Logout")
    WebElement btnLogout;

    //action methods
    public void setTxtEmail (String email) {
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }
    public void setTxtPassword (String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }
    public void clickLoginBtn () {
        btnLogin.click();
    }
    public void clickLogoutBtn () throws InterruptedException {
        Thread.sleep(2000);
        btnLogout.click();
    }
}