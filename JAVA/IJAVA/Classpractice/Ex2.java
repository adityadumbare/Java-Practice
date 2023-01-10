import java.util.Scanner;
public class Ex2
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=s.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the "+size+"array element");
        for (int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("the sum of Array is: "+sum);

    }
}
