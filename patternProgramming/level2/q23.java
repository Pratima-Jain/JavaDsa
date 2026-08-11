public class q23 {
    public static void main(String[] args) {
        int n = 7;
        printPattern(n);

    }

    public static void printPattern(int n) {
        int patternSize = 1;
        int space = n / 2;
        int mid = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("*   ");
            }
            if (i < mid) {
                patternSize += 1;
                space -= 1;
            } else {
                patternSize -= 1;
                space += 1;

            }
            System.out.println();
        }
    }
}
// output
//       *   
//     *   *   
//   *   *   *   
// *   *   *   *   
//   *   *   *   
//     *   *   
//       *   
