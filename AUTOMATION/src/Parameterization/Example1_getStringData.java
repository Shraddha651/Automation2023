package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Swapnil Sanke\\Documents\\java\\exel sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//1. getStringCellValue()-to read String,char data
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		Object data2 = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data2);
		
		//2.getNumericCellValue();--to read numeric data
		 double data3 = sh.getRow(0).getCell(1).getNumericCellValue();
		 System.out.println(data3);
		 
		 //explicit value
		 int d3 = (int)data3;
		 System.out.println(d3);
		 
		 //3.getBooleanCellValue()---to read boolean data
		 boolean data4 = sh.getRow(1).getCell(1).getBooleanCellValue();
		 System.out.println(data4);
		 
		 //4. get last row no--it return no of rows from 0th index
		 int rowsize = sh.getLastRowNum();
		 System.out.println(rowsize);//3
		 System.out.println(rowsize+1);//4 actual row count
		 
		 //5.get last cell no()--it return no of values from specific row
		short cellSize = sh.getRow(3).getLastCellNum();
		System.out.println(cellSize);
	}

}
