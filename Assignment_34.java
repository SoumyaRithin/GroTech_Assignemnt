package done_assignments;
//Write a program to call the parent class constructor using super calling statement
 class parent
{
	parent(int a)
	{
		System.out.println("This is Parent constructor ");
	}
}
public class Assignment_34  extends parent{
	Assignment_34()
	{
		super(1);
	System.out.println("This is child constructor ");
	
	}
	public static void main(String[] args) {
		new Assignment_34();

	}

}
