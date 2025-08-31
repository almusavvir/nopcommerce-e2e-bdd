package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.Assert;
import pageObjects.LoginPage;

import java.net.SocketException;

public class LoginStepDefinitions {

    public WebDriver driver;
    public LoginPage lp;

    @Given("User launches Chrome browser")
    public void user_launches_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        lp = new LoginPage(driver);
    }

    @Given("User launches Edge browser")
    public void user_launches_edge_browser() {
        driver = new EdgeDriver();
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
            driver.quit();
        }
    }

    @Then("user should see error message {string}")
    public void user_should_see_error_message(String expectedLoginMsg) {
        String actualMessage = lp.getInvalidLoginMsg();
        if (actualMessage.equals(expectedLoginMsg)) {
            Assert.assertTrue(true); // pass
        } else {
            Assert.assertTrue(false);
            driver.quit();
        }
    }

    @When("User clicks on Logout link")
    public void user_clicks_on_logout_link() throws InterruptedException, SocketException {
        Thread.sleep(2000);
        lp.clickLogoutBtn();
    }

    @Then("Close Browser")
    public void close_browser() {
        //driver.close();
        driver.quit();
    }

    @Then("user should see error message:")
    public void userShouldSeeErrorMessage(String expectedLoginMsg) {
        String actualMessage = lp.getInvalidLoginMsg();
        if (actualMessage.equals(expectedLoginMsg)) {
            Assert.assertTrue(true); // pass
        } else {
            Assert.assertTrue(false);
            driver.quit();
        }
    }
}
