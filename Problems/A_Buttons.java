
import java.util.*;

public class A_Buttons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        a += (c+1)/2 ; 
        b += c/2 ; 

        System.out.println( a > b ? "First" : "Second");
    }
}
