//oposite pattern

public class _Pattern10 {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num; i++) {

         for (int k =1; k < i; k++) {
          System.out.print(" ");
         }
            for (int j = i; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
