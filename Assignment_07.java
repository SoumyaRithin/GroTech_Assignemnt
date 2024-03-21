package done_assignments;

public class Assignment_07 {

	/* Create a class and write 5 static methods each for addition, subtration, multiplication, 
	  devision and modules,call it in the main method */
	
	public static void main(String[] args) 
	{
		add(); 	sub(); mul(); div(); mod();
		
	}
	 static void add()
	{
		 int num1=2; double num2 =100;
		System.out.println("Addition = "+(num1+num2));
	}
	static void sub()
	{
		int num1=2; int num2 =100;
		System.out.println("Subtraction = "+(num2-num1));
	}
	static void mul()
	{
		int num1=2; byte num2 =100; 
		System.out.println("Multiplication = "+(num1*num2));
	}
	static void div()
	{
		int num1=2; byte num2 =100; 
		System.out.println("Division = "+(num2/num1));
	}
	static void mod()
	{
		int num1=2; double num3=2.05;
		System.out.println("Modulus = "+(num3%num1));	
	}
	}

