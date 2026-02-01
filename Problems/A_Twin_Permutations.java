
import java.util.*;

public class A_Twin_Permutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
            max = Math.max(arr.get(i), max);
        }
        max += 1;

        for (int i = 0; i < n; i++) {
            System.out.print(max - arr.get(i) + " ");
        }
        System.out.println();
    }
}
