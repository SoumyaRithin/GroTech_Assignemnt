package grotech_automation;

import java.util.Arrays;

//write a program to check whether the given string is palindrome or not
public class Assignment_41 {
	public static void main(String[] args) {
		//char sum='a';char sum1='a';
	
	String name="madam";
	String reverse ="";
	for(int i =name.length()-1;i>=0;i--) {
		char sum= name.charAt(i);
		reverse =reverse+sum;
		
	}
	//System.out.println(name);
	//System.out.println(reverse);
	boolean a=name.equals(reverse);
	if(a==true) {
		
	
	System.out.println("given string is palindrome");
	}
	else {
		System.out.println("given string is Not palindrome");
	}
	}
}
