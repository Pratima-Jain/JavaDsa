public class q20 {
       public static void main(String[] args){
        int n = 5;
        printPattern(n);
    }
    public static void printPattern(int n ){
        int patternSize =n;
        int space= 0;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=patternSize; j++){
                System.out.print("* ");
            }
            space+=1;
            patternSize-=1;
            System.out.println();

        }
    }
}
//output
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
