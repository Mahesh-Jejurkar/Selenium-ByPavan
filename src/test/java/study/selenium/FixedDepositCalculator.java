package study.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDepositCalculator extends ExcelUtils {
	@Test(dataProvider = "getTestData")
	public void launchApp(String principle, String roi, String tenure, String tenurePeriod, String frequency,
			String EMV, int currentRow, int cellAMV, int cellResult) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().window().maximize();
		driver.get(
				"https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");

		WebElement we_fdc = driver.findElement(By.xpath("//*[text()='Fixed Deposit Calculator:']"));
		js.executeScript("arguments[0].scrollIntoView(true)", we_fdc);

		WebElement we_principle = driver.findElement(By.xpath("//*[@id='principal']"));
		WebElement we_roi = driver.findElement(By.xpath("//*[@id='interest']"));
		WebElement we_tenure = driver.findElement(By.xpath("//*[@id='tenure']"));
		WebElement we_tenurePeriod = driver.findElement(By.xpath("//*[@id='tenurePeriod']"));
		Select s_tenurePeriod = new Select(we_tenurePeriod);
		WebElement we_frequency = driver.findElement(By.xpath("//*[@id='frequency']"));
		Select s_frequency = new Select(we_frequency);
		WebElement we_calculate = driver.findElement(By.xpath("//*[@class='CTR PT15']//a[1]//img"));
		WebElement we_maturityvalue = driver.findElement(By.xpath("//*[@id='resp_matval']"));

		we_principle.sendKeys(principle);
		we_roi.sendKeys(roi);
		we_tenure.sendKeys(tenure);
		s_tenurePeriod.selectByVisibleText(tenurePeriod);
		s_frequency.selectByVisibleText(frequency);
		js.executeScript("arguments[0].click()", we_calculate);
		String AMV = we_maturityvalue.getText();
		updateAMV(currentRow, cellAMV, AMV);

		if (AMV.equals(EMV)) {
			updateResult(currentRow, cellResult, "Pass");
			fillGreenColor(currentRow, cellResult);
		} else {
			updateResult(currentRow, cellResult, "Fail");
			fillRedColor(currentRow, cellResult);
		}

		Thread.sleep(5000);
		driver.close();
	}

	@DataProvider(name = "getTestData")
	public Object[][] getTestData() throws Exception {
		String filePath = System.getProperty("user.dir") + "\\test-data\\TestData_FixedDeposit.xlsx";
		String sheetName = "Sheet1";

		int rowCount = getRowCount(filePath, sheetName);
		int cellCount = getCellCount(filePath, sheetName, 0);

		Object[][] obj = new Object[rowCount - 1][cellCount + 1];

		for (int i = 0; i < rowCount - 1; i++) {
			int row = i + 1;
			String[] principle = (getCellData(filePath, sheetName, row, 0)).split("\\.");
			String roi = getCellData(filePath, sheetName, row, 1);
			String[] tenure = (getCellData(filePath, sheetName, row, 2)).split("\\.");
			String tenurePeriod = getCellData(filePath, sheetName, row, 3);
			String frequency = getCellData(filePath, sheetName, row, 4);
			String EMV = getCellData(filePath, sheetName, row, 5);
			int currentRow = row;
			int cellAMV = 6;
			int cellResult = 7;

			obj[i][0] = principle[0];
			obj[i][1] = roi;
			obj[i][2] = tenure[0];
			obj[i][3] = tenurePeriod;
			obj[i][4] = frequency;
			obj[i][5] = EMV;
			obj[i][6] = currentRow;
			obj[i][7] = cellAMV;
			obj[i][8] = cellResult;
		}
		return obj;
	}

	public Boolean updateAMV(int currentRow, int cellAMV, String AMV) throws Exception {
		String filePath = System.getProperty("user.dir") + "\\test-data\\TestData_FixedDeposit.xlsx";
		String sheetName = "Sheet1";

		Boolean result = setExistingCellData_update(filePath, sheetName, currentRow, cellAMV, AMV);
		return result;
	}

	public Boolean updateResult(int currentRow, int cellResult, String result) throws Exception {
		String filePath = System.getProperty("user.dir") + "\\test-data\\TestData_FixedDeposit.xlsx";
		String sheetName = "Sheet1";

		Boolean rresult = setExistingCellData_update(filePath, sheetName, currentRow, cellResult, result);
		return rresult;
	}

	public void fillGreenColor(int row, int cell) throws Exception {
		String filePath = System.getProperty("user.dir") + "\\test-data\\TestData_FixedDeposit.xlsx";
		String sheetName = "Sheet1";
		fillGreenColor(filePath, sheetName, row, cell);
	}

	public void fillRedColor(int row, int cell) throws Exception {
		String filePath = System.getProperty("user.dir") + "\\test-data\\TestData_FixedDeposit.xlsx";
		String sheetName = "Sheet1";
		fillRedColor(filePath, sheetName, row, cell);
	}
}