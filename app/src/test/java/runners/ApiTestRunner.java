package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/api",
        glue = "stepdefinitions.api",
        plugin = {
                "pretty",
                "html:build/reports/api-cucumber.html",
                "json:build/reports/api-cucumber.json"
        }
)
public class ApiTestRunner {
}
