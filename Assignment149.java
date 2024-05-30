package sele_B41;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment149 {
	//Launch amazon.in type shoe, & Auto_select the 5th suggesion.


	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");

	WebElement w1=	driver.findElement(By.id("twotabsearchtextbox"));

	w1.sendKeys("shoe");
	Thread.sleep(2000);
	
	List<WebElement> amazonautosuggestion= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	   int count = amazonautosuggestion.size();
	   System.out.println(count);
	   amazonautosuggestion.get(4).click();
}
}