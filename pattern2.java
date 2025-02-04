public class pattern2  {
    public static void main(String[] args) {

        pattern4to4( 4);

    }
    static void pattern4to4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

