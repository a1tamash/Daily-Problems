import java.util.*; 

public class A_How_Much_Does_Daytona_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt() , k = sc.nextInt() ; 
        boolean flag = false ; 
        for(int i=0; i<n ; i++){
            int x = sc.nextInt(); 
            if( k == x )
                flag = true ; 
        }

        System.out.println(flag ? "YES" : "NO");
    }
}