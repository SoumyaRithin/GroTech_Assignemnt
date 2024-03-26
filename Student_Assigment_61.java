package java_assignment;
//WAP by upcasting from Experience Student class to Mentor Class and downcasting from Experience
//Student Class to Student Class with four classes of Student, Experience Student,Mentor and Teacher
class Teacher
{
void add()
{
	System.out.println("addition");
}
}
class mentor extends Teacher 
{
	void mul()
	{
		System.out.println("Multiplication");
	}
}
public class Student_Assigment_61 extends mentor {

	void division()
	{
		System.out.println("division");
	}
	public static void main(String[] args) {
		
		mentor m1= new Student_Assigment_61();//upcasting
		System.out.println("upcasting");
		m1.add();
		m1.mul();
		Student_Assigment_61 s1=(Student_Assigment_61)m1;//downcasting
		System.out.println("*********************************************************************");
		System.out.println("downcasting");
		s1.mul();
		s1.division();
		s1.add();

	}

}
