import java.util.Scanner;
class Main

{
	public static void m1(int n)
    {
       if ((n%23==0) && (n%41==0))
		{
            System.out.println("Foo Bar");
		}
		else if(n%41==0)
		{
        System.out.println("Bar");
		} 
		else if (n%23==0)
		{
        System.out.println("Foo");
		} 
          else{

			   System.out.println("Not divisible by 23,41");
		  }

	}
	public static void main(double[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n =s.nextInt();
		m1(n);
	
	}
}
