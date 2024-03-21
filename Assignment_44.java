package grotech_automation;

import java.util.Arrays;
import java.util.Scanner;

//Create an array of length 3 of int data type and add its value at the runtime
public class Assignment_44 {
public static void main(String[] args) {
	int number[]= new int[3];
	Scanner s1=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		System.out.println("Enter the array value");
		number[i]=s1.nextInt();
	}
	
	System.out.println(Arrays.toString(number));

	
}
}
