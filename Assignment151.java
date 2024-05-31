package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment151 {
	//Login to Amazon search shoe and select a first shoe
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
     srch.sendKeys("Shoe");
     srch.sendKeys(Keys.ENTER);
     WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
     //1. here xpath wecan give bcs if we put id  or name then may be after fewdays other shoe will be on 1 st possition so our [program will select  this shoe only not the 1st position shoe so give xpath
     //2. if when we inspect and it select image code eg : <img> then  dont use it.. image will change anytime. better to use grandparent <a> --><div> --> <img> here use <a>
     shoe_1.click();
     
}
}
