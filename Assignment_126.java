package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_126 {	
		/*"Automate below scenario
1.launch browser
2.goto google.com
3.type ""india"" on search textfield
4.Search using enter click on keyboard"  */
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();//launch browser
		
		driver.get("https://www.google.com/");   //2.goto google.com
		driver.findElement(By.name("q")).sendKeys("India"); //3.type ""india"" on search textfield
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER); //4.click on Enter on keryboard"
	}

}
