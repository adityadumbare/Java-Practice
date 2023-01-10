import java.util.Scanner;
class MulFloat 
{
	public static void main(String[] args) 
	{
		float a;
		float b;
		float res;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter float Number a ");
	a=s.nextFloat();
	System.out.println("Enter float Number b ");
		b=s.nextFloat();
		res=a*b;
		System.out.println("Multiplication of two number is " + res);
	}
}
