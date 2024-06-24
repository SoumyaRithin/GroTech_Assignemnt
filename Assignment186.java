package NGTest;

import org.testng.annotations.Test;

public class Assignment186 {
	//"Demostrate the  TestCases using the invocationCount parameter in TestNG
	//Example: 
		//@Test(invocationCount=10)"

	@Test(invocationCount=10)
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
