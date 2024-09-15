package selenium_byPavan;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\input-files\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("UserData");
		XSSFRow row = sheet.getRow(0);
		int noOfRow = sheet.getPhysicalNumberOfRows();
		int noOfCell = row.getPhysicalNumberOfCells();

		System.out.println("No. of row: " + noOfRow);
		System.out.println("No. of cell: " + noOfCell);

		for (int r = 1; r < noOfRow; r++) {
			XSSFRow current_row = sheet.getRow(r);
			
			String firstname = current_row.getCell(0).getStringCellValue();
			String lastname = current_row.getCell(1).getStringCellValue();
			String email = current_row.getCell(2).getStringCellValue();
			double telephone = current_row.getCell(3).getNumericCellValue();
			String password = current_row.getCell(4).getStringCellValue();
			
			System.out.println(firstname+"\t"+lastname+"\t"+email+"\t"+telephone+"\t"+password);
		}
		workbook.close();
	}
}
