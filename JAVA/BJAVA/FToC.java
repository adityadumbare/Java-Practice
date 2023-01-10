import java.util.Scanner;
class FToC 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Scanner s=new Scanner(System.in);
		System.out.print("Which operation do you want perform if Celcius to far then press 1:"+"\n"+"if far to celcius then press 2:");
		int b=s.nextInt();
	
		
		switch (b)
		{
		case 1:
		{
				System.out.print("Enter Temp in Farenhieth to convert in Celcius ");
		double a=s.nextDouble();
			System.out.println(FToC(a));
		}
		break;
		case 2:
			{
				System.out.print("Enter Temp in Farenhieth to convert in Celcius ");
		double d=s.nextDouble();
			System.out.println(CToF(d));
		}
		}
		
	}

public static double FToC(double a) 
	{
		double b=a;

		double c=(b-32)*5/9;
		System.out.println("Temperature of "+b+"Farenhirght to Celcius is "+c);
		return 0;
	}
	public static double CToF(double d) 
	{
		double b=d;

		double c=(b*9/5)+32;
		System.out.println("Temperature of "+b+"Celcius to farehnight is "+c);
		return 0;
	}
}
	