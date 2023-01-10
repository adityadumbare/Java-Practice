import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println(Palindrome(a));
	}
	public static int Palindrome(int a) 
	{
		int n=a;
		int b=0;
		int c;
		int temp=n;
	while(n>0)
		{    
   c=n%10;
   b=(b*10)+c;    
   n=n/10;    
  }    
  if(temp==b) 
		{
   System.out.println("palindrome number "); 
		}
  else    
		{
   System.out.println("not palindrome"); 
		}
	return 0;
}  


	
	}

