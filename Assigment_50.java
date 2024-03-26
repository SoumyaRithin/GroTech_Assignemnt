package java_assignment;

import java.util.Arrays;

//Copy the value of 1 array into another array using iteration
public class Assigment_50 {
public static void main(String[] args) {
	int a[]=new int[3];
	int b[]=new int[3];
	a[0]=25;
	a[1]=20;
	a[2]=39;
	for(int i=0;i<3;i++)
	{
		b[i]=a[i];
	}
	Arrays.sort(a);
	Arrays.sort(b);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	
}
}
