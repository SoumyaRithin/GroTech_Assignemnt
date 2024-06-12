package sele_launch;

import java.util.Scanner;

public class Assignment120 {
//Demonstrate a program for Switch case, default and break with different browsers and scanner class
	public static void main(String[] args) {
		
		
		Scanner s1=new Scanner(System.in);
		 System.out.println("Enter the value ");
		int i=s1.nextInt();
		switch(i)
		{
		case 1:
		 System.out.println("please launch Google Chrome driver");
		 break;
	case 2:
		 System.out.println("please launch Google Chrome driver");
		 break;
	case 3:
		 System.out.println("please launch Mozilla driver");
		 break;
	case 4:
		 System.out.println("please launch Edge driver");
		 break;
	case 5:
		 System.out.println("please launch Safari driver");
		 break;
	default:
		 System.out.println("invalid number");
		
		
	}
}}
