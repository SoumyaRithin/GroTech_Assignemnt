package NeedToUpload;

import java.util.ArrayList;

//Demonstrate 4 add() methods.3 remove(),clear(),isEmpty(),clone(), size(), contains() of ArrayList
public class Assignments_110 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println("add()");
		a1.add("soumya");
		a1.add("remya");
		a1.add("dhanya");
		a1.add(12);	
		a1.add(true);
		ArrayList a3=new ArrayList();
		a3= (ArrayList) a1.clone();
		System.out.println("a1 values ");
		System.out.println(a1);
		a1.remove(3);
		System.out.println("After Remove()");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		
		System.out.println("a2 values: ");
		a2.add(a1);
		a2.add("new");
		
		System.out.println(a2);
		a1.clear();
		
		System.out.println("a2 value is after a1 clear "+a2);
		System.out.println("isEmpty a1 value : "+ a1.isEmpty());
		a1=(ArrayList) a2.clone();
		System.out.println("clone : " +a1);
		System.out.println("size: "+ a1.size());
		System.out.println("a3 values"+a3);
		boolean con=a3.contains("remya");
		System.out.println("does a3 contains remya ? "+ con);
	}
}
