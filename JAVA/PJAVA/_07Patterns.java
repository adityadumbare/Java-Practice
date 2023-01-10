public class _07Patterns
{
    public static void main(String[] args) {
       int n=4;
       char enum1='*';
       int onum=0;
//int res=n/2;
        for (int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                if(i%2==0)
                {
                    System.out.print(enum1+" ");
                   // enum1+=2;
                }
                else
                {
                    System.out.print(onum+" ");
                   // onum+=3;
                }
            }
            System.out.println();
        }

    }
}
