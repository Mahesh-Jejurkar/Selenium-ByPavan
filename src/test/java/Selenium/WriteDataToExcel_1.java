package Selenium;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataToExcel_1 
{
	public static void main(String[] args) throws Exception 
	{
		int r = 1;
		FileOutputStream fos = new FileOutputStream(
				System.getProperty("user.dir") + "\\input-files\\OpenCartOutData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();

		CellStyle cell_style = workbook.createCellStyle();
		cell_style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		cell_style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		XSSFFont font = workbook.createFont();
		font.setBold(true);
		font.setColor(IndexedColors.WHITE.getIndex());

		cell_style.setFont(font);

		XSSFSheet sheet = workbook.createSheet("AllLinks");
		XSSFRow row_0 = sheet.createRow(0);
		
		XSSFCell header_linkText = row_0.createCell(0);
		header_linkText.setCellValue("Link Text");
		header_linkText.setCellStyle(cell_style);

		XSSFCell header_linkURL = row_0.createCell(1);
		header_linkURL.setCellValue("Link URL");
		header_linkURL.setCellStyle(cell_style);

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		Thread.sleep(2000);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (WebElement link : alllinks) 
		{
			String link_text = link.getText();
			String link_url = link.getAttribute("href");

			XSSFRow row = sheet.createRow(r);
			XSSFCell cell_linkText = row.createCell(0);
			XSSFCell cell_linkURL = row.createCell(1);

			cell_linkText.setCellValue(link_text);
			cell_linkURL.setCellValue(link_url);
			r++;
		}

		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);

		workbook.write(fos);
		workbook.close();
		fos.close();

		Thread.sleep(9000);
		driver.close();
	}
}
