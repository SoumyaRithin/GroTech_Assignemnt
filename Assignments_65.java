package NeedToUpload;
//Write a program to demonstrate this calling statement
import java.util.Scanner;

public class Assignments_65 {

	

	public Assignments_65()

	{

		

		this(100);

		System.out.println("constructor 1");

	}

	public Assignments_65(int a)

	{

		

		this("soumya");

		System.out.println("constructor 2");

	}

	public Assignments_65(String b)

	{

		

		this("abc",10);

		System.out.println("constructor 3");

	}

	public Assignments_65(String a,int b)

	{

		System.out.println("constructor 4");

	}

	

	public static void main(String[] args) {

		

		Assignments_65 a = new Assignments_65();

		

	}



}