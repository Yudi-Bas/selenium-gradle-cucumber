package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/web",
        glue = "stepdefinitions.web",
        plugin = {
                "pretty",
                "html:build/reports/web-cucumber.html",
                "json:build/reports/web-cucumber.json"
        }
)
public class WebTestRunner {
}
