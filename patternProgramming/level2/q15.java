public class q15 {
    public static void main(String[] args) {
        int n = 9;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int patternSize = mid;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= patternSize; j++) {
                System.out.print("* ");
            }
            if (i < mid) {
                patternSize -= 1;
            } else {
                patternSize += 1;
            }
            System.out.println();
        }
    }
}
// output
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
