public class q42 {

    public static void main(String[] args){
        int n= 5;
        printpattern(n);
    }
      public static void printpattern(int n){
      for(int i=1; i<=n; i++){
        for(int j = i; j>=1; j-- ){
            System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
// output
// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1
// 6 5 4 3 2 1
// 7 6 5 4 3 2 1 