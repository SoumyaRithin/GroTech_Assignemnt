package sele_launch;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_114 {

	public static void main(String[] args) {
		// Sort the ArrayList using Collections class(int,String)
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(96);
		a1.add(-53);
		a1.add(-98);
		a1.add(-0);
		System.out.println("int" + a1);
		Collections.sort(a1);
		System.out.println("collections(sort) using integer value"+a1);
		
		
		ArrayList a2=new ArrayList();
		a2.add("20");
		a2.add("96");
		a2.add("-53");
		a2.add("-93");
		a2.add("-0");
		System.out.println("String: " + a2);
		Collections.sort(a2);
		System.out.println("collections(sort) Using String values"+a2);
	

	}

}
