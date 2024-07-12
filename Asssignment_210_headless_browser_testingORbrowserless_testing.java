package TestNG_testcase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Asssignment_210_headless_browser_testingORbrowserless_testing {
	//WebDriver driver;
	@Test 
	public void testcase1() throws InterruptedException
	{

	//login
		ChromeOptions c1=new ChromeOptions();
		 c1.addArguments("--headless");
	 ChromeDriver driver= new ChromeDriver(c1);
	 
	 driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	
	WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
	 srch.sendKeys("Shoe");
	 srch.sendKeys(Keys.ENTER);
	 
	 
	 
	 
}}
