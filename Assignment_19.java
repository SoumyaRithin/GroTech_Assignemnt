package done_assignments;
public class Assignment_19 {
	//write a program for constructor overloading using 10 constructors
	 public static void main(String[] args) {
		 new Assignment_19();
		 new Assignment_19(1);
		 new Assignment_19(1.5f);
		 new Assignment_19(15.2);
		 new Assignment_19("add");
		 new Assignment_19(1,2);
		 new Assignment_19("one",2);
		 new Assignment_19(1.6f,5);
		 new Assignment_19("two",2.4f);
		 new Assignment_19("hi",267.4);
		/* Assignment_19 a1=new Assignment_19();
		 Assignment_19 b1=new Assignment_19(12);
		 Assignment_19 c1=new Assignment_19(1.5f);
		 Assignment_19 d1=new Assignment_19(15.2);
		 Assignment_19 e1=new Assignment_19("add");
		 Assignment_19 f1=new Assignment_19(1,2);
		 Assignment_19 g1=new Assignment_19("one",2);
		 Assignment_19 h1=new Assignment_19(1.6f,5);
		 Assignment_19 i1=new Assignment_19("two",2.4f);
		 Assignment_19 j1=new Assignment_19("hi",267.4); */
    }
	 Assignment_19()
	 {System.out.println("constructor 1"); }
	 Assignment_19(int a)
	 { System.out.println("constructor 2"); 	 }
	 Assignment_19(float a)
	 { System.out.println("constructor 3"); }
	 Assignment_19(double a)
	 { System.out.println("constructor 4"); 	 }
	 Assignment_19(String a)
	 { System.out.println("constructor 5");	 }	 
	 Assignment_19(int a,int b)
	 {System.out.println("constructor 6");	 }	
	 Assignment_19(String a,int b)
	 { System.out.println("constructor 7"); 	 }	
	 Assignment_19(float a,int b)
	 { System.out.println("constructor 8"); 	 }	
	 Assignment_19(String a,float b)
	 { System.out.println("constructor 9"); 	 }	
	 Assignment_19(String a,double b)
	 {System.out.println("constructor 10"); 	 }
}
