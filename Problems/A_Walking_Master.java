
import java.util.*;

public class A_Walking_Master {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();

        int res = -1 ;
        int dx = x-a , dy = y-b ; 
        if( dx >= 0 && dy >= 0 ){
            if( dx <= dy ){
                res = dy + (dy-dx) ; 
            }
        } 
        else if( dx <= 0 && dy >= 0 ){
            res = Math.abs(dx) + 2*dy ; 
        }

        System.out.println(res);
    }
}
