package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment165 {
	public static void main(String[] args) {
		// Demostrate a code for Java script popup, use JSAM application
		

		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///home/sakthi/Documents/OTHER/Automation/My%20Class/learningHTML1.html");
		driver.switchTo().alert().accept(); //javascript popup closing 
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Soumya123");
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("enter numeric and characters");
		WebElement pswd = driver.findElement(By.xpath("(/html/body/input)[3]"));
		pswd.sendKeys("abc123");
		WebElement fname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fname.sendKeys("soumya");
		//WebElement submit1 = driver.findElement(By.xpath("(/html/body/form/input)[3]"));
		//submit1.click();
		WebElement girl = driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		girl.click();
		WebElement female = driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		WebElement locate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		locate.click();
		WebElement submit = driver.findElement(By.xpath("(/html/body/input)[7]"));
		submit.click();
		

}}
