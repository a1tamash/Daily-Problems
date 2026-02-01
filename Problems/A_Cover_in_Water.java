import java.util.*; 

public class A_Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        sc.nextLine();
        String str = sc.nextLine() ;
        int res = 0; 
        int count = 0 ; 
        for(int i=0; i<n; i++){
            if( str.charAt(i) == '.' )
                count++; 
            else{
                if( count >= 3 ){
                    res = 2 ;
                    break;
                }
                else
                    res += count; 

                count = 0 ; 
            }
        }

        if( count >= 3 )
            res = 2 ; 
        else
            res += count ; 

        System.out.println(res);
    }
}