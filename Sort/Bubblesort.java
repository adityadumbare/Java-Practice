import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] a={1,9,4,7,69,3,4};
                bubblesort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void bubblesort(int [] arr)
    {
        for (int i =0; i< arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped)
                break;
        }
    }
}
   /* Best	O(n)
    Worst	O(n2)
    Average	O(n2)
    Space Complexity	O(1)
    Stability	Yes

    */
