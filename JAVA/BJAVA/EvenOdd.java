import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args)
	{
		System.out.println(EvenOdd());
	}

	public static int EvenOdd() 
	{
			char d;
		do
		{
		Scanner s=new Scanner(System.in);
	System.out.println("Enter number 1 ");
	int a=s.nextInt();
	
		
		if(a%2==0)
	{
		System.out.println("The number is "+a+"is Even");
	}
	else
	{
		System.out.println("The number is "+a+" is odd");
	}
	Scanner w=new Scanner(System.in);
	System.out.println("If You want to do this Operation Again the type only 'Y' if No then type any Other word ");
	 d=w.next().charAt(0);
 }
		while (d=='y'||d=='Y');
	return 0;
	}


	}
