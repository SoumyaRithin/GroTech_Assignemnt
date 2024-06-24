package TestNG_testcase;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class Assignment181 {
//Demonstrate a code for order of execution of annotations
	@Test
	public static void TestCaseOne()
	{
		System.out.println("TestCase1");
	}
	
	@BeforeSuite
	public static void BS()
	{
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public static void BT()
	{
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public static void BF()
	{
		System.out.println("Beforeclass");
	}
	
	@BeforeMethod
	public static void BM()
	{
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public static void AM()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public static void Ac()
	{
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public static void AT()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public static void as()
	{
		System.out.println("AfterSuite");
	}
}
