//Using Page Factory
package study.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.*;


public class LoginPage2 {
	WebDriver driver;
	
	//Constructor
	public LoginPage2(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Locators
	@FindBy(xpath = "//input[@name='username']")
	WebElement loc_input_username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement loc_input_password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loc_click_login;
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	
	//Action Methods
	public void enterUsername(String username) {
		loc_input_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		loc_input_password.sendKeys(password);
	}
	
	public void clickLogin() {
		loc_click_login.click();
	}
}
