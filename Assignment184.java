package NGTest;

import org.testng.annotations.Test;

public class Assignment184 {
	//"Demostrate the  TestCases using the priority parameter in TestNG
	//Example: 
	//	@Test(Priority=-1)"

	
	
	
	@Test
	public  void Logout()
	{
		System.out.println("Logout");		
	}
	@Test(priority=-1)
	public  void Z_Login()
	{
	System.out.println("LogIN");	
	}
	
}
