package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment135 {
	//Demostrate a program on dropdown, use Amazon.in, use all three methods of Select class
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Electronics");
		
		s1.selectByValue("search-alias=alexa-skills");
		
		s1.selectByIndex(15);
}}
