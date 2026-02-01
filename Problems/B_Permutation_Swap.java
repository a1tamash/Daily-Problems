
import java.util.*;

public class B_Permutation_Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static int gcd(int a , int b){
        return b == 0 ? a : gcd(b,a%b) ; 
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int res = -1 ; 
        for(int i=0; i<n ; i++){
            int x = sc.nextInt();
            int diff = Math.abs(x - (i+1)) ; 
            if( diff != 0 ){
                if( res == -1 )
                    res = diff ; 
                else 
                    res = gcd(res,diff);
            }
        }

        System.out.println(res);
    }
}
