package java_assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program  for an exception with 5 catches and 1 finally block
public class Assigment_59 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first value");
		int a=s1.nextInt();
		System.out.println("Enter the second value");
		int b=s1.nextInt();
try {
	int c=a/b;
	System.out.println(c);
}
catch (ArithmeticException a1)
{
	System.out.println("ArithmeticException");
}
catch ( NullPointerException n)
{
	System.out.println("NullPonterException");
}
catch(InputMismatchException i)
{
	System.out.println("InputMismatchException");
}
catch(ArrayIndexOutOfBoundsException b1)
{
	System.out.println("ArrayIndexOutOfBoundsException");
}
catch(NumberFormatException n1)
{
	System.out.println("NumberFormatException");
}
	}

}
