package NGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment183_testcase3 {
	// test case 3: amazon login +  search Shoe +  selecting a product
	@Test
	public void select_shoe()
	{
		ChromeDriver driver= new ChromeDriver();
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
		 //search Shoe
		 WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
		 srch.sendKeys("Shoe");
		 srch.sendKeys(Keys.ENTER);
		 WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		 shoe_1.click();
}}
