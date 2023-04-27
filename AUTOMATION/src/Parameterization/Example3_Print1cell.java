package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_Print1cell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Swapnil Sanke\\Documents\\java\\exel sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int rowSize = sh.getLastRowNum();
		for(int i=0;i<=rowSize;i++) {
			double data = sh.getRow(i).getCell(4).getNumericCellValue();
			System.out.println(data);
		}
	}

}
