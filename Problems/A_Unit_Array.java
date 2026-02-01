
import java.util.*;

public class A_Unit_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += x;
            if (x == -1) {
                count++;
            }
        }

        int res = 0;
        if (sum >= 0) {
            res = count % 2 == 0 ? 0 : 1;
        } else {
            res = count - (n / 2);
            if( (count-res)%2 == 1 )
                res += 1; 
        }

        System.out.println(res);
    }
}
