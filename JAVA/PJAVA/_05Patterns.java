public class _05Patterns {
    public static void main(String[] args) {
        int n=4;
       // int col=5;

        for (int i=1;i<=n;i++)
        {
            char ch='A';
            for (int j=0;j<=n;j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}
