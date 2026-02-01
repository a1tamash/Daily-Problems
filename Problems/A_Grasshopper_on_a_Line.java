import java.util.*; 

public class A_Grasshopper_on_a_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int x = sc.nextInt() , k = sc.nextInt();
        if( x%k == 0 )
            System.out.println("2 \n" + (x-1) + " " + 1);
        else
            System.out.println("1\n" + x);
    }
}