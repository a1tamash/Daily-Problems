import java.util.*; 

public class A_Don_t_Try_to_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int n = sc.nextInt() , m = sc.nextInt() ; 
        sc.nextLine(); 
        String fs = sc.nextLine() , ss = sc.nextLine(); 

        int i = 0; 
        while( i <= 5 ){
            if( fs.contains(ss) ){
                System.out.println(i);
                return ;
            }

            i++;
            fs += fs ; 
        }

        System.out.println("-1");
    }
}