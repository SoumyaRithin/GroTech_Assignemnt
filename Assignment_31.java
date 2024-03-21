package done_assignments;
//Write a program for single level inheritance
class parent {
	static void parentmethod()
	{
	System.out.println("This is Parent class");	
	}
}
public class Assignment_31 extends parent{
	static void childmethod()
	{
	System.out.println("This is child class");	
	}
	public static void main(String[] args) {
		parentmethod();
		childmethod();
	}

}
