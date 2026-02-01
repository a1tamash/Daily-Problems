import java.util.*; 

public class A_Ambitious_Kid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt() ;
        int t = 1 ; 
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        int res = Integer.MAX_VALUE; 
        for(int i=0; i<n ; i++){
            int x = Math.abs(sc.nextInt()); 
            // int x = sc.nextInt(); 
            // x = Math.abs(x) ;
            res = Math.min(res,x) ; 
        }
        System.out.println(res);
    }
}