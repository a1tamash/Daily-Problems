import java.util.*; 

public class A_Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        while( n-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt() , k = sc.nextInt(); 
        List<Integer> arr = new ArrayList<>(n); 
        for(int i=0; i<n ; i++){
            arr.add(sc.nextInt()); 
        }

        if( k == 1 ){
            for(int i=1; i<arr.size() ; i++){
                if( arr.get(i-1) > arr.get(i) ){
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}