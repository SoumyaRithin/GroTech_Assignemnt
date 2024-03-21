package done_assignments;
import java.util.Scanner;
public class Assignment_26 {
	//declare and initialize all type of scanners
	
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter:nextLine");
		String r= s1.nextLine();
		System.out.println(r);
		
		System.out.println("Enter your name ");
		String name= s1.next();
		System.out.println("Hello "+name+" have a great day! ");
		
		System.out.println("Enter:nextInt");
		int i= s1.nextInt();
		System.out.println(i);
		
		System.out.println("Enter:nextShort");
		short a= s1.nextShort();
		System.out.println(a);
		
		System.out.println("Enter:nextLong");
		long b= s1.nextLong();
		System.out.println(b);

		System.out.println("Enter:nextFloat");
		float z= s1.nextFloat();
		System.out.println(z);
		
		System.out.println("Enter:nextDouble");
	    double c= s1.nextDouble();
		System.out.println(c);
		System.out.println("Enter:nextBoolean");
		boolean d= s1.nextBoolean();
		System.out.println(d);	
	}

	}


