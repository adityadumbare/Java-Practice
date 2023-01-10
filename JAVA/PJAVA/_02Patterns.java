public class _02Patterns {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        int num=1;
        for (int i=1;i<=row;i++)
        {
            for (int j=1;j<=col;j++){
                System.out.print(num+++" ");
            }
            System.out.println();
        }
    }
}
