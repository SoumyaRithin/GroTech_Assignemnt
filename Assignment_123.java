package sele_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_123 {
//Selenium program to get title of browser
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
	}
}
