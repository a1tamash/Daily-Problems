import java.util.*; 

public class B_Blank_Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        int curr = 0 , res = 0; 
        for(int i=0; i<n; i++){
            int x = sc.nextInt() ; 
            if( x == 0 )
                curr++; 
            else{
                res = Math.max(res,curr); 
                curr = 0 ;
            }
        }

        res = Math.max(curr,res);
        System.out.println(res);
    }
}