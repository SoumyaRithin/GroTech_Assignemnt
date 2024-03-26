package java_assignment;
//Print the numbers from 1 to 1000, if the number is divisible by 3 print "sun" and if number is divisible by 5 then print "moon",
//and again if the both numbers divisible (3&5) print "sun and moon" 
public class Assigment_55 {
	public void sun(int i)
	{
		System.out.println("sun "+i);
	}
	public void moon(int i) {
		
		System.out.println("moon "+i);	
	}
	public void sunmoon(int i) {
		System.out.println("sun and moon "+i);
	}
	public static void main(String[] args) {
		Assigment_55 a1=new Assigment_55();
		for(int i=1;i<=100;i++)
		{
		
			if (i%3==0&&i%5==0)
			{
				a1.sunmoon(i);
				
			}else if(i%3==0) {
				a1.sun(i);
				
			}else if(i%5==0) {
				a1.moon(i);
			}
			else {
				System.out.println("number is:"+i );
			}
			
		}
	}

}
