package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment144 {
	//Launch amazon.in select option as amazon fresh using keys functionality//keyboard
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();//launch browser
		
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement dd= driver.findElement(By.id("searchDropdownBox"));
		 dd.sendKeys(Keys.ARROW_DOWN);
		 dd.sendKeys(Keys.ARROW_DOWN);
		 dd.sendKeys(Keys.ARROW_DOWN);
		 dd.sendKeys(Keys.ARROW_DOWN);
		 
		   
	

}}
