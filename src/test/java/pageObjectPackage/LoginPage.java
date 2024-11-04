package pageObjectPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@id='name']")
	public WebElement textbox_name;
	
	@FindBy (xpath = "//input[@id='email'] ")
	public WebElement textbox_email;
	
	@FindBy (xpath = "//input[@id='phone'] ")
	public WebElement textbox_phone;
	
	@FindBy (xpath = "//textarea[@id='textarea'] ")
	public WebElement textarea_address;
	
	@FindBy (xpath = "//div[@class='widget-content'] //a[text()='Home']")
	public WebElement link_home;
	
	@FindBy (xpath = "//div[@class='widget-content'] //a[text()='Hidden Elements & AJAX']")
	public WebElement link_element;
	
	@FindBy (xpath = ".//tr")
	public WebElement table_row;
	
	@FindBy (xpath = ".//td")
	public WebElement table_cell;
	
	@FindBy (xpath = "//*[@id='productTable']//tbody")
	public WebElement table_body;
	
	@FindBy (xpath = "//*[@id='pagination']//li")
	public List<WebElement> paginationBox;
	
	@FindBy (xpath = "//*[@id='pagination']")
	public WebElement pagination;
	
	@FindBy ( xpath = "//input[@id='comboBox']")
	public WebElement dropdownlist;
	
	@FindBy ( xpath = "//div[@id='dropdown']")
	public WebElement dropdownvalues;
	
	@FindBy (xpath = "//div[@id='dropdown']//div")
	public List<WebElement> dropdowncount;
	
	
	@FindBy (xpath = "//h2[text()='Drag and Drop']")
	WebElement labelDragDrop;
	
	@FindBy (xpath = "//div[@id='draggable']")
	WebElement sourceDraggable;
	
	@FindBy (xpath = "//div[@id='droppable']")
	WebElement targetDroppable;
	
	@FindBy (xpath = "//h2[text()='Double Click']")
	WebElement labelDoubleClick;
	
	@FindBy (xpath = "//input[@id='field1']")
	WebElement inputField1;
		
	@FindBy (xpath = "//input[@id='field2']")
	WebElement inputField2;
	
	@FindBy (xpath = "//button[text()='Copy Text']")
	WebElement buttonCopyText;
	
	
	@FindBy (xpath = "//*[text()='Point Me']")
	WebElement buttonPoinMe;
	
	
	@FindBy (xpath = "//*[contains(@id,'datepicker')]")
	WebElement datePicker1;
	
	
	@FindBy (xpath = "//div[@class='ui-datepicker-title']//span[1]")
	WebElement datePicker1Month;
	
	@FindBy (xpath = "//div[@class='ui-datepicker-title']//span[2]")
	WebElement datePicker1Year;
	
	@FindBy (xpath = "//table[@class='ui-datepicker-calendar']//tbody//tr//td//a")
	List<WebElement> datePicker1Dates;
	
	@FindBy (xpath = "//*[text()='Next']")
	WebElement buttonNext;
	
	@FindBy (xpath = "//*[text()='Prev']")
	WebElement buttonPrev;
	
	@FindBy (xpath = "//label[text()='Colors:']")
	WebElement labelColor;
	
	@FindBy (xpath = "//select[@id='colors']")
	WebElement webElementSelect;
	
	@FindBy (xpath = "//div[@class='form-group']//label[text()='Days:']")
	WebElement labelDays;
	
	@FindBy (xpath = "//div[@class='form-group']//label[text()='Days:']//parent::div//div/input")
	List<WebElement> allDays;
	
	@FindBy (xpath = "//button[text()='Popup Windows']")
	WebElement buttonPopupWindow;
	
	
	public void clickPopupWindow() {
		buttonPopupWindow.click();
	}
	
	public List<WebElement> getAllDays() {
		return allDays;
	}
	
	public void clickPrev() {
		buttonPrev.click();
	}
	
	public void clickNext() {
		buttonNext.click();
	}
	
	public List<WebElement> getListOfDates() {
		return datePicker1Dates;
	}
	
	public int getCount() {
		return datePicker1Dates.size();
	}
	
	public String getMonth() {
		return datePicker1Month.getText();
	}
	
	public String getYear() {
		return datePicker1Year.getText();
	}
	
	
	public void clickDatePicker() {
		datePicker1.click();
	}
	
	public void enterInputField2Value(String value) {
		inputField2.sendKeys(value);
	}
	
	public String getInputField1Value() {
		return inputField1.getAttribute("value");
	}
	
	public int getDropdownItemCount() {
		return dropdowncount.size();
	}
	
	public String getDropdownValues(int i) {
		return dropdownvalues.findElement(By.xpath(".//div["+i+"]")).getText();
	}
	
	
	public void clickOnDropdownList() {
		dropdownlist.click();
	}
	
	
	public void enterName(String name) {
		textbox_name.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		textbox_email.sendKeys(email);
	}
	
	public void enterPhone(String phone) {
		textbox_phone.sendKeys(phone);
	}
	
	public void enterAddress(String address) {
		textarea_address.sendKeys(address);
	}
	
	public void clickOnHome() {
		link_home.click();
	}
	
	public void clickOnElement() {
		link_element.click();
	}

}
