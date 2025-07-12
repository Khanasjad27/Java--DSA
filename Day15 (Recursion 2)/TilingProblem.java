// package Day15 (Recurssion 2);

import java.util.Scanner;

public class TilingProblem {
    public static int tiling(int n){
        // Base Case
        if(n==1 || n==0){
            return 1;
        }
        // vertical 
        int vT = tiling(n-1);  // vertical tile
        // horizontal
        int hT = tiling(n-2); // horizontal tile

        return vT + hT;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        int n = scn.nextInt();
        System.out.println(tiling(n));
    }
}
