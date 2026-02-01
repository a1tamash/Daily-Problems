import java.util.*; 

public class A_Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ;
        while( t-- > 0 ){
            solve(sc) ; 
        }
    }

    public static void solve(Scanner sc){
        int a = sc.nextInt() , b = sc.nextInt() ;
        int kx = sc.nextInt() , ky = sc.nextInt() ; 
        int qx = sc.nextInt() , qy = sc.nextInt() ; 

        int dx[] = {-1,1,-1,1} ; 
        int dy[] = {-1,-1,1,1} ; 

        Set<Pair<Integer,Integer>> king = new HashSet<>(); 
        Set<Pair<Integer,Integer>> queen = new HashSet<>();
        for(int i=0; i<4; i++){
            king.add(new Pair(kx+a*dx[i],ky+b*dy[i]));
            king.add(new Pair(kx+b*dx[i],ky+a*dy[i]));

            queen.add(new Pair(qx+a*dx[i],qy+b*dy[i]));
            queen.add(new Pair(qx+b*dx[i],qy+a*dy[i]));
        }


        int ans = 0 ;
        for(Pair<Integer,Integer> pos : king){
            if( queen.contains(pos) )
                ans++;
        }

        System.out.println(ans);
    }
}

class Pair<K,V>{
    public int first , second ; 

    public Pair(int first , int second){
        this.first = first ; 
        this.second = second; 
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.first;
        hash = 59 * hash + this.second;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pair<?, ?> other = (Pair<?, ?>) obj;
        if (this.first != other.first) {
            return false;
        }
        return this.second == other.second;
    }
}