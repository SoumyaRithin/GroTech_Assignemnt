package sele_launch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment178 {
	//Create an account in amazon.in using DDT (No need to click on Register button)
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FirefoxDriver driver =new FirefoxDriver();
		
		//ChromeDriver driver =new ChromeDriver();//launch browser
		 driver.get("https://www.amazon.com/");
Thread.sleep(3000);

		WebElement hover= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		 Actions a1=new Actions(driver);
		 a1.moveToElement(hover).perform();
		 Thread.sleep(3000);
		 WebElement signup=driver.findElement(By.linkText("Start here."));
		 signup.click();
		 
		 
			FileInputStream f1 = new FileInputStream("/home/sakthi/eclipse-workspace/selenium_project/TestData/name1.xlsx");//locatopn of the excel
			Workbook wh = WorkbookFactory.create(f1);// open excelsheet
			String name =	wh.getSheet("amazonsignup").getRow(0).getCell(0).getStringCellValue();
			String email =	wh.getSheet("amazonsignup").getRow(0).getCell(1).getStringCellValue();
			String pass =	wh.getSheet("amazonsignup").getRow(0).getCell(2).getStringCellValue();
			String passc =	wh.getSheet("amazonsignup").getRow(0).getCell(3).getStringCellValue();
			
			
			
		driver.findElement(By.id("ap_customer_name")).sendKeys(name);
		 
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("passwordCheck")).sendKeys(passc);
		 driver.findElement(By.id("continue")).click();
		 
		 
	}
}
