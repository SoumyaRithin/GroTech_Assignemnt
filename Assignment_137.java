package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_137 {

	public static void main(String[] args) {
		// "Solve assignments 1 related to dropdown from below link    https://grotechminds.com/dropdown/"
		//FirefoxDriver driver =new FirefoxDriver();
		ChromeDriver driver= new ChromeDriver();//launch browser
		 driver.get("https://grotechminds.com/dropdown/");
		 driver.manage().window().maximize();
		WebElement drop= driver.findElement(By.id("Choice1"));
		Select s1=new Select(drop);
		s1.selectByIndex(3);
		
		WebElement drop1= driver.findElement(By.id("Choice2"));
		Select s2=new Select(drop1);
		s2.selectByVisibleText("practice2");
		
		WebElement drop2= driver.findElement(By.id("Choice3"));
		Select s02=new Select(drop2);
		s02.selectByVisibleText("Power9");
		
		WebElement drop3= driver.findElement(By.id("Choice4"));
		Select s3=new Select(drop3);
		s3.selectByVisibleText("Energy13");
		
		WebElement drop4= driver.findElement(By.id("Choice5"));
		Select s4=new Select(drop4);
		s4.selectByVisibleText("Day8");
		
		WebElement drop6= driver.findElement(By.id("Choice6"));
		Select s6=new Select(drop6);
		s6.selectByVisibleText("Night7");
		
		WebElement drop7= driver.findElement(By.xpath("(//select)[7]"));
		Select s7=new Select(drop7);
		s7.selectByValue("Night15");
		//
		WebElement drop8= driver.findElement(By.xpath("(//select)[8]"));
		Select s8=new Select(drop8);
		s8.selectByValue("Selenium2");
		
		WebElement drop09= driver.findElement(By.id("Choice8"));
		Select s09=new Select(drop09);
		s09.selectByValue("QTP1");
		
		WebElement drop9= driver.findElement(By.id("Choice9"));
		Select s9=new Select(drop9);
		s9.selectByValue("SQL5");
		
		WebElement drop10= driver.findElement(By.id("Choice10"));
		Select s10=new Select(drop10);
		s10.selectByValue("CoreJava6");
		
		
		
		 

	}

}
