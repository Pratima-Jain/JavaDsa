public class q1{
    public static void main(String[] args){
        int n = 5;
        printpattern(n);
    }
    public static void printpattern(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
// output
// 1 1 1 1 1 
// 2 2 2 2 2 
// 3 3 3 3 3 
// 4 4 4 4 4 
// 5 5 5 5 5 
