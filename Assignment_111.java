package NeedToUpload;

import java.util.ArrayList;
import java.util.Iterator;

//Demonstrate Iterator
public class Assignment_111 {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	System.out.println("add()");
	a1.add("soumya");
	a1.add("remya");
	a1.add("dhanya");
	a1.add(12);	
	a1.add(true);
	Iterator i1=a1.iterator();
	System.out.println("Iterator: ");
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
}
}
