package java_assignment;

import java.util.Scanner;

//Find the factorial of numbers using  scanner class
public class Assigment_52 {
	
	public static void main(String[] args) {
	System.out.println("Please enter factorial number");	
Scanner s1=new Scanner (System.in);
long sum=1;
int number= s1.nextInt();
for(int i=1;i<=number;i++)
{
	sum=sum*i;
}
System.out.println(number +"! is "+sum);

	}

}
