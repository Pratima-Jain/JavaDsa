public class q32 {
    public static void main(String[] args){
        int n =9;
        printPattern(n);
    }
   public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int patternSize = n;
        int space = 0;
        for (int i = 1; i <= mid; i++) {
            if (i == 1 ) {
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
            }
            space+=2;
            patternSize -= 2;
            System.out.println();
        }
    }
}
