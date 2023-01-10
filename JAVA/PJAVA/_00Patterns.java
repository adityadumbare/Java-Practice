public class _00Patterns {
    public static void main(String[] args) {
        int row = 1;
        int col = 5;
        for (int i = 1; i <= row; i++) {
            System.out.print("* ");
            System.out.print("--------------------");

            for (int j = 0; j <= col; j++) {
                System.out.println("$");
            }
        }
    }
}