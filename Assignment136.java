package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment136 {
//"Demostrate a program on dropdown, use https://www.facebook.com/reg and select drop down for date, month and year when creating account"
	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();//launch browser
 driver.get("https://www.facebook.com/reg/");
 driver.manage().window().maximize();
WebElement fname = driver.findElement(By.name("firstname"));
fname.sendKeys("Soumya");
WebElement lname =driver.findElement(By.name("lastname"));
lname.sendKeys("Haridas");
WebElement reistr =driver.findElement(By.name("reg_email__"));
reistr.sendKeys("Soumya@gmail.com");
 
 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("123");
 driver.findElement(By.name("reg_passwd__")).sendKeys("123");
 WebElement fm=driver.findElement(By.xpath("(//label)[1]"));
 fm.click();
WebElement day= driver.findElement(By.id("day"));
Select s1=new Select(day);
s1.selectByIndex(7);

WebElement month= driver.findElement(By.id("month"));
Select s2=new Select(month);
s2.selectByIndex(6);
WebElement year= driver.findElement(By.id("year"));
Select s3=new Select(year);
s3.selectByValue("2000");

 driver.findElement(By.name("websubmit")).click();
}
}