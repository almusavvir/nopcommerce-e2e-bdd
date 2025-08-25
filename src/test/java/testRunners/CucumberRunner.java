package testRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//src//test//features",
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty" , "html:test-output/CucumberReports/reports1.html"}
)
public class CucumberRunner {

}