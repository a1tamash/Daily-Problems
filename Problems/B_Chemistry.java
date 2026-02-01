import java.util.*; 

public class B_Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt() , k = sc.nextInt(); 
        sc.nextLine();  
        String str = sc.nextLine(); 

        Map<Character,Integer> res = new HashMap<>(); 
        for(int i=0; i<n ; i++){
            res.put(str.charAt(i),res.getOrDefault(str.charAt(i), 0)+1);
        }


        int odd = 0 ;
        for(char x : res.keySet()){
            if( res.get(x)%2 == 1 )
                odd += res.get(x);  
        }

        if( odd <= k )
            System.out.println("YES");
        else{
            int left = odd-k ; 
            for(char x : res.keySet()){
                if( res.get(x) == left ){
                    System.out.println("YES");
                    return ;
                }
            }

            System.out.println("NO");
        }
    }
}