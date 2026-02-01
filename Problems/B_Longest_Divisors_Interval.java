
import java.util.*;

public class B_Longest_Divisors_Interval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        int i = 1;
        while (n % (i + 1) == 0) {
            i++;
        }

        System.out.println(i);
    }
}