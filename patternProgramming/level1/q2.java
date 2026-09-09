public class q2 {
    public static void main(String[] arg){
        int n = 5;
        printpattern(n);
    }
    public static void printpattern(int n){
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i%2==1){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
        System.out.println();
        }
    }
}
// output
// 1 1 1 1 1 
// 0 0 0 0 0 
// 1 1 1 1 1 
// 0 0 0 0 0 
// 1 1 1 1 1 
