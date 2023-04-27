package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice_print1row {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream File = new FileInputStream("C:\\Users\\Swapnil Sanke\\Documents\\java\\practice sheet.xlsx");
		Sheet sh = WorkbookFactory.create(File).getSheet("Sheet1");
		
		short cellsize = sh.getRow(4).getLastCellNum();
		for(int i=0;i<=cellsize-1;i++) {
			String data = sh.getRow(4).getCell(i).getStringCellValue();
			System.out.println(data);
		}
		
	}
	
   
	

	

}
