package java_assignment;

import java.util.Scanner;

//Swap the 2 numbers without extra variable 
public class Assigment_54 {
	public static void main(String[] args) {
	System.out.println("Please enter 1st number");	
	Scanner s1=new Scanner (System.in);
	
int a = s1.nextInt();
System.out.println("Please enter 2nd number");	
int b= s1.nextInt();
System.out.println(" 1st number  is "+a);	
System.out.println(" 2nd number is "+b);

a=a+b;
b=a-b;
a=a-b;
System.out.println(" After Swap 1st number  is "+a);	
System.out.println(" After Swap  2nd number is "+b);

}
}