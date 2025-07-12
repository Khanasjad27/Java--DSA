// package Day13 (Bitwise Operator);
import java.util.Scanner;

public class SetIthBit {
    public static int check(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number in Decimal: ");
        int n = scn.nextInt();
        System.out.print("Enter position: ");
        int i = scn.nextInt();
        System.out.println(check(n,i));
    }
}
