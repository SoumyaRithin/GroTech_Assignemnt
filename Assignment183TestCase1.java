package TestNG_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment183TestCase1 {
	@Test
	public static void  srchshoe()
	{
		

ChromeDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
 srch.sendKeys("Shoe");
 srch.sendKeys(Keys.ENTER);
 //WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
 //shoe_1.click();
 
	}
	
	

}
