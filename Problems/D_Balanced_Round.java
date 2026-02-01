
import java.util.*;

public class D_Balanced_Round {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt(), k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        int res = 0, count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i + 1) - list.get(i) <= k) {
                count++;
            } else {
                count = 1;
            }

            res = Math.max(res, count);
        }
        
        if( n == 1 )
            res = 1 ; 

        int ans = n-res ; 
        System.out.println(ans);
    }
}
