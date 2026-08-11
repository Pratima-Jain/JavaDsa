public class q12 {
    public static void main(String[] args){
        int n =5;
        printPattern(n);
    }
    public static void printPattern(int n){
        int PatternSize = 1;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=PatternSize; j++){
                System.out.print("* ");
            }
            PatternSize+=1;
            System.out.println();
        }
    }
}
// output
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
