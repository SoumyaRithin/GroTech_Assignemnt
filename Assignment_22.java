package done_assignments;

public class Assignment_22 {
//Write a program to find Area of Circle,Triangle,Rectangle,Square,Trapezium

static void circle()
{
	double pi=3.14;int r=10;
	double area_c=pi*r*r;
	System.out.println("Area of Circle: "+area_c);
}
static void triangle()
{
	int base=20; int height=50;
	double area_t=(base*height)/2;
	System.out.println("Area of Triangle: "+area_t);
}
static void rectangle()
{
	int length=10; int width =5;
	int area_r=length*width;
	System.out.println("Area of Rectangle: "+area_r);
}
static void square()
{
	int side=15;
	int area_s=side*side;
	System.out.println("Area of Square: "+area_s);
}
static void Trapezium()
{
	int base1=20;int base2=16; int height=77;
	double area_tr = (base1+base2)*height/2;
	System.out.println("Area of Trapezium: "+area_tr);
}


	public static void main(String[] args) {
		circle(); triangle(); rectangle();square();Trapezium();

	}

}
