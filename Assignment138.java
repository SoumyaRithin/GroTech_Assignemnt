package finished;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment138 {
	//Program to hover over on flipcart ->fashion->Mens T shirt
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();//launch browser
		//FirefoxDriver driver =new FirefoxDriver();//launch browser
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		WebElement fashion= driver.findElement(By.className("_27h2j1"));
	
		 Actions a1=new Actions(driver);
		 a1.moveToElement(fashion).perform();
		 WebElement menfashion= driver.findElement(By.linkText("Men's T-Shirts"));
		menfashion.click();
		 
		 
	}

}

