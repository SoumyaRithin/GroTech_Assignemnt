package done_assignments;
//Write a program using for loop that starts from 1 to 10 and find out its average?
public class Assignment_28 {
	
	public static void main(String[] args) {
		 double sum=0;int count=0;
		for (int i=1;i<=10;i++)
		{
			sum=(sum+i);
			count++;
			
		}
		double average = sum/count;
		System.out.println("Sum is : "+sum);
		System.out.println("count is : "+count);
		System.out.println("Average is : "+average);
		
	}

}


