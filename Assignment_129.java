package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_129 {

	public static void main(String[] args) {
		// Demostrate a code for linktext locator use google application and click gmail linktext
FirefoxDriver driver =new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.google.co.in");
WebElement gmail=driver.findElement(By.linkText("Gmail"));
gmail.click();
	}

}
