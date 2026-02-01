
import java.util.*;

public class B_Comparison_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int res = 1, current = 1;
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                current += 1; 
            }else {
                current = 1;
            }

            res = Math.max(res, current);
        }

        res += 1;
        System.out.println(res);
    }
}
