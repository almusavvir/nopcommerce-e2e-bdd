package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//src//test//resources//features",
        glue = {"stepDefinitions"},
        dryRun = true,
        monochrome = true,
        tags = "@customer",
        plugin = {"pretty", "json:target/cucumber.json", "junit:target/cucumber.xml"}
        //plugin = {"pretty" , "html:test-output/CucumberReports/reports1.html"}
)
public class CustomerAddTest {

}