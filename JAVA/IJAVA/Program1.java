
import java.util.Scanner;
public class Program1
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number");
        int num= s.nextInt();

        if (num>99&&num<1000)
        {
            System.out.println("Number is three digit");
        }else
        {
            System.out.println("Number is not three digit");
        }
    }
}
