// package Day14 (Recurssion 1);

import java.util.Scanner;

public class SumOfNNaturalNo {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int Snm1 = sum(n-1);
        int Sn = n + sum(n-1);
        return Sn;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        System.out.println(sum(n));
    }
}
