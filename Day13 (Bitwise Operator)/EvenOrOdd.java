// package Day13 (Bitwise Operator);

import java.util.Scanner;

public class EvenOrOdd {
    public static void check(int n){
        int bitmask = 1;
        if((bitmask & n) == 0){   // single "&" Decimal ko Binary me convert karke check karega 
            System.out.println(n+" is Even");
        }else{
            System.out.println(n+" is odd");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number in Decimal: ");
        int n = scn.nextInt();
        check(n);
    }
}
