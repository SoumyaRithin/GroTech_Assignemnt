package sele_B41;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment140 {
	//"Demonstrate a program on how to double click   Launch http://google.com/   and Double click on Gmail"
	
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			WebElement gmail =driver.findElement(By.linkText("Gmail"));
			
			Actions a1=new Actions(driver);
			a1.doubleClick(gmail).perform();
		
	}

}
