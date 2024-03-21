package done_assignments;
import java.util.Scanner;
public class Assignment_27 {
	//create 5 methods for addition , subtraction , multiplication ,division , modulus using scanner class
	static int a; static int b;
	static void add()
	{
		int sum = a+b;
		System.out.println("addition:"+sum);
	}

	static void sub()
	{
		int sum = a-b;
		System.out.println("subtraction:"+sum);
	}


	static void mul()
	{
		int sum = a*b;
		System.out.println("multiplication:"+sum);
	}

	static void div()
	{
		int sum = a/b;
		System.out.println("Division:"+sum);
	}

	static void mod()
	{
		int sum = a%b;
		System.out.println("modulus:"+sum);
	}

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter the 1st value");
		a= s1.nextInt();
		System.out.println("Please Enter the 2nd value");
		b=s1.nextInt();
		add();
		sub();
		mul();
		div();
		mod();
		
	}
}
