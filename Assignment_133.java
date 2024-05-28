package sele_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment_133 {

	public static void main(String[] args) {
		// Goto Amazon.in locate shoe with relative xpath
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		     WebElement searchbar=   driver.findElement(By.xpath(("(//input)[5]")));
		     searchbar.sendKeys("shoe");
		  WebElement search= driver.findElement(By.xpath("(//input)[6]"));
		  search.click();

	}

}
