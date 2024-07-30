package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_195_DataProvider_conceptfacebookregistration {

///Un finished code ******* still working on it 
	
	
	//Use DataProvider concept facebook.com registration
	@DataProvider(name="login1")
	public Object [][] method1()
	{
		Object d1[][]=new Object[5][4];
		d1[0][0]="Soumya";
		d1[0][1]="hari";
		d1[0][2]="soumya@gmail.com";
	    d1[0][3]="asd145";
		
	    d1[1][0]="mani";
		d1[1][1]="ren";
		d1[1][2]="rem@gmail.com";
	    d1[1][3]="fg950";
	    
	    d1[2][0]="remz";
		d1[2][1]="das";
		d1[2][2]="remz@gmail.com";
	    d1[2][3]="asd145";
	    
	    d1[3][0]="dhan";
		d1[3][1]="davi";
		d1[3][2]="dhan@gmail.com";
	    d1[3][3]="asd145";
	    
	    d1[4][0]="thara";
		d1[4][1]="mohan";
		d1[4][2]="thara@gmail.com";
	    d1[4][3]="asd145";
		
		
		
		return d1;
		
	}
	
	@Test(dataProvider="login1")
	public void testcase1(String name,String surname,String email,String pswd)
	{
		
	ChromeDriver driver= new ChromeDriver();//launch browser
	 driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805964%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805964&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9062009%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=EAIaIQobChMIq7_cmI3yhgMVQ6lmAh0uvwgaEAAYASAAEgLZE_D_BwE");
	 driver.manage().window().maximize();
	 
	WebElement fname = driver.findElement(By.name("firstname"));
	fname.sendKeys(name);
	WebElement lname =driver.findElement(By.name("lastname"));
	lname.sendKeys(surname);
	WebElement reistr =driver.findElement(By.name("reg_email__"));
	reistr.sendKeys(email);
	 
	 driver.findElement(By.name("reg_email_confirmation__")).sendKeys(pswd);
	 
	 driver.findElement(By.name("reg_passwd__")).sendKeys("123");
	 WebElement fm=driver.findElement(By.xpath("(//label)[1]"));
	 fm.click();
	WebElement day= driver.findElement(By.id("day"));
	Select s1=new Select(day);
	s1.selectByIndex(7);

	WebElement month= driver.findElement(By.id("month"));
	Select s2=new Select(month);
	s2.selectByIndex(6);
	WebElement year= driver.findElement(By.id("year"));
	Select s3=new Select(year);
	s3.selectByValue("2000");

	 driver.findElement(By.name("websubmit")).click();
	 
	}
}
