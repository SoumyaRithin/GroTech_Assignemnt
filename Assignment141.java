package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment141 {
//Demonstrate a program on drag drop https://grotechminds.com/drag-and-drop/
	public static void main(String[] args) {
		
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/drag-and-drop/");
	driver.manage().window().maximize();
	 WebElement drag=    driver.findElement(By.xpath("(//div[@id='container'])[4]"));
	 WebElement drop = driver.findElement(By.id("div2"));
	 Actions a1=new Actions(driver);
	 a1.dragAndDrop(drag,drop).perform();
	
	
}}
