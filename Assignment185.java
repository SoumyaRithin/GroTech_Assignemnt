package NGTest;

import org.testng.annotations.Test;

public class Assignment185 {
//"Demostrate the  TestCases using the enabled parameter in TestNG
	//Example: 
		//@Test(enabled=false)"
	
	@Test(enabled=false)
	public  void Logout()
	{
		System.out.println("Logout");		
	}
	@Test
	public  void Login()
	{
	System.out.println("LogIN");	
	}
}
