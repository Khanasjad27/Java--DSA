// package Day13 (Bitwise Operator);
import java.util.*;
public class clrRangeOfBit {
    public static int range(int n, int i, int j){
        int a = (-1<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number in Decimal: ");
        int n = scn.nextInt();
        System.out.print("Enter Starting of Range : ");
        int i = scn.nextInt();
        System.out.print("Enter Ending of Range : ");
        int j = scn.nextInt();
        System.out.println(range(n, i, j));
    }
}
