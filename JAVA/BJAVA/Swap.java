
import java.util.Scanner;
class Swap 
{
	public static void main(String[] args) 
	{
	/*int a=10;
		int b=20;
		int temp=a;
			a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+" "+b);

*/
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=s.nextInt();
	System.out.println("Enter second number");
	int b=s.nextInt();
		

	System.out.println(swap(a,b));
	System.out.println(swap1(a,b));
	System.out.println(swap2(a,b));
	
	}

	public static int swap(int a,int b) 
	{
		
		//Scanner s=new Scanner(System.in);
	//System.out.println("Enter first number");
	// a=s.nextInt();
	//System.out.println("Enter second number");
	// b=s.nextInt();
		
		int temp=a;
			a=b;
		b=temp;
		System.out.println("the swap number are");
		System.out.println("now the value of a is "+a);
		System.out.println("now the value of b is "+b);
		//System.out.println(a+" "+b);
	return 0;
	}
	public static int swap1(int a,int b) 
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("now the valu of a is "+a);
		System.out.println("now the valu of b is "+b);
		return 0;
	}
	public static int swap2(int a,int b) 
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("now the valu of a is "+a);
		System.out.println("now the valu of b is "+b);
		return 0;
	}
}
