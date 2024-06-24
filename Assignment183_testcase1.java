package NGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
test case 1: amazon login
test case 2: amazon login +  search Shoe
test case 3: amazon login +  search Shoe +  selecting a product
test case 4: amazon login +  search Shoe + selecting a product + add to cart or wishlist
test case 5: amazon login +  search Shoe + selecting a product + add to cart or wishlist +  logout of the application. 
    run all cases as a suite

*/
public class Assignment183_testcase1 {

 //test case 1: amazon login
@Test
public void Login_Amazon()
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
}
}
