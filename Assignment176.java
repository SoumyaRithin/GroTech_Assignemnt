package sele_launch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//Take the data from the excel sheet and write the Data Driven Test program using method chaining concept.
public class Assignment176 {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream f1 = new FileInputStream("/home/sakthi/eclipse-workspace/selenium_project/TestData/name1.xlsx");//locatopn of the excel
			
			Workbook wh = WorkbookFactory.create(f1);// open excelsheet
			
	String value =	wh.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
	
		System.out.println(value);
		
		
		}
	}

