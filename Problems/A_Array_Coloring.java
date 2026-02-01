import java.util.*; 

public class A_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        int sum = 0; 
        for(int i=0; i<n; i++){
            int x = sc.nextInt(); 
            sum +=x ; 
        }

        System.out.println( sum%2 == 0 ? "YES": "NO");
    }
}