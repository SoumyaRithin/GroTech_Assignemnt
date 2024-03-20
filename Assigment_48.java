package java_assignment;

public class Assigment_48 {
//In a string "mango" calculate how many are alpha and how many are numeric
	public static void main(String[] args) {
 String name="mango";
 int count =0;int num=0;
   char arr[]= name.toCharArray();
   for(int i=0; i<name.length();i++) {
	  boolean c= Character.isAlphabetic(arr[i]);
	  if (c==true) {
		  count++; 
	  }else {
		  num++;
	  }
   }
   System.out.println("Alphabetic count :" +count);
   System.out.println("numeric count :"+num);

	}

}
