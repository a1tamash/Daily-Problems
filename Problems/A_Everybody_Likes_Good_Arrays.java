import java.util.*; 

public class A_Everybody_Likes_Good_Arrays {
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

        int count = 0 ;
        for(int i=0; i<n-1; i++){
            if( arr.get(i)%2 == arr.get(i+1)%2 )
                count++;
        }

        System.out.println(count);        
    }
}