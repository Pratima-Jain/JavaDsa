public class q41 {
    public static void main(String[] args){
    int n = 7;
    printpattern(n);
    }
    public static void printpattern(int n){
        int PatternSize=1;
        for(int i =7; i>=1; i--){
            for(int j=1; j<=PatternSize; j++){
                IO.print(i+" ");
            }
            PatternSize+=1;
            IO.println();
        }
    }
}
// output
// 7 
// 6 6 
// 5 5 5 
// 4 4 4 4 
// 3 3 3 3 3 
// 2 2 2 2 2 2 
// 1 1 1 1 1 1 1 
