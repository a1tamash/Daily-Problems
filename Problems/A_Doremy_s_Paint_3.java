import java.util.*; 

public class A_Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        Map<Integer,Integer> mp = new HashMap<>(); 
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            mp.put(x,mp.getOrDefault(x,0)+1); 
        }

        if( mp.size() == 1 )
            System.out.println("Yes");
        else if( mp.size() == 2 ){
            Iterator<Integer> it = mp.values().iterator();
            int first = it.next(); 
            int second = it.next(); 

            if( Math.abs(first-second) <= 1 )
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.out.println("No");
    }
}