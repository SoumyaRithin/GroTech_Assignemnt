package sele_launch;

import java.util.ArrayList;

public class Assignment_115 {

	public static void main(String[] args) {
		//Demonstrate get(),set(),indexof() methods of Arraylist.
ArrayList a1=new ArrayList();
a1.add(12);
a1.add(94);
a1.add(91);
a1.add(-35);
a1.add(0);
System.out.println(a1);
System.out.println("get()  :"+a1.get(1)); //get()
a1.set(1,0); //set()
System.out.println("set()  : " +a1);
		System.out.println("indexof()-35 is :  "+a1.indexOf(-35));//indexof()

	}

}
