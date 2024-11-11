package selenium;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.*;

public class WriteDataToExcel {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\test-data\\Outputdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Test-Data");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rowCount = sc.nextInt();

		System.out.println("Enter no. of cells : ");
		int cellCount = sc.nextInt();

		for (int i = 0; i < rowCount; i++) {
			XSSFRow currentRow = sheet.createRow(i);
			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = currentRow.createCell(j);
				System.out.println("Enter the value for row " + i + " and column " + j);
				cell.setCellValue(sc.next());
			}
		}
		workbook.write(fos);
		System.out.println("File created...");	
		
		sc.close();
		workbook.close();
		fos.close();
	}

}
