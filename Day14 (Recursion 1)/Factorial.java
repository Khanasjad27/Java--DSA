// package Day14 (Recurssion 1);

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        // int fnm1 = fact( n - 1);
        // int fn = n * fact( n - 1);
        // return fn;
        // or
        return n * fact( n - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number for Factorial: ");
        int n = scn.nextInt();
        System.out.println(fact(n));
    }
}
