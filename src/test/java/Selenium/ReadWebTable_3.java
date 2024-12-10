package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadWebTable_3 extends BaseClass 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = getDriver();
		JavascriptExecutor js = getJavascriptExecutor();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		WebElement txt_webtable = driver.findElement(By.xpath("//h2[text()='Web Table']"));
		js.executeScript("arguments[0].scrollIntoView(true);", txt_webtable);

		WebElement table_book = driver.findElement(By.xpath("//table[@name='BookTable']"));

		// Get rows
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No. of rows : " + row);

		// Get columns
		int column = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println("No. of columns : " + column);

		// Get all table data
		for (int r = 2; r <= row; r++) 
		{
			for (int c = 1; c <= column; c++) 
			{
				WebElement el_data = table_book.findElement(By.xpath("//tr[" + r + "]//td[" + c + "]"));
				String originalColor = (String) js
						.executeScript("return window.getComputedStyle(arguments[0]).backgroundColor;", el_data);
				js.executeScript("arguments[0].style.backgroundColor='green'", el_data);
				Thread.sleep(1000);
				js.executeScript("arguments[0].style.backgroundColor=arguments[1]", el_data, originalColor);
				String data = el_data.getText();
				System.out.print(data + "\t");
			}
			System.out.println();
		}

		Thread.sleep(2000);

		// Get data based on condition. here name of book written by author Mukesh
		for (int r = 2; r <= row; r++) 
		{
			String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]"))
					.getText();
			if (authorname.equalsIgnoreCase("Mukesh")) 
			{
				WebElement el_data = table_book.findElement(By.xpath("//tr[" + r + "]//td[1]"));
				String data = el_data.getText();
				System.out.print(data + "\t");

				String originalColor = (String) js
						.executeScript("return window.getComputedStyle(arguments[0]).backgroundColor;", el_data);
				js.executeScript("arguments[0].style.backgroundColor='green'", el_data);
				Thread.sleep(500);
				js.executeScript("arguments[0].style.backgroundColor=arguments[1]", el_data, originalColor);
			}
			System.out.println();
		}

		Thread.sleep(2000);
		// Get price of all the books.
		int totalPrice = 0;
		for (int r = 2; r <= row; r++) 
		{

			WebElement we_price = table_book.findElement(By.xpath("//tr[" + r + "]//td[4]"));
			String price = we_price.getText();
			totalPrice = totalPrice + Integer.parseInt(price);

			String originalColor = (String) js
					.executeScript("return window.getComputedStyle(arguments[0]).backgroundColor;", we_price);
			js.executeScript("arguments[0].style.backgroundColor='green'", we_price);
			Thread.sleep(500);
			js.executeScript("arguments[0].style.backgroundColor=arguments[1]", we_price, originalColor);
		}
		System.out.println("Total price of all the books : "+totalPrice);

		closeDriver();
	}
}
