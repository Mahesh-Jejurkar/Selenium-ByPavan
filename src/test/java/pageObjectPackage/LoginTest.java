package pageObjectPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

	// @Test(priority = 1)
	public void test1() {
		loginpage.enterName("Mahesh Jejurkar");
		loginpage.enterEmail("mahesh.jejurkar@gmail.com");
		loginpage.enterPhone("1234567898");
		loginpage.enterAddress("Pune");
	}

//	@Test(priority = 2)
	public void test2() {
		js.executeScript("arguments[0].scrollIntoView(true)", loginpage.link_home);
		action.moveToElement(loginpage.link_home).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

	}

//	@Test(priority = 3)
	public void switchBetweenWindows() throws Exception {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
	}

//	@Test(priority = 4)
	public void iterateTable() {

		int pageCount = loginpage.paginationBox.size();
		System.out.println(pageCount);

		for (int p = 1; p <= pageCount; p++) {
			loginpage.pagination.findElement(By.xpath(".//li[" + p + "]")).click();

			int row = loginpage.table_body.findElements(By.xpath(".//tr")).size();
			System.out.println(row);

			for (int i = 1; i <= row; i++) {
				String id = loginpage.table_body.findElement(By.xpath(".//tr[" + i + "]//td[1]")).getText();
				String name = loginpage.table_body.findElement(By.xpath(".//tr[" + i + "]//td[2]")).getText();
				String price = loginpage.table_body.findElement(By.xpath(".//tr[" + i + "]//td[3]")).getText();
				WebElement selectBox = loginpage.table_body.findElement(By.xpath(".//tr[" + i + "]//td[4]//input"));

				System.out.println(id + " " + name + " " + price);
				selectBox.click();
			}

		}
	}

	public List<String> getDropdownValues() throws Exception {
		scrollToElement(loginpage.dropdownlist);
		Thread.sleep(1000);
		loginpage.clickOnDropdownList();
		Thread.sleep(1000);
		int itemCount = loginpage.getDropdownItemCount();

		List<String> dropDownValues = new ArrayList<String>();

		for (int i = 1; i <= itemCount; i++) {
			dropDownValues.add(loginpage.getDropdownValues(i));
		}

		return dropDownValues;
	}

//	@Test(priority = 5)
	public void matchValues() throws Exception {
		List<String> dropDownValues = getDropdownValues();
		String[] ExpectedValues = { "Item 77", "Item 73", "Item 42" };
		boolean found = false;

		for (int i = 0; i < ExpectedValues.length; i++) {
			found = false;
			String currentExpectedValue = ExpectedValues[i];
			for (int j = 0; j < dropDownValues.size(); j++) {
				String currentActualValue = dropDownValues.get(j);
				if (currentExpectedValue.equals(currentActualValue)) {
					found = true;
					break;
				}
			}
			System.out.println(currentExpectedValue+" : "+found);
		}
	}
	
//	@Test(priority = 6)
	public void doDragDrop() {
		Actions act = dragAndDrop(loginpage.sourceDraggable, loginpage.targetDroppable);
		act.build().perform();
	}

//	@Test(priority = 7)
	public void doCopyPaste() {
		String value = loginpage.getInputField1Value();
		loginpage.enterInputField2Value(value);
	}
	
//	@Test(priority = 8)
	public void doDoubleClick() throws Exception {
		scrollToElement(loginpage.labelDoubleClick);
		Thread.sleep(1000);
		doubleClick(loginpage.buttonCopyText);
	}
	
//	@Test(priority = 9)
	public void doMouseOver() throws Exception {
		moveToElement(loginpage.labelDoubleClick);
		Thread.sleep(1000);
		mouseOver(loginpage.buttonPoinMe);
	}
	
//	@Test(priority = 10)
	public void selectDate1() {
		String expectedYear = "2025";
		String expectedMonth = "December";
		String expectedDate = "25";

		scrollToElement(loginpage.datePicker1);
		loginpage.clickDatePicker();

		do {
			String actualMonth = loginpage.getMonth();
			String actualYear = loginpage.getYear();

			if (actualMonth.equals(expectedMonth) && actualYear.equals(expectedYear)) {
				System.out.println(actualMonth);
				System.out.println(actualYear);
				break;
			}

			loginpage.clickNext();
		} while (true);
		
		List<WebElement> allDates = loginpage.getListOfDates();
		
		for(int i=0; i<allDates.size(); i++) {
			String currentDate = allDates.get(i).getText();
			if(currentDate.equals(expectedDate)) {
				allDates.get(i).click();
				break;
			}
		}
	}
	
//	@Test(priority = 11)
	public void doMultiSelect() {
		Select s = select(loginpage.webElementSelect);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement options : allOptions) {
			System.out.println(options.getText());
		}
		
		s.selectByIndex(1);
		s.selectByValue("yellow");
		s.selectByVisibleText("White");
		
		List<WebElement> allSelectedOption = s.getAllSelectedOptions();
		for(WebElement options : allSelectedOption) {
			System.out.println(options.getText());
		}
		
		System.out.println(s.getFirstSelectedOption().getText());
	}
	
//	@Test(priority = 12)
	public void checkListIsSorted() {
		List<String> values = new ArrayList<String>();
		List<String> tempValues = new ArrayList<String>();
		
		Select s = select(loginpage.webElementSelect);
		List<WebElement> allOptions = s.getOptions();
		
		for(WebElement options : allOptions) {
			values.add(options.getText());
		}
		
		tempValues.addAll(values);
		
		System.out.println(tempValues);
		Collections.sort(values);
		System.out.println(values);
		
		if(tempValues.equals(values)) {
			System.out.println("Sorted...");
		}else {
			System.out.println("Not sorted...");
		}
	}
	
//	@Test(priority = 13)
	public void checkAllDays() {
		List<WebElement> allDays = loginpage.getAllDays();
		
		for(WebElement day : allDays) {
			day.click();
		}
	}
	
	@Test
	public void testSwitchWindow() {
		scrollToElement(loginpage.buttonPopupWindow);
		loginpage.clickPopupWindow();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String window = it.next();
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		}
	}
	
	
	
}
