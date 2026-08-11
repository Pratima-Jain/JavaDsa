public class q25 {
    public static void main(String[] args){
        int n =7;
        printPattern(n);
    }
    public static void printPattern(int n){
        int space = n/2;
        int patternSize=1;
        int mid = n/2+1;
        for(int i = 1; i <n; i++){
            for (int j = 1; j<=space; j++){
                System.out.print("    ");
            }
            for(int j=1; j<=patternSize; j++){
                System.out.print("*   ");
            }
            if(i<mid){
                patternSize+=2;
                space-=1;
            }else{
                patternSize-=2;
                space+=1;

            }
            System.out.println();
        }
    }
}
// output
//             *   
//         *   *   *   
//     *   *   *   *   *   
// *   *   *   *   *   *   *   
//     *   *   *   *   *   
//         *   *   *   
