// package Day14 (Recurssion 1);

import java.util.Scanner;

public class xToPowerN {
    public static int power(int x, int n){
        // not optimized
        if(n == 0){
            return 1;
        }
        // int Xnm1 = power(x, n-1);
        // int Xn = x * Xnm1;
        // return Xn;

        // optimized 
        int halfPow = power(x,n/2) ;
        int halfPowSq = halfPow * halfPow;
        if(n% 2 !=0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int x = scn.nextInt();
        System.out.print("Enter Exponenetial value: ");
        int n = scn.nextInt();
        System.out.println(x+" to power "+n+" is "+power(x, n));
    }
}
