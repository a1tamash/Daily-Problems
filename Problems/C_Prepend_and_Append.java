import java.util.*; 

public class C_Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt();
        String str = sc.next();
        int low = 0 , high = str.length()-1;
        while( low <= high ){
            if( str.charAt(low) == str.charAt(high) ){
                break;
            }
            low++ ;
            high-- ;
        }

        System.out.println(high-low+1);
    }
}