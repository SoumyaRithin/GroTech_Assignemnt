package sele_launch;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.zeromq.ZStar.Set;

public class Assignment163 {
	//Launch naukari.com registration, click on login with google, move control to child window and enter email address
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://hk.linkedin.com/");
		driver.manage().window().maximize();
		
		 WebElement signin=driver.findElement(By.className("nsm7Bb-HzV7m-LgbsSe-BPrWId"));
		signin.click();
		Set<String>  s1=driver.getWindowHandles();//toget both id's
		
		
		Iterator <String> pcid=s1.iterator();
		String parent_id= pcid.next();
				String child_id=pcid.next();
				System.out.println(parent_id);
				System.out.println(child_id);
				driver.switchTo().window(child_id);
				driver.manage().window().maximize();
			WebElement child=	driver.findElement(By.id("identifierId"));
			child.sendKeys("somz@gmail.com");
				
		
	
	
	}

}
