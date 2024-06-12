package sele_launch;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment169 {
//	Launch google, search india and take a screenshot with your name and current time
	public static void main(String[] args) throws InterruptedException, IOException {
		Date d1=new Date();
		String a9=d1.toString();
		String time = a9.substring(11, 20);
		//System.out.println(time);
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	WebElement w1=	driver.findElement(By.id("APjFqb"));
	w1.sendKeys("India");
	Thread.sleep(2000);
	w1.sendKeys(Keys.ENTER);
	
	TakesScreenshot a1=driver; //upcasting  driver to takes screesnshot
	Thread.sleep(2000);
	File source =a1.getScreenshotAs(OutputType.FILE);// utitlize upcast method
	
	File destination = new File("/home/sakthi/Desktop/grotech/soumya_".concat(time)+".png"); // create object of an  FILE classs , Pass location of the screenshot where u wish to save 
	
	FileHandler.copy(source, destination); //using filehandler class, utilize its static methos called as copy from  sourch to destination
	
	driver.manage().window().minimize();
	
	
	
	
	}
}
