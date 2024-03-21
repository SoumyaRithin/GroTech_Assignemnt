package done_assignments;
//Write a program for method overriding 
class parent_35
{
	void add()
	{
		System.out.println("parent method");
	}
}
public class Assignment_35 extends parent_35 {
void add()
{
	System.out.println("child method");
	super.add();
}
public static void main(String[] args) {
	Assignment_35 a1 =new Assignment_35();
	a1.add();
	
}
}
