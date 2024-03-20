package java_assignment;
//In a string "sky is 441 !@#" find out the number of special character,alphabet,numeric,spaces we have
public class Assigment_49 {
	public static void main(String[] args) {
		
	String name="sky is 441 !@#";
	char a[]=name.toCharArray();
	int c=0;int d=0;int s=0;int sc=0;
	for(int i=0;i<name.length();i++) 
	{
		boolean word=Character.isAlphabetic(a[i]);
		boolean num=Character.isDigit(a[i]);
		boolean space=Character.isSpaceChar(a[i]);
		
		if(word==false)
		{
		if(num==false)
		{
			if(space==false)
				
			{
				sc++;
			}else {
				s++;
			}
		}else {
			d++;
		}
		}
		else 
		{
		c++;	
		}
		
	}
	System.out.println("total number of character"+c);
	System.out.println("total number of Digit"+d);
	System.out.println("total number of space"+s);
	System.out.println("total number of special character"+sc);

}}
