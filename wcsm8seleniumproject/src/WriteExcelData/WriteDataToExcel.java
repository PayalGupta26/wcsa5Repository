package WriteExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		  FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		  
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("IPL Data");
		 Row row = sheet.getRow(1);
		 Cell cell = row.createCell(2);//it will create new cell
		 
		 cell.setCellValue("pune");//write data into the cell
		 
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
		
		 
	}

	

}
