package sele_launch;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_128 {

	public static void main(String[] args) {
		// Register yourself on amazon application with use id and name locators
		FirefoxDriver driver =new FirefoxDriver();//launch browser
		 driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F%26tag%3Dusgoabkdeen-20%26ref%3Dnav_ya_signin%26adgrpid%3D157643735951%26hvpone%3D%26hvptwo%3D%26hvadid%3D677607229102%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D17280950258819266229%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9069536%26hvtargid%3Dkwd-10573980%26hydadcr%3D3631_13712499%26language%3Den_US%26gad_source%3D1&prevRID=0Z0EK0CEQZJ3V6RKF4W4&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 driver.findElement(By.id("ap_customer_name")).sendKeys("soumya");
		 driver.findElement(By.name("email")).sendKeys("soumya.hridayadas@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("ABCK@10274");
		 driver.findElement(By.name("passwordCheck")).sendKeys("ABCK@10274");
		 driver.findElement(By.id("continue")).click();
		 
		 
	}

}
