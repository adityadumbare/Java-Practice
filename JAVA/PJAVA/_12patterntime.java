public class _12patterntime {
    public static void main(String[] args) {

        int num=6;
        for (int i=1;i<=num;i++){

            for (int j=num-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=2;i<=num;i++){

            for (int j=1;j<i; j++){
                System.out.print(" ");
            }
            for (int k=num;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
//////////////////////////////
        for (int j=1;j<10;j++){
            System.out.print("= ");
        }
        System.out.println();
///////////////////////////
        for (int i=1;i<=num;i++){

            for (int j=1;j<i; j++){
                System.out.print(" ");
            }
            for (int k=num;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=2;i<=num;i++){

            for (int j=num-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
