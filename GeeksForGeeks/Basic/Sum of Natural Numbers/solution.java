import java.util.Scanner;

class GFG {
    static int solve(int n){
        //  int sum =0;
        // for(int i =0; i <=n; i++){
        //     sum += i;
        //                this is iterative approach
        // }
        // System.out.println(sum);
        // return;
         if(n==0){
             return 0;  // this si the basea condition
             
         }
         return n + solve(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
       
        
    }
}