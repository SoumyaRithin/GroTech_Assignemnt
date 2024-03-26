package java_assignment;

import java.util.Scanner;

//check if the given string contains space
public class Assigment_51 {

	public static void main(String[] args) {
		System.out.println("Please enter the string ");
		Scanner s1=new Scanner(System.in);
		String value =s1.nextLine();
		char sum[] =value.toCharArray();
		int add=0;
		for(int i=0;i<value.length();i++)
		{
			boolean check=Character.isSpaceChar(sum[i]);
			if(check ==true) {
				System.out.println("String contains Space");
				
			}
				else 
				{
					add++;
					
				}
			}
		if(add==value.length()) {
			
			System.out.println("String doest not contains Space");
		}
		
	}

}
