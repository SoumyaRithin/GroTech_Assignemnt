package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_124 {
	/* "Automate below scenario
	1.launch browser
	2.goto google.com
	3.type ""india"" on search textfield
	4.click on search button" */
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();//launch browser
		
		driver.get("https://www.google.com/");   //2.goto google.com
		driver.findElement(By.name("q")).sendKeys("India"); //3.type ""india"" on search textfield
		driver.findElement(By.name("btnK")).click(); //4.click on search button" */
		}
}
