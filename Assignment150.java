package sele_B41;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment150 {


	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		//ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();

		driver.get("https://www.goodrx.com/");

	WebElement w1=	driver.findElement(By.xpath("(//input[@id='autocomplete-input'])[4]"));

	w1.sendKeys("Diclo");
	Thread.sleep(2000);
	
	List<WebElement> pharmacyautosuggestion= driver.findElements(By.xpath("//div[@class='sc-133ge4c-0 jHGJcQ']/ul/li"));
	   int count = pharmacyautosuggestion.size();
	  System.out.println(count);
	   pharmacyautosuggestion.get(4).click();
}
}