public class q31 {
    public static void main(String[] args) {
        int n = 9;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int patternSize = mid;
        int space = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*  ");
                }
            } else {
                for (int j = 1; j <= patternSize; j++) {
                    System.out.print("*  ");
                }
                for (int j = 1; j < space   ; j++) {
                    System.out.print("   ");
                }
                for (int j = 1; j <= patternSize; j++) {
                    System.out.print("*  ");
                }
            }
            if (i < mid) {
                patternSize -= 1;
                space += 2;
            } else {
                patternSize += 1;
                space -= 2;
            }
            System.out.println();
        }
    }
}
// output
// *  *  *  *  *  *  *  *  *  
// *  *  *  *     *  *  *  *  
// *  *  *           *  *  *  
// *  *                 *  *  
// *                       *  
// *  *                 *  *  
// *  *  *           *  *  *  
// *  *  *  *     *  *  *  *  
// *  *  *  *  *  *  *  *  *  