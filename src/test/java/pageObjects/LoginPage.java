package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public WebDriver driver;


    public LoginPage(WebDriver driver) { super(driver);}

    //locators
    @FindBy(xpath = "//input[@id='Email']")
    WebElement txtEmail;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement btnLogin;
    @FindBy(linkText = "Logout")
    WebElement btnLogout;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement InvalidLoginMsg;

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
    public void clickLogoutBtn () {
        btnLogout.click();
    }
    public String getInvalidLoginMsg() {
        return InvalidLoginMsg.getText().replace("\n", " ").trim();
    }
}
