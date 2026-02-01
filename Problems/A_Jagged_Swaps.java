import java.util.*; 

public class A_Jagged_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        List<Integer> arr = new ArrayList<>(n);
        for(int i=0; i<n ; i++){
            arr.add(sc.nextInt()); 
        }

        System.out.println( arr.get(0) == 1 ? "YES" : "NO");
    }
}