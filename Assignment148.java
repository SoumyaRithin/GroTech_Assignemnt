package sele_B41;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment148 {
	//Launch google.co.in type india and select 5th autosuggestion.
	

		public static void main(String[] args) throws InterruptedException {

			ChromeDriver driver=new ChromeDriver();

			driver.get("https://www.google.co.in/");

		WebElement w1=	driver.findElement(By.id("APjFqb"));

		w1.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> autosuggestion=   driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));// find autosuggestion so xpath will be all autosuggestion path with absalute xpath and relative xpath
		
		int count = autosuggestion.size();//to know howmany suggestion present 
		System.out.println(count);
autosuggestion.get(4).click();
		

			

			

		}



	}