import java.util.Scanner;
public class Ex3
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
        int big=0;
        for (int i=0;i<a.length-1;i++){

            if(a[i]<a[i+1]){
                big=a[i+1];}
        }
        System.out.println("the big of Array is: "+big);

    }
}

