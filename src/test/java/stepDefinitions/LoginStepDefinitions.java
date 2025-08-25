package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LoginPage;

public class LoginStepDefinitions {

    public WebDriver driver;
    public LoginPage lp;

    @Given("User launches Chrome browser")
    public void user_launches_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        lp = new LoginPage(driver);
    }

    @When("user opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("user enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        lp.setTxtEmail(email);
        lp.setTxtPassword(password);
    }

    @When("Clicks on Login")
    public void clicks_on_login() {
        lp.clickLoginBtn();
    }

    @Then("Page Title should be {string}")
    public void verify_pagetitle (String expectedTitle) {
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            Assert.assertTrue(true); // pass
        } else {
            Assert.assertTrue(false);
        }
    }

    @When("User clicks on Logout link")
    public void user_clicks_on_logout_link() throws InterruptedException {
        lp.clickLogoutBtn();
    }

    @Then("Close Browser")
    public void close_browser() {
        driver.close();
        driver.quit();
    }
}
