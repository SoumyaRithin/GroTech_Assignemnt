package done_assignments;

public class Assignment_14 {
//Write a program for NOT with AND and NOT with OR operator
	public static void main(String[] args) {
		int a=100; int b=200;
		//NOT with AND operator
		 if(!(a>=18 && b==10000))
		 {
			 System.out.println("NOT with AND operator");
			System.out.println("NOT-AND condition program PASS"); 
		 }
		 else 
		 {
			 System.out.println("NOT with AND operator");
			 System.out.println("NOT-AND condition program FAIL");
		 }
	
		 if(!(a>=18 || b==10000))
		 {
			 System.out.println("NOT with OR operator"); 
			System.out.println("NOT-AND condition program PASS"); 
		 }
		 else 
		 {
			 System.out.println("NOT with OR operator");
			 System.out.println("NOT-OR condition program FAIL");
		 }
	}
}
