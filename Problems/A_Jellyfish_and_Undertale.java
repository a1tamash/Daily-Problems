import java.util.*; 

public class A_Jellyfish_and_Undertale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int a = sc.nextInt() , b = sc.nextInt() , n = sc.nextInt(); 
        List<Integer> arr = new ArrayList<>(); 
        for(int i=0; i<n ; i++){
            arr.add(sc.nextInt());
        }

        long res = b-1 ;  
        for(int i=0; i<n-1 ; i++){
            int val = Math.min(arr.get(i)+1,a);
            // System.out.println(val);
            res += (val-1);
        }
        res += Math.min(arr.get(n-1)+1,a);  
            
        System.out.println(res);
    }
}