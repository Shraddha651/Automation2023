package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_verifyTypeOfCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Swapnil Sanke\\Documents\\java\\exel sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		CellType CT = sh.getRow(0).getCell(3).getCellType();//string,numeric,boolean
		System.out.println(CT);
	}

}
