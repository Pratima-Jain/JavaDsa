public class q10 {
    public static void main(String[] args){
        int n =11;
        printpattern(n);
    }
    public static void printpattern(int n){
        int mid = (n/2)+1;
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n || i==j || i+j==n+1 || i == mid || j==mid){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }
    }
}
// output
// * * * * * * * * * * *   
// * *       *       * *   
// *   *     *     *   *   
// *     *   *   *     *   
// *       * * *       *   
// * * * * * * * * * * *   
// *       * * *       *   
// *     *   *   *     *   
// *   *     *     *   *   
// * *       *       * *   
// * * * * * * * * * * *   
