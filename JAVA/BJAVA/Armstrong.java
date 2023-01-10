
import java.util.Scanner;
class Armstrong { 

	// Function to print Armstrong 
	// Numbers between two integers 
	static void ArmstrongNum(long a, long b) 
	{ 
		for (long j = a + 1; j < b; ++j) { 

			// Calculating number of digits 
			long y = j; 
			long N = 0; 
			while (y != 0) { 
				y /= 10; 
				++N; 
			} 

			// Calculating the sum of nth 
			// power of all the digits 
			long sum_power = 0; 
			y = j; 
			while (y != 0) { 
				long d = y % 10; 
				sum_power +=Math.pow(d, N); 
				y /= 10; 
			} 

			// Checking if the current number 
			// i is equal to the sum of nth 
			// power of all the digits 
			if (sum_power == j) 
				System.out.println(j); 
		} 
	} 

	// The Driver code 
	public static void main(String args[]) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number starting range ");
		long a=s.nextLong();
		System.out.print("Enter a number starting range ");
		long b=s.nextLong();
	
		ArmstrongNum(a, b); 
		System.out.println(); 
	} 
}
