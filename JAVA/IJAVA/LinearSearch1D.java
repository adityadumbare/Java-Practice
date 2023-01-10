import java.util.Scanner;
class LinearSearch1D
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=s.nextInt();
                int[] arr =new int[a];
        System.out.println("Enter array element");
        for (int index=0;index<arr.length;index++)
        {
            arr[index]=s.nextInt();
        }
        char d;
        do {
            System.out.println("Enter number to search");
        int target = s.nextInt();
            // int[] arr = {1,23,45,67,89,90};
            //  int target=23;
            System.out.println("Match or not");
            System.out.println(LinearSearch3(arr, target));
            System.out.println("Element");
            System.out.println(LinearSearch2(arr, target));
            System.out.println("At index");
            System.out.println(LinearSearch(arr, target));

            System.out.println("Press 'Y' If you want to search another element in this array again");
            d =s.next().charAt(0);
        }
        while (d =='Y'|| d=='y');
    }

    // search the target and return true or false
    static boolean LinearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    //return index
    static int LinearSearch(int [] arr,int target)
    {
        for (int index=0;index<arr.length;index++)
        {
            if (arr.length == 0) {
                return -1;
            }

            int element=arr[index];
            if (element==target)
            {
                return index;
            }
        }
                return -1;
    }
    //return element
    static int LinearSearch2(int [] arr,int target)
    {
        for (int index=0;index<arr.length;index++)
        {
            if (arr.length == 0) {
                return -1;
            }

            int element=arr[index];
            if (element==target)
            {
                return element;
            }
        }
        return -1;
    }
}
