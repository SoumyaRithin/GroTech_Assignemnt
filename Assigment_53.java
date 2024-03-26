package java_assignment;

import java.util.Scanner;

//Swap the 2 number using third variable 
public class Assigment_53 {
	public static void main(String[] args) {
	System.out.println("Please enter 1st number");	
	Scanner s1=new Scanner (System.in);
	
int a = s1.nextInt();
System.out.println("Please enter 2nd number");	
int b= s1.nextInt();
System.out.println(" 1st number  is "+a);	
System.out.println(" 2nd number is "+b);
int c=a;
a=b;
b=c;
System.out.println(" After Swap 1st number  is "+a);	
System.out.println(" After Swap  2nd number is "+b);
}
}