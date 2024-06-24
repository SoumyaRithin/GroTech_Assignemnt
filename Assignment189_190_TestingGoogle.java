package paraleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingGoogle {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Edgebrowser(String nameofbrowser)
	{
	if(nameofbrowser.equals("chrome"))
	{
		 driver =new ChromeDriver();	
	}
	if(nameofbrowser.equals("firefox"))
	{
		 driver =new FirefoxDriver();	
	}
	if(nameofbrowser.equals("edge"))
	{
		 driver =new EdgeDriver();	
	}	
	
		
	 
		
	driver.get("https://www.google.com/");   //2.goto google.com
	driver.findElement(By.name("q")).sendKeys("India"); //3.type ""india"" on search textfield
	driver.findElement(By.name("btnK")).click(); //4.click on search button" */
	}
	}


