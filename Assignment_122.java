package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//Selenium Methods(get,close,quit,getWindowHandles,getWindowHandle,Minimize & Maximize browser, findElement,findElements)
public class Assignment_122 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getWindowHandle());
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandles());
		driver.close();
		driver.findElements(By.name("q"));
		driver.findElements(By.name("btnK"));
		driver.quit();
		
		
	}

}
