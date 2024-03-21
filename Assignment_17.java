package done_assignments;
public class Assignment_17 {
	//Write a program with 2 Static method,2 Non-Static method,and one Constructor
	static void add()
	{
		int a=10; int b =5;
	System.out.println("addition  "+(a+b));	
	}
	static void sub()
	{
		int a=10; int b =5;
		System.out.println("Subtraction  "+(a-b));	
		
	}
	 void mul()
	 {
			int a=10; int b =5;
			System.out.println("multiplication  "+(a*b));	
		 
	 }
	 void div()
	 {
			int a=10; int b =5;
			System.out.println("Divition  "+(a/b));	
		 
	 }
	 Assignment_17()
	 {
			System.out.println("This is constructor ");	
		 
	 }

	 public static void main(String[] args)
	 {
		
		 add();
		 sub();
		 Assignment_17 a1=new Assignment_17();
		 a1.mul();
		 a1.div();
		 }}
