package ReadExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDtaFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//implementation to read data from the Excel
		
		for(int i=1;i<=10;i++) {
		//Read multiple value from excel using loop
		FileInputStream file = new FileInputStream("./data/TestData.xlsx");//privide path of file
		Workbook wb = WorkbookFactory.create(file);//
		Sheet sheet = wb.getSheet("IPL Data");//get into sheet
		Row row = sheet.getRow(i);//get into row return type is row interface
		Cell cell = row.getCell(0);//get into disire cell--return type --cell interface
		String data = cell.getStringCellValue();//read value for cell//
		System.out.println(data);
		
		}
		
	}

}
