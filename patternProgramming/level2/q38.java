public class q38 {
    public static void main(String[] args){
        int n = 7;
        printPattern(n);
    }
    public static void printPattern(int n){
        int PatternSize = 1;
        for(int i=1; i<n; i++){
            for(int j=1; j<=PatternSize; j++){
                if(i%2==1){
                    System.out.print("1 ");
                }    else{
                    System.out.print("0 ");
                }
            }
            PatternSize+=1;
            System.out.println(" ");
        }
    }
}
//output
// 1  
// 0 0  
// 1 1 1  
// 0 0 0 0  
// 1 1 1 1 1  
// 0 0 0 0 0 0  
