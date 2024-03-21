package done_assignments;

import java.util.Scanner;

//create 5 methods for addition , subtraction , multiplication ,division , modulus using 5 scanner class with local  variables
public class Assignment_29 {
static void addition(int a ,int b)
{
	int sum =a+b;
	System.out.println("Addition: "+sum);
}
static void subtraction(int a ,int b)
{
	System.out.println("subtraction: "+(a-b));
}
static void multiplication(int a, int b)
{
	System.out.println("multiplication: "+(a*b));
}
static void division(int a, int b)
{
	int div=a/b;
	System.out.println("Division: "+div);
}
static void modulus(int a ,int b)
{
	System.out.println("Modulus: "+(a%b));
}
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter addition 2 numbers");
	addition(s1.nextInt(),s1.nextInt());
	System.out.println("Enter subtraction 2 numbers");
	subtraction(s1.nextInt(),s1.nextInt());
	System.out.println("Enter multiplication 2 numbers");
	multiplication(s1.nextInt(),s1.nextInt());
	System.out.println("Enter division 2 numbers");
	division(s1.nextInt(),s1.nextInt());
	System.out.println("Enter modulus 2 numbers");
	modulus(s1.nextInt(),s1.nextInt());
	
	
}
}
