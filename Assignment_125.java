package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_125 {

	public static void main(String[] args) {
		/* "Automate below scenario
		1.launch browser
		2.goto other website like amazon/flipcart
		3.type ""sample eg text"" on search textfield
		4.click on search button"   */
		
			ChromeDriver driver =new ChromeDriver();//launch browser
		
			driver.get("https://www.amazon.in/");   //2.goto amazon.com
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sample eg text"); //3.type ""sample eg text"" on search textfield
			driver.findElement(By.id("nav-search-submit-button")).click(); //4.click on search button" */
			}
	}


