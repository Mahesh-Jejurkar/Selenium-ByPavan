package Selenium;

import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel_FixedDepositCalculator 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\input-files\\FixedDepositCalculator_InputData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		Thread.sleep(5000);
		WebElement element_text = driver.findElement(By.xpath("//span[text()='Fixed Deposit Calculator:']"));
		js.executeScript("arguments[0].scrollIntoView()", element_text);

		for (int i = 1; i <= rowCount; i++) 
		{
			XSSFRow currentRow = sheet.getRow(i);

			int principalValue = (int) currentRow.getCell(0).getNumericCellValue();
			driver.findElement(By.xpath("//*[@id='principal']")).sendKeys(String.valueOf(principalValue));

			double rateOfInterest = currentRow.getCell(1).getNumericCellValue();
			driver.findElement(By.xpath("//*[@id='interest']")).sendKeys(String.valueOf(rateOfInterest));

			int tenure = (int) currentRow.getCell(2).getNumericCellValue();
			driver.findElement(By.xpath("//*[@id='tenure']")).sendKeys(String.valueOf(tenure));

			String tenurePeriod = currentRow.getCell(3).getStringCellValue();
			Select s = new Select(driver.findElement(By.xpath("//*[@id='tenurePeriod']")));
			s.selectByVisibleText(tenurePeriod);

			String frequency = currentRow.getCell(4).getStringCellValue();
			Select s2 = new Select(driver.findElement(By.xpath("//*[@id='frequency']")));
			s2.selectByVisibleText(frequency);

			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();

			double expectedMaturityValue = currentRow.getCell(5).getNumericCellValue();

			String maturityValue = driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
			double actualMaturityValue = Double.parseDouble(maturityValue);

			System.out.print(principalValue + "\t" + rateOfInterest + "\t" + tenure + "\t" + tenurePeriod + "\t"
					+ frequency + "\t" + expectedMaturityValue + "\n");

			if (actualMaturityValue == expectedMaturityValue) 
			{
				System.out.println("Test Passed...");
			} 
			else 
			{
				System.out.println("Test Failed...");
			}
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
		}
		
		workbook.close();
		file.close();
		Thread.sleep(5000);
		driver.close();
	}
}
