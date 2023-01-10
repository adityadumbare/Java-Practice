public class _04Patterns {
    public static void main(String[] args) {
        int n=4;

        for (int i=1;i<=n;i++)
        {
            int num=1;
            for (int j=1;j<=n;j++){
                System.out.print(num+++" ");
            }
            System.out.println();
        }
    }
}
