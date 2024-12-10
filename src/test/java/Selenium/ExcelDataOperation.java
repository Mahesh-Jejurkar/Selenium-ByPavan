package Selenium;

public class ExcelDataOperation extends ExcelUtils
{
	public static void main(String[] args) throws Exception 
	{
		String filePath = System.getProperty("user.dir")+"\\test-data\\Book1.xlsx";;
		String sheetName = "Sheet1";
		String data = "Mahesh";
		int rowNo = 1;
		int cellNo = 1;
		
//		System.out.println(getRowCount(filePath, sheetName));
//		System.out.println(getCellCount(filePath, sheetName, 0));
//		System.out.println(getCellData(filePath, sheetName, 0, 0));	
//		getAllCellData(filePath, sheetName);
//		System.out.println(setExistingCellData_update(filePath, sheetName, 5, 4, "Pass"));
//		System.out.println(setNewCellData(filePath, sheetName, rowNo, cellNo, data));
//		System.out.println(getCellType(filePath, sheetName, rowNo, cellNo));
//		System.out.println(fillGreenColor(filePath, sheetName, rowNo, cellNo));
		System.out.println(fillRedColor(filePath, sheetName, rowNo, cellNo));
	}
}