package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_130 {
//Demostrate a code for Partial linktext locator use amazon application and click bestselllers
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		 WebElement bestseller= driver.findElement(By.partialLinkText("Best "));
		 bestseller.click();
		   
		
		
	}
}
