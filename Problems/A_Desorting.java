import java.util.*; 

public class A_Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n ; i++){
            arr.add(sc.nextInt());
        }

        int min = Integer.MAX_VALUE; 
        for(int i=0; i<n-1; i++){
            if( arr.get(i) <= arr.get(i+1) ){
                int diff = arr.get(i+1)-arr.get(i) ;
                min = Math.min(min,diff/2+1); 
            }
            else{
                min = 0; 
                break; 
            }
        }

        System.out.println(min);
    }
}