import java.util.*; 

public class A_Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt() , x = sc.nextInt() ; 
        List<Integer> arr = new ArrayList<>(n) ; 
        for(int i=0; i<n ; i++){
            arr.add(sc.nextInt());
        }

        int tank = 1 ;
        for(int i=0; i<n ; i++){
            if( i == 0 )
                tank = Math.max(tank,arr.get(i)); 
            else
                tank = Math.max(tank,arr.get(i)-arr.get(i-1));
        }

        tank = Math.max(tank,(x-arr.get(n-1))*2);

        System.out.println(tank);
    }
}