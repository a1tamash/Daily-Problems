import java.util.*; 

public class A_Goals_of_Victory {
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
        for(int i=0; i<n-1 ; i++){
            int x = sc.nextInt() ; 
            res += x ;
        }

        System.out.println(-res);
    }
}