//Without using Page Factory
package study.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {

	WebDriver driver;
	
	//Constructor
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locator
	By loc_input_username = By.xpath("//input[@name='username']");
	By loc_input_password = By.xpath("//input[@name='password']");
	By loc_btn_login = By.xpath("//button[@type='submit']");
	
	//Action Methods
	public void enterUsername(String username) {
		driver.findElement(loc_input_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(loc_input_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loc_btn_login).click();
	}
	

}
