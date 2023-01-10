import java.util.Arrays;
import java.util.Scanner;
public class Ex6
{
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of an array");
            int size = s.nextInt();
            int[] a = new int[size];
            System.out.println("Enter the " + size + "array element");
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
        for (int i:a) {
            System.out.println(i);
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
            for (int i=a.length-1; i>=0; i--) {
                System.out.println(a[i]);
            }
            System.out.println(Arrays.toString(a));

    }
}
