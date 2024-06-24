package NGTest;

import org.testng.annotations.Test;

public class Assignment187 {
//"Demostrate the  TestCases using more than one parameter in TestNG
	//Example: 
	//	@Test(Priority=-1,invocationCount=10)"
	
	@Test
	public  void Logout()
	{
		System.out.println("Logout");		
	}
	@Test(invocationCount=10,priority=-1)
	public  void Z_Login()
	{
	System.out.println("LogIN");	
	}
}
