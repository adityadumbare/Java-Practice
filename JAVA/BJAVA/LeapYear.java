import java.util.Scanner;
class  LeapYear
{
	public static void main(String[] args) 
	{

		System.out.println("Hello World!");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a year");
		int a=s.nextInt();
		System.out.println(LeapYear(a));
	}
	public static int LeapYear(int a)
	{
	 int year=a;
		if (year%400==0 || year%4==0 && year%100!=0)
		{
			System.out.println("It is a leap year");
		}else
		{
			System.out.println("It is a not a leap year");
		}
	  return 0;
	}


}
