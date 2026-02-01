
import java.util.*;

public class A_Make_It_Zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int xor = 0;
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            xor ^= list.get(i);
        }

        if (xor == 0) {
            System.out.println("1\n1 " + n);
        } else {
            if (n % 2 == 0) {
                System.out.println("2");
                System.out.println("1 " + n);
                System.out.println("1 " + n);
            }
            else{
                System.out.println("4\n");
                System.out.println("1 " + n);
                System.out.println("1 " + (n-1));
                System.out.println((n-1) + " " + n);
                System.out.println((n-1) + " " + n);
            }
        }
    }
}
