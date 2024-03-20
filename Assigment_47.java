package java_assignment;

//import java.util.Scanner;

//In  a string "mango123" check which character is numeric and which is alpha
public class Assigment_47 {
public static void main(String[] args) {
	String name= "mango123";
	char[] value = name.toCharArray();
	for (int i=0;i<name.length();i++) {
  boolean result = Character.isAlphabetic(value[i]);
  if (result ==true)
  {
	  System.out.println("index position "+i+" is Alphabet ");
  }else {
	  System.out.println("index position "+i+" is Numeric  ");
  }
	}
	
	System.out.println(value);
}
}
