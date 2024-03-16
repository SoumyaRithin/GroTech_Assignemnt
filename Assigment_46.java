package java_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assigment_46 {

	public static void main(String[] args) {
		//Check any 2 strings are anagram or not
		
		System.out.println("Please Enter the 1st word");
		Scanner s1=new Scanner(System.in);
		             String name1=s1.next();
		             System.out.println("Please Enter the second word");
		     		
		     		             String name2=s1.next();
		             
		            System.out.println("your 1st word is :"+name1);
		            System.out.println("your 2nd word is :"+name2); 
		            if(name1.length()!= name2.length())
		            {
		            	System.out.println(" Enter the words are not Anagram ");
		            }
		            else {
		            	char n1[]= name1.toCharArray();
		            	char n2[]=name2.toCharArray();
		            	Arrays.sort(n1);
		            	Arrays.sort(n2);
		            	boolean a= Arrays.equals(n1, n2);
		            	if (a==true) {
		            		System.out.println("Enter the words are Anagram");
		            	}
		            	else {
		            		System.out.println("Enter the words are not Anagram");
		            	}}
		            	}
		            

	}


