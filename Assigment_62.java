package java_assignment;
//Try to find area of circle using PI from Math.PI, and radius from Math.random in the for loop  for 10 times.
public class Assigment_62 {

	public static void main(String[] args) {
	double pi=Math.PI;
	System.out.println(pi);
	for(int i=0;i<10;i++)
	{
		double r=Math.random();
		System.out.println(r);
		System.out.println(pi*r*r);
	
	}
	
	}

}
