import java.util.*; 

public class D_Odd_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt() , q = sc.nextInt(); 
        List<Integer> arr = new ArrayList<>() ; 
        long sum = 0; 
        for(int i=0; i<n ; i++){
            arr.add(sc.nextInt());
            sum += arr.get(i);
        }

        for(int i=0; i<q; i++){
            int l = sc.nextInt() , r = sc.nextInt() ;
            long k = sc.nextInt() ; 
            long add = k*(r-l+1); 
            long val = sum ;  
            for(int j=l-1; j<r; j++)
                val -= arr.get(j); 
            val += add ; 
            
            System.out.println(val%2 == 1 ? "YES" : "NO");
        } 
    }
}