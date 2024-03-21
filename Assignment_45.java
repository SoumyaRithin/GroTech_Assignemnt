package grotech_automation;

import java.util.Arrays;
import java.util.Scanner;

//write a program in Array by getting the size of an array using Scanner class?
public class Assignment_45 {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner s1=new Scanner(System.in);
		  int a=s1.nextInt();

	int name[] = new int[a];
	
	for (int i=0;i<(name.length);i++ )
	{
		System.out.println("Enter the integer value");
		name[i]=s1.nextInt();	
	}
	Arrays.sort(name);
	for (int i=0;i<(name.length);i++ )
	{
		
		System.out.println(name[i]);
	}
	
	
	}

}
