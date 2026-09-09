public class q30 {
    public static void main(String[] args) {
        int n = 9;
        printPattern(n);
    }

    public static void printPattern(int n) {
        int mid = n / 2 + 1;
        int space = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid || j == space + 1 || j == n - space) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }
            }
            if(i<mid){
                space-=1;
            }else{
                space+=1;
            }
            System.out.println();
        }

    }
}
// output
//         *         
//       * * *       
//     *   *   *     
//   *     *     *   
// * * * * * * * * * 
//   *     *     *   
//     *   *   *     
//       * * *       
//         * 
