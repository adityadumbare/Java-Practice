import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		
 	System.out.println("Which operation do you want to perform "+"\n"+"If Addition then press 1:"+"\n"+"If Substraction then press 2:"+"\n"+"If Multiplication the press 3:"+"\n"+"If Division then press 4:"+"\n"+"if You want remainger then press 5:");
	Scanner s3=new Scanner(System.in);
		int c=s3.nextInt();
	double res;
	char d;

	do
	{
		System.out.println("Enter the First number : ");
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		System.out.println("Enter the Second number : ");
		Scanner s2=new Scanner(System.in);
		double b=s2.nextDouble();
 
	
	switch(c)
		{
			case 1:
				res=a+b;
			System.out.println("Addition of two number is : "+res);
			break;
			case 2:
				res=a-b;
			System.out.println("Substraction of two number is : "+res);
			break;
			case 3:
				res=a*b;
			System.out.println("Multiplication of two number is : "+res);
			break;
			case 4:
				res=a/b;
			System.out.println("Division of two number is : "+res);
			break;
			case 5:
				res=a%b;
			System.out.println("Remainder of two number is : "+res);
			break;
		}
			


		System.out.println("If you want perform this opration again then press 'Y'");
		Scanner s1=new Scanner(System.in);
		 d=s1.next().charAt(0);
	}
	while(d=='Y'||d=='y');
	}
}
