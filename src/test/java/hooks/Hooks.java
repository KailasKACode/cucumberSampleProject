package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import global.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void setup() {
		driver = Base.getDriver();
	}

	@After
	public void tearDown(Scenario scenario) {

		Base.closeDriver();
	}

}
