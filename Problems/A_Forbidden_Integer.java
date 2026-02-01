import java.util.*; 

public class A_Forbidden_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void print(int digit , int end){
        System.out.println(end);
        for(int i=0; i<end; i++){
            System.out.print(digit + " ");
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt(); 
        int k = sc.nextInt() , x = sc.nextInt() ; 

        if( x != 1 ){
            System.out.println("YES");
            print(1,n);
        }
        else{
            if( k == 1 )
                System.out.println("NO");
            else if( k == 2 && n%2 == 0 ){
                System.out.println("YES");
                print(2,n/2);
            }
            else if( k == 2 && n%2 == 1 )
                System.out.println("NO");
            else{
                System.out.println("YES");
                if( n%2 == 0 )
                    print(2,n/2); 
                else{
                    System.out.println(n/2);
                    for(int i=0; i<n/2-1; i++)
                        System.out.print("2 ");
                    System.out.println("3 ");
                }
            }
        }
    }
}