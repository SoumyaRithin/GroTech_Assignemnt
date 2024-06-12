package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment166 {
	
	public static void main(String[] args) {
		// "Open Grotechminds website and handle java script popup   https://grotechminds.com/javascript-popup/"
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		
		driver.manage().window().maximize();
		 WebElement clck=driver.findElement(By.className("btnjs"));
		 clck.click();
		 driver.switchTo().alert().accept();

}}
