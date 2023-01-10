public class _06Patterns {
    public static void main(String[] args) {
        int n=4;
        int num=1;

        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<=n;j++){
                if (num==10) {
                    num = 1;
                    System.out.print(num++ + "  ");
                }
            }
            System.out.println();
        }
    }
}
