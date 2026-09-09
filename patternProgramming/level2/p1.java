public class p1 {
    public static void main(String[] args){
        int n = 7;
        printpattern(n);
    }
    public static void printpattern(int n){
        int PatternSize = 1;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=PatternSize; j++){
                IO.print(i+" ");
            }
            PatternSize+=1;
            System.out.println(" ");
        }
    }
}
// output
// 1  
// 2 2  
// 3 3 3  
// 4 4 4 4  
// 5 5 5 5 5  
// 6 6 6 6 6 6  
// 7 7 7 7 7 7 7  