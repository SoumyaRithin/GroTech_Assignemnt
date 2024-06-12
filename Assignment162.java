package sele_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment162 {
	//Find out the number of links in page and get the URL of each one of them. also print its linktext value. 
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	List < WebElement > links=driver.findElements(By.tagName("a"));//tagname <a> has link
	int count = links.size();  //to know the count of total links
	System.out.println(count);

	
	for(int i=0;i<count;i++)
	{
		WebElement s1=links.get(i);
	String link=	s1.getAttribute("href");// get 1 st link name and store it in link string variable 
	
		
		System.out.println(link);
	}
	
}
}
