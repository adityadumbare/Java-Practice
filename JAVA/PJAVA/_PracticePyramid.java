public class _PracticePyramid {
    public static void main(String[] args) {
        int num=5;

        for (int i=1;i<=num;i++){

            for (int j=1;j<=num/2;j++){
                if (num<num/2){
                    System.out.print(" ");
                 }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
