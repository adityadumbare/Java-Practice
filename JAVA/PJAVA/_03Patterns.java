public class _03Patterns {
    public static void main(String[] args) {
        int n=5;
        char b ='A';
        int num=1;
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++){
               // if(b<='Z') {
                    System.out.print(b++ + " ");
               // }
            }
            System.out.println();
        }
    }

}
