package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment167 {
	//Automate https://grotechminds.com/registration/ reach till file upload option

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
	WebElement fnam=	driver.findElement(By.name("fname"));
	fnam.sendKeys("soumya");
	
	WebElement lnam=	driver.findElement(By.name("lname"));
	lnam.sendKeys("hari");
	
	WebElement ps=	driver.findElement(By.name("password"));
	ps.sendKeys("123");
	
	WebElement mail=	driver.findElement(By.name("email"));
	mail.sendKeys("soumya@gmail.com");
	
	WebElement ad=	driver.findElement(By.id("Present-Address"));
	ad.sendKeys("haridas  "
			+ "pandarikkal"
			+ "kerala");
	
	WebElement male=	driver.findElement(By.id("male"));
	male.click();
	
	WebElement pad=	driver.findElement(By.id("Permanent-Address"));
	pad.sendKeys("haridas         adress");
	
	WebElement pin=	driver.findElement(By.id("Pincode"));
	pin.sendKeys("64729");
	WebElement re=	driver.findElement(By.id("relocate"));
	re.click();
	WebElement cv=	driver.findElement(By.id("file"));
	cv.sendKeys("/home/sakthi/Desktop/upload.pdf");
	
	
	WebElement dropdwnskill= driver.findElement(By.id("Skills"));
	Select s1=new Select(dropdwnskill);
	s1.selectByIndex(1);
	WebElement dropdwnskillsub= driver.findElement(By.id("technicalskills"));
	Select s2=new Select(dropdwnskillsub);
	s2.selectByIndex(2);
	
	
	WebElement country= driver.findElement(By.id("Country"));
	Select s3=new Select(country);
	s3.selectByIndex(2);
	
	WebElement submit=	driver.findElement(By.name("Submit"));
	submit.click();
	}
}
