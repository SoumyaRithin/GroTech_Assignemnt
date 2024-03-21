package done_assignments;
//Write a program for multi level inheritance by creating different class

public class Assignment_32 extends Super_Class {
	static void  child()
	{
	System.out.println("This is chlild class");	
	}
	public static void main(String[] args) {
		
		grandparent();
		parent();
		child();
	}
}
