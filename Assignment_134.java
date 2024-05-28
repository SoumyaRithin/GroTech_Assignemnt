package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_134 {
	public static void main(String[] args) {
		// Login to  Amazon Application using Relative Xpath Syntax.
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		login.click();
		WebElement loginpage = driver.findElement(By.xpath("//input[@id='ap_email']"));
		loginpage.sendKeys("soumyaaharidas@gmail.com");
		WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));
		submit.click();	
		WebElement paswd = driver.findElement(By.xpath("//input[@id='ap_password']"));
		paswd.sendKeys("123");
		paswd.sendKeys(Keys.ENTER);
		
	

}}
