

import java.util.Scanner;



public class Fibonacci {
    public static int fibo(int n){
        if(n==0  || n==1)
            return n;
        int fnm2 = fibo(n-2);
        int fnm1 = fibo(n-1);
        int fn = fnm1 + fnm2;
        return fn;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scn.nextInt();
        System.out.println(fibo(n));

    }
}
