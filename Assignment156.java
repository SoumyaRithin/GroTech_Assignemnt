package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment156 {
//Demonstrate CSS locator program on google.in and search India use textarea.gLFyf
	//CSS can be writtern with the help of Tagname annd classname

public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();//launch browser
		driver.get("https://www.google.com/");
		WebElement a1=driver.findElement(By.cssSelector("textarea.gLFyf"));
		a1.sendKeys("India");
		a1.sendKeys(Keys.ENTER);
	}
	}
