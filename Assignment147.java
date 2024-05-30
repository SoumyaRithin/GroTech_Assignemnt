package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment147 {
	//Demonstrate a program methods of WebElement Interface Use JSAM HTML/growtechminds website isSelected()
	
	public static void main(String[] args) {
		
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///home/sakthi/Downloads/learningHTML1%20(1).html");
		//driver.manage().window().maximize();
		WebElement ihaveaboy=driver.findElement(By.id("123"));
		if(ihaveaboy.isSelected()==true)
		{
			System.out.println("i have a boy is SELECTED");
		}
		else {
			System.out.println("i have a boy is NOT SELECTED");
			ihaveaboy.click();
		}
		
}}
