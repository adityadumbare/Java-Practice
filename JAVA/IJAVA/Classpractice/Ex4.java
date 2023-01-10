import java.util.Scanner;
public class Ex4
{
    public static void main(String[] args) {
        int y;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the size of an array");
            int size = s.nextInt();
            int[] a = new int[size];
            System.out.println("Enter the " + size + "array element");
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
            int avg = sum / a.length;
            System.out.println("the avg of Array is: " + avg);

            System.out.println("If you want to repeat this then press 'Y'" +
                    " or 'y'");
            y = s.next().charAt(0);
        }
        while (y == 'y' || y == 'Y');
    }
}

