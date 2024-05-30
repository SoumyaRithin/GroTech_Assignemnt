package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment145 {

	public static void main(String[] args) {
		// Lanch the Amazon.india and click the Account List & Clikc the Sign in Button & Login Using Hover Over
		
		ChromeDriver driver= new ChromeDriver();//launch browser
		 driver.get("https://www.amazon.com");
		 //		FirefoxDriver driver =new FirefoxDriver();//launch browser
		 driver.manage().window().maximize();
		    WebElement hover= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		     Actions a1=new Actions(driver);
		     a1.moveToElement(hover).perform();
		     
		     WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		     
		     signin.click();
		     WebElement loginpage = driver.findElement(By.xpath("//input[@id='ap_email']"));
				loginpage.sendKeys("soumyaaharidas@gmail.com");
				WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));
				submit.click();	
				WebElement paswd = driver.findElement(By.xpath("//input[@id='ap_password']"));
				paswd.sendKeys("123");
				paswd.sendKeys(Keys.ENTER);
	}

}
