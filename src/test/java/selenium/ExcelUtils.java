package selenium;

import java.io.*;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

public class ExcelUtils {
	static FileInputStream fis;
	static FileOutputStream fos;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static XSSFCellStyle style;
	static String ct;

	public static int getRowCount(String filePath, String sheetName) throws Exception {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		workbook.close();
		fis.close();
		return rowCount;
	}

	public static int getCellCount(String filePath, String sheetName, int rowNo) throws Exception {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		int cellCount = sheet.getRow(rowNo).getPhysicalNumberOfCells();
		workbook.close();
		fis.close();
		return cellCount;
	}

	public static String getCellData(String filePath, String sheetName, int rowNo, int cellNo) throws IOException {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNo);
		cell = row.getCell(cellNo);
		String data = cell.toString();
		workbook.close();
		fis.close();
		return data;
	}

	public static void getAllCellData(String filePath, String sheetName) throws Exception {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowCount; i++) {
			row = sheet.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cellCount; j++) {
				cell = row.getCell(j);
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}

		workbook.close();
		fis.close();
	}

	public static boolean setExistingCellData_update(String filePath, String sheetName, int rowNo, int cellNo,
			String data) throws Exception {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNo);
		cell = row.getCell(cellNo);
		cell.setCellValue(data);
		fos = new FileOutputStream(filePath);
		workbook.write(fos);
		workbook.close();
		fos.close();
		fis.close();

		// return "Cell data written successfully..!";
		return true;
	}

	public static boolean setNewCellData(String filePath, String sheetName, int rowNo, int cellNo, String data)
			throws Exception {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.createRow(rowNo);
		cell = row.createCell(cellNo);
		cell.setCellValue(data);
		fos = new FileOutputStream(filePath);
		workbook.write(fos);
		workbook.close();
		fos.close();
		fis.close();

		// return "Cell data written successfully..!";
		return true;
	}

	public static String getCellType(String filePath, String sheetName, int rowNo, int cellNo) throws Exception {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Sheet1");
		row = sheet.getRow(rowNo);
		cell = row.getCell(cellNo);
		ct = cell.getCellType().toString();
		return ct;
	}

	public static boolean fillGreenColor(String filePath, String sheetName, int rowNo, int cellNo) throws Exception {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Sheet1");
		row = sheet.getRow(rowNo);
		cell = row.getCell(cellNo);
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		fos = new FileOutputStream(filePath);
		workbook.write(fos);
		workbook.close();
		fos.close();
		fis.close();
		return true;
	}

	public static boolean fillRedColor(String filePath, String sheetName, int rowNo, int cellNo) throws Exception {
		fis = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("Sheet1");
		row = sheet.getRow(rowNo);
		cell = row.getCell(cellNo);
		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		fos = new FileOutputStream(filePath);
		workbook.write(fos);
		workbook.close();
		fos.close();
		fis.close();
		return true;
	}
}