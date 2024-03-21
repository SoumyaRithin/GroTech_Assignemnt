package done_assignments;
import java.util.Scanner;
//write a program for multiple level inheritance with 4 parents  using interface?
interface Parent_1{
 void add(int a,int b);
}
interface Parent_2{
	void  sub(int a,int b);
}
interface Parent_3{
	 void mul(int a,int b);
}
interface Parent_4{
	void div (int a,int b);
}
public class Assignment_39 implements Parent_1,Parent_2 ,Parent_3,Parent_4{
static void mod(int a,int b){	
	System.out.println("modulus"+(a%b));	
}
public void div(int a,int b) {
	System.out.println("Division"+(a/b));	
}
public void mul(int a,int b) {
	System.out.println("multiplication"+(a*b));	
}
public void sub(int a,int b) {
	System.out.println("substraction"+(a-b));	
}
public void add(int a,int b) {
	System.out.println("Addition"+(a+b));}
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	Assignment_39 a1=new Assignment_39();
	System.out.println("Enter the 1st number");
	int a=s1.nextInt();
	System.out.println("Enter the 2st number");
	int b=s1.nextInt();
	mod(a,b);
	
	a1.add(a,b);
	a1.sub(a,b);
	a1.mul(a,b);
	a1.div(a,b);
	
}

}
