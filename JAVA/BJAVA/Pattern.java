import java.util.Scanner;
class pattern 
{
	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of * pattern to print ");
		int a=s.nextInt();

		// System.out.println(pattern(a));
		System.out.println(pattern1(a));
	}


	public static int pattern(int a) 
	{
	a=a;	
	int i;
	int j;

	for (i=1;i<=a ;i++ )
	{
	for (j=1;j<=i ;j++ )
	{
		System.out.print('*');

	}
	System.out.print("\n");

	}
       return 0;
	}

	public static int pattern1(int a) 
	{
		a=a;	
	int i;
	int j;

	for (i=1;i<=a ;i++ )
	{
	for (j=1;j<=i ;j++ )
	{
		System.out.print('*');

	}
	System.out.print("\n");

	}
	for ( i=a;i>=1;i-- )
	{
	for ( j=i;j>=1;--j )
	{
		System.out.print('*');
 
	}
	
	System.out.print("\n");

	}
	return 0;
	}
}

