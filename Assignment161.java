package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment161 {
	//Login to https://retail.onlinesbi.sbi/retail/login.htm where right click is disabled, use dumy id and password.
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement button =  driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		button.click();
	WebElement user =	driver.findElement(By.id("username"));
	user.sendKeys("soumya");
	WebElement pswd =	driver.findElement(By.id("label2"));
	pswd.sendKeys("123");
	
	WebElement txt =	driver.findElement(By.id("loginCaptchaValue"));
	txt.sendKeys("dummy data ");
	
	WebElement check =	driver.findElement(By.id("capOption"));
	check.sendKeys("dummy data ");
		
	}

}
