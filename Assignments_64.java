package NeedToUpload;
//Write a program to demonstrate encapsulation
class AmazonLogin
{
	private int age =10;
	private String un="student@gmail.com";
	private String pswd="stu@123";
	private int otp= 321;
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setUn(String un)
	{
		this.un=un;
	}
	public String getUn()
	{
		return un;
	}
	public void setPswd(String pswd)
	{
		this.pswd=pswd;
	}
	public String getPswd()
	{
		return pswd;
	}
	public void setOtp(int otp)
	{
		this.otp=otp;
	}
	public int getOtp()
	{
		return otp;
	}
}

public class Assignments_64 {
	public static void main(String[] args) {
		AmazonLogin a1=new AmazonLogin();
		a1.setAge(26);
		a1.setOtp(123);
		a1.setPswd("number@23");
		a1.setUn("soumya");
		System.out.println(a1.getAge());
		System.out.println(a1.getOtp());
		System.out.println(a1.getPswd());
		System.out.println(a1.getUn());
	}

}
