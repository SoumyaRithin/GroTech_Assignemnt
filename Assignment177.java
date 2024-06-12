package sele_launch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment177 {
	//Login to Amazon application using DDT concept
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {

	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	login.click();
	FileInputStream f1 = new FileInputStream("/home/sakthi/eclipse-workspace/selenium_project/TestData/name1.xlsx");//locatopn of the excel
		Workbook wh = WorkbookFactory.create(f1);// open excelsheet
String email =	wh.getSheet("test").getRow(0).getCell(0).getStringCellValue();
String pswd=wh.getSheet("test").getRow(0).getCell(1).getStringCellValue();
	WebElement loginpage = driver.findElement(By.xpath("//input[@id='ap_email']"));
	loginpage.sendKeys(email);
	WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));
	submit.click();	
	WebElement paswd = driver.findElement(By.xpath("//input[@id='ap_password']"));
	paswd.sendKeys(pswd);
	paswd.sendKeys(Keys.ENTER);
}
}