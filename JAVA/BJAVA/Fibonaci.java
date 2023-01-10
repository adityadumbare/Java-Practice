import java.util.Scanner;
class Fibonaci 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter what first fibonacci number you want : ");
		Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	
	
		Fibonacci(a);
	}

public static int Fibonacci(int a)
{
     int start=1;
	 int end=a;
	 int num=0;
	 int res;
	 System.out.println("Your fitrst "+end+" fibonaci numbers are");
	  //System.out.println(num);
	  // System.out.println(start);
	 for (int i=1;i<=a ;i++ )
	 {
		 res=num+start;
		 System.out.println(res);
		 num=start;
		 start=res;
	 }
	 return 0;
}}