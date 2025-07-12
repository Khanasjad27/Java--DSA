// package Day18 (BackTracking);

public class GridWays {
    public static int ways(int n, int m, int i,int j){
        // base
        if(i==n-1 && j==m-1){ // last cell
            return 1;
        }else if(i==n || j==m){  // jaise mai boundary me aajauga to muje aur aage nhi barna hai coz usse aage grid se bahar nikal jaauga therefore ya condition hai
            return 0;
        }


        // recursion
        // ways 1 -> Right
        int w1 = ways(n, m, i, j+1);
        // way 2 -> Down
        int w2 = ways(n, m, i+1, j);
        // Total = w1 + w2
        return w1 + w2;
 
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total ways = "+ways(n, m, 0, 0));
    }
}
