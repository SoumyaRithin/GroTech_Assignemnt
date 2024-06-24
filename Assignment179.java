package sele_launch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment179 {
	//Automate https://grotechminds.com/registeration-form/   using DDT
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		//FirefoxDriver driver =new FirefoxDriver();
		
		ChromeDriver driver =new ChromeDriver();//launch browser
		 driver.get("https://grotechminds.com/registeration-form/");
		 FileInputStream f1 = new FileInputStream("/home/sakthi/eclipse-workspace/selenium_project/TestData/name1.xlsx");//locatopn of the excel
			Workbook wh = WorkbookFactory.create(f1);// open excelsheet
			String fname =	wh.getSheet("registrationform").getRow(0).getCell(0).getStringCellValue();
			String lname =	wh.getSheet("registrationform").getRow(0).getCell(4).getStringCellValue();
			String email =	wh.getSheet("registrationform").getRow(0).getCell(1).getStringCellValue();
			
			String number=	NumberToTextConverter.toText(wh.getSheet("registrationform").getRow(0).getCell(2).getNumericCellValue());
			String Aadhaar =	NumberToTextConverter.toText(wh.getSheet("registrationform").getRow(0).getCell(3).getNumericCellValue());
			String PAN =	wh.getSheet("registrationform").getRow(0).getCell(5).getStringCellValue();
			
			WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
					firstname.sendKeys(fname);
			 
			
					WebElement lastName=driver.findElement(By.id("lastName"));
					lastName.sendKeys(lname);
			
					WebElement	emailname=driver.findElement(By.id("email"));
					emailname.sendKeys(email);
			
			driver.findElement(By.id("phone")).sendKeys(number);
			driver.findElement(By.id("aadhaar")).sendKeys(Aadhaar);
			driver.findElement(By.id("pan")).sendKeys(PAN);
			
			WebElement genderdropdown=driver.findElement(By.xpath("//select[@id='gender']"));
			Select s1=new Select(genderdropdown);
			s1.selectByIndex(2);
			WebElement statedropdown=driver.findElement(By.xpath("//select[@id='state']"));
			Select s2=new Select(statedropdown);
			s2.selectByValue("kerala");
			
			
			
			WebElement checkbox=driver.findElement(By.xpath("//input[@id='terms']"));
			checkbox.click();
			WebElement submit=driver.findElement(By.xpath("//button[@value='Submit']"));
			submit.click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			
			
}}
