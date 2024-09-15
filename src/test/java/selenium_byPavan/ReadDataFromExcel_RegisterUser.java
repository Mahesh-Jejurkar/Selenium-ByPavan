package selenium_byPavan;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel_RegisterUser {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\input-files\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("UserData");
		int noOfRow = sheet.getPhysicalNumberOfRows();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		Thread.sleep(2000);

		for (int r = 1; r < noOfRow; r++) {
			XSSFRow current_row = sheet.getRow(r);
			String firstname = current_row.getCell(0).getStringCellValue();
			String lastname = current_row.getCell(1).getStringCellValue();
			String email = current_row.getCell(2).getStringCellValue();
			double telephone = current_row.getCell(3).getNumericCellValue();
			String password = current_row.getCell(4).getStringCellValue();
			
			driver.findElement(By.id("input-firstname")).sendKeys(firstname);
			driver.findElement(By.id("input-lastname")).sendKeys(lastname);
			driver.findElement(By.id("input-email")).sendKeys(email);
			driver.findElement(By.id("input-telephone")).sendKeys(String.valueOf(telephone));
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.id("input-confirm")).sendKeys(password);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='list-group'] //*[text()='Logout']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='list-group'] //*[text()='Register']")).click();
			Thread.sleep(2000);
		}
		
		workbook.close();
		Thread.sleep(9000);
		driver.close();
	}

}
