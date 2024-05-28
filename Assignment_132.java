package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_132 {
	//locate each component of JSAM application using relative xpath(excluding dropdown and disable)
	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///home/sakthi/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(//input)[1]"));
		username.sendKeys("Soumya123");
		WebElement hint = driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("enter numeric and characters");
		WebElement pswd = driver.findElement(By.xpath("(//input)[3]"));
		pswd.sendKeys("abc123");
		WebElement fname = driver.findElement(By.xpath("(//input)[4]"));
		fname.sendKeys("soumya");
		
		WebElement girl = driver.findElement(By.xpath("(//input)[9]"));
		girl.click();
		WebElement female = driver.findElement(By.xpath("(//input)[12]"));
		female.click();
		WebElement locate = driver.findElement(By.xpath("(//input)[13]"));
		locate.click();
		WebElement signup = driver.findElement(By.xpath("(//input)[14]"));
		signup.click();
}}
