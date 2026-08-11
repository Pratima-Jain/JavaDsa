public class q13 {
    public static void main(String[] args){
    int n = 5;
    printpattern(n);
    }
    public static void printpattern(int n){
        int PatternSize = n;
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= PatternSize; j++){
                System.out.print("* ");
                }
                PatternSize-=1;
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
