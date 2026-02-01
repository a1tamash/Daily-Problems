    import java.util.*; 

    public class A_Serval_and_Mocha_s_Array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt() ;
            while( t-- > 0 ){
                solve(sc) ; 
            }
        }

        public static int gcd(int a , int b ){
            return b == 0 ? a : gcd(b,a%b) ;
        }

        public static void solve(Scanner sc){
            int n = sc.nextInt(); 
            List<Integer> arr = new ArrayList<>(n); 
            for(int i=0; i<n; i++){
                arr.add(sc.nextInt());
            }

            for(int i=0; i<n-1 ; i++){
                for(int j=i+1; j<n ; j++){
                    int res = (int) gcd(arr.get(i),arr.get(j));
                    if( res <= 2 ){
                        System.out.println("Yes");
                        return;
                    }
                }
            }       

            System.out.println("No");
        }
    }