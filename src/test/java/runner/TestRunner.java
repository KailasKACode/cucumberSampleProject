package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "steps", "hooks" }, plugin = { "pretty",
		"html:target/cucumber-reports.html" }, strict = true, monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {

}
