package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment152 {
	//Without login to flipcart, search for shoe and select first shoe
	
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement srch=   driver.findElement(By.name("q"));
	     srch.sendKeys("Shoe");
	     srch.sendKeys(Keys.ENTER);
	     WebElement shoe_1 =driver.findElement(By.xpath("(//div[@class='wvIX4U'])[1]"));
	     //1. here xpath wecan give bcs if we put id  or name then may be after fewdays other shoe will be on 1 st possition so our [program will select  this shoe only not the 1st position shoe so give xpath
	     //2. if when we inspect and it select image code eg : <img> then  dont use it.. image will change anytime. better to use grandparent <div> --><div> --> <img> here use <div>
	     shoe_1.click();

}}
