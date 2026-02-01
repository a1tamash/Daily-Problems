import java.util.*;

public class A_Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong(), k = sc.nextLong();
        boolean flag = true;
        if (k % 2 == 0 && n % 2 == 1) {
            flag = false;
        }

        System.out.println((flag ? "YES" : "NO"));
    }
}