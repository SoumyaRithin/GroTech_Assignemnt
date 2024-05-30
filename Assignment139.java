package finished;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment139 {

	
		// Demonstrate program on How to hover over https://grotechminds.com/hoverover/
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			 driver.get("https://grotechminds.com/hoverover/");
			 driver.manage().window().maximize();
			 
		
			
			 
			 WebElement Demo3= driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-531a7c0 e-con-full e-flex e-con e-child']"));
				Actions a1 = new Actions(driver);
				a1.moveToElement(Demo3).perform(); // hoverover demo2
				Thread.sleep(2000);
				WebElement practice1 = driver.findElement(By.xpath("(//div[@class='popup5'])[1]"));
				practice1.click();
			 
			 
			 
			 
			 
				WebElement Demo2= driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-ab4cf56 e-con-full e-flex e-con e-child']"));
				//Actions a1 = new Actions(driver);
				a1.moveToElement(Demo2).perform(); // hoverover demo2
				Thread.sleep(2000);
				WebElement practice10 = driver.findElement(By.xpath("(//div[@class='popup4'])[20]"));
				practice10.click();
			 
			 
				
			
			 
			WebElement Demo1= driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
			//Actions a1 = new Actions(driver);
			a1.moveToElement(Demo1).perform(); // hoverover demo1
			WebElement practice3 = driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
			practice3.click();
			
			
		}

	}