package sele_B41;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment180 {
	public static void main(String[] args) throws InterruptedException  {

		ChromeDriver driver=new ChromeDriver();


		driver.navigate().to("https://www.google.co.in/");

	WebElement w1=	driver.findElement(By.id("APjFqb"));

	w1.sendKeys("India");
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
	
		
}
}