public class q3 {
    public static void main(String[] args){
        int n = 5;
        printpattern(n);
    }
    public static void printpattern(int n){
        for(int i = 1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
// output
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
// 1 2 3 4 5 
