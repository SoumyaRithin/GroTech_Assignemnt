package done_assignments;
//write a program using abstract class,abstract method ,concrete class and concrete method?
abstract  class parent_class
{
	abstract  void add();
}

public class Assignment_37 extends parent_class {
	 void add()
	{
		System.out.println("this is abstractmethod overriden ");
	}
	 void mul()
		{
			System.out.println("this is concrete method ");
		}

	public static void main(String[] args) {
		System.out.println("this is concrete method inside of the concrete class ");
		Assignment_37 a1=new Assignment_37();
		a1.add();
		a1.mul();
		
		
	}
}
