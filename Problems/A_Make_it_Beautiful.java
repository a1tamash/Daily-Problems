
import java.util.*;
import java.util.stream.Collectors;

public class A_Make_it_Beautiful {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr, Collections.reverseOrder());
        if( arr.get(0) == arr.get(n-1) )
            System.out.println("NO");
        else{
            for(int i=1; i<n; i++){
                if( arr.get(i) != arr.get(0) ){
                    Collections.swap(arr,0,i);
                    break;
                }
            }

            System.out.println("YES");
            System.out.println(arr.stream().map( x -> x.toString()).collect(Collectors.joining(" ")));
        }
    }
}
