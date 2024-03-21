package done_assignments;

//import java.util.Scanner;

//Write a program to replace surname to some other name using String functions.
public class Assignment_38 {
	public static void main(String[] args) {
		String name="Manish Kumar";
		System.out.println("Surname is "+name);
		String num1=name.replaceAll("Kumar", "Tiwar");
		System.out.println("Updated surname is "+num1);
	}

}
