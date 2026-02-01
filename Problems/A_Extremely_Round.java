import java.util.*; 

public class A_Extremely_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        int log = (int) Math.log10(n);
        int res = log*9 ; 

        long val = (long) Math.pow(10,log);
        res += n/val ; 


        System.out.println(res);
    }
}