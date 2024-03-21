package done_assignments;

public class Assignmnet_16 {
	/* Write a program to check if gender equals to male or female.If it is male and check if age is greater than 18 or not.
	if it is greater than 18 then the person is eligible to vote otherwise not eligible to vote.If it is female and check if age is greater than 18 or not.
	If the age is greater than 18 then the person is eligible to vote otherwise not eligible to vote  */
 public static void main(String[] args) {
	String gender="Female";int age=28;
	if(gender=="Male")
	{
		if(age>18)
		{
			System.out.println("Female");
			System.out.println("persone is eligible to vote");
		}
		else 
			System.out.println("Female");
			System.out.println("person is not eligible to vote");
	}
	else 
	{
		System.out.println("voting eligible program");
	}
   if(gender=="Female")
	{
		if(age>18)
		{
			System.out.println("Female");
			System.out.println("person is eligible to vote");
		}
		else 
		{
			System.out.println("Female");
			System.out.println("person is not eligible to vote");
	     }
	}
	else
		{
		System.out.println("voting eligible program");	
		}
}
}
