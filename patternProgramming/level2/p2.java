public class p2 {
    public static void main(String[] args) {
        int n = 9;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int space = n / 2;
        int patternSize = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("*   ");
            }
            if (i < mid) {
                space -= 1;
                patternSize += 2;
            } else {
                space += 1;
                patternSize -= 2;
            }
            System.out.println();
        }
    }

}
//output
//         *   
//       *   *   *   
//     *   *   *   *   *   
//   *   *   *   *   *   *   *   
// *   *   *   *   *   *   *   *   *   
//   *   *   *   *   *   *   *   
//     *   *   *   *   *   
//       *   *   *   
//         *   
