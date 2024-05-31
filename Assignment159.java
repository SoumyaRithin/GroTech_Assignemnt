package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment159 {
	//Launch flipcart.com and search for shoe with help of css selector input.Pke_EE[name='q']
	
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement srch=   driver.findElement(By.cssSelector("input.Pke_EE[name='q']"));
	     srch.sendKeys("Shoe");
	     srch.sendKeys(Keys.ENTER);
	     }

}
