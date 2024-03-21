package done_assignments;

import java.util.Scanner;

//write a program using this keyword to assign the value of a LV(local variable) to GV(global variable)
public class Assignment_36 {
static int age=20;static String name ="name";

 void add(String name,int age)
{
	this.age=age;
	System.out.println("After assigned the value of a LV to GV");
	System.out.println("Name :  "+name);
	System.out.println("Age : "+age);
}
	public static void main(String[] args) {
		System.out.println("Global variable ");
		System.out.println("   age:   "+age);
		System.out.println("   name : "+name);
Scanner s1=new Scanner(System.in);
System.out.println("Please Enter your Name ");
name = s1.next();
System.out.println("Please Enter your age");
age =s1.nextInt();
Assignment_36 a1=new Assignment_36();
a1.add(name, age);

System.out.println("Name :  "+name);
System.out.println("Age : "+age);
	}

}
