public class q39 {
    public static void main(){
        int n = 7;
        printpattern(n);
    }
    public static void printpattern(int n){
        int PatternSize=1;
        for(int i=1; i<n; i++){
            for(int j =1; j<=PatternSize; j++){
                System.out.print(j+" ");
            }   
            PatternSize+=1;
            System.out.println();
        }

    }
}
// output
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 