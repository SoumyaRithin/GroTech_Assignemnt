package NeedToUpload;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	import java.util.Set;

	public class Assignments_113 {
		//Demonstrate ListIterator
		public static void main(String[] args) {
		List a1=new ArrayList();
		a1.add("sam");
		a1.add("ram");
		a1.add("som");
		a1.add(23);
		a1.add(true);
		System.out.println("List : "+a1);
		Set a2 = new HashSet();
		a2.add("sam");
		a2.add("ram");
		a2.add("som");
		a2.add(23);
		a2.add(true);
	
		System.out.println("Set : "+a2);
		Iterator i3=a2.iterator();
		System.out.println("a2 iterator ");
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		ListIterator i2=a1.listIterator();
		System.out.println("a1 iterator next ");
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("a1 iterator previous");
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
		

		}

	}
