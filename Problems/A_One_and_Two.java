import java.util.*; 

public class A_One_and_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>(n); 
        int count = 0; 
        for(int i=0; i<n ; i++){
            arr.add(sc.nextInt()); 
            if( arr.get(i) == 2 )
                count++; 
        }

        if( count%2 == 0 ){
            count /= 2; 
            for(int i=0; i<n ; i++){
                if( arr.get(i) == 2 ){
                    count--; 
                } 
                if( count == 0 ){
                    System.out.println(i+1);
                    break;
                }
            }
        }
        else
            System.out.println("-1");
    }
}