package grotech_automation;

import java.util.Date;

//write a program to get 10 days before the current time and 10 days after the current time using Date Class?
public class Assignment_42
{
public static void main(String[] args) {
	Date d1=new Date();
	long time=d1.getTime();
	Date d2=new Date(d1.getTime());
	
	System.out.println("current time :      "+d2);
	Date d3=new Date(d1.getTime()+(1000*60*60*24*10));
	System.out.println("Time After 10 days:  "+d3);
	Date d4=new Date(d1.getTime()-(1000*60*60*24*10));
	System.out.println("Time Before 10 days: "+d4);
	
	
}
}
