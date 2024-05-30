package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment146 {

	public static void main(String[] args) {
		// Demonstrate a program three methods of WebElement Interface Use google.in page and type india in search using isDisplayed() and isEnabled().

			
			
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.google.in/");
			driver.manage().window().maximize();
			   WebElement search= driver.findElement(By.name("q"));
			   if(search.isDisplayed() && search.isEnabled())
			   {
				   search.sendKeys("India");
			   }

	}

}
