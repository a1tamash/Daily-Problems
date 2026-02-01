import java.util.*; 

public class A_Two_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt() , a = sc.nextInt() , b = sc.nextInt();  

        if( ( a == b && b == n ) || ( a + 2 + b <= n ) )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}