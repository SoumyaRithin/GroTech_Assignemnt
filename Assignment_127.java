package sele_launch;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Assignment_127 {

	public static void main(String[] args) {
		// Launch facebook.com > click on create account > register yourself > Use name and ID locator
		FirefoxDriver driver =new FirefoxDriver();//launch browser
 driver.get("https://www.facebook.com/reg/");
 driver.findElement(By.name("firstname")).sendKeys("Soumya");
 driver.findElement(By.name("lastname")).sendKeys("Haridas");
 driver.findElement(By.name("reg_email__")).sendKeys("Soumya@gmail.com");
 
 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("123");
 driver.findElement(By.name("reg_passwd__")).sendKeys("123");
 driver.findElement(By.name("websubmit")).click();

 
	}

}
