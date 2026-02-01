
import java.util.*;

public class C_Target_Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        // List<String> arr = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        //     arr.add(sc.nextLine());
        // }

        // int res = 0;
        // for (int i = 0; i < arr.size(); i++) {
        //     for (int j = 0; j < arr.get(i).length(); j++) {
        //         String str = arr.get(i);
        //         // System.out.println("Str: " + str);
        //         if (str.charAt(j) == 'X') {
        //             res += (Math.min(i + 1, Math.min(j + 1, Math.min(10 - i, 10 - j))));
        //         }
        //     }
        // }
        // System.out.println(res);
        List<String> arr = new ArrayList<>(10);
        arr.add("1111111111");
        arr.add("1222222221");
        arr.add("1233333321");
        arr.add("1234444321");
        arr.add("1234554321");
        arr.add("1234554321");
        arr.add("1234444321");
        arr.add("1233333321");
        arr.add("1222222221");
        arr.add("1111111111");

        int res = 0;
        for (int i = 0; i < 10; i++) {
            String x = sc.nextLine();
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) == 'X') {
                    res += arr.get(i).charAt(j) - '0';
                }
            }
        }

        System.out.println(res);
    }
}
