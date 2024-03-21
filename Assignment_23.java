package done_assignments;

public class Assignment_23 {
	//Write a program for Declaration and Intilization for Local and Global Variables
static int a=10; static int b=10;

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


public static void main(String[] args) {
	add();
	sub();
	mul();
	div();
	
	
	
}
}
