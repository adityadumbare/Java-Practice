//understanding the concept of compareto();
import java.util.Arrays;
class BookDriver
{
    public static void main(String[] args) {
        Book b1=new Book("java",120,660);
        Book b2=new Book("c",130,560);
        Book b3=new Book("php",140,460);

        Book [] barr={b1,b2,b3};
        System.out.println("Befprre sort");
        System.out.println(Arrays.toString(barr));
        Arrays.sort(barr);
        System.out.println("After sort");
        System.out.println(Arrays.toString(barr));

    }
}
