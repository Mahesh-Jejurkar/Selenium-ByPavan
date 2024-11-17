package Selenium;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\test-data\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int countRow = sheet.getPhysicalNumberOfRows();
		int countCell = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total no. of rows : " + countRow);
		System.out.println("Total no. of cells : " + countCell);

//		int totalRows = sheet.getLastRowNum();
//		int totalCells = sheet.getRow(1).getLastCellNum();
//		System.out.println("Total no. of rows : " + totalRows);
//		System.out.println("Total no. of cells : " + totalCells);

		for (int i = 0; i < countRow; i++) {
			XSSFRow row = sheet.getRow(i);
			int indCellCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < indCellCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}

		workbook.close();
		fis.close();
	}

}
