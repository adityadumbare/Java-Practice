import java.util.Scanner;
class AddBinary 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number");
	String a=s.next();
	System.out.println("Enter second number");
	String b=s.next();
	System.out.println(AddBinary(a,b));
	}
	public static String AddBinary(String a,String b) 
	{
		String c;
		c=a+b;
		System.out.println("now the valu of a is "+a);
		System.out.println("now the valu of b is "+b);
		return c;
	}
}
