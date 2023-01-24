public class Pattern_6 {
    public static void main(String args[]) {
        int m = 5;
        int n = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%3d", n);
                n++;
            }
            System.out.println();
        }
    }
}
