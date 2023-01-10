import java.util.Scanner;
class Lcmof2 
{
	public static void main(String[] args) 
	{Scanner s=new Scanner(System.in);
	System.out.println("Enter number 1 ");
	int a=s.nextInt();
	System.out.println("Enter number 2 ");
	int b=s.nextInt();

		System.out.println(Lcmof2(a,b));
	}
	public static int Lcmof2(int a,int b){
		
int i;
int j;
	for (i=1;i<=a ;i++ )
	{
		if(a%i==0)
		{
			System.out.println(i);
		}
	}
	for (j=1;j<=b ;j++ )
	{
		if(b%j==0)
		{
			System.out.println(j);
		}
	}
if(i==j)
		{
			
		}



     
	return 0;
	}
}
