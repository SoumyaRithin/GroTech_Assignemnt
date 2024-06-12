package sele_launch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment173 {
	//What happens when you fetch value from empty cell
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("/home/sakthi/eclipse-workspace/selenium_project/TestData/name1.xlsx");//locatopn of the excel
		
		Workbook wh = WorkbookFactory.create(f1);// open excelsheet
		
		Sheet s1 = wh.getSheet("Login");//go to perticular sheet or tab  
		
	Row r1= s1.getRow(99); //got to perticular row
	
	Cell c1= r1.getCell(99);//got to perticular cell
	
	String value = c1.getStringCellValue(); //fetch value 
	
	System.out.println(value);// display 
	
	
	}
}
