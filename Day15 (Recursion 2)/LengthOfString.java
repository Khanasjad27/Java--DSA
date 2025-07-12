// package Day15 (Recursion 2);

import java.util.Scanner;

public class LengthOfString {
    public static int length(String str,int idx){
        int count = 1;
        length(str, idx+1);
        count++;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scn.nextLine();
        int idx = 0;
    }
}
