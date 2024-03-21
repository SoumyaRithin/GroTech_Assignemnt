package grotech_automation;

import java.util.Arrays;

//Create an array with double and Boolean data types?
public class Assignment_43 {
	
	public static void main(String[] args) {
		{
			double number[]=new double[3];
			boolean value[]=new boolean[3];
			number[0]=1454.3885;
			number[2]=34.678789;
			number[1]=56.467;
			value[0]=true;
			value[1]=false;
			value[2]=true;
			
			Arrays.sort(number);
			
System.out.println(Arrays.toString(value));
System.out.println(Arrays.toString(number));
		}
	}

}