package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import global.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utility.Util;

public class LoginStepDefination {
	private WebDriver driver = Base.getDriver();
	LoginPage loginPage = new LoginPage();

	@Given("I am on the login page")
	public void i_am_on_the_login_page() throws InterruptedException, IOException {
		driver.get(Util.getEnv("QA1_URL"));
		// driver.get("https://practicetestautomation.com/practice-test-login/?utm_source=chatgpt.com");
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String user, String pass) {
		loginPage.userEnterTheUserIDAndPassword(user, pass);
	}

	@Then("I should be redirected to the homepage")
	public void i_should_be_redirected_to_the_homepage() throws InterruptedException {
		loginPage.validateUserOnLoginPage();
	}

}
