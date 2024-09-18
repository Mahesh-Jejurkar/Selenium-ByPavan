package opencart_PageFactoryModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_2 {
	WebDriver driver;
	
	//Constructor
	public LoginPage_2(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement element_input_email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement element_input_password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement element_button_login;
	
	@FindBy(tagName = "a")
	List<WebElement> allLinks;
	
	//Action methods
	public void enterEmail(String email) {
		element_input_email.sendKeys(email);
	}

	public void enterPassword(String password) {
		element_input_password.sendKeys(password);
	}
	
	public void clickLogin() {
		element_button_login.click();
	}
}
