// package Day15 (Recurssion 2);

import java.util.Scanner;

public class FriendsParring {
    public static int Pairing(int n){
        if(n==2 || n==1){
            return n;
        }
        // Single
        int single = Pairing(n-1);
        // pair
        int pair = Pairing(n-2) * (n-1);
        return single + pair;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of person: ");
        int n = scn.nextInt();
        System.out.println(Pairing(n));
    }
}
