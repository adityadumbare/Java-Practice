import java.util.Arrays;
import java.util.Scanner;
public class Ex5
{
    public static void main(String[] args) {
        int y;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of an array");
            int size = s.nextInt();
            int[] a = new int[size];
            System.out.println("Enter the " + size + "array element");
            for (int i = 0; i < a.length; i++)
            {
                a[i] = s.nextInt();
            }
            int start=0;
            int end=a.length-1;
            System.out.println(Arrays.toString(a));
               while (start < end)
               {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
               }
            System.out.println(Arrays.toString(a));

            System.out.println("If you want to repeat this then press 'Y'" + " or 'y'");
            y = s.next().charAt(0);
            }
        while (y == 'y' || y == 'Y');
    }
}

