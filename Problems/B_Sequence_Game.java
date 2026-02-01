
import java.util.*;

public class B_Sequence_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (i == 0) {
                list.add(x); 
            }else {
                if (list.getLast() <= x) {
                    list.add(x); 
                }else {
                    list.add(x);
                    list.add(x);
                }
            }
        }

        System.out.println(list.size());
        for(Integer x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
