import java.util.*; 

public class C_Vasilije_in_Cacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        long n = sc.nextLong(); 
        long k = sc.nextLong() , x = sc.nextLong();  

        long lower = (k*(k+1))/2 ;
        long limit = n-k; 
        long higher = (n*(n+1))/2 - (limit*(limit+1))/2 ; 

        if( lower <= x && x <= higher )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}