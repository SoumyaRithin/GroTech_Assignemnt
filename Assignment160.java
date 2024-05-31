package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment160 {
	//Demonstrate CSS locator program on TN[AN^='Sub String of AV']
	
public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();//launch browser
		driver.get("https://www.google.com/");
		WebElement a1=driver.findElement(By.cssSelector("textarea[class^='gLFy']"));
		a1.sendKeys("India");
		a1.sendKeys(Keys.ENTER);
	}
}
