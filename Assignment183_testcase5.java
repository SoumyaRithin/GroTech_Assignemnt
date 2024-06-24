package NGTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment183_testcase5 {
	//test case 5: amazon login +  search Shoe + selecting a product + add to cart or wishlist +  logout of the application. 
    
@Test
public void logout() throws InterruptedException

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
		 Set<String> both= driver.getWindowHandles();
		 Iterator<String> s1= both.iterator();
		 String pid= s1.next();
		 String cid= s1.next();
		 driver.switchTo().window(cid);
		 driver.manage().window().maximize();
		 //add to cart
		 WebElement addtocart =driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		 addtocart.click();
		 //logout
		 WebElement hoverover =driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		 //hoverover.click();
		 Actions a1=new Actions(driver);
		 a1.moveToElement(hoverover).perform();
		 Thread.sleep(2000);
		 WebElement log_out =driver.findElement(By.xpath("(//span[@class='nav-text'])[22]"));
		 log_out.click();
		 
}}
