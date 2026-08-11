public class q27 {
    public static void main(String[] args) {
        int n = 7;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int space = 0;
        int patternSize = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("* ");
            }
            if (i < mid) {
                space += 1;
                patternSize -= 2;
            } else {
                space -= 1;
                patternSize += 2;
            }

            System.out.println();
        }
    }
}
//output
//   * * * * * * * 
//     * * * * * 
//       * * * 
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
