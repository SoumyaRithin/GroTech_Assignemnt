package manish;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class logINlogOUTAssignment188 {
	ChromeDriver driver;
	@BeforeMethod
	public void login1()
	{
		//login
		 driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		WebElement hellologin=  driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		hellologin.click();
		 WebElement mail=   driver.findElement(By.id("ap_email"));
		 mail.sendKeys("85254877979");
		 
		 WebElement submit=  driver.findElement(By.xpath("//input[@id='continue']"));
		 submit.click();
		 WebElement pswd=  driver.findElement(By.xpath("//input[@id='ap_password']"));
		 pswd.sendKeys("grotech@123");
		 WebElement sub=  driver.findElement(By.xpath( "//input[@id='signInSubmit']"));
		 sub.click();
	}
	@AfterMethod
	public void logout1() throws InterruptedException, IOException
	{
		//Screenshot
				TakesScreenshot a11=driver; //upcasting  driver to takes screesnshot
				Thread.sleep(2000);
				File source =a11.getScreenshotAs(OutputType.FILE);// utitlize upcast method
				
				File destination = new File("/home/sakthi/Desktop/grotech/logout"+ Math.random()+"ram.png"); // create object of an  FILE classs , Pass location of the screenshot where u wish to save 
				
				FileHandler.copy(source, destination); //using filehandler class, utilize its static methos called as copy from  sourch to destination
				
		//logout
		 WebElement hoverover =driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		 //hoverover.click();
		 Actions a1=new Actions(driver);
		 a1.moveToElement(hoverover).perform();
		 Thread.sleep(2000);
		 WebElement log_out =driver.findElement(By.xpath("(//span[@class='nav-text'])[22]"));
		log_out.click();
		
		
		
		
	}

}
