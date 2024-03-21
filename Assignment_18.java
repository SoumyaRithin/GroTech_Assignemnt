package done_assignments;
public class Assignment_18 {
	//"Write a program with 4 Static method and 4 Non-Static method make sure all have same name"
	static void program()
	{
	System.out.println("static method 1  ");	
	}
	static void program(int a)
	{
		System.out.println("static method 2  ");	
	}
	static void program(char a)
	{
		System.out.println("static method 3  ");	
	}
	static void program(int a,int b)
	{
		System.out.println("static method 4  ");	
	}
	 void program(int a, int b,int c)
	 {
		 System.out.println("non-static  method 1  ");		 
	 }
	 void program(int a,float b)
	 {
		 System.out.println("non-static  method 2  ");		 
	 }
	 void program(double a, int b)
	 {
		 System.out.println("non-static  method 3  ");	}
	 void program(int a, int b,String c)
	 {
		 System.out.println("non-static  method 4  ");		 
	 }
	 public static void main(String[] args)
	 {
		program();program(1);program('M');program(5,6);
		 Assignment_18 a1=new Assignment_18();
		 a1.program(2,5,8);
		 a1.program(2,1.8f); a1.program(5.1,8); a1.program(2,4,"task");
		}}


