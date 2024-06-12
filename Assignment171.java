package sele_launch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment171 {
	//Take a screenshot but provide a wrong location, find exception name
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	WebElement w1=	driver.findElement(By.id("APjFqb"));
	w1.sendKeys("India");
	Thread.sleep(2000);
	w1.sendKeys(Keys.ENTER);
	
	TakesScreenshot a1=driver; //upcasting  driver to takes screesnshot
	Thread.sleep(2000);
	File source =a1.getScreenshotAs(OutputType.FILE);// utitlize upcast method
	
	File destination = new File("/home/sakthi/Desktop/groteche/ram.png"); // create object of an  FILE classs , Pass location of the screenshot where u wish to save 
	
	FileHandler.copy(source, destination); //using filehandler class, utilize its static methos called as copy from  sourch to destination
	
	
	}
}
