package TestNG_testcase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Assignment209_soft_assert_and_hard_assert {

	WebDriver driver;
	@Test 
	public void testcase1() throws InterruptedException
	{

	//login
	 driver= new EdgeDriver();
	 driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		 //soft Assert 
		Set<String> a2= driver.getWindowHandles();
		SoftAssert s2=new SoftAssert();
		s2.assertEquals(a2.size(), 1);
		 System.out.println(a2.size());
		
		
	WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
	 srch.sendKeys("Shoe");
	 srch.sendKeys(Keys.ENTER);
	 WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
	 shoe_1.click();
	 
	 
	 
	 
	 
	 
	 
	 Set<String> both= driver.getWindowHandles();
	 int sizeof=both.size();
	 
	 //Hard Assert 
	 Assertion a1=new Assertion();
	 a1.assertEquals(sizeof, 2);
	 
	
	 System.out.println(sizeof);


 
	}
}

