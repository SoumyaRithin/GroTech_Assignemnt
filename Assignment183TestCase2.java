package TestNG_testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment183TestCase2 {
	@Test
	public static void  firstshoe()
	
	{

ChromeDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
 srch.sendKeys("Shoe");
 srch.sendKeys(Keys.ENTER);
 WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
 shoe_1.click();
 
 
 Set<String> both= driver.getWindowHandles();
 Iterator<String> s1= both.iterator();
 String pid= s1.next();
 String cid= s1.next();
 driver.switchTo().window(cid);
 driver.manage().window().maximize();
		
	}

}
