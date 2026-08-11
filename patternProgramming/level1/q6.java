public class q6 {
    public static void main(String[] args){
        int n = 10;
        printpattern(n);
    }
    public static void printpattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if( i<=2 || i>=n-1 || j<=2 || j>=n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
// output
// * * * * * * * * * * 
// * * * * * * * * * * 
// * *             * * 
// * *             * * 
// * *             * * 
// * *             * * 
// * *             * * 
// * *             * * 
// * * * * * * * * * * 
// * * * * * * * * * * 
