package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice_getStringdata {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Swapnil Sanke\\Documents\\java\\practice sheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		//getStringData
		String data1 = sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(data1);
		
		//GetBooleanData
		boolean data2 = sh.getRow(2).getCell(4).getBooleanCellValue();
			System.out.println(data2);
			
			//getNumericCellValue
			double data3 = sh.getRow(1).getCell(0).getNumericCellValue();
			System.out.println(data3);
			
			//explicit
			int d3 = (int)data3;
			System.out.println(d3);
			
			//rowsize
			int data4 = sh.getLastRowNum();
			System.out.println(data4);
			
			//columnsize
			short data5 = sh.getRow(data4).getLastCellNum();
			System.out.println(data5);
		}
		
	}

