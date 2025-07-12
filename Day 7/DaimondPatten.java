import java.util.*;

public class DaimondPatten {
    public static void printDaimondPatten(int n) {
        // for 1st half
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces for hollow rhombus
            for (int j = 1; j <= (2*i-1); j++) {        // for odd we use 2x+1 or 2x-1;   for star  x = i
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }
        // 2nd half
        for (int i = n; i >=1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces for hollow rhombus
            for (int j = 1; j <= (2*i-1); j++) {        // for odd we use 2x+1 or 2x-1;   for star  x = i
                System.out.print("*");
            }

            System.out.println(); // Move to next line
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        printDaimondPatten(n);
    }
}
