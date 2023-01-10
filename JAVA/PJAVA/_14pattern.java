public class _14pattern {
    public static void main(String[] args) {
        int num=6;
        int star=1;
        int space=num/2;
        for (int i=1;i<=num;i++){

            for (int j=-10;j<=space; j++){
                System.out.print("  ");
            }
            for (int k=1;k<=star;k++) {
                System.out.print("* ");
            }
                if(i<=num/2){
                    space--;
                    star=star+2;
                }
               else{
                    space++;
                    star=star-2;
                }
            System.out.println();
        }
    }
}
