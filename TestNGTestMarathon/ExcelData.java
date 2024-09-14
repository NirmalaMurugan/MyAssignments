package TestNGTestMarathon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData { 

	public static String[][] readExcel(String filename) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0); 

		int RowCount = sheet.getLastRowNum();
		int CellCount = sheet.getRow(1).getLastCellNum();

		//Declaring a 2D array
		String[][] DataProviderValue = new String[RowCount][CellCount];
	
		for (int i = 1; i <= RowCount; i++) {
			for (int j = 0; j < CellCount; j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				DataProviderValue[i-1][j] = data; 
				System.out.println(data);
			}
		}
		book.close();
		return DataProviderValue;
	}

}

