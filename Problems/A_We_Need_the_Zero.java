import java.util.*; 

public class A_We_Need_the_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt();
        int res = 0 ; 
        for(int i=0; i<n ; i++){
            int x = sc.nextInt();
            res ^= x ; 
        }

        if( res == 0 )
            System.out.println(0);
        else if( n%2 == 1 )
            System.out.println(res);
        else
            System.out.println(-1);
    }
}