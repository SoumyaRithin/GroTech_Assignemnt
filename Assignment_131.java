package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_131 {

	public static void main(String[] args) {
		// locate each component of JSAM application using absolute xpath(excluding dropdown and disable)
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///home/sakthi/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Soumya123");
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("enter numeric and characters");
		WebElement pswd = driver.findElement(By.xpath("(/html/body/input)[3]"));
		pswd.sendKeys("abc123");
		WebElement fname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fname.sendKeys("soumya");
		//WebElement submit1 = driver.findElement(By.xpath("(/html/body/form/input)[3]"));
		//submit1.click();
		WebElement girl = driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		girl.click();
		WebElement female = driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		WebElement locate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		locate.click();
		WebElement submit = driver.findElement(By.xpath("(/html/body/input)[7]"));
		submit.click();
		
		
		
		
	}

}
