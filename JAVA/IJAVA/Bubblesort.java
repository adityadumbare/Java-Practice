
import java.util.Arrays;
public class Bubblesort
{
    public static void main(String[] args)
    {
        int [] a={1,23,4,5,45,43};
//        for(int k=0;k<a.length;k++)
//        {
//            System.out.print(a[k]+",");
//        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<=a.length-1;i++)
        {
            int t = 0;
            for(int j=i+1;j<=a.length-1;j++)
            {
                if(a[i]<a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println("Afyer sorting");
        System.out.println(Arrays.toString(a));
//        for(int k=0;k<a.length;k++)
//        {
//            System.out.println(a[k]);
//        }

    }
}
