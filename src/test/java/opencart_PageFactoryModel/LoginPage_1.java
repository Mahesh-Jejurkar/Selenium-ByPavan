package opencart_PageFactoryModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_1 {
	WebDriver driver;

	// Constructor
	LoginPage_1(WebDriver driver) {
		this.driver = driver;
	}

	// Locator
	By locator_input_email = By.xpath("//input[@id='input-email']");
	By locator_input_password	= By.xpath("//input[@id='input-password']");
	By locator_button_login = By.xpath("//input[@value='Login']");

	// Action methods
	public void enterEmail(String email) {
		driver.findElement(locator_input_email).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(locator_input_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(locator_button_login).click();
	}
}
