package done_assignments;

import java.util.Scanner;

//Find the area and circumference of the circle,triangle,square,rectangle & trapezium using scanner class
public class Assignment_30 {
	static float pi=3.14f;
static void circle(int r) {
	float sum = pi*r*r;
	System.out.println("Area of the Circle : "+sum);
}
static void triangle(int base,int height) {
	float sum = (base*height)/2;
	System.out.println("Area of the triangle : "+sum);
}
static void square(int side) {
	int sum = side*side;
	System.out.println("Area of the square : "+sum);
}
static void rectangle(int length,int width)
{
	int sum = length*width;
	System.out.println("Area of the rectangle : "+sum);
}
static void trapezium(int base1,int base2,int height)
{
	float sum = (base1+base2)*height/2;
	System.out.println("Area of the trapezium : "+sum);
}
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);

	System.out.println("Enter r for Circle");
     circle(s1.nextInt());
     System.out.println("Enter base and height for triangle");
     triangle(s1.nextInt(),s1.nextInt());
     
     System.out.println("Enter side for square");
     square(s1.nextInt());
     System.out.println("Enter length and width for rectangle");
     rectangle(s1.nextInt(),s1.nextInt());
     System.out.println("Enter base and height for trapezium");
     trapezium(s1.nextInt(),s1.nextInt(),s1.nextInt());	
}
}
