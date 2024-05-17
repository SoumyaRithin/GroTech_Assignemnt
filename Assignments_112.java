package NeedToUpload;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Assignments_112 {
//Demonstrate how List and set are different from each other ?
	public static void main(String[] args) {
	List a1=new ArrayList();
	a1.add("sam");
	a1.add("ram");
	a1.add("som");
	a1.add(23);
	a1.add(true);
	a1.add("repeat");
	a1.add("repeat");
	System.out.println("List : "+a1);
	Set a2 = new HashSet();
	a2.add("sam");
	a2.add("ram");
	a2.add("som");
	a2.add(23);
	a2.add(true);
	a2.add("repeat");
	a2.add("repeat");
	System.out.println("Set : "+a2);
	}

}
