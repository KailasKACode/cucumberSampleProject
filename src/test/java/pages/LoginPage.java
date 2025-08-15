	package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import global.Base;

public class LoginPage {
	private WebDriver driver;

	public LoginPage() {
		this.driver = Base.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement inputUsername;

	@FindBy(xpath = "//input[@name='password']")
	WebElement inputPassword;

	@FindBy(id = "submit")
	WebElement submitBtn;

	@FindBy(xpath = "//h1[text()='Logged In Successfully']")
	WebElement successMSG;

	public void userEnterTheUserIDAndPassword(String user, String password) {
		inputUsername.sendKeys(user);
		inputPassword.sendKeys(password);
		submitBtn.click();
	}

	public void validateUserOnLoginPage() {
		String ssmg = successMSG.getText();
		if (ssmg.equals("Logged In Successfully")) {
			System.out.println("User login successfully");
		} else
			System.out.println("Please check url");

	}

}
