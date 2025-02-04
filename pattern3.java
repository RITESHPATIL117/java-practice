public class pattern3 {
    public static void main(String[] args) {

        pattern4to1( 4);

    }
    static void pattern4to1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

