
import java.util.*;

public class A_United_We_Stand {

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
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (int x : arr) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }

        if (mp.size() == 1) {
            System.out.println("-1");
        } else {
            System.out.println(mp.get(mp.firstKey()) + " " + (n - mp.get(mp.firstKey())));
            for (Integer key : mp.keySet()) {
                if (key == mp.firstKey()) {
                    for (int i = 0; i < mp.get(key); i++) {
                        System.out.println(key + " ");
                    }
                } else {
                    for (int i = 0; i < mp.get(key); i++) {
                        System.out.print(key + " ");
                    }
                }
            }
        }
    }
}
