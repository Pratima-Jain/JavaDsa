public class q28 {
    public static void main(String[] args) {
        int n = 7;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int space = 1;
        int patternSize = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= space || j >= patternSize) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // System.out.print("* ");
            if (i < mid) {
                space += 1;
                patternSize -= 1;

            } else {
                space -= 1;
                patternSize += 1;

            }
            System.out.println();
        }
    }
}

//output
// *           * 
// * *       * * 
// * * *   * * * 
// * * * * * * * 
// * * *   * * * 
// * *       * * 
// *           * 