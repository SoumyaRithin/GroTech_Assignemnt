package TestNG_testcase;
import java.util.Iterator;
import java.util.Set;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Assignment183TestCase5 {
@Test
public static void logout()
{
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement srch=   driver.findElement(By.id("twotabsearchtextbox"));
 srch.sendKeys("Shoe");
 srch.sendKeys(Keys.ENTER);
 WebElement shoe_1 =driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
 shoe_1.click();
 
 
 Set<String> both= driver.getWindowHandles();
 Iterator<String> s1= both.iterator();
 String pid= s1.next();
 String cid= s1.next();
 driver.switchTo().window(cid);
 driver.manage().window().maximize();
 
 WebElement wishlist=  driver.findElement(By.xpath("//span[@id='wishListMainButton']"));
 wishlist.click();
 WebElement mail=   driver.findElement(By.id("ap_email"));
 mail.sendKeys("85254877979");
 
 WebElement submit=  driver.findElement(By.xpath("//input[@id='continue']"));
 submit.click();
 WebElement pswd=  driver.findElement(By.xpath("//input[@id='ap_password']"));
 pswd.sendKeys("grotech@123");
 WebElement sub=  driver.findElement(By.xpath( "//input[@id='signInSubmit']"));
 sub.click();
 
 WebElement addcart=  driver.findElement(By.xpath( "//input[@id='add-to-cart-button']"));
 addcart.click();
 
 //logout
 
 WebElement hoveroverAccount = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
    Actions a1=new Actions(driver);
    a1.moveToElement(hoveroverAccount).perform();
    WebElement signout = driver.findElement(By.xpath( "(//span[@class='nav-text'])[20]"));
    
    signout.click();

}}
