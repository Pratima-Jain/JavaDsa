public class q11 {
    public static void main(String[] args){
        int n =5;
        printPattern(n);
    }
    public static void printPattern(int n){
        int mid = (n/2)+1;
        for (int i = 1; i<=n; i++){
            for(int j=1;j<=n; j++){
                if(i==mid || j==mid || j>mid & i==1 || j< mid & i ==n || i > mid & j == n || i < mid & j == 1 ){
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
// *   * * * 
// *   *     
// * * * * * 
//     *   * 
// * * *   * 


